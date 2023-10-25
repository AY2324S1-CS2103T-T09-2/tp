package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.*;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Developer;

/**
 * Adds a developer to the address book.
 */
public class AddDeveloperCommand extends Command {

    public static final String COMMAND_WORD = "adddeveloper";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a developer to the address book. "
            + "Parameters: "
            + PREFIX_NAME + "NAME "
            + PREFIX_PHONE + "PHONE "
            + PREFIX_EMAIL + "EMAIL "
            + PREFIX_ADDRESS + "ADDRESS "
            + PREFIX_ROLE + "ROLE "
            + "[" + PREFIX_PROJECT + "PROJECT]...\n"
            + PREFIX_SALARY + "SALARY "
            + PREFIX_DATEJOINED + "DATE JOINED (Optional) "
            + PREFIX_GITHUBID + "GITHUBID "
            + PREFIX_RATING + "RATING "
            + "Example: " + COMMAND_WORD + " "
            + PREFIX_NAME + "John Doe "
            + PREFIX_PHONE + "98765432 "
            + PREFIX_EMAIL + "johnd@example.com "
            + PREFIX_ADDRESS + "311, Clementi Ave 2, #02-25 "
            + PREFIX_ROLE + "Developer "
            + PREFIX_PROJECT + "AndroidApp "
            + PREFIX_PROJECT + "CustomWebsite"
            + PREFIX_SALARY + "4500 "
            + PREFIX_DATEJOINED + "19-11-2023 ";

    public static final String MESSAGE_SUCCESS = "New developer added: %1$s";
    public static final String MESSAGE_DUPLICATE_DEVELOPER = "This developer already exists in the address book";

    private final Developer toAdd;

    /**
     * Creates an AddDeveloperCommand to add the specified {@code Developer}
     */
    public AddDeveloperCommand (Developer developer) {
        requireNonNull(developer);
        toAdd = developer;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        if (model.hasDeveloper(toAdd)) {
            throw new CommandException(MESSAGE_DUPLICATE_DEVELOPER);
        }

        model.addDeveloper(toAdd);
        return new CommandResult(String.format(MESSAGE_SUCCESS, Messages.format(toAdd)));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof AddDeveloperCommand)) {
            return false;
        }

        AddDeveloperCommand otherAddDeveloperCommand = (AddDeveloperCommand) other;
        return toAdd.equals(otherAddDeveloperCommand.toAdd);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("toAdd", toAdd)
                .toString();
    }
}