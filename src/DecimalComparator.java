public class DecimalComparator {
    public static void main(String[] args) {

        boolean firstTest = areEqualByThreeDecimalPlaces(456.45645,5468545);
        boolean secondTest = areEqualByThreeDecimalPlaces(3.145, 3.146);
        boolean thirdTest = areEqualByThreeDecimalPlaces(3.157789,3.157859);

        System.out.println(firstTest);
        System.out.println(secondTest);
        System.out.println(thirdTest);

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble) {

        return (long) (firstDouble * 1000) == (long) (secondDouble * 1000);

        /* The below is describing exactly how this method works in a more detailed way.
        long firstLong = (long) (firstDouble * 1000);
        long secondLong = (long) (secondDouble * 1000);

        if (firstLong == secondLong) {
            return true;
        } else {
            return false;
        }
        */




    }
}