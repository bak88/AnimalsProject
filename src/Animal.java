import java.time.LocalDate;

public class Animal {

    private String name;
    private String command;
    private LocalDate birthDate;

    public Animal(String name, String command, LocalDate birthDate) {
        this.name = name;
        this.command = command;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getCommand() {
        return command;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void teachNewCommand(String newCommand){
        this.command = newCommand;
    }
}
