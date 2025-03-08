public class Main{
  public static void main(String str[]) {
    RoomTempratureControl rtControl = new RoomRempratireControl();
    rtControl.turnHeaterOn(Double.valueOf(str[0]), Double.valueOf(str[1]), RoomType.valueOf(str[2));
  }
}
