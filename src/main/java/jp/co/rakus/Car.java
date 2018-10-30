package jp.co.rakus;

/**
 * 車の設定を行うクラス.
 * 
 * @author rksuser
 *
 */
public class Car {
	private Integer speed;
	private String bodyColor;
	private String carName;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
}
