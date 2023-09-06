public class Pet implements Comparable<Pet>
{

         private String name;
         private String type;
         private double price;

         public Pet(String Name, String Type, double Price)
        {
            name = Name;
            type = Type;
            price = Price;
        }

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public double getPrice()
    {
        return price;
    }

    public void printInfo()
        {System.out.printf("%-15s %-8s  %.2f%n", name, type+ ":", price ); }

        public int compareTo(Pet other)
        {
            if(type.compareTo(other.type) == 0)
                return Double.compare(price, other.price);
            else
                return type.compareTo(other.type);
        }
}
