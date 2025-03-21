package in.edu.kristujayanti.propertyBinder.KJAnnexe;

import in.edu.kristujayanti.propertyBinder.KJUSYSPropertyBinder;
import org.bson.Document;

public enum AnnexeBookingPBinder implements KJUSYSPropertyBinder {

    BOOKING_ID("bookingId_KJAnnexeBooking_Text", "Booking ID", String.class),
    GUEST_INFO("guestInfo_KJAnnexeBooking_DocumentArray", "Guest Information", Document.class),
    PURPOSE_OF_VISIT("purposeOfVisit_KJAnnexeBooking_Text", "Purpose of Visit", String.class),
    STAFF_IN_CHARGE("staffInCharge_KJAnnexeBooking_Text", "Staff In Charge", String.class),
    STAFF_IN_CHARGE_MOBILE("staffInChargeMobile_KJAnnexeBooking_Text", "Staff In Charge Mobile", String.class),
    PROGRAMME_NAME("programmeName_KJAnnexeBooking_Text", "Programme Name", String.class),
    START_DATE_OF_PROGRAMME("startDateOfProgramme_KJAnnexeBooking_Date", "Start Date of Programme", Long.class),
    END_DATE_OF_PROGRAMME("endDateOfProgramme_KJAnnexeBooking_Date", "End Date of Programme", Long.class),
    CHECK_IN_DATE("checkInDate_KJAnnexeBooking_Date", "Check-in Date", Long.class),
    CHECK_OUT_DATE("checkOutDate_KJAnnexeBooking_Date", "Check-out Date", Long.class),
    COLLEGE_GUEST("collegeGuest_KJAnnexeBooking_Bool", "College Guest", Boolean.class),
    GUEST_NAME("guestName_KJAnnexeBooking_Text", "Guest Name", String.class),

    SELECTED_ROOM("selectedRoom_KJAnnexeBooking_DocumentArray", "Selected Room Details", Document.class),

    BED_INFO("bedInfo_KJAnnexeBooking_DocumentArray", "Bed Information", Document.class),

    BOOKING_STATUS("bookingStatus_KJAnnexeBooking_Text", "Booking Status", String.class),
    PAYMENT_STATUS("paymentStatus_KJAnnexeBooking_Text", "Payment Status", String.class),
    TOTAL_AMOUNT_PAYABLE("totalAmountPayable_KJAnnexeBooking_double", "Total Amount Payable", Double.class);

    private final String property;
    private final String label;
    private final Class<?> dataType;
    private final int minLength;
    private final int maxLength;

    private AnnexeBookingPBinder(String property, String label, Class<?> dataType, int minLength, int maxLength) {
        this.property = property;
        this.label = label;
        this.dataType = dataType;
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    private AnnexeBookingPBinder(String property, String label, Class<?> dataType) {
        this.property = property;
        this.label = label;
        this.dataType = dataType;
        this.minLength = -1;
        this.maxLength = -1;
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

    private static AnnexeBookingPBinder[] $values() {
        return AnnexeBookingPBinder.class.getEnumConstants();
    }
}

