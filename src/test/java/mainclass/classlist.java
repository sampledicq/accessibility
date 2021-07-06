package mainclass;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testcases.testcase1;
@RunWith(Suite.class)

@Suite.SuiteClasses({
	testcases.testcase1.class
})
public class classlist {
	public static void main(String[] args) {
		JUnitCore.runClasses(classlist.class);
		
	}
}
 