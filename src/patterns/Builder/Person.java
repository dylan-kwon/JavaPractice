package patterns.Builder;

public class Person {

    private String mName;
    private String mEmail;
    private String mPhone;
    private int mAge;

    private Person(Builder builder) {
        // Patterns.Builder Pattern
        mName = builder.mName;
        mEmail = builder.mEmail;
        mPhone = builder.mPhone;
        mAge = builder.mAge;
    }

    public String getName() {
        return mName;
    }

    public String getEmail() {
        return mEmail;
    }

    public String getPhone() {
        return mPhone;
    }

    public int getAge() {
        return mAge;
    }

    public static class Builder {

        private String mName;
        private String mEmail;
        private String mPhone;
        private int mAge;

        public Builder setName(String name) {
            mName = name;
            return this;
        }

        public Builder setEmail(String email) {
            mEmail = email;
            return this;
        }

        public Builder setPhone(String phone) {
            mPhone = phone;
            return this;
        }

        public Builder setmAge(int age) {
            mAge= age;
            return this;
        }

        public Person builder() {
            return new Person(this);
        }

    }
}
