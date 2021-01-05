
public class AsciiArt
{
   //skriver ut startskärm.
   public static void startScreen()
   {
      System.out.print("Welcome to");
      System.out.print("\r\n" + 
            " __, __,  _,  _,  _, _, _   ___ __, __,  _,  _, _,_ __, __,\r\n" + 
            " | \\ |_) /_\\ / _ / \\ |\\ |    |  |_) |_  /_\\ (_  | | |_) |_ \r\n" + 
            " |_/ | \\ | | \\ / \\ / | \\|    |  | \\ |   | | , ) | | | \\ |  \r\n" + 
            " ~   ~ ~ ~ ~  ~   ~  ~  ~    ~  ~ ~ ~~~ ~ ~  ~  `~' ~ ~ ~~~\r\n" + 
            "                                                           \r\n" + 
            "");
      System.out.println("Write your name and press [Enter] to start a new game...");
   }
   
   //skriver ut draken.
   public static void displayDragon()
   {
      System.out.println("                                                  .~))>>\n"
            + "                                                 .~)>>\n"
            + "                                               .~))))>>>\n"
            + "                                             .~))>>             ___\n"
            + "                                           .~))>>)))>>      .-~))>>\n"
            + "                                         .~)))))>>       .-~))>>)>\n"
            + "                                       .~)))>>))))>>  .-~)>>)>\n"
            + "                   )                 .~))>>))))>>  .-~)))))>>)>\n"
            + "                ( )@@*)             //)>))))))  .-~))))>>)>\n"
            + "              ).@(@@               //))>>))) .-~))>>)))))>>)>\n"
            + "            (( @.@).              //))))) .-~)>>)))))>>)>\n"
            + "          ))  )@@*.@@ )          //)>))) //))))))>>))))>>)>\n"
            + "       ((  ((@@@.@@             |/))))) //)))))>>)))>>)>\n"
            + "      )) @@*. )@@ )   (\\_(\\-\\b  |))>)) //)))>>)))))))>>)>\n"
            + "    (( @@@(.@(@ .    _/`-`  ~|b |>))) //)>>)))))))>>)>\n"
            + "     )* @@@ )@*     (@)  (@) /\\b|))) //))))))>>))))>>\n"
            + "   (( @. )@( @ .   _/  /    /  \\b)) //))>>)))))>>>_._\n"
            + "    )@@ (@@*)@@.  (6///6)- / ^  \\b)//))))))>>)))>>   ~~-.\n"
            + " ( @jgs@@. @@@.*@_ VvvvvV//  ^  \\b/)>>))))>>      _.     `bb\n"
            + " ((@@ @@@*.(@@ . - | o |' \\ (  ^   \\b)))>>        .'       b`,\n"
            + "   ((@@).*@@ )@ )   \\^^^/  ((   ^  ~)_        \\  /           b `,\n"
            + "     (@@. (@@ ).     `-'   (((   ^    `\\ \\ \\ \\ \\|             b  `.\n"
            + "       (*.@*              / ((((        \\| | |  \\       .       b `.\n"
            + "                         / / (((((  \\    \\ /  _.-~\\     Y,      b  ;\n"
            + "                        / / / (((((( \\    \\.-~   _.`\" _.-~`,    b  ;\n"
            + "                       /   /   `(((((()    )    (((((~      `,  b  ;\n"
            + "                     _/  _/      `\"\"\"/   /'                  ; b   ;\n"
            + "                 _.-~_.-~           /  /'                _.'~bb _.'\n"
            + "               ((((~~              / /'              _.'~bb.--~\n"
            + "                                  ((((          __.-~bb.-~\n"
            + "                                              .'  b .~~\n"
            + "                                              :bb ,' \n"
            + "                                              ~~~~\n");
   }
   
   
   
