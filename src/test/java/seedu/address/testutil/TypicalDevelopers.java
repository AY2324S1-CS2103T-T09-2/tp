package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PROJECT_1_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PROJECT_2_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PROJECT_2_BOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.developer.Developer;

/**
 * A utility class containing a list of {@code Developer} objects to be used in tests.
 */
public class TypicalDevelopers {

    public static final Developer ALICE = new DeveloperBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253").withRole("Developer").withSalary("50000")
            .withGithubId("mahidharah").withRating("5.0").withDateJoined("01-01-2022")
            .withProjects("AndroidApp").build();
    public static final Developer BENSON = new DeveloperBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25").withEmail("johnd@example.com")
            .withPhone("98765432").withRole("Developer").withSalary("50000")
            .withGithubId("mahidharah").withRating("5.0").withDateJoined("01-01-2022")
            .withProjects("owesMoney", "friends").build();
    public static final Developer CARL = new DeveloperBuilder().withName("Carl Kurz").withPhone("95352563")
            .withRole("Developer").withSalary("50000").withGithubId("mahidharah").withRating("5.0")
            .withDateJoined("01-01-2022").withEmail("heinz@example.com")
            .withAddress("wall street").withProjects("AppleApp").build();
    public static final Developer DANIEL = new DeveloperBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street")
            .withRole("Developer").withSalary("50000").withGithubId("mahidharah").withRating("5.0")
            .withProjects("friends").withDateJoined("01-01-2022").build();
    public static final Developer ELLE = new DeveloperBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withAddress("michegan ave")
            .withRole("Developer").withSalary("50000").withGithubId("mahidharah").withRating("5.0")
            .withDateJoined("01-01-2022").withProjects("AndroidApp").build();
    public static final Developer FIONA = new DeveloperBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withAddress("little tokyo").withRole("Developer")
            .withSalary("50000").withGithubId("mahidharah").withRating("5.0").withDateJoined("01-01-2022")
            .withProjects("AppleApp").build();
    public static final Developer GEORGE = new DeveloperBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").withAddress("4th street").withRole("Developer")
            .withSalary("50000").withGithubId("mahidharah").withRating("5.0").withDateJoined("01-01-2022")
            .withProjects("GoogleApp").build();
    // Manually added
    public static final Developer HOON = new DeveloperBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withAddress("little india").build();
    public static final Developer IDA = new DeveloperBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withAddress("chicago ave").build();

    // Manually added - Developer's details found in {@code CommandTestUtil}
    public static final Developer AMY = new DeveloperBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withProjects(VALID_PROJECT_2_AMY).build();
    public static final Developer BOB = new DeveloperBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB)
            .withProjects(VALID_PROJECT_1_BOB, VALID_PROJECT_2_BOB).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalDevelopers() {
    } // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Developer developer : getTypicalPersons()) {
            ab.addDeveloper(developer);
        }
        return ab;
    }

    public static List<Developer> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}