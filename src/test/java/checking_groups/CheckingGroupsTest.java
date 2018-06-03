package checking_groups;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckingGroupsTest {

    @Test
    public void myTests() {
        assertEquals(CheckingGroups.groupCheck("()"), true);
        assertEquals(CheckingGroups.groupCheck("({"), false);
    }

}