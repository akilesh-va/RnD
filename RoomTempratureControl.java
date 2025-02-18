public class RoomTempratureControl {
      public boolean turnHeaterOn(double roominSquareFeet, double tempInCelcius, RoomType roomType) {
        MetricsCalc mCalc = new MetricsCalc();
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
