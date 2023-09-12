package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.test.data.Properties;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("faker")
public class RegistrationFormTestsWithFaker extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    Properties testData = new Properties();

    @Test
    void registrationFormTest() {

        registrationPage.openPage()
                .setFirstName(testData.firstNameValue)
                .setLastName(testData.lastNameValue)
                .setUserEmail(testData.userEmailValue)
                .setGender(testData.genderWrapperValue)
                .setNumber(testData.userNumberValue)
                .setBirthDate(testData.birthDayValue, testData.birthMonthValue, testData.birthYearValue)
                .setSubjects(testData.subjectsInputValue)
                .setHobbies(testData.hobbiesWrapperValue)
                .setPicture(testData.uploadPictureValue)
                .setCurrentAddress(testData.currentAddressValue)
                .setState(testData.stateValue)
                .setCity(testData.cityValue)
                .submit();

        registrationPage.checkModalAppears()
                .checkTableResult("Student Name", testData.firstNameValue + " " + testData.lastNameValue)
                .checkTableResult("Student Email", testData.userEmailValue)
                .checkTableResult("Gender", testData.genderWrapperValue)
                .checkTableResult("Mobile", testData.userNumberValue)
                .checkTableResult(
                        "Date of Birth",
                        testData.birthDayValue + " " + testData.birthMonthValue + "," + testData.birthYearValue
                )
                .checkTableResult("Subjects", testData.subjectsInputValue)
                .checkTableResult("Hobbies", testData.hobbiesWrapperValue)
                .checkTableResult("Picture", testData.uploadPictureValue)
                .checkTableResult("Address", testData.currentAddressValue)
                .checkTableResult("State and City", testData.stateValue + " " + testData.cityValue);
    }
}
