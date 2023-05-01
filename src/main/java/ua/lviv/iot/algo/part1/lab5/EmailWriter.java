package ua.lviv.iot.algo.part1.lab5;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailWriter {
    public static final String EMAIL_DOMAIN_SEPARATOR = "@";
    public final Pattern EMAIL_PATTERN = Pattern.compile("[\\w-%]+@[\\w-%]+\\.[A-Za-z]{2,}");
    private final List<String> domains = new LinkedList<>();

    public String findDomainsFromEmail(String text) {
        Matcher matcher = EMAIL_PATTERN.matcher(text);
        while (matcher.find()) {
            String email = matcher.group();
            domains.add(email.split(EMAIL_DOMAIN_SEPARATOR)[1]);
        }
        return domains.toString();
    }
}
