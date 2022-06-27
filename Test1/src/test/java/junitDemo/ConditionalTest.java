package junitDemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ConditionalTest {

	@Test
	@Disabled("dont run this until jira123 is fixed")
	void basicTest() {

	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testForWindowsOnly() {

	}


	@Test
	@EnabledOnOs(OS.MAC)
	void testForMacOnly() {

	}
	
	@Test
	@EnabledOnOs({OS.MAC,OS.WINDOWS})
	void testForWindowsAndMacOnly() {

	}

	@Test
	@EnabledOnOs(OS.LINUX)
	void testForLinuxOnly() {

	}

	@Test
	@EnabledOnJre(JRE.JAVA_17)
	void testOnlyForJava17() {

	}
	@Test
	@EnabledForJreRange(min=JRE.JAVA_8,max=JRE.JAVA_14)
	void testForJava8To14() {

	}
	@Test
	@EnabledForJreRange(min=JRE.JAVA_11)
	void testForMinJre11() {
		
	}
	@Test
	@EnabledIfEnvironmentVariable(named="samer_env",matches ="dev")
	void testOnlyForDevEnvironment() {
		
	}
	
	@Test
	@EnabledIfSystemProperty(named ="samer_system_property",matches="ci_cd_deploy")
	void testOnlyForSystemProperty() {
		
	}


}
