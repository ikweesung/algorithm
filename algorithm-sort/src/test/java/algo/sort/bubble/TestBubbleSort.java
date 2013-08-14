package algo.sort.bubble;

import org.junit.Test;

import algo.sort.utils.LoggerLoader;

public class TestBubbleSort{
	
	@Test
	public void testBubbleSort(){
		LoggerLoader.load();
		int[] inputs = {1,33,-2,5,100};
		BubbleSort.bubbleSort(inputs);
	}
}
