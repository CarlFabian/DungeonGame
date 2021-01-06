
public class Item
{
   // variabler för namn och beskrivning
   private String name;
   private String desc;

   // Konstruktor för objektet Item.
   public Item(String name, String desc)
   {
      this.setName(name);
      this.setDesc(desc);
   }

   // setters och getters
   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getDesc()
   {
      return desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

}
