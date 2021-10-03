public class Call {
    public static void main (String args[]){
        Phone phone1 = new Phone("+7 (915) 245-92-30","Honor",120.0);
        Phone phone2 = new Phone("+7 (901) 333-05-98","IPhone");
        Phone phone3 = new Phone();
        Phone[] phones = {phone1, phone2, phone3};
        for(Phone p:phones){
            System.out.println("Model: " + p.model + "\nNumber: " + p.number + "\nWeight: " + p.weight + "\n");
        }
        phone1.receiveCall("Янина");
        phone2.receiveCall("Андрей");
        phone3.receiveCall("Ангелина\n");
        for(Phone p:phones){
            System.out.println(p.getNumber());
        }
        phone1.receiveCall("Янина", "+7 (926) 987-57-23");
        phone2.receiveCall("Андрей", "+7 (985) 975-73-80");
        phone3.receiveCall("Ангелина", "+7 (926) 040-32-30\n");

        Phone.sendMessage("Привет! Приглашаю сегодня в кафе 'Мне бы мяса' в 20:00.","+7 (926) 987-57-23", "+7 (985) 975-73-80", "+7 (926) 040-32-30");
    }
}
