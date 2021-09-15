public class Main {

//    validWordNest("deep", "deep") ➞ true
//    validWordNest("novel", "nonnonovnovnovelelelvelovelvel") ➞ true
//    validWordNest("painter", "ppaintppapaipainterinternteraintererainter") ➞ false
//    validWordNest("shape", "sssshapeshapehahapehpeape") ➞ false

    public static void main(String[] args) {
        System.out.println(validWordNest("deep", "deep"));
        System.out.println(validWordNest("novel", "nonnonovnovnovelelelvelovelvel"));
        System.out.println(validWordNest("painter", "ppaintppapaipainterinternteraintererainter"));
        System.out.println(validWordNest("shape", "sssshapeshapehahapehpeape"));
        System.out.println(validWordNest("broadcast", "broadcbroadcastbroadcastast"));


    }

    public static boolean validWordNest(String word, String nest) {
        if (nest.contains(word)) {
            while (nest.contains(word)) {
                if (nestValid(word, nest)) {
                    nest = nest.replace(word, "");
                } else {
                    return false;
                }
            }
        }

        if (nest.length() == 0) {
            return true;
        }

        return false;
    }

    private static boolean nestValid(String word, String nest) {
        int len = word.length();
        int lastIndex = nest.indexOf(word) + len;
        nest = nest.substring(lastIndex);

        if (nest.contains(word))
            return false;

        return true;
    }
}
