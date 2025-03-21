package in.edu.kristujayanti.propertyBinder.KJAnnexe;


import in.edu.kristujayanti.propertyBinder.KJUSYSPropertyBinder;
import in.edu.kristujayanti.propertyBinder.Library.LibraryCommonKeysPBinder;


public enum AnnexeRoomKeysPBinder implements KJUSYSPropertyBinder {
    KJANNEXE_ROOM_ID("roomId_KJAnnexRoom_Int", "KJAnnexe Room ID", Integer.class),
    KJANNEXE_ROOM_NUMBER("roomNumber_KJAnnexRoom_Text", "KJAnnexe Room Number", String.class),
    KJANNEXE_COST_PER_BED("costPerBed_KJAnnexRoom_Double", "KJAnnexe Cost Per Bed", Double.class),
    KJANNEXE_COST_PER_ROOM("costPerRoom_KJAnnexRoom_Double", "KJAnnexe Cost Per Room", Double.class),
    KJANNEXE_CREATED_AT("createdAt_KJAnnexRoom_Long", "KJAnnexe Created At", Long.class),
    KJANNEXE_UPDATED_AT("updatedAt_KJAnnexRoom_Long", "KJAnnexe Updated At", Long.class),
    KJANNEXE_ROOM_TYPE("roomType_KJAnnexRoom_Text", "KJAnnexe Room Type", String.class),
    KJANNEXE_MAX_PEOPLE("maxPeople_KJAnnexRoom_Int", "KJAnnexe Max People", Integer.class),
    KJANNEXE_PHOTO_URL("photoUrl_KJAnnexRoom_Text", "KJAnnexe Photo URL", String.class),
    KJANNEXE_STATUS("status_KJAnnexRoom_String", "KJAnnexe Status", String.class),
    KJANNEXE_NUMBER_OF_BEDS("numberOfBeds_KJAnnexRoom_Int", "KJAnnexe Number of Beds", Integer.class);


    private final String property;
    private final String label;
    private final Class<?> dataType;
    private final int minLength;
    private final int maxLength;

    private AnnexeRoomKeysPBinder(String property, String label, Class<?> dataType, int minLength, int maxLength) {
        this.property = property;
        this.label = label;
        this.dataType = dataType;
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    private AnnexeRoomKeysPBinder(String property, String label, Class<?> dataType) {
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

    public Class getDataType() {
        return this.dataType;
    }

    public Integer getMinLength() {
        return this.minLength;
    }

    public Integer getMaxLength() {
        return this.maxLength;
    }

    private static LibraryCommonKeysPBinder[] $values() {
        return (LibraryCommonKeysPBinder[])LibraryCommonKeysPBinder.class.getEnumConstants();
    }
}