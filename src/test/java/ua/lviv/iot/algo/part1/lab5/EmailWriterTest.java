package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailWriterTest {
    EmailWriter emailWriter;

    @BeforeEach
    void setUp() {
        emailWriter = new EmailWriter();
    }

    @Test
    void findEmails() {
        String str = "To regain access to your account, please contact " +
                "us at support@ourcompany.com or send an email to recovery@ourcompany.net.";
        Assertions.assertEquals("[ourcompany.net, ourcompany.com]", emailWriter.findEmails(str));
    }

    @Test
    void findEmailsInTextWithoutIt(){
        String str = "I have coffee";
        Assertions.assertEquals("[]", emailWriter.findEmails(str));
    }

    @Test
    void findEmailsInTextWithWrongFormat(){
        String str = "I have coffee and my email is recovery@our.t and second: recovery&our.ua";
        Assertions.assertEquals("[]", emailWriter.findEmails(str));
    }
}