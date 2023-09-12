package com.demoqa.pages.test.data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Properties {

    public String firstNameValue,
            lastNameValue,
            userEmailValue,
            genderWrapperValue,
            userNumberValue,
            birthDayValue,
            birthMonthValue,
            birthYearValue,
            subjectsInputValue,
            hobbiesWrapperValue,
            uploadPictureValue,
            currentAddressValue,
            stateValue,
            cityValue;

    public Properties() {
        Faker fakerEn = new Faker(new Locale("en"));
        firstNameValue = Methods.getRandomFirstName(fakerEn);
        lastNameValue = Methods.getRandomLastName(fakerEn);
        userEmailValue = Methods.getRandomUserEmail(fakerEn);
        genderWrapperValue = Methods.getRandomGender();
        userNumberValue = Methods.getRandomUserNumber(fakerEn);
        birthDayValue = Methods.getRandomDay();
        birthMonthValue = Methods.getRandomMonth();
        birthYearValue = Methods.getRandomYear();
        subjectsInputValue = Methods.getRandomSubject();
        hobbiesWrapperValue = Methods.getRandomHobby();
        uploadPictureValue = Methods.getRandomPicture();
        currentAddressValue = Methods.getRandomCurrentAddress(fakerEn);
        stateValue = Methods.getRandomState();
        cityValue = Methods.getRandomCity(stateValue);
    }
}