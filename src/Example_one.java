class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class AnimalSoundSystem {
    public void playSound(String animalType) {
        if (animalType.equals("dog")) {
            Dog dog = new Dog();
            dog.makeSound();
        } else if (animalType.equals("cat")) {
            Cat cat = new Cat();
            cat.makeSound();
        } else {
            Animal genericAnimal = new Animal();
            genericAnimal.makeSound();
        }
    }
}