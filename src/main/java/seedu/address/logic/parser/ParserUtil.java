package seedu.address.logic.parser;

import static java.util.Objects.requireNonNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.StringUtil;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.*;
import seedu.address.model.tag.Project;

/**
 * Contains utility methods used for parsing strings in the various *Parser classes.
 */
public class ParserUtil {

    public static final String MESSAGE_INVALID_INDEX = "Index is not a non-zero unsigned integer.";

    /**
     * Parses {@code oneBasedIndex} into an {@code Index} and returns it. Leading and trailing whitespaces will be
     * trimmed.
     * @throws ParseException if the specified index is invalid (not non-zero unsigned integer).
     */
    public static Index parseIndex(String oneBasedIndex) throws ParseException {
        String trimmedIndex = oneBasedIndex.trim();
        if (!StringUtil.isNonZeroUnsignedInteger(trimmedIndex)) {
            throw new ParseException(MESSAGE_INVALID_INDEX);
        }
        return Index.fromOneBased(Integer.parseInt(trimmedIndex));
    }


    /**
     * Returns true if the String can be parsed to return an Index and false if not.
     *
     * @param str The String to try to parse.
     */
    public static Boolean canParseIndex(String str) {
        try {
            parseIndex(str);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
    /**
     * Parses a {@code String name} into a {@code Name}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code name} is invalid.
     */
    public static Name parseName(String name) throws ParseException {
        requireNonNull(name);
        String trimmedName = name.trim();
        if (!Name.isValidName(trimmedName)) {
            throw new ParseException(Name.MESSAGE_CONSTRAINTS);
        }
        return new Name(trimmedName);
    }

    /**
     * Parses a {@code String phone} into a {@code Phone}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code phone} is invalid.
     */
    public static Phone parsePhone(String phone) throws ParseException {
        requireNonNull(phone);
        String trimmedPhone = phone.trim();
        if (!Phone.isValidPhone(trimmedPhone)) {
            throw new ParseException(Phone.MESSAGE_CONSTRAINTS);
        }
        return new Phone(trimmedPhone);
    }

    /**
     * Parses a {@code String address} into an {@code Address}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code address} is invalid.
     */
    public static Address parseAddress(String address) throws ParseException {
        requireNonNull(address);
        String trimmedAddress = address.trim();
        if (!Address.isValidAddress(trimmedAddress)) {
            throw new ParseException(Address.MESSAGE_CONSTRAINTS);
        }
        return new Address(trimmedAddress);
    }

    /**
     * Parses a {@code String email} into an {@code Email}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code email} is invalid.
     */
    public static Email parseEmail(String email) throws ParseException {
        requireNonNull(email);
        String trimmedEmail = email.trim();
        if (!Email.isValidEmail(trimmedEmail)) {
            throw new ParseException(Email.MESSAGE_CONSTRAINTS);
        }
        return new Email(trimmedEmail);
    }

    /**
     * Parses a {@code String project} into a {@code Project}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code Project} is invalid.
     */
    public static Project parseProject(String project) throws ParseException {
        requireNonNull(project);
        String trimmedProject = project.trim();
        if (!Project.isValidProjectName(trimmedProject)) {
            throw new ParseException(Project.MESSAGE_CONSTRAINTS);
        }
        return new Project(trimmedProject);
    }

    /**
     * Parses {@code Collection<String> projects} into a {@code Set<project>}.
     */
    public static Set<Project> parseProjects(Collection<String> projects) throws ParseException {
        requireNonNull(projects);
        final Set<Project> projectSet = new HashSet<>();
        for (String projectName : projects) {
            projectSet.add(parseProject(projectName));
        }
        return projectSet;
    }
    /**
     * Parses a {@code String dateJoined} into a {@code DateJoined}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code DateJoined} is invalid.
     */
    public static DateJoined parseDateJoined(String dateJoined) throws ParseException {
        requireNonNull(dateJoined);
        String trimmedDateJoined = dateJoined.trim();
        if (!DateJoined.isValidDate(trimmedDateJoined)) {
            throw new ParseException(DateJoined.MESSAGE_CONSTRAINTS);
        }
        return new DateJoined(trimmedDateJoined);
    }
    /**
     * Parses a {@code String username} into a {@code Username}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code Username} is invalid.
     */
    public static Username parseUsername(String username) throws ParseException {
        requireNonNull(username);
        String trimmedUsername = username.trim();
        if (!Username.isValidUsername(trimmedUsername)) {
            throw new ParseException(Username.MESSAGE_CONSTRAINTS);
        }
        return new Username(trimmedUsername);
    }
    /**
     * Parses a {@code String password} into a {@code Password}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code Password} is invalid.
     */
    public static Password parsePassword(String password) throws ParseException {
        requireNonNull(password);
        String trimmedPassword = password.trim();
        if (!Password.isValidPassword(trimmedPassword)) {
            throw new ParseException(Password.MESSAGE_CONSTRAINTS);
        }
        return new Password(trimmedPassword);
    }
    /**
     * Parses a {@code String role} into a {@code Role}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code Role} is invalid.
     */
    public static Role parseRole(String role) throws ParseException {
        requireNonNull(role);
        String trimmedRole = role.trim();
        if (!Role.isValidRole(trimmedRole)) {
            throw new ParseException(Role.MESSAGE_CONSTRAINTS);
        }
        return new Role(trimmedRole);
    }
    /**
     * Parses a {@code String salary} into a {@code Salary}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code Salary} is invalid.
     */
    public static Salary parseSalary(String salary) throws ParseException {
        requireNonNull(salary);
        String trimmedSalary = salary.trim();
        if (!Salary.isValidSalary(trimmedSalary)) {
            throw new ParseException(Salary.MESSAGE_CONSTRAINTS);
        }
        return new Salary(trimmedSalary);
    }
}
