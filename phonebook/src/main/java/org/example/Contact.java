package org.example;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
public abstract class Contact {
    Scanner getInfo = new Scanner(System.in);
    List <String>contactNameList = new ArrayList<>();
    List <String>contactPhoneList = new ArrayList<>();
    public abstract void setContact();
    public abstract void getContact();
}
