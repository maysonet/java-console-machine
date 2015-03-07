/** Contains controlling actions for the operations on numbers menu
 *  @author Christopher Maysonet
 *
 */

public class NumbersMenuManager {
	private static NumbersMenuManager uniqueInstance = null;
    private Menu menu;

    /**
     * Manage numbers menu options and content. 
     * @return operations on numbers menu
     */
    public static NumbersMenuManager getInstance() {
    	uniqueInstance = new NumbersMenuManager();
    	uniqueInstance.menu = new Menu(3);
    	
    	uniqueInstance.menu.addHeader("Operations on Numbers Menu:");
    	uniqueInstance.menu.addOption("Process Quadratic Equation"); 
    	uniqueInstance.menu.addOption("Compute Average of List of Numbers"); 
    	uniqueInstance.menu.addOption("Exit");
    	uniqueInstance.menu.addTail("Enter Your Selection:");

    	
		return uniqueInstance;

    }

    /**
     * Display operations on numbers menu options and control the menu selection
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
                ProjectUtils.processQuadraticEquation();
            }
            else if (choice == 2) {
                ProjectUtils.computeAverageOfNumbers();
            }
            else if (choice == 3) {
            	 exitMenu = true; 
            } 
    } while (!exitMenu);


    }
	
	
}
