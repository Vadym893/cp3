public class DrivingLicense {
    private String name;
    private String surname;
    private String adress;
    private int postal_code;
    private String city;
    private int year_of_issue;
    private String driving_licence_category;
    // rest of fields
    // ...
    public void display(){
        System.out.println("Driving licence issued for the "+name+" "+surname+" with adress of  "+adress+" "+postal_code+" city: "+city+" issued in "+year_of_issue+" with a category of "+driving_licence_category);
    }
    public String toString(){
        return ("Driving licence issued for the "+name+" "+surname+" with adress of  "+adress+" "+postal_code+" city: "+city+" issued in "+year_of_issue+" with a category of "+driving_licence_category);
    }
    public String getAdress() {
        return adress;
    }
    public String getCity() {
        return city;
    }
    public String getDriving_licence_category() {
        return driving_licence_category;
    }
    public String getName() {
        return name;
    }
    public int getPostal_code() {
        return postal_code;
    }
    public String getSurname() {
        return surname;
    }
    public int getYear_of_issue() {
        return year_of_issue;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDriving_licence_category(String driving_licence_category) {
        this.driving_licence_category = driving_licence_category;
    }
    public void setName(String name) {
        this.name = name.substring(0,1).toUpperCase()+name.substring(1,name.length()).toLowerCase();
    }
    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setYear_of_issue(int year_of_issue) {
        if (year_of_issue<1980 || year_of_issue>2024){
            System.out.println("Isnt it a lil impossible????");
        }
        else{
            this.year_of_issue = year_of_issue;
        }
        
    }
    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();
        dl.setAdress("rakowicka 31");
        dl.setCity("Krakow");
        dl.setDriving_licence_category("light vehicle");
        dl.setName("seBAStien");
        dl.setSurname("Einsteinowicz");
        dl.setPostal_code(65789);
        dl.setYear_of_issue(1971);
        System.out.println(dl.name);
        dl.display();
    }
}

    
