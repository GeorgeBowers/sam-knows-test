package group.sam_knows_test;


import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DownloadSpeed {
	

	private float downloadSpeedBytes;
	
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date date;

	@JsonCreator
	public DownloadSpeed(@JsonProperty(value = "metricValue")float downloadSpeedBytes,
			@JsonProperty(value = "dtime")Date date) {
		this.downloadSpeedBytes = downloadSpeedBytes;
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}
	
	public float getDownloadSpeedBytes() {
		return downloadSpeedBytes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(date, downloadSpeedBytes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DownloadSpeed other = (DownloadSpeed) obj;
		return Objects.equals(date, other.date)
				&& Float.floatToIntBits(downloadSpeedBytes) == Float.floatToIntBits(other.downloadSpeedBytes);
	}
}
