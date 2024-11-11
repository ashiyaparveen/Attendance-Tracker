package details;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AttendanceService attendanceService = new AttendanceService();

        // Test Case 1: Record attendance for a student and verify it is saved
        AttendanceRecord record1 = new AttendanceRecord("S123", "2024-11-11", "Present");
        attendanceService.recordAttendance(record1);
        System.out.println("Attendance recorded: ");
        System.out.println(record1);  // Print each attendance record on a new line

        // Test Case 2: Retrieve attendance records for a specific date and confirm accuracy
        List<AttendanceRecord> records = attendanceService.getAttendanceByDate("2024-11-11");
        System.out.println("\nAttendance records for 2024-11-11:");
        for (AttendanceRecord record : records) {
            System.out.println(record);  // Each record on a new line
        }
    }
}
