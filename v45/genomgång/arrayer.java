package genomg�ng;

public class arrayer {

	public static void main(String[] args) {

		double mass = 740;
		double velocity = 100 / 3.6;
		double time = 4.4;
		double acceleration = velocity / time;
		double power = 0;

		// En bil med massan 740kg accelererar fr�n 0-100 p� 4.4 sekunder.
		// Hur stor effekt har bilens motor uppn�tt?

		power = work(force(mass, acceleration), distance(velocity, time)) / time;

		System.out.printf("%.2f W", power);
		
	}

	static double distance(double velocity, double time) {

		double distance = velocity * time;

		return distance;
	}

	static double force(double mass, double acceleration) {

		double force = mass * acceleration;

		return force;
	}

	static double work(double force, double distance) {

		double work = force * distance;

		return work;
	}
}
