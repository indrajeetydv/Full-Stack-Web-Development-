class ConstantsWithoutEnums
{
    public static final String east = "EAST";
    public static final String west = "WEST";
    public static final String north = "NORTH";
    public static final String south = "SOUTH";
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println(ConstantsWithoutEnums.east);
        System.out.println(ConstantsWithoutEnums.west);
        System.out.println(ConstantsWithoutEnums.north);
        System.out.println(ConstantsWithoutEnums.south);
    }
}