import java.io.File;
import java.io.FileWriter;

public class IntegrationLauncher {

	public static void main(String[] args) {
		try {

			FileWriter outputFile = new FileWriter(new File("outputFile.txt"));
			IntegrationMethods integration = new IntegrationMethods();

			double x0 = 0;
//			double y0 = 1;
			double y0 = (Math.sqrt(5) - 1) / 2d;
			double h = 0.001d;
			double x = 10d;

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
