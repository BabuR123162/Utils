package in.edu.kristujayanti.propertyBinder.KJAnnexe;


import in.edu.kristujayanti.propertyBinder.KJUSYSPropertyBinder;
import in.edu.kristujayanti.propertyBinder.Library.LibraryCommonKeysPBinder;


public enum AnnexeRoomKeysPBinder implements KJUSYSPropertyBinder {
    ROOM_ID("roomId_KJAnnexeRoom_Int", "Room ID", Integer.class),
    ROOM_NUMBER("roomNumber_KJAnnexeRoom_Text", "Room Number", String.class),
    COST_PER_BED("costPerBed_KJAnnexeRoom_Double", "Cost Per Bed", Double.class),
    COST_PER_ROOM("costPerRoom_KJAnnexeRoom_Double", "Cost Per Room", Double.class),
    CREATED_AT("createdAt_KJAnnexeRoom_DateTime", "Created At", Long.class),
    UPDATED_AT("updatedAt_KJAnnexeRoom_DateTime", "Updated At", Long.class),
    ROOM_TYPE("roomType_KJAnnexeRoom_Text", "Room Type", String.class),
    MAX_PEOPLE("maxPeople_KJAnnexeRoom_Int", "Max People", Integer.class),
    PHOTO_URL("photoUrl_KJAnnexeRoom_Text", "Photo URL", String.class),
    ACTIVE_STATUS("activeStatus_KJAnnexeRoom_Bool", "Status", Boolean.class),
    NUMBER_OF_BEDS("numberOfBeds_KJAnnexeRoom_Int", "Number of Beds", Integer.class);


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