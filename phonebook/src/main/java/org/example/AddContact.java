package org.example;
import java.util.ArrayList;
import java.util.List;

public class AddContact extends Contact {


    boolean answer = false;

    @Override
    public void setContact() {
        do{
            System.out.println("Do you want to add contact? Type in 'y' for yes and 'n' for no");
            char ans = getInfo.nextLine().charAt(0);
            if(ans == 'y'){
                System.out.println("Contact Name:");
                    String name = getInfo.nextLine();
                System.out.println("Phone Number:");
                    String phoneNumber = getInfo.nextLine();
                //checking if value exists already
                if(!contactNameList.contains(name) || !contactPhoneList.contains(phoneNumber)){
                    contactNameList.add(name);
                    contactPhoneList.add(phoneNumber);
                    System.out.println("Total Number of contacts: " +contactNameList.size());
                }else if(contactNameList.contains(name) && contactPhoneList.contains(phoneNumber)){
                    //checking for duplicate contacts
                    System.out.println("This contact exists already!");
                }


            }else if(ans == 'n'){
                answer = true;
            }else{
                System.out.println("Invalid input, try again!");
            }
        }while(!answer);
    }


    public void getContact() {
        boolean answer = false;
        List <String> listOfIndexes = new ArrayList<>();
        do{
            System.out.println("Do you want to search contact? Type in 'y' for yes and 'n' for no");
            char ans = getInfo.nextLine().charAt(0);

            if(ans == 'y'){
                System.out.println("Type search term:");
                String searchTerm = getInfo.nextLine();
                
                List <String>forNameList = new ArrayList<>();
                List <String>forNumList = new ArrayList<>();

                //checking if searchTerm is contained in any of the lists
                if(contactNameList.contains(searchTerm) || contactPhoneList.contains(searchTerm)){

                    for(int i = 0; i < contactNameList.size(); i++){
                        if(contactNameList.get(i).equals(searchTerm)){
                            forNameList.add(Integer.toString(i));
                        }
                    }



                    for(int j = 0; j < contactPhoneList.size(); j++){
                        if(contactPhoneList.get(j).equals(searchTerm)){
                            forNumList.add(Integer.toString(j));
                        }
                    }

                    if(forNameList.size() > 0){
                        listOfIndexes = forNameList;
                    }else{
                        listOfIndexes = forNumList;
                    }
                    //displaying search results
                    for(String count : listOfIndexes){
                        System.out.println(contactNameList.get(Integer.parseInt(count)) + "\t" + contactPhoneList.get(Integer.parseInt(count)));
                    }


                }else{

                    System.out.println("Sorry no such contact exits!");
                }
            }else if(ans == 'n'){
                answer = true;
            }else{
                System.out.println("Invalid input, try again!");
            }
        }while(!answer);
    }
}
