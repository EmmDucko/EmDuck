public class Cats
{
    public static int solution()
    {
        int start = 1;
        int finish = 8;
        int number = finish - start;

        int nnoBigJumps = number % 3;
        int bigJumps = (number / 3);

        int result = nnoBigJumps + bigJumps;

        return result;
    }
}