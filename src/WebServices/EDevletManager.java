package WebServices;

public class EDevletManager implements EDevletService{

    @Override
    public void checkCitizen(String citizenId, String firstName, String lastName, int yearOfBirth) {
        System.out.println("Vatandaş doğrulandı : " + firstName + " " + lastName);
    }
}
