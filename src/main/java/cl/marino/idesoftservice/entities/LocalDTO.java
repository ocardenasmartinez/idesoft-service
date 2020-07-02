package cl.marino.idesoftservice.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalDTO {

    @SerializedName("local_nombre")
    private String localNombre;
    @SerializedName("comuna_nombre")
    private String comunaNombre;
    @SerializedName("local_direccion")
    private String localDireccion;
    @SerializedName("local_telefono")
    private String localTelefono;
    @SerializedName("local_lat")
    private String localLat;
    @SerializedName("local_lng")
    private String localLng;

}