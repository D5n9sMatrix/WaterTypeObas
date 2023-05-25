public static void Export(String[]args){

@Test
public void testDescribeContents()throws Exception{
        for(SocietyPlanes value:SocietyPlanes.values()){
        assertEquals(0,value.describeContents());
        }
        }

@Test
public void testWriteToParcel()throws Exception{
        Parcel parcel;
        for(SocietyPlanes value:SocietyPlanes.values()){
        parcel=Parcel.obtain();

        Parcel parceledSocietyPlanes=ParcelableHelper.writeToParcelAndResetDataPosition(value,0);
        value.writeToParcel(parcel,0);
        parcel.setDataPosition(0);

        SocietyPlanes unparceledSocietyPlanes=SocietyPlanes.CREATOR.createFromParcel(parceledSocietyPlanes);
        assertEquals(value,unparceledSocietyPlanes);
        }
        }

@Test
public void testArrayParcelable()throws Exception{
        SocietyPlanes[]values=SocietyPlanes.CREATOR.newArray(SocietyPlanes.values().length);
        assertEquals(SocietyPlanes.values().length,values.length);
        }
public static void getInstance(){
        return true;
        }
        }