package com.compare.maven.artifiact.versioncomparison;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComparableversionApplicationTests {

	@Test
	void contextLoads() {
		Software s1 = new Software();
		s1.setName("book1");
		s1.setVersion("10.0.0");
		Software s2 = new Software();
		s2.setName("book2");
		s2.setVersion("11.0.0");
		Software s3 = new Software();
		s3.setName("book3");
		s3.setVersion("0.0.1");
		Software s4 = new Software();
		s4.setName("book4");
		s4.setVersion("1.0.0");
		Software s5 = new Software();
		s5.setName("book5");
		s5.setVersion("1.0.1");
		List<Software> softwares = new ArrayList<>();
		softwares.add(s1);
		softwares.add(s2);
		softwares.add(s3);
		softwares.add(s4);
		softwares.add(s5);
		VersionComparator versionComparator = new VersionComparator();
		softwares.sort(versionComparator);
		System.out.println(softwares);

	}

}
