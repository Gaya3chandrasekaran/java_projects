public class Customer {
    private String name;
    private String accno;
    private int age;
    private float balance;

    public Customer(String name, String accno, int age, float balance) {
        this.name = name;
        this.accno = accno;
        this.age = age;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", accno='" + accno + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
