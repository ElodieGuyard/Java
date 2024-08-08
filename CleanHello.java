public class CleanHello {
  public static void main(String[] args) {
	  helloBeyonce();// appelle la fonction/méthode helloBeyonce
	  sayHelloTo("you", 18);//appelle la fonction sayHelloTo avec argument la chaîne de caractères "you"
  }
  
  private static void helloBeyonce() {
		String message = "Bonjour !"; //déclatation d'une variable de type String de nom 'message' de valeur "Bonjour !"
		String firstname = "Beyonce"; //déclaration d'une variable de type String de nom firstname de valeur 'Beyonce'
		message += " " + firstname; //Modification de la variable message avec concaténation message+message+" "+Beyonce
	    System.out.println(message); // Affiche dans la console "Bonjour ! Beyonce"
  }
  private static void sayHelloTo(String recipient, int hour) {
	  
	  if (hour>=18) { //si l'heure est superieure ou égale à 18 alors on print "Bonsoir ..."
		  System.out.println("Bonsoir " + recipient);
	  } else { // sinon, (heure inférieur à 18h, on print "Bonjour ..."
		  System.out.println("Bonjour " + recipient);
	  }
  }
}
