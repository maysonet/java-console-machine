/** Manage the application menu 
 * @author Christopher Maysonet*/

public class Menu {
    private String content; 
 	// All the content of the menu display as a String. 
 	private int nOptions; 
 	// Number of options in menu. These are values: 1, ..., nOptions.
 	private int maxChances;
 	// Max number of opportunities that this menu gives to its users the enter a valid 
             // selection. 
 	
 	/** Constructs a menu with the content,
 	 *  the options and the max number of opportunities. 
 	 * 	@param All the content the content of the menu
 	 * 	@param Number of options in the menu
 	 * 	@param maxChances max numbers of opportunities to 
 	 *	select a valid option in the menu.
 	 * 
 	 * */
 	public Menu(String content, int nOptions, int maxChances) { 
		this.content = content;
		this.nOptions = nOptions; 
 		this.maxChances = maxChances; 
 	}
 	/** Constructs a menu with the max numbers of opportunities specified 
 	 * @param maxChances max numbers of opportunities to select a valid option in the menu
 	 * */
 	public Menu(int maxChances){
 		nOptions = 0;
 		this.maxChances = maxChances;
 	}
 	
 	/** Add String to the content.It does not add an option to the menu.
 	 * @param s String to be added to the content*/
 	public void addHeader(String s){
 		content = s + "\n";
 	}
 	
 	/** Append String to the content. It does not add an option to the menu.
 	 * @param s String to be appended to the content*/
 	public void addTail(String s){
 		content += s+ "\n";
 		
 	}                                        
 	
 	/** Append String to the content and an option to the menu.
 	 * It adds the number of the option appended to the string to be added
 	 * @param s String to be appended to the content*/ 
 	public void addOption(String s){
 		nOptions++;
 		content += "\t" + nOptions + "> " + s + "\n" ;
 	}
 	
 	/** Display the content of the menu */
 	public void display() { 
        ProjectUtils.println(content);  
    }
    
    /**
      Asks for and reads the user's selection. 
      @return Returns 0 if all the attempts allowed have been
      used by the user, without entering a valid selection. 
      Otherwise, it returns the integer value corresponding to
      the valid selection by the user. 
    */
    public int getUserSelection() { 
        int opportunity = 0; 
        boolean valid = false; 
        int selection = 0; 
        while (!valid && opportunity < maxChances) { 
            opportunity++; 
            ProjectUtils.print("\nEnter valid selection for this menu: "); 
            selection = ProjectUtils.readInteger(); 
            if (selection >= 1 && selection <= nOptions) 
                valid = true; 
        }
        if (!valid) {
            return 0; 
        }
        else
            return selection; 
    }

    /**
       Get the int value representing the exit option in menu
       @return the int value corresponding to the exit option 
     */
    public int getExitChoice() { 
        return nOptions; 
    }

}
