package Assignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

   public class BoltDriver extends NewBoltDriver{

       @Override
       void driver() {
           System.out.println("Your car must be older than 2014.");
       }

       public static void main(String[] args) {

            BoltDriver bolt = new BoltDriver();

            BoltDriver drive[] = new BoltDriver[200];

            Scanner scan = new Scanner(System.in);

            LocalDateTime time = LocalDateTime.now().plusDays(4);

            for (int b = 0; b < 10; b++) {

                System.out.println();
                System.out.println("1. Register as a new driver.");
                System.out.println("2. Login as a bolt driver.");

                int option = scan.nextInt();

                if (option == 1) {

                    bolt = new BoltDriver();

                    System.out.println("========Register=========");

                    System.out.println("    ");

                    scan.nextLine();
                    System.out.println("Enter your full name: ");
                    String fullName = scan.nextLine();

                    System.out.println("Enter your gender: ");
                    String gender = scan.nextLine();

                    System.out.println("Enter your email address: ");
                    String emailAddress = scan.nextLine();

                    System.out.println("Enter your phone number: ");
                    long phoneNumber = scan.nextLong();

                    scan.nextLine();
                    System.out.println("Enter your car model: ");
                    String carModel = scan.nextLine();

                    System.out.println("Enter your car year: ");
                    int carYear = scan.nextInt();

                    System.out.println("Enter your plate number: ");
                    String plateNumber = scan.nextLine();

                    scan.nextLine();
                    System.out.println("Enter your bank name: ");
                    String bankName = scan.nextLine();

                    System.out.println("Enter your bank account: ");
                    int bankAccount = scan.nextInt();

                    System.out.println("Enter password: ");
                    String password = scan.nextLine();
                    scan.nextLine();

                    System.out.println();

                    if (carYear < 2014){
                        System.out.println("You do not qualify.");
                        break;
                    }

                    else if (carYear > 2014){
                        System.out.println("You have successfully register as a new driver.");
                    }

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE,MMMM dd yyyy HH:mm");

                    String formattedDate = time.format(formatter);

                    System.out.println("you have an appointment on " + formattedDate);

                    System.out.println();

                    bolt.driver();
                    bolt.registration(fullName, emailAddress, phoneNumber, gender, carModel, carYear,
                            password, bankName, bankAccount, plateNumber, drive);


                }

                else if (option == 2) {

                    System.out.println("======Login==========");

                    System.out.println("Enter email address:");
                    String emailAddress = scan.nextLine();

                    System.out.println("Enter password: ");
                    String password = scan.nextLine();

                    bolt.login(emailAddress, password, drive);
                }


                    for (int y = 0; y < 10; y++) {


                        System.out.println("1. Display driver information.");
                        System.out.println("2. Update driver information.");
                        System.out.println("3. Deregister your account.");
                        System.out.println("4. Logout.");

                        int input = scan.nextInt();

                        if (input == 1) {

                            System.out.println("=========Display==========");

                            bolt.display(drive);
                        } else if (input == 2) {

                            System.out.println("=========Update================");

                            System.out.println("Enter your full name: ");
                            String fullName = scan.nextLine();

                            scan.nextLine();
                            System.out.println("Enter your gender: ");
                            String gender = scan.nextLine();

                            System.out.println("Enter your email address: ");
                            String emailAddress = scan.nextLine();

                            System.out.println("Enter your phone number: ");
                            long phoneNumber = scan.nextLong();

                            scan.nextLine();
                            System.out.println("Enter your car model: ");
                            String carModel = scan.nextLine();

                            System.out.println("Enter your plate number: ");
                            String plateNumber = scan.nextLine();

                            System.out.println("Enter your bank name: ");
                            String bankName = scan.nextLine();

                            System.out.println("Enter your bank account: ");
                            int bankAccount = scan.nextInt();

                            System.out.println("Enter your car year: ");
                            int carYear = scan.nextInt();

                            System.out.println("Enter password: ");
                            String password = scan.nextLine();
                            scan.nextLine();

                            bolt.update(fullName, emailAddress, phoneNumber, gender, carModel, carYear,
                                    password, bankName, bankAccount, plateNumber, drive);

                        }

                        else if (input == 3) {

                            System.out.println("==========Deregister============");

                            System.out.println();
                            System.out.println("Enter your email address: ");
                            String emailAddress = scan.nextLine();

                            scan.nextLine();
                            System.out.println("You have successfully deregister your account.");

                            bolt.deregister(emailAddress, drive);
                        }

                        else if (input == 4) {

                            System.out.println("============Logout. Return to main page.================");
                            bolt.logout(drive);
                        }
                    }
            }

        }

    }