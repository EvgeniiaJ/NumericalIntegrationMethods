import java.io.File;
import java.io.FileWriter;

public class IntegrationLauncher {

	public static void main(String[] args) {
		try {

			FileWriter outputFile = new FileWriter(new File("outputFile.txt"));
			IntegrationMethods integration = new IntegrationMethods();

			double x0 = 0;
			
			// choose one of the following two values y0 or add another one
//			double y0 = 1;
			double y0 = (Math.sqrt(5) - 1) / 2.0d;
			
			double h = 0.001d; // the size of the step 
			double x = 10.0d;  // final value the stop of approximation

			integration.eulerMethod(x0, y0, h, x, outputFile);
			integration.midpointRule(x0, y0, h, x, outputFile);
			integration.trapezoidRule(x0, y0, h, x, outputFile);
			integration.rungeKutta(x0, y0, h, x, outputFile);
			
			outputFile.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
