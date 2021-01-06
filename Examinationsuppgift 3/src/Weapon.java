
public class Weapon extends Item
{
   // variabel som ökar skada som spelaren gör.
   private static int increaseDamage;

   // Konstruktor för Weapon-Objekt
   public Weapon(String name, String desc, int increaseDamage)
   {
      super(name, desc);
      Weapon.setIncreaseDamage(increaseDamage);

   }

   // Getter och Setter
   public static int getIncreaseDamage()
   {
      return increaseDamage;
   }

   public static void setIncreaseDamage(int increaseDamage)
   {
      Weapon.increaseDamage = increaseDamage;
   }
}
