/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import builderdesignpattern.User.UserBuilder;

/**
 *
 * @author Urvashi
 */

class User{
    private String first_name;
    private String last_name;
    private int age;
    private String address;
    private String phone;
    
    private User(UserBuilder userbuilder){
        this.first_name=userbuilder.first_name;
        this.last_name=userbuilder.last_name;
        this.age=userbuilder.age;
        this.address=userbuilder.address;
        this.phone=userbuilder.phone;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User{" + "first_name=" + first_name + ", last_name=" + last_name + ", age=" + age + ", address=" + address + ", phone=" + phone + '}';
    }
    
    static class UserBuilder{
        private String first_name;
        private String last_name;
        private int age;
        private String address;
        private String phone;

        public UserBuilder(String first_name, String last_name) {
            this.first_name = first_name;
            this.last_name = last_name;
        }

        public UserBuilder setFirst_name(String first_name) {
            this.first_name = first_name;
            return this;
        }

        public UserBuilder setLast_name(String last_name) {
            this.last_name = last_name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public User build(){
            User user=new User(this);
            return user;
        }
        
        private void validateUserObject(User user) {
            //Do some basic validations to check 
            //if user object does not break any assumption of system
        }
    }
}
public class BuilderDesignPattern {

    public static void main(String[] args) {
       User user1=new UserBuilder("Urvashi","Kodwani")
                  .setAge(22)
                  .setPhone("123456789")
                  .setAddress("India").build();
        System.out.println(user1);
        
        User user2=new UserBuilder("Alsion","Andrew")
                  .setAge(40)
                  .setPhone("442200400")
                  .setAddress("America").build();
        System.out.println(user2);
    }
    
}
