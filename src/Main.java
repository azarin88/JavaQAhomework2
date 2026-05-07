public class Main
{
    public static void main (String[] args)
    {
        short account = 100;
        short replenishment = 200;
        if (replenishment >= 1000)
        {
            System.out.println("Баланс: " + (account + replenishment * (1 + 0.01)) + " рублей.");
            System.out.println("Бонус: " + replenishment * 0.01 + " рублей");
        }
        else
        {
            System.out.println("Баланс: " + (account + replenishment) + " рублей.");
            System.out.println("Бонус начисляется при пополнении счета от 1000 рублей! ;)");
        }
    }
}
