package com.kopsabros.hometeach.model;

import com.google.auto.value.AutoValue;

/**
 * Created by Aghbac on 12/10/16.
 */
@AutoValue
public abstract class Family {
    abstract Integer id();
    abstract String name();
    abstract String address();
    abstract String email();
    abstract String phone();

    public static Builder builder() {
        return new AutoValue_Family.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder id(Integer id);

        public abstract Builder address(String address);

        public abstract Builder email(String email);

        public abstract Builder phone(String phone);

        public abstract Builder name(String name);

        public abstract Family build();
    }
}
