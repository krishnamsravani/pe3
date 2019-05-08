import java.util.Scanner;

class someMyexception extends Exception {
    public someMyexception(String str)
    {
        super(str);
    }
}
class ExceptionHandling
{
    public void checkDivision(int num) throws someMyexception
    {
        if (num == 0)
        {
            someMyexception divideByZero = new someMyexception("Divide By Zero Exception");
            throw divideByZero;
        } else
            System.out.println(10/num);

    }

}
public class TryCatchMyException
{
        public static void main(String args[])
        {
            int number;
            System.out.println("Enter Denominator...");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            ExceptionHandling handlingException = new ExceptionHandling();

            try
            {

                handlingException.checkDivision(number);
            } catch (Exception e)
            {
                System.out.println(e.getMessage());

            }
            finally
            {
                System.out.println("Inside finally");
            }
        }
}
