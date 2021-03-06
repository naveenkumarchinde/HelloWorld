package com.mindtree;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JUnitSampleTest {

	private String verify = "nk";

	@Test
	public void instanceOfTest() {
		assertThat(new ArrayList<>(), instanceOf(List.class));
	}

	@Test
	public void assertTrueTest() {
		assertTrue(false);
	}

	@Test
	public void equalToTest() {
		assertThat(verify, is("abc"));
	}
}
