
/**
 * Write a description of class Little_Old_Lady here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Little_Old_Lady {  
    public static void main (String[] args) {
        flyStanza();
        spiderStanza();
        birdStanza();
        catStanza();
        dogStanza();
        cowStanza();
        horseStanza();
    }   

    public static void oldLady() {
        System.out.print  ("There was an old lady who swallowed a");
    }

    public static void flyStanza() {
        oldLady();
        System.out.print (" fly.");
        System.out.println ("I don’t know why she swallowed the fly");
        System.out.println ("Perhaps she’ll die.");
        System.out.println(" ");
    }

    public static void whyTheFly() {
        System.out.println ("I don’t know why"); 
        System.out.println ("She swallowed the fly");
        System.out.println ("Perhaps she’ll die.");
    }

    public static void spiderStanza() {
        oldLady();
        System.out.print (" spider.");
        System.out.println ("That wiggled and jiggled and tickled inside her.");
        catchTheFly();
        System.out.println(" ");
    }

    public static void catchTheFly() {
        System.out.println ("She swallowed the spider to catch the fly");
        whyTheFly();
    }
    
    public static void birdStanza() {
        oldLady();
        System.out.print(" bird.");
        System.out.println("How absurd! She swallowed a bird!");
        catchTheSpider();
        System.out.println(" ");
    }
    
    public static void catchTheSpider() {
        System.out.println("She swallowed the bird to catch the spider.");
        catchTheFly();
    }

    public static void catStanza() {
        oldLady();
        System.out.print(" cat.");
        System.out.println("Imagine that! She swallowed a cat.");
        catchTheBird();
        System.out.println(" ");
    }
    
    public static void catchTheBird() {
        System.out.println("She swallowed the cat to catch the bird.");
        catchTheSpider();
    }

    public static void dogStanza() {
        oldLady();
        System.out.print(" dog.");
        System.out.println("She went whole hog to swallow the dog.");
        catchTheCat();
        System.out.println(" ");
    }
    
    public static void catchTheCat() {
        System.out.println("She swallowed the dog to catch the cat.");
        catchTheBird();
    }

    public static void cowStanza() {
        oldLady();
        System.out.print(" cow.");
        System.out.println("I don’t know how she swallowed the cow.");
        catchTheDog();
        System.out.println(" ");
    }

    public static void catchTheDog() {
        System.out.println("She swallowed the cow to catch the dog.");
        catchTheCat();
    }

    public static void horseStanza() {
        oldLady();
        System.out.print(" horse.");
        System.out.println("She died of course.");
    }
}
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Little_Old_Lady
     */
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */