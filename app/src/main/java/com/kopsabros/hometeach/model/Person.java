package com.kopsabros.hometeach.model;

import com.google.auto.value.AutoValue;

import java.util.Date;

/**
 * Created by Aghbac on 12/10/16.
 */
@AutoValue
public abstract class Person {
    abstract Integer id();
    abstract Integer familyId();
    abstract String name();
    abstract String phone();
    abstract Integer age();
    abstract Date birthday();

    public static Builder builder() {
        return new AutoValue_Person.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder id(Integer id);

        public abstract Builder familyId(Integer familyId);

        public abstract Builder name(String name);

        public abstract Builder phone(String phone);

        public abstract Builder age(Integer age);

        public abstract Builder birthday(Date birthday);

        public abstract Person build();
    }
}
