import java.io.FileWriter;
import java.io.IOException;

public class IntegrationMethods {

	public double firstFunction(double y) {
		return y;
	}

	public double secondFunction(double x, double y) {
		return x * y;
	}

	public double thirdFunction(double x, double y) {
		return ((x) / (1 + y));
	}

	public double fourthFunction(double x, double y) {
		return ((x) * (1 - Math.pow(y, 2)));
	}

	public double fifthFunction(double x, double y) {
		return ((2.0d) * (x) * (Math.pow(y, 2)));
	}

	public double sixthFunction(double x, double y) {
		return (Math.pow((y - x), 5));
	}

	public double seventhFunction(double x, double y) {
		return ((2.0d) * (x) * Math.pow(y, 2));
	}

	public double eighthFunction(double x, double y) {
		double xValue = Math.sin(Math.pow(x, 2));
		double yValue = Math.cos(Math.pow(y, 2));
		return ((-1.0d) * (xValue) * (yValue));
	}
	
	
	// computation of values using Euler Method
	public void eulerMethod(double startingValue, double y, double step, double finalValue, FileWriter outputFile) {
		try {
			double temp = -0;

			System.out.println("\t\tEULER METHOD Computation:");
			System.out.println(" run \t x_run \t y_run \t");

			outputFile.write("\n\t\tEULER METHOD Computation:\n");
			outputFile.write(" run \t x_run \t y_run \t\n");
			int run = 0;

			while (startingValue <= finalValue) {
				temp = y;

				y = y + step * firstFunction(y);
//				y = y + step * secondFunction(startingValue, y);
//				y = y + step * thirdFunction(startingValue, y);
//				y = y + step * fourthFunction(startingValue, y);
//				y = y + step * fifthFunction(startingValue, y);
//				y = y + step * sixthFunction(startingValue, y);
//				y = y + step * seventhFunction(startingValue, y);
//				y = y + step * eighthFunction(startingValue, y);
				
				System.out.println(" " + run + "\t " + startingValue + "\t " + y);
				outputFile.write(" " + run + "\t " + startingValue + "\t " + y + "\n");

				startingValue = startingValue + step;

				run++;
			}

			System.out.println("Approximate solution at x = " + finalValue + " is " + y);
			outputFile.write("\nApproximate solution at x = " + finalValue + " is " + y + "\n\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// computation of values using Midpoint Rule
	public void midpointRule(double startingValue, double y, double step, double finalValue, FileWriter outputFile) {
		try {
			System.out.println("\t\tMIDPOINT METHOD Computation:");
			System.out.println(" run \t x_run \t y_run \t");

			outputFile.write("\n\t\tMIDPOINT METHOD Computation:\n");
			outputFile.write(" run \t x_run \t y_run \t\n");
			double g1, gmid;
			int run = 0;
			while (startingValue <= finalValue) {

				g1 = firstFunction(y);
				gmid = firstFunction(y + 0.5 * step * g1);
//				
//				g1 = secondFunction(startingValue, y);
//				gmid = secondFunction((startingValue + 0.5 * step), (y + 0.5 * step * g1));
//				
//				g1 = thirdFunction(startingValue, y);
//				gmid = thirdFunction((startingValue + 0.5 * step), (y + 0.5 * step * g1));
//				
//				g1 = fourthFunction(startingValue, y);
//				gmid = fourthFunction((startingValue + 0.5 * step), (y + 0.5 * step * g1));
//				
//				g1 = fifthFunction(startingValue, y);
//				gmid = fifthFunction((startingValue + 0.5 * step), (y + 0.5 * step * g1));
//				
//				g1 = sixthFunction(startingValue, y);
//				gmid = sixthFunction((startingValue + 0.5 * step), (y + 0.5 * step * g1));
//				
//				g1 = seventhFunction(startingValue, y);
//				gmid = seventhFunction((startingValue + 0.5 * step), (y + 0.5 * step * g1));
//				
//				g1 = eighthFunction(startingValue, y);
//				gmid = eighthFunction((startingValue + 0.5 * step), (y + 0.5 * step * g1));
				
				System.out.println(" " + run + "\t " + startingValue + "\t " + y);
				outputFile.write(" " + run + "\t " + startingValue + "\t " + y + "\n");

				y = y + step * gmid;
				startingValue = startingValue + step;

				run++;
			}

			// Printing approximation
			System.out.println("Approximate solution at x = " + finalValue + " is " + y);
			outputFile.write("\nApproximate solution at x = " + finalValue + " is " + y + "\n\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void trapezoidRule(double startingValue, double y, double step, double finalValue, FileWriter outputFile) {
		try {
			System.out.println("\t\tTRAPEZOID METHODS Computation:");
			System.out.println(" run \t x_run \t y_run \t");

			outputFile.write("\n\t\tTRAPEZOID METHODS Computation:\n");
			outputFile.write(" run \t x_run \t y_run \t\n");

			double g1, g2;
			int run = 0;
			while (startingValue <= finalValue) {

				g1 = firstFunction(y);
				g2 = firstFunction(y + step * g1);

//				g1 = secondFunction(startingValue, y);
//				g2 = secondFunction((startingValue + step), (y + step * g1));
//				
//				g1 = thirdFunction(startingValue, y);
//				g2 = thirdFunction((startingValue + step), (y + step * g1));
//				
//				g1 = fourthFunction(startingValue, y);
//				g2 = fourthFunction((startingValue + step), (y + step * g1));
//				
//				g1 = fifthFunction(startingValue, y);
//				g2 = fifthFunction((startingValue + step), (y + step * g1));
//				
//				g1 = sixthFunction(startingValue, y);
//				g2 = sixthFunction((startingValue + step), (y + step * g1));
				
				System.out.println(" " + run + "\t " + startingValue + "\t " + y);
				outputFile.write(" " + run + "\t " + startingValue + "\t " + y + "\n");

				y = y + 0.5 * step * (g1 + g2);
				startingValue = startingValue + step;

				run++;
			}

			// Printing approximation
			System.out.println("Approximate solution at x = " + finalValue + " is " + y + "\n");
			outputFile.write("\nApproximate solution at x = " + finalValue + " is " + y + "\n\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void rungeKutta(double startingValue, double y, double step, double finalValue, FileWriter outputFile) {

		try {
			System.out.println("\t\tRUNGE-KUTTA METHOD:");
			System.out.println(" run \t x_run \t y_run \t y(x) \t y(x) - 0.1 ");

			outputFile.write("\n\t\tRUNGE-KUTTA METHOD:\n");
			outputFile.write(" run \t x_run \t y_run \t y(x) \t y(x) - 0.1 " + "\n");

			double g1, g2, g3, g4, f_x, f_x_subtracted;
			int run = 0;
			while (startingValue <= finalValue) {

				g1 = firstFunction(y);
				g2 = firstFunction(y + 0.5 * step * g1);
				g3 = firstFunction(y + 0.5 * step * g2);
				g4 = firstFunction(y + step * g3);
				f_x = firstFunction(startingValue);
				f_x_subtracted = firstFunction(startingValue) - 0.1d;

//				g1 = secondFunction(startingValue, y);
//				g2 = secondFunction(startingValue + 0.5 * step, y + 0.5 * step * g1);
//				g3 = secondFunction(startingValue + 0.5 * step, y + 0.5 * step * g2);
//				g4 = secondFunction(startingValue + step, y + step * g3);
//				f_x = secondFunction(startingValue, y);
//				f_x_subtracted = secondFunction(startingValue, y) - 0.1d;
//
//				g1 = thirdFunction(startingValue, y);
//				g2 = thirdFunction((startingValue + 0.5 * step), y + 0.5 * step * g1);
//				g3 = thirdFunction((startingValue + 0.5 * step), y + 0.5 * step * g2);
//				g4 = thirdFunction((startingValue + step), y + step * g3);
//				f_x = thirdFunction(startingValue, y);
//				f_x_subtracted = thirdFunction(startingValue, y) - 0.1d;
//
//				g1 = fourthFunction(startingValue, y);
//				g2 = fourthFunction(startingValue + 0.5 * step, y + 0.5 * step * g1);
//				g3 = fourthFunction(startingValue + 0.5 * step, y + 0.5 * step * g2);
//				g4 = fourthFunction(startingValue + step, y + step * g3);
//				f_x = fourthFunction(startingValue, y);
//				f_x_subtracted = fourthFunction(startingValue, y) - 0.1d;
//
//				g1 = fifthFunction(startingValue, y);
//				g2 = fifthFunction(startingValue + 0.5 * step, y + 0.5 * step * g1);
//				g3 = fifthFunction(startingValue + 0.5 * step, y + 0.5 * step * g2);
//				g4 = fifthFunction(startingValue + step, y + step * g3);
//				f_x = fifthFunction(startingValue, y);
//				f_x_subtracted = fifthFunction(startingValue, y) - 0.1d;
//
//				g1 = sixthFunction(startingValue, y);
//				g2 = sixthFunction(startingValue + 0.5 * step, y + 0.5 * step * g1);
//				g3 = sixthFunction(startingValue + 0.5 * step, y + 0.5 * step * g2);
//				g4 = sixthFunction(startingValue + step, y + step * g3);
//				f_x = sixthFunction(startingValue, y);
//				f_x_subtracted = sixthFunction(startingValue, y) - 0.1d;
				
//				g1 = seventhFunction(startingValue, y);
//				g2 = seventhFunction(startingValue + 0.5 * step, y + 0.5 * step * g1);
//				g3 = seventhFunction(startingValue + 0.5 * step, y + 0.5 * step * g2);
//				g4 = seventhFunction(startingValue + step, y + step * g3);
//				f_x = seventhFunction(startingValue, y);
//				f_x_subtracted = seventhFunction(startingValue, y) - 0.1d;
//
//				g1 = eighthFunction(startingValue, y);
//				g2 = eighthFunction(startingValue + 0.5d * step, y + 0.5d * step * g1);
//				g3 = eighthFunction(startingValue + 0.5d * step, y + 0.5d * step * g2);
//				g4 = eighthFunction(startingValue + step, y + step * g3);
//				f_x = eighthFunction(startingValue, y);
//				f_x_subtracted = eighthFunction(startingValue, y) - 0.1d;

				if (f_x > 0.099 && f_x < 0.101) {
					outputFile.write(" " + run + "\t " + startingValue + "\t " + y + "\t " + f_x + "\t "
							+ f_x_subtracted + "\n");
				}

				System.out
						.println(" " + run + "\t " + startingValue + "\t " + y + "\t " + f_x + "\t " + f_x_subtracted);

				y = y + (step / 6.0d) * (g1 + 2 * g2 + 2 * g3 + g4);
				startingValue = startingValue + step;

				run++;
			}

			// Printing approximation
			System.out.println("Approximate solution at x = " + finalValue + " is " + y);
			outputFile.write("\nApproximate solution at x = " + finalValue + " is " + y + "\n\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
