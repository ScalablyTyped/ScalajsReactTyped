package typingsJapgolly.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressComponent extends StObject {
  
  var adcode: String
  
  var building: String
  
  var buildingType: String
  
  var businessAreas: js.Array[BusinessArea]
  
  var city: String
  
  var citycode: String
  
  var district: String
  
  var neighborhood: String
  
  var neighborhoodType: String
  
  var province: String
  
  var street: String
  
  var streetNumber: String
  
  var township: String
}
object AddressComponent {
  
  inline def apply(
    adcode: String,
    building: String,
    buildingType: String,
    businessAreas: js.Array[BusinessArea],
    city: String,
    citycode: String,
    district: String,
    neighborhood: String,
    neighborhoodType: String,
    province: String,
    street: String,
    streetNumber: String,
    township: String
  ): AddressComponent = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], building = building.asInstanceOf[js.Any], buildingType = buildingType.asInstanceOf[js.Any], businessAreas = businessAreas.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any], neighborhoodType = neighborhoodType.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any], township = township.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressComponent]
  }
  
  extension [Self <: AddressComponent](x: Self) {
    
    inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    inline def setBuilding(value: String): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
    
    inline def setBuildingType(value: String): Self = StObject.set(x, "buildingType", value.asInstanceOf[js.Any])
    
    inline def setBusinessAreas(value: js.Array[BusinessArea]): Self = StObject.set(x, "businessAreas", value.asInstanceOf[js.Any])
    
    inline def setBusinessAreasVarargs(value: BusinessArea*): Self = StObject.set(x, "businessAreas", js.Array(value*))
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
    
    inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    inline def setNeighborhood(value: String): Self = StObject.set(x, "neighborhood", value.asInstanceOf[js.Any])
    
    inline def setNeighborhoodType(value: String): Self = StObject.set(x, "neighborhoodType", value.asInstanceOf[js.Any])
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    inline def setStreetNumber(value: String): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
    
    inline def setTownship(value: String): Self = StObject.set(x, "township", value.asInstanceOf[js.Any])
  }
}