   //skriver ut skatten
   public static void displayTreasure()
   {
      System.out.println("                  _.--.\n" + "              _.-'_:-'||\n" + "          _.-'_.-::::'||\n"
            + "     _.-:'_.-::::::'  ||\n" + "   .'`-.-:::::::'     ||\n" + "  /.'`;|:::::::'      ||_\n"
            + " ||   ||::::::'      _.;._'-._\n" + " ||   ||:::::'   _.-!oo @.!-._'-.\n"
            + " \'.  ||:::::.-!() oo @!()@.-'_.||\n" + "   '.'-;|:.-'.&$@.& ()$%-'o.'\\U||\n"
            + "     `>'-.!@%()@'@_%-'_.-o _.|'||\n" + "      ||-._'-.@.-'_.-' _.-o  |'||\n"
            + "      ||=[ '-._.-\\U/.-'    o |'||\n" + "      || '-.]=|| |'|      o  |'||\n"
            + "      ||      || |'|        _| ';\n" + "      ||      || |'|    _.-'_.-'\n"
            + "      |'-._   || |'|_.-'_.-'\n" + "      '-._'-.|| |' `_.-'\n" + "           '-.||_/.-'\n");
   }
   
   //skriver ut bild på "utomhus"
   public static void displayOutside()
   {
      System.out.print("        _    .  ,   .           .\r\n" + 
            "    *  / \\_ *  / \\_      _  *        *   /\\'__        *\r\n" + 
            "      /    \\  /    \\,   ((        .    _/  /  \\  *'.\r\n" + 
            " .   /\\/\\  /\\/ :' __ \\_  `          _^/  ^/    `--.\r\n" + 
            "    /    \\/  \\  _/  \\-'\\      *    /.' ^_   \\_   .'\\  *\r\n" + 
            "  /\\  .-   `. \\/     \\ /==~=-=~=-=-;.  _/ \\ -. `_/   \\\r\n" + 
            " /  `-.__ ^   / .-'.--\\ =-=~_=-=~=^/  _ `--./ .-'  `-\r\n" + 
            "/        `.  / /       `.~-^=-=~=^=.-'      '-._ `._\r\n" + 
            "");
   }
   
   //tar in 4 booleans för varje kordinat och skriver ut en karta över rummet beroende på vilka dörrar som finns.
   public static void displayRoom(boolean N, boolean S, boolean W, boolean E)
   {
    
    if(N)
    {
       System.out.print(
             " ___________     ____________\r\n" +  
             "|  _________     __________  |\r\n" + 
             "| |           N            | |\r\n" + 
             "| |                        | |\r\n" + 
             "| |                        | |\r\n" );
    }
    else
    {
       System.out.print(
             " ____________________________\r\n" +  
             "|  ________________________  |\r\n" + 
             "| |                        | |\r\n" + 
             "| |                        | |\r\n" + 
             "| |                        | |\r\n" );
    }

    if(W && E)
    {
       System.out.print(
             "                               \r\n" + 
             "   W                      E    \r\n" + 
             "                               \r\n");
    }
    else if (W && !E)
    {
       System.out.print(
             "                           | | \r\n" + 
             "   W                       | | \r\n" + 
             "                           | | \r\n");
    }
    else if (!W && E)
    {
       System.out.print(
             "| |                           \r\n" + 
             "| |                       E   \r\n" + 
             "| |                           \r\n");
    }
    else
    {
       System.out.print(
             "| |                        | | \r\n" + 
             "| |                        | | \r\n" + 
             "| |                        | | \r\n");
    }

      
    if(S)
    {
       System.out.print(
             "| |                        | |\r\n" + 
             "| |                        | |\r\n" + 
             "| |_________  S  __________| |\r\n" + 
             "|___________     ____________|\n" ); 
    }
    else
    {
       System.out.print(
             "| |                        | |\r\n" + 
             "| |                        | |\r\n" + 
             "| |________________________| |\r\n" + 
             "|____________________________|\n" ); 
    }

      

      

   }
}
