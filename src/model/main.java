package model;

public class main {
    public static void main(String[] args) {
        Student a=new Student("小明",23,"男","04150122");
        System.out.println(a.getName()+"-"+a.getAge()+"-"+a.getSex()+"-"+a.getNumber());
    }
}
