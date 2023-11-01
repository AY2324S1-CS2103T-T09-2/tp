package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

public class RedoCommand extends Command {
    public static final String COMMAND_WORD = "redo";
    public static final String MESSAGE_SUCCESS = "Redo successful!";

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        model.redoAddressBook(model);
        return new CommandResult(MESSAGE_SUCCESS, TabIndex.Developer);
    }
}
