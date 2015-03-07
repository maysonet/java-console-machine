/** Contains controlling actions for the operations on strings menu
 *  @author Christopher Maysonet
 *
 */

public class StringsMenuManager {
	private static StringsMenuManager uniqueInstance = null;
    private Menu menu;

    
    /**
     * Manage strings menu options and content. 
     * @return operations on strings menu
     */
    public static StringsMenuManager getInstance() {
    	uniqueInstance = new StringsMenuManager();
    	uniqueInstance.menu = new Menu(3);
    	
    	uniqueInstance.menu.addHeader("Operations on Strings Menu:");
    	uniqueInstance.menu.addOption("Show Reverse of a Given String"); 
    	uniqueInstance.menu.addOption("Format Strings"); 
    	uniqueInstance.menu.addOption("Exit");
    	uniqueInstance.menu.addTail("Enter Your Selection:");

    	
		return uniqueInstance;

    }

    
    /**
     * Display operations on strings menu options and control the menu selection
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
                // for the moment, just exit....
                exitMenu = true;
            }
            else if (choice == 1) {
                // here goes your code to initiate action associated to
                // menu option 1....
                ProjectUtils.reverseAString();
            }
            else if (choice == 2) {
                ProjectUtils.formatAString();
            }
            else if (choice == 3) {
            	 exitMenu = true; 
            } 
    } while (!exitMenu);


    }
	
	
}
