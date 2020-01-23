package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBDirectDebit1  {

    private java.time.LocalDateTime PreviousPaymentDateTime;
    private String AccountId;
    private String MandateIdentification;
    private OBExternalDirectDebitStatus1Code DirectDebitStatusCode;
    private String DirectDebitId;
    private OBActiveOrHistoricCurrencyAndAmount PreviousPaymentAmount;
    private String Name;

    public OBDirectDebit1 () {
    }

    @JsonProperty("PreviousPaymentDateTime")
    public java.time.LocalDateTime getPreviousPaymentDateTime() {
        return PreviousPaymentDateTime;
    }

    public void setPreviousPaymentDateTime(java.time.LocalDateTime PreviousPaymentDateTime) {
        this.PreviousPaymentDateTime = PreviousPaymentDateTime;
    }

    @JsonProperty("AccountId")
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    @JsonProperty("MandateIdentification")
    public String getMandateIdentification() {
        return MandateIdentification;
    }

    public void setMandateIdentification(String MandateIdentification) {
        this.MandateIdentification = MandateIdentification;
    }

    @JsonProperty("DirectDebitStatusCode")
    public OBExternalDirectDebitStatus1Code getDirectDebitStatusCode() {
        return DirectDebitStatusCode;
    }

    public void setDirectDebitStatusCode(OBExternalDirectDebitStatus1Code DirectDebitStatusCode) {
        this.DirectDebitStatusCode = DirectDebitStatusCode;
    }

    @JsonProperty("DirectDebitId")
    public String getDirectDebitId() {
        return DirectDebitId;
    }

    public void setDirectDebitId(String DirectDebitId) {
        this.DirectDebitId = DirectDebitId;
    }

    @JsonProperty("PreviousPaymentAmount")
    public OBActiveOrHistoricCurrencyAndAmount getPreviousPaymentAmount() {
        return PreviousPaymentAmount;
    }

    public void setPreviousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount PreviousPaymentAmount) {
        this.PreviousPaymentAmount = PreviousPaymentAmount;
    }

    @JsonProperty("Name")
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBDirectDebit1 OBDirectDebit1 = (OBDirectDebit1) o;

        return Objects.equals(PreviousPaymentDateTime, OBDirectDebit1.PreviousPaymentDateTime) &&
               Objects.equals(AccountId, OBDirectDebit1.AccountId) &&
               Objects.equals(MandateIdentification, OBDirectDebit1.MandateIdentification) &&
               Objects.equals(DirectDebitStatusCode, OBDirectDebit1.DirectDebitStatusCode) &&
               Objects.equals(DirectDebitId, OBDirectDebit1.DirectDebitId) &&
               Objects.equals(PreviousPaymentAmount, OBDirectDebit1.PreviousPaymentAmount) &&
               Objects.equals(Name, OBDirectDebit1.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PreviousPaymentDateTime, AccountId, MandateIdentification, DirectDebitStatusCode, DirectDebitId, PreviousPaymentAmount, Name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDirectDebit1 {\n");
        sb.append("    PreviousPaymentDateTime: ").append(toIndentedString(PreviousPaymentDateTime)).append("\n");        sb.append("    AccountId: ").append(toIndentedString(AccountId)).append("\n");        sb.append("    MandateIdentification: ").append(toIndentedString(MandateIdentification)).append("\n");        sb.append("    DirectDebitStatusCode: ").append(toIndentedString(DirectDebitStatusCode)).append("\n");        sb.append("    DirectDebitId: ").append(toIndentedString(DirectDebitId)).append("\n");        sb.append("    PreviousPaymentAmount: ").append(toIndentedString(PreviousPaymentAmount)).append("\n");        sb.append("    Name: ").append(toIndentedString(Name)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
