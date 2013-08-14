package algo.sort.bubble;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BubbleSort {

	private static Logger LOG = LoggerFactory.getLogger(BubbleSort.class);
	
	public static void bubbleSort(int[] inputs){
		for (int i = inputs.length -1; i > 0 ; i--) {
			for (int j = 1; j <= i; j++) {
				if (inputs[j-1] > inputs[j]) {
					int temp = inputs[j-1];
					inputs[j-1] = inputs[j];
					inputs[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < inputs.length; i++) {
			LOG.info(""+inputs[i]);
		}
	}

}
