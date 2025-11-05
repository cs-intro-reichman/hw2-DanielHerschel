public class TimeCalc {
    public static void main(String[] args) {
        String currentTime =  args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        int hour = Integer.parseInt(currentTime.split(":")[0]);
        int minute = Integer.parseInt(currentTime.split(":")[1]);

        int totalMinutes = (hour * 60) + minute + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        System.out.printf("%02d:%02d%n", newHours, newMinutes);
    }
}
