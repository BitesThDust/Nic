package F;

class Calculation {
    public static String replace (String ant, String bnt){
        StringBuilder resultBuilder = new StringBuilder(ant.toString());
        int index = resultBuilder.indexOf(bnt);
        if (index != -1) {
            resultBuilder.delete(index, index + bnt.length());
        }
        return resultBuilder.toString();
    }
    public static String multiply (String ant,int a){
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < a; i++) {
            s.append(ant);
        }
        return s.toString();
    }
    public static String davide (String ant,int a){
        String result = ant.substring(0, ant.length() / a);
        return result;

    }
}