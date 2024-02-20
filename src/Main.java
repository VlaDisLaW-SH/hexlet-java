public class Main {
    public static void main(String[] args) {
        //System.out.println(numJewelsInStones("z", "zzL"));
        String name1 = "1";
        String name2 = name1.concat("2");
        System.out.println(name2);
        name2 = name2.concat("3");
        System.out.println(name2);
    }

    /*public static int numJewelsInStones(String jewels, String stones) {
        int countJewels = 0;
        int oneJewels = 0;

        for (int i = 0; i < stones.length(); i++) {

            countJewels = oneJewels + countJewels;
            System.out.println(countJewels);

            if (jewels.charAt(i) == stones.charAt(i)) {
                oneJewels = oneJewels + 1;
                System.out.println(oneJewels);
            }
        }
    return countJewels;
    }*/
}