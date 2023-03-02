
    class Cat implements EatAble, Breeds {
        int age;
        int weight;

        Cat(int cat, int weight) {
            this.age = age;
            this.weight = weight;
        }


        @Override
        public void eat() {
            if (age <= 1) {
                System.out.println("Корм для котят");
            }
            if (age > 1 && age < 7) {
                System.out.println("Корм для взрослых кошек");
            }
            if (age >= 7) {
                System.out.println("Корм для стареющих кошек");
            }
        }


        @Override
        public void weight() {
            if (weight <= 2) {
                System.out.println("MINI порода");
            }
            if (weight > 2 && weight < 5) {
                System.out.println("MEDIUM порода");
            }
            if (weight >= 5) {
                System.out.println("MAXI порода");
            }
        }
    }

