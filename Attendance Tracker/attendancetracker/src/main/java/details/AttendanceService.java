// AttendanceService.java
package details;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AttendanceService {
    private List<AttendanceRecord> attendanceRecords;

    public List<AttendanceRecord> getAttendanceRecords() {
        return attendanceRecords;
    }

    public void setAttendanceRecords(List<AttendanceRecord> attendanceRecords) {
        this.attendanceRecords = attendanceRecords;
    }

    public AttendanceService() {
        this.attendanceRecords = new ArrayList<>();
    }

    public void recordAttendance(AttendanceRecord record) {
        attendanceRecords.add(record);
    }

    public List<AttendanceRecord> getAttendanceByDate(String date) {
        return attendanceRecords.stream()
                .filter(record -> record.getDate().equals(date))
                .collect(Collectors.toList());
    }
}
