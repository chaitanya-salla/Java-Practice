public class CheckIsNumeric {
    public static void main(String[] args) {
        System.out.println(isNumeric("1"));
        System.out.println(isNumeric("ab"));
        System.out.println(isNumeric(""));
        System.out.println(isNumeric(" "));
        System.out.println(isNumeric(null));
    }

    private static boolean isNumeric(CharSequence sequence) {
        if(sequence == null || sequence.isEmpty()) return false;

        for (int i = 0; i < sequence.length(); i++) {
            if(!Character.isDigit(sequence.charAt(i))) return false;
        }
        return true;
    }



}
