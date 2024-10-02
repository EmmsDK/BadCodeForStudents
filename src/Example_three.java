class Coffee {
    public String getDescription() {
        return "Basic Coffee";
    }

    public double cost() {
        return 5.0;
    }
}

class CoffeeWithMilk extends Coffee {
    @Override
    public String getDescription() {
        return super.getDescription() + " + Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }
}

class CoffeeWithSugar extends Coffee {
    @Override
    public String getDescription() {
        return super.getDescription() + " + Sugar";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}

class CoffeeWithMilkAndSugar extends Coffee {
    @Override
    public String getDescription() {
        return super.getDescription() + " + Milk + Sugar";
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }
}
