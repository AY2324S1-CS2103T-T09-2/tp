package seedu.address.ui;

import java.util.Comparator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.developer.Developer;


/**
 * A UI component that displays information of a {@code Developer}.
 */
public class DeveloperCard extends UiPart<Region> {

    private static final String FXML = "DeveloperListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Developer developer;

    @FXML
    private HBox cardPane;
    @FXML
    private Label name;
    @FXML
    private Label id;
    @FXML
    private Label phone;
    @FXML
    private Label address;
    @FXML
    private Label email;
    @FXML
    private Label dateJoined;
    @FXML
    private Label role;
    @FXML
    private Label salary;
    @FXML
    private FlowPane tags;

    /**
     * Creates a {@code PersonCode} with the given {@code Developer} and index to display.
     */
    public DeveloperCard (seedu.address.model.developer.Developer developer, int displayedIndex) {
        super(FXML);
        this.developer = developer;
        id.setText(displayedIndex + ". ");
        name.setText(developer.getName().fullName);
        phone.setText(developer.getPhone().value);
        email.setText(developer.getEmail().value);
        role.setText(developer.getRole().role);

        address.setText(developer.getAddress().value);
        dateJoined.setText(String.valueOf(developer.getDateJoined().value));
        salary.setText(String.valueOf(developer.getSalary().salary));
        developer.getProjects().stream()
                .sorted(Comparator.comparing(tag -> tag.getProjectName().fullName))
                .forEach(tag -> tags.getChildren().add(new Label(tag.getProjectName().fullName)));
    }
}