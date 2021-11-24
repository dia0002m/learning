package de.p7s1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class User {
    private int id;
    private String userName;
    private String password;
    private static String firstName;
    private static String lastName;
    private String dateOfBirht;

    public User(int id, String userName, String password, String firstName, String lastName, String dateOfBirht) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirht = dateOfBirht;
    }

    public static void printNameInSmallLetter(String f, String l) {
        System.out.println(f);
        System.out.println(l);
    }

    public static List<User> printNameInSmallLetter2() {
        List<String> letters = new ArrayList<>();
        letters.add(firstName);
        letters.add(lastName);

        for (String letter : letters) {
            String newValue = letter.toLowerCase(Locale.ROOT);
            System.out.println(newValue);
        }
        System.out.println(letters);
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVorName() {
        return firstName;
    }

    public void setVorName(String vorName) {
        this.firstName = vorName;
    }

    public String getNachName() {
        return lastName;
    }

    public void setNachName(String nachName) {
        this.lastName = nachName;
    }

    public String getDateOfBirht() {
        return dateOfBirht;
    }

    public void setDateOfBirht(String dateOfBirht) {
        this.dateOfBirht = dateOfBirht;
    }

    @Override
    public String toString() {
        return "User{" +
                "id: " + id +
                ", userName: " + userName +
                ", password: " + password +
                ", firstName: " + firstName +
                ", lastName: " + lastName +
                ", dateOfBirht: " + dateOfBirht + '\n' +
                '}';
    }
}
