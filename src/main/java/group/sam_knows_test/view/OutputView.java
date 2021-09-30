package group.sam_knows_test.view;

import java.util.Date;
import java.util.List;

import group.sam_knows_test.Model.DownloadSpeed;

public class OutputView {
	
	private Date from;
	private Date to;
	
	private float average;
	private float min;
	private float max;
	private float median;
	
	public OutputView(Date from, Date to, float average, float min, float max, float median) {
		this.from = from;
		this.to = to;
		this.average = average;
		this.min = min;
		this.max = max;
		this.median = median;
	}
	
	public void generateOutput() {
		
	}
}
