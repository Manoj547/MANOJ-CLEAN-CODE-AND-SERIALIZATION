package epamCleanCode.homecost;

public class Home
{
    String material;
    double area;
    Boolean automated;

    public Home(String mat, double ar, Boolean auto)
    {
        material = mat;
        area = ar;
        automated = auto;
    }

    public double totalCost()
    {
        double cost = 0.0;
        if(automated == true)
        {
            cost = 700;
        }
        switch(material)
        {
            case "s" :
            case "S" :
                cost += 1200;
                return cost*area;


            case "a" :
            case "A" :
                cost += 1500;
                return cost*area;

            case "h" :
            case "H" :
                cost += 1800;
                return cost*area;

            default :
                return 0;
        }
    }
}