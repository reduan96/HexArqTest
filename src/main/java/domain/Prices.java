package domain;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Prices {
    private short brandId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private short priceList;
    private int productId;
    private short priority;
    private double price;
    private String curr;
}
