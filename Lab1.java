import java.util.regex.Pattern;

class Lab1 {
    public static void main(String[] args) {
        System.out.println(task1());
        System.out.println(task2());
    }

    private static String task1() {
        final var pattern = Pattern.compile("^.*log\\.\\w+\\(\\\"(.*)\\\".*\\);?$");
        final var input = "log.debug(\"saveFilter: filter saved={}\", saved);";
        final var matcher = pattern.matcher(input);
        matcher.matches();
        return matcher.group(1);
    }

    private static String task2() {
        final var pattern = Pattern.compile(".(?=.{4})");
        final var input = "+7-901-777-1234";
        return pattern.matcher(input).replaceAll("*");
    }
}
