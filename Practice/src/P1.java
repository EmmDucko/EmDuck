public class P1 {
    public P1() {
    }

    public static long[] clonewars(int kataPerDay) {
        int clones = 1;
        int cata_solved = 0;

        for(int y = 1; y < kataPerDay; ++y) {
            clones *= 2;
            cata_solved += (kataPerDay - y) * clones;
        }

        long cata_overll = (long)(cata_solved + kataPerDay);
        long[] result = new long[]{(long)clones, cata_overll};
        return result;
    }
}