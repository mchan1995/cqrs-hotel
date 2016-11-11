// Copyright © 2016 Esko Luontola
// This software is released under the Apache License 2.0.
// The license text is at http://www.apache.org/licenses/LICENSE-2.0

package fi.luontola.cqrshotel.events;

import fi.luontola.cqrshotel.framework.Event;
import fi.luontola.cqrshotel.util.Struct;

import java.time.Instant;
import java.util.UUID;

public class ReservationMade extends Struct implements Event {

    public final UUID reservationId;
    public final Instant checkInTime;
    public final Instant checkOutTime;

    public ReservationMade(UUID reservationId, Instant checkInTime, Instant checkOutTime) {
        this.reservationId = reservationId;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }
}
