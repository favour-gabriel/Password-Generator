package Assignment;

abstract class NewBoltDriver {

    abstract void driver();

   private String fullName;
    private String emailAddress;
   private long phoneNumber;
   private String gender;
   private String carModel;
   private int carYear;
   private String plateNumber;
   private String bankName;
   private int bankAccount;
   private String password;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCarModel(){
        return carModel;
    }

    public void setCarModel(String carModel){
        this.carModel = carModel;
    }

    public int getCarYear(){
        return carYear;
    }

    public void setCarYear(int carYear){
        this.carYear = carYear;
    }

    public String getPlateNumber(){
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public String getBankName(){
        return bankName;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public int getBankAccount(){
        return bankAccount;
    }

    public void setBankAccount(int bankAccount){
        this.bankAccount = bankAccount;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void registration(String fullName, String emailAddress, long phoneNumber, String gender, String carModel,
                             int carYear, String plateNumber, String bankName, int bankAccount, String password, BoltDriver drive[]) {

        setFullName(fullName);
        setEmailAddress(emailAddress);
        setPhoneNumber(phoneNumber);
        setGender(gender);
        setCarModel(carModel);
        setCarYear(carYear);
        setPlateNumber(plateNumber);
        setBankName(bankName);
        setBankAccount(bankAccount);
        setPassword(password);

        for (int a = 0; a < drive.length; a++){

            if (drive[a] == null){

                break;
            }
        }
    }

    public void display(BoltDriver drive[]) {

        for (int a = 0; a < drive.length; a++) {

            if (drive[a] != null) {

                System.out.println("Full name: " + drive[a].getFullName() + ".");
                System.out.println("Email address: " + drive[a].getEmailAddress() + ".");
                System.out.println("Phone number: " + drive[a].getPhoneNumber() + ".");
                System.out.println("Gender: " + drive[a].getGender() + ".");
                System.out.println("Car model: " + drive[a].getCarModel() + ".");
                System.out.println("Car year: " + drive[a].getCarYear() + ".");
                System.out.println("Bank name: " + drive[a].getBankName() + ".");
                System.out.println("Bank account number: " + drive[a].getBankAccount() + ".");
                System.out.println("Plate number: " + drive[a].getPlateNumber() + ".");
                System.out.println("Password: " + drive[a].getPassword() + ".");

                System.out.println("===============================================");
            }
        }
    }

    public void update(String fullName, String emailAddress, long phoneNumber, String gender, String carModel, int carYear,
                       String plateNumber, String bankName, int bankAccount, String password, BoltDriver drive[]) {

        setFullName(fullName);
        setEmailAddress(emailAddress);
        setPhoneNumber(phoneNumber);
        setGender(gender);
        setCarModel(carModel);
        setCarYear(carYear);
        setPlateNumber(plateNumber);
        setBankName(bankName);
        setBankAccount(bankAccount);
        setPassword(password);

        for (int a = 0; a < drive.length; a++) {

            if (drive[a] != null) {

                break;

            }
        }
    }


    public boolean login(String emailAddress, String password, BoltDriver[] drive) {

        for (int w = 0; w < drive.length; w++) {

            if (drive[w] != null) {

                if (drive[w].getEmailAddress().equals(emailAddress) && drive[w].getPassword().equals(password)) {
                    System.out.println("Login successful.");
                    return true;
                }
            } else {
                System.out.println("Invalid login." + w + ".");
            }
        }
        System.out.println("Invalid login. Driver not found, please contact your admin.");

        return false;
    }

    public void deregister(String emailAddress, BoltDriver drive[]){

        for (int w = 0; w < drive.length; w++){

            if (drive[w] != null){


                if (getEmailAddress().equalsIgnoreCase(emailAddress)){

                    drive[w] = null;
                    break;
                }
            }

        }

    }

    public void logout(BoltDriver drive[]){

        if (drive != null){

            System.out.println("Logging out driver: " + emailAddress);

            System.out.println();
            System.out.println("Logout successful.");

        }

    }

    }