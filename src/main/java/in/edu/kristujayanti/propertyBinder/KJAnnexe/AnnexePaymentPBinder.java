package in.edu.kristujayanti.propertyBinder.KJAnnexe;

import in.edu.kristujayanti.propertyBinder.KJUSYSPropertyBinder;
import org.bson.Document;

public enum AnnexePaymentPBinder implements KJUSYSPropertyBinder {

    PAYMENT_ID("paymentId_KJAnnexePayment_Text", "Payment ID", String.class),
    BOOKING_ID("bookingId_KJAnnexePayment_Long", "Booking ID", Long.class),
    BILL_REF_NUMBER("billRefNumber_KJAnnexePayment_Text", "Bill Reference Number", String.class),
    ACCOMMODATION_CHARGES("accommodationCharges_KJAnnexePayment_Double", "Accommodation Charges", Double.class),
    PAYMENT_METHOD("paymentMethod_KJAnnexePayment_DocumentArray", "Payment Method", Document.class),
    DISCOUNT_AMOUNT("discountAmount_KJAnnexePayment_Double", "Discount Amount", Double.class),
    TOTAL_DUE_AMOUNT("totalDueAmount_KJAnnexePayment_Double", "Total Due Amount", Double.class),
    PAYMENT_STATUS("paymentStatus_KJAnnexePayment_Text", "Payment Status", String.class),
    AMOUNT_PAID("amountPaid_KJAnnexePayment_Double", "Amount Paid", Double.class),
    PAYMENT_DATE("paymentDate_KJAnnexePayment_Long", "Payment Date", Long.class);

    private final String property;
    private final String label;
    private final Class<?> dataType;
    private final int minLength;
    private final int maxLength;

    private AnnexePaymentPBinder(String property, String label, Class<?> dataType, int minLength, int maxLength) {
        this.property = property;
        this.label = label;
        this.dataType = dataType;
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    private AnnexePaymentPBinder(String property, String label, Class<?> dataType) {
        this(property, label, dataType, -1, -1);
    }

    public String getPropertyName() {
        return this.property;
    }

    public String getDisplayName() {
        return this.label;
    }

    public Class<?> getDataType() {
        return this.dataType;
    }

    public Integer getMinLength() {
        return this.minLength;
    }

    public Integer getMaxLength() {
        return this.maxLength;
    }

    private static AnnexePaymentPBinder[] $values() {
        return AnnexePaymentPBinder.class.getEnumConstants();
    }
}
