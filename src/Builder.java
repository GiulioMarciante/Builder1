public class Builder {
    String firstName;

    String lastName;

    int age;
    String address;

    boolean married;

    public Builder setfirstName(String firstName){
        this.firstName = firstName;
        return this;
    }
    public Builder setlastName(String lastName){
        this.lastName = lastName;
        return this;
    }
    public Builder setage(int age){
        this.age = age;
        return this;
    }
    public Builder setaddress(String address){
        this.address = address;
        return this;
    }
    public Builder setmarried(boolean married){
        this.married = married;
        return this;
    }

    public Person build(){
        return new Person(firstName,lastName,age,address,married);
    }
}
