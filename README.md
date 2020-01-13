# CustomTexturedButtons
Short tutorial on how to create custom buttons for your main menu (or any GUI)..

1]
  Download both the template image and class and put it in your desired directory. (you will also have to set the directory in the class as it uses ResourceLocation)
  
2]
  In your GUI class (Example: GuiMaineMenu.java) (where you want to use the custom buttons), you will need to go to the line where the       button is specified (it is usually called "GuiButton") and you'll need to replace that with your class name, import it, and remove the     arguments so that it matches the class.
  
  PS: 
  - The language icon in the template.png is used for size reference but isn't required.
  - In the template class, you will see "int i = 0;", that is used to set the y axis on your image, per exemple: if you want to add           another button, instead of 0, you put in 40 etc.
