abstract class User {
    String name;
    String function;

    public User(String function, String name) {
        this.function = function;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String toString() {
        return this.getName();
    }


}
