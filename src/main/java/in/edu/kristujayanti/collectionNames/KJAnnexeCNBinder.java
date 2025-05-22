package in.edu.kristujayanti.collectionNames;

public enum KJAnnexeCNBinder implements KJUSYSCNBinder {
    KJANNEXE_ROOM_COLLECTION("KJAnnexeRooms"),
    KJANNEXE_BOOKING_COLLECTION("KJAnnexeBooking"),
    KJANNEXE_PAYMENT_COLLECTION("KJAnnexePayment"),
    KJANNEXE_ROOM_TYPE_COLLECTION("KJAnnexeRoomTypes"),
    KJANNEXE_PROPERTY_COLLECTION("KJAnnexeProperties");
    private final String collectionName;

    private KJAnnexeCNBinder(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getCollectionName() {
        return this.collectionName;
    }

    // $FF: synthetic method
    private static KJAnnexeCNBinder[] $values() {
        return KJAnnexeCNBinder.class.getEnumConstants();
    }
}