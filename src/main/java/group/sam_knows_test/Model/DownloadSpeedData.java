package group.sam_knows_test.Model;

import java.util.Date;
import java.util.List;

public class DownloadSpeedData {
	
	private List<DownloadSpeed> downloadSpeeds;
	
	private Date from;
	private Date to;
	
	private float average;
	private float min;
	private float max;
	private float median;
	
	public DownloadSpeedData(List<DownloadSpeed> downloadSpeeds, Date from, Date to, float average, float min,
			float max, float median) {
		this.downloadSpeeds = downloadSpeeds;
		this.from = from;
		this.to = to;
		this.average = average;
		this.min = min;
		this.max = max;
		this.median = median;
	}

	public List<DownloadSpeed> getDownloadSpeeds() {
		return downloadSpeeds;
	}
	
	public Date getFrom() {
		return from;
	}
	
	public Date getTo() {
		return to;
	}
	
	public float getAverage() {
		return average;
	}
	
	public float getMin() {
		return min;
	}
	
	public float getMax() {
		return max;
	}
	
	public float getMedian() {
		return median;
	}
}
