import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class Player {

    //Attributes---------------------------------------------------------------------------------
    String playerName;
    String playerBandAlliance; //team
    String playerInstrument; //weapon
    int playerPoints;
    




    //Constructor---------------------------------------------------------------------------------
   
    /**
     * player character constructor 
     * @param name (changed in main)
     * @param bandAlliance (changed in main)
     * @param instrument (changed in main)
     * @param playerPoints
     */
    public Player(String playerName, String playerBandAlliance, String playerInstrument, int playerPoints){
        this.playerName = playerName;
        this.playerBandAlliance = playerBandAlliance;
        this.playerInstrument = playerInstrument;
        this.playerPoints = playerPoints;
        

    }
    


    //Methods---------------------------------------------------------------------------------

    /**
     * Level 1
     * @param p1
     * @throws IOException
     * @throws LineUnavailableException
     * @throws UnsupportedAudioFileException
     */
    public static void fightSeq(Player p1) throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        
        boolean correctAnswer = false;
        String lvlAnswer;
        int tries = 3;
        String loserResponse;


        //LEVEL 1--------------------------------------------------------------------------------------------
        while (tries > 0 && correctAnswer == false){
            // change this path
            File Battlefile = new File("toTheDEATH.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(Battlefile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

        

            System.out.println();
            slowPrint("Where was Gerard's Way, My Chemical Romance, founded in? i.e. what state?");
            System.out.println();
            System.out.println();
            slowPrint("Please type your answer in all lowercase <3! \n");
            Scanner fScanner = new Scanner(System.in);
            lvlAnswer= fScanner.nextLine();

            //if answer is correct
            if(lvlAnswer.equals("new jersey")||(lvlAnswer.equals("nj"))){
                File correct = new File("correct.wav");
                AudioInputStream audioStrea = AudioSystem.getAudioInputStream(correct);
                Clip Aclip = AudioSystem.getClip();
                Aclip.open(audioStrea);
                Aclip.start();  

                correctAnswer = true;

                slowPrint("Correct! My Chemical Romance was a New Jersey based band!");
                p1.playerPoints++;
                tries = 3;

            }else{
                File incorrect = new File("incorrect.wav");
                AudioInputStream audioStr = AudioSystem.getAudioInputStream(incorrect);
                Clip Wclip = AudioSystem.getClip();
                Wclip.open(audioStr);
                Wclip.start(); 

                tries --;
                p1.playerPoints --;

                slowPrint("Nope, that's not it. You have "+tries+ " tries remaining");  
                System.out.println();  
                System.out.println();
            }
            }

            //if player dies/ runs out of tries
            if(tries == 0){
                File death = new File("dead.wav");
                AudioInputStream audioStre = AudioSystem.getAudioInputStream(death);
                Clip Dclip = AudioSystem.getClip();
                Dclip.open(audioStre);
                Dclip.start();

                slowPrint("Gerard Way: Ugh! Don't you know that My Chemical Romance is from in New Jersey?!");
                System.out.println();
                System.out.println();
                slowPrint("Sorry, you lost!");
                System.out.println();
                System.out.println();
                slowPrint("Want to try again? \n");
                Scanner loser = new Scanner(System.in);
                loserResponse = loser.nextLine();

            if(loserResponse.equals("yes")){
                slowPrint("Let's try that again....");
                System.out.println();
                tries = 3;
                fightSeq(p1);



                
            }else{
                slowPrint("Thanks for playing! Try again another time");
            }
        }}


     
        



    /**
     * Level 2
     * @param p1
     * @throws LineUnavailableException
     * @throws IOException
     * @throws UnsupportedAudioFileException
     */
    public static void fightSeq2(Player p1) throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        
            File Battlefile = new File("toTheDEATH.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(Battlefile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();


        boolean correctAnswer = false;
        String lvlAnswer;
        int tries = 3;
        String loserResponse;
 

        //Lvl 2---------------------------------------------------------------------------------------------------
        while (tries > 0 && correctAnswer == false){
            System.out.println();
            slowPrint("What is the name of Robert Smith's The Cure's first released album?");
            System.out.println();
            System.out.println();
            slowPrint("Please type your answer in all lowercase <3! \n");
            Scanner fScanner = new Scanner(System.in);
            lvlAnswer= fScanner.nextLine();

            //if answer is correct
            if(lvlAnswer.equals("three imaginary boys")){
                File correct = new File("correct.wav");
                AudioInputStream audioStrea = AudioSystem.getAudioInputStream(correct);
                Clip Aclip = AudioSystem.getClip();
                Aclip.open(audioStrea);
                Aclip.start();  

                correctAnswer = true;

                slowPrint("Correct! The Cure's first album is titled Three Imaginary Boys!");
                p1.playerPoints++;
                tries = 3;

            }else{
                File incorrect = new File("incorrect.wav");
                AudioInputStream audioStr = AudioSystem.getAudioInputStream(incorrect);
                Clip Wclip = AudioSystem.getClip();
                Wclip.open(audioStr);
                Wclip.start(); 

                tries --;
                p1.playerPoints --;

                slowPrint("Nope, that's not it. You have "+tries+ " tries remaining");  
                System.out.println();  
                System.out.println();
                }
        }

        //if player dies/ runs out of tries
        if(tries == 0){
        File death = new File("dead.wav");
        AudioInputStream audioStre = AudioSystem.getAudioInputStream(death);
        Clip Dclip = AudioSystem.getClip();
        Dclip.open(audioStre);
        Dclip.start();

        slowPrint("Robert Smith: Wot? Yew downt know thot moy band The Cure's first album is titled Three Imaginary Boys?!");
        System.out.println();
        System.out.println();
        slowPrint("Sorry, you lost!");
        System.out.println();
        System.out.println();
        slowPrint("Want to try again? \n");
        Scanner loser = new Scanner(System.in);
        loserResponse = loser.nextLine();

        if(loserResponse.equals("yes")){
            slowPrint("Let's try that again....");
            System.out.println();
            tries = 3;
            fightSeq2(p1);



                
        }else{
            slowPrint("Thanks for playing! Try again another time");
            }
    }}
     





    /**
     * Level 3
     * @param p1
     * @throws LineUnavailableException
     * @throws IOException
     * @throws UnsupportedAudioFileException
     */
    public static void fightSeq3(Player p1) throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        
        File Battlefile = new File("toTheDEATH.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(Battlefile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();



        boolean correctAnswer = false;
        String lvlAnswer;
        int tries = 3;
        String loserResponse;
 

        //Lvl 3---------------------------------------------------------------------------------------------------
        while (tries > 0 && correctAnswer == false){
            System.out.println();
            slowPrint("What was Joans all female band before she was apart of Joan Jett and the Black Hearts?");
            System.out.println();
            System.out.println();
            slowPrint("Please type your answer in all lowercase <3! \n");
            Scanner fScanner = new Scanner(System.in);
            lvlAnswer= fScanner.nextLine();

            //if answer is correct
            if(lvlAnswer.equals("the runaways")||lvlAnswer.equals("runaways")){
                File correct = new File("correct.wav");
                AudioInputStream audioStrea = AudioSystem.getAudioInputStream(correct);
                Clip Aclip = AudioSystem.getClip();
                Aclip.open(audioStrea);
                Aclip.start();  

                correctAnswer = true;

                slowPrint("Correct! Joan's all female band was called The Runaways!");
                p1.playerPoints++;
                tries = 3;

            }else{
                File incorrect = new File("incorrect.wav");
                AudioInputStream audioStr = AudioSystem.getAudioInputStream(incorrect);
                Clip Wclip = AudioSystem.getClip();
                Wclip.open(audioStr);
                Wclip.start(); 

                tries --;
                p1.playerPoints --;

                slowPrint("Nope, that's not it. You have "+tries+ " tries remaining");  
                System.out.println();  
                System.out.println();
            }
                }

            //if player dies/ runs out of tries
            if(tries == 0){
                File death = new File("dead.wav");
                AudioInputStream audioStre = AudioSystem.getAudioInputStream(death);
                Clip Dclip = AudioSystem.getClip();
                Dclip.open(audioStre);
                Dclip.start();

                slowPrint("Joan Jett: Huh? Haven't you ever heard of the Runaways??!");
                System.out.println();
                System.out.println();
                slowPrint("Sorry, you lost!");
                System.out.println();
                System.out.println();
                slowPrint("Want to try again? \n");
                Scanner loser = new Scanner(System.in);
                loserResponse = loser.nextLine();

                if(loserResponse.equals("yes")){
                slowPrint("Let's try that again....");
                System.out.println();
                tries = 3;
                fightSeq3(p1);



                
                }else{
                slowPrint("Thanks for playing! Try again another time");
                }
            }}


    /**
     * prints the text character by character (method structure from @amaddentcsec on replit)
     * @param output
     */
    public static void slowPrint(String output) {
    for (int i = 0; i<output.length(); i++) {
      char c = output.charAt(i);
      System.out.print(c);
      try {
        TimeUnit.MILLISECONDS.sleep(40);
      }
      catch (Exception e) {
 
      }
    }
}


   
    /**
     * responds to y/n if the user wants game instructions at the start, loops until recieve "yes" or "no" as an input
     * @param inputScanner
     */
    public static void gameInstructions(Scanner inputScanner){
        
        System.out.println("Before we start would you like a run down of the game instructions? type yes or no");
        String response;
        boolean goAgain = false;

        while(goAgain == false) {
            response= inputScanner.nextLine();
            if(response.equals("yes")){
                goAgain = true;
                System.out.println("Here are the game play instructions!");
                System.out.println("--------------------------------------------");
                slowPrint("In BATTLE OF BANDS you will be answering trivia questions about some famous musicians.");
                System.out.println();
                slowPrint("Answer all questions correctly to prove your the best musician! Because that's how music works right?");
                System.out.println();
                System.out.println("--------------------------------------------");
            }
            else if(response.equals("no")){
                goAgain = true;
                slowPrint("Ok, let's start then shall we?");
            }
            else{
                slowPrint("Please answer yes or no in all lowercase so I can understand you: \n");
 


            }
        }
    }









   
    //Main------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        File Introfile = new File("intro.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(Introfile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();



        Scanner input = new Scanner(System.in);
        Player p1 = new Player("pName", "bandName", "inst", 10);

        //INTRODUCTION---------------------------------------------------------------------------------
        System.out.println("--------------------------------");
        slowPrint("Welcome to BATTLE OF BANDS!!!");
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();

        slowPrint("What would you like to name your character?:");
        p1.playerName = input.nextLine();
        System.out.println();
        slowPrint("Why, hello there, "+p1.playerName+"!");
        System.out.println();

        slowPrint("And what would you like to name your band?:");
        p1.playerBandAlliance = input.nextLine();
        System.out.println();
        slowPrint(p1.playerBandAlliance+"! Ooh! Has a nice ring to it!");
        System.out.println();

        slowPrint("Last character question: what instrument would you like "+p1.playerName+" to play?");
        p1.playerInstrument = input.nextLine();
        System.out.println();
        slowPrint("Awesome! "+p1.playerInstrument+" it is!");
        System.out.println();


        
        gameInstructions(input);
    

    
        System.out.println();
        slowPrint("In this game, you will be battling other bands, TO THE DEATH!!!!");
        System.out.println();
        System.out.println();
        slowPrint("Okay, maybe that's an exaggeration...");
        System.out.println();
        slowPrint("But become the VICTOR or PERISHHHHHH!!!!!!!!");
        System.out.println();

        //GAME START---------------------------------------------------------------------------------
        slowPrint("Let the battles begin!!");
        System.out.println();
        System.out.println("--------------------------------");
        slowPrint("LEVEL 1");
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("");
        
        


        slowPrint("Here comes your fellow bandmates for "+p1.playerBandAlliance+"!");
        System.out.println();

        //BANDMATES
        System.out.println();
        slowPrint("First up we have "+p1.playerBandAlliance+"'s bassist, Raven!");
        System.out.println();
        slowPrint("Raven: Ready to play bass and kick some ass!"); 
        //plays bass audio
        File bassFile = new File("bass.wav");
        audioStream = AudioSystem.getAudioInputStream(bassFile);
        Clip Bclip = AudioSystem.getClip();
        Bclip.open(audioStream);
        Bclip.start();

        
        System.out.println();
        System.out.println();
        slowPrint("Next up, "+p1.playerBandAlliance+"'s singer, Francis!");
        System.out.println();
        slowPrint("Francis: Let's tear them apart!");
        //plays guitar audio
        File guitarFile = new File("guitar.wav");
        audioStream = AudioSystem.getAudioInputStream(guitarFile);
        Clip Gclip = AudioSystem.getClip();
        Gclip.open(audioStream);
        Gclip.start();


        
        System.out.println();
        System.out.println();
        slowPrint("And last but not least, here we have Charli, "+p1.playerBandAlliance+"'s drummer!");
        System.out.println();
        slowPrint("Charli: Let's do this!!!!!"); 
        //plays drum audio
        File drumFile = new File("drum.wav");
        audioStream = AudioSystem.getAudioInputStream(drumFile);
        Clip Dclip = AudioSystem.getClip();
        Dclip.open(audioStream);
        Dclip.start();
        
        System.out.println();
        System.out.println();
        slowPrint("Uh oh... and here comes your first opponent...");
        slowPrint("The Pearls of Destruction!");
        System.out.println();


        //OPPONENT 1
        slowPrint("Moria, guitarist from P.O.D: Ha! You think you can defeat The Pearls of Destruction?");
        System.out.println();
        System.out.println();

        slowPrint("Lilith, bassist from P.O.D: We have a secret weapon...");
        System.out.println();
        System.out.println();

        slowPrint("Gerard Way, singer for P.O.D: Yeah, and that's me! ");
        System.out.println();
        System.out.println();

        slowPrint("Gerard Way?! From hit American rock band My Chemical Romance?! Hmm, if only we knew some trivia about him...");
        System.out.println();
        slowPrint("Ready? FIGHT!");
        System.out.println();

        fightSeq(p1);

        System.out.println();
        slowPrint("Congrats on completing Level 1! Here are "+p1.playerName+"'s current stats");
        System.out.println();
        System.out.println();
        slowPrint("Score: "+p1.playerPoints);
        System.out.println();
        System.out.println();


        slowPrint("On to Level 2...");


        System.out.println();
        System.out.println("--------------------------------");
        slowPrint("LEVEL 2");
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("");

        //OPPONENT 2
        slowPrint("And your next opponent is... Gast Station Jade");
        System.out.println();
        System.out.println();


        slowPrint("Kancer, guitarist from G.S.J: Gas Station Jade RULEZ!");
        System.out.println();
        System.out.println();

        slowPrint("Hamlet, drummer from G.S.J: We also have a secret weapon...");
        System.out.println();
        System.out.println();

        slowPrint("Robert Smith, singer for G.S.J: And thots me! ");
        System.out.println();
        slowPrint("Don't mind Robert's bizarre speach.. he's British ya know?");
        System.out.println();
        System.out.println();

        slowPrint("Robert Smith! From hit British goth-pop band The Cure! Hmm, if only we knew some trivia about him...");
        System.out.println();
        slowPrint("Ready? FIGHT!");
        System.out.println();


        fightSeq2(p1);

        System.out.println();
        slowPrint("Congrats on completing Level 2! Here are "+p1.playerName+"'s current stats");
        System.out.println();
        System.out.println();
        slowPrint("Score: "+p1.playerPoints);
        System.out.println();
        System.out.println();

        slowPrint("You're doing great "+p1.playerName+"! One more Level to go!");

        System.out.println();
        System.out.println("--------------------------------");
        slowPrint("LEVEL 3");
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("");

        //OPPONENT 3
        slowPrint("And your last opponent is... Crash Kurse");
        System.out.println();
        System.out.println();


        slowPrint("Magnolia, bassist from C.K: You'll never beat Crash Kurse!");
        System.out.println();
        System.out.println();

        slowPrint("Lucifer, guitarist from C.K: Our secret weapon has a bad, baaaad reputation....");
        System.out.println();
        System.out.println();

        slowPrint("Joan Jett, singer for C.K: And I don't give a damn about it!!");
        System.out.println();
        System.out.println();

        slowPrint(" Joan Jett! THE JOAN JETT?!?!?!?!?! Hmm, if only we knew some trivia about her...");
        System.out.println();
        slowPrint("Ready? FIGHT!");
        System.out.println();


        fightSeq3(p1);

        System.out.println();
        slowPrint("Congrats on completing Level 3! Here are "+p1.playerName+"'s current stats");
        System.out.println();
        System.out.println();
        slowPrint("Score: "+p1.playerPoints);
        System.out.println();
        System.out.println();


        System.out.println();
        System.out.println("--------------------------------");
        slowPrint("YOU WIN!!!!");
        System.out.println();
        slowPrint(p1.playerName+"'s score is: "+p1.playerPoints);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("");




        


    }





    
    



}



