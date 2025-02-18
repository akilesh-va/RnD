public class RoomTempratureControl {
      MetricsCalc mCalc;
      public RoomTempratureControl() {
             mCalc = new MetricsCalc();
      }
      public boolean turnHeaterOn(double roominSquareFeet, double tempInCelcius, RoomType roomType) {
        
        double roomsizeInMeters = mCalc.feet2Meter(roominSquareFeet);
        double tempInFarenheit = mCalc.celcius2Farenheit(tempInCelcius);

        switch (roomType) {
          case BED:
            if ((tempInFarenheit/roomsizeInMeters) > 250) return true;
          case BED:
            if ((tempInFarenheit/roomsizeInMeters) > 100) return true;
          case BED:
            if ((tempInFarenheit/roomsizeInMeters) > 170) return true;
            

        }
        return false;
      }
}
