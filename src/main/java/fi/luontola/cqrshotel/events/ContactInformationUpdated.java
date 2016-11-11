// Copyright © 2016 Esko Luontola
// This software is released under the Apache License 2.0.
// The license text is at http://www.apache.org/licenses/LICENSE-2.0

package fi.luontola.cqrshotel.events;

import fi.luontola.cqrshotel.framework.Event;
import fi.luontola.cqrshotel.util.Struct;

import java.util.UUID;

public class ContactInformationUpdated extends Struct implements Event {

    public final UUID reservationId;
    public final String name;
    public final String email;

    public ContactInformationUpdated(UUID reservationId, String name, String email) {
        this.reservationId = reservationId;
        this.name = name;
        this.email = email;
    }
}
