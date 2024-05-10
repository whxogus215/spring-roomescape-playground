package roomescape.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.format.annotation.DateTimeFormat;

public class ReservationResponseDto {

    private final Long id;
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime time;

    public ReservationResponseDto(final Long id,
                                  final String name,
                                  final LocalDate date,
                                  final LocalTime time) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

}
