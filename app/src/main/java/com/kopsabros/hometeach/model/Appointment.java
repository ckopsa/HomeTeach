package com.kopsabros.hometeach.model;

import com.google.auto.value.AutoValue;
import java.util.Date;

/**
 * Created by Aghbac on 12/10/16.
 */
@AutoValue
public abstract class Appointment {
    public abstract Integer id();
    public abstract Integer familyId();
    public abstract boolean wasCompleted();
    public abstract Date dateSet();
    public abstract Date dateCompleted();
    public abstract Date appointmentDate();

    public static Builder builder() {
        return new AutoValue_Appointment.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder id(Integer id);

        public abstract Builder familyId(Integer familyId);

        public abstract Builder wasCompleted(boolean wasCompleted);

        public abstract Builder dateSet(Date dateSet);

        public abstract Builder dateCompleted(Date dateCompleted);

        public abstract Builder appointmentDate(Date appointmentDate);

        public abstract Appointment build();
    }
}
