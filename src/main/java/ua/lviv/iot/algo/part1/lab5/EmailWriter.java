package ua.lviv.iot.algo.part1.lab5;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailWriter {
    Set<String> domains = new HashSet<>();
    Pattern pattern = Pattern.compile("\\b[\\w-%]+@[\\w-%]+\\.[A-Za-z]{2,}\\b");

    public String findEmails(String string) {
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            String email = matcher.group();
            String[] splitStr = email.split("@");
            domains.add(splitStr[1]);
        }

        for (String domain : domains) {
            System.out.println(domain);
        }
        return domains.toString();
    }
}
