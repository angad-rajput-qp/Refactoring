public class User {
    int id;
    int age;
    

    public User(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public static String getAgeType(User user) throws Exception {
        if (user != null) {
            if (user.getAge() < 10) {
                return "child";
            }
        }
        throw new Exception("I am");
    }

    @Override
    public String toString() {
        return "Survey{" +
                "id=" + id +
                ", age='" + age +
                '}';
    }
}
