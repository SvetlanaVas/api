import lombok.Value;

public class DataGenerator {
    private DataGenerator() {}

    @Value
public static class RegistrationDto {
        private String login;
        private String password;
        private String status;
    }
    public static RegistrationDto getRegistrationInfo (){
        return new RegistrationDto ("vasya", "password", "active");
    }
}
