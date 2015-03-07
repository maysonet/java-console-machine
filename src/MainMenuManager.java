/** Contains controlling actions for the main menu
 *  @author Christopher Maysonet
 *
 */
public class MainMenuManager {
    private static MainMenuManager uniqueInstance = null;
    private Menu menu;

    /**
     * Manage main menu options and content. 
     * @return main menu
     */
    public static MainMenuManager getInstance() {
    	uniqueInstance = new MainMenuManager();
    	uniqueInstance.menu = new Menu(3);
    	
    	uniqueInstance.menu.addHeader("Main Menu:");
    	uniqueInstance.menu.addOption("Perform Operations on Numbers"); 
    	uniqueInstance.menu.addOption("Perform Operations on String"); 
    	uniqueInstance.menu.addOption("Show Use Statistics"); 
    	uniqueInstance.menu.addOption("Exit Program");
    	uniqueInstance.menu.addTail("Enter Your Selection:");

    	
		return uniqueInstance;

    }

    /**
     * Display main menu options and control the menu selection
     * 
     */
    public void run() {
        boolean exitMenu = false;
        do {
            menu.display();
            int choice = menu.getUserSelection();
            // the above method call will return 0 if the user did not
            // entered a valid selection in the opportunities given...
            // Otherwise, it is valid...
            if (choice == 0) {
                // here the user can be informed that fail to enter a
                // valid input after all the opportunities given....
                // for the moment, just exit...
            	ProjectUtils.println("Invalid option. The program is exiting...");
                exitMenu = true;
            }
            else if (choice == 1) {
                ProjectUtils.operationsOnNumbers();
            }
            else if (choice == 2) {
                ProjectUtils.operationsOnStrings();
            }
            else if (choice == 3) {
                ProjectUtils.showStatistics();
            }
            else if(choice==4) {
                exitMenu = true; 
    
        } 
    } while (!exitMenu);


    }
}
