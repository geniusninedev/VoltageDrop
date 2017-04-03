package nineinfosys.voltagedrop;

public class voltageDropCalculator {

	 double current;
	 double distance;
	    double  resistance;
	  
	    public voltageDropCalculator(double current, double distance,double resistance) {
	        this.current = current;
	        this.resistance = resistance;
	        this.distance=distance;
	       
	    }

		public double getDistance() {
			return distance;
		}

		public void setDistance(double distance) {
			this.distance = distance;
		}

		public double getCurrent() {
			return current;
		}

		public void setCurrent(double current) {
			this.current = current;
		}

		public double getResistance() {
			return resistance;
		}

		public void setResistance(double resistance) {
			this.resistance = resistance;
		}
public double voltageCalculator()
		
		{
      	double result = current * ((2*distance*resistance)/1000);

		    return result;
		}
		public static class voltageDropMain {
			
			public static void main(String arg[])
			{
				
				voltageDropCalculator gdpcal=new voltageDropCalculator(1000,54,10);
				double result=gdpcal.voltageCalculator();
	
				System.out.print("Voltage Drop  Value:"+result);
		
			}
		}
}
