package typingsJapgolly.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeoLocationResponse extends StObject {
  
  /**
    * A complex type that contains the codes and full continent, country, and subdivision names for the specified geolocation code.
    */
  var GeoLocationDetails: typingsJapgolly.awsSdk.clientsRoute53Mod.GeoLocationDetails
}
object GetGeoLocationResponse {
  
  inline def apply(GeoLocationDetails: GeoLocationDetails): GetGeoLocationResponse = {
    val __obj = js.Dynamic.literal(GeoLocationDetails = GeoLocationDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeoLocationResponse]
  }
  
  extension [Self <: GetGeoLocationResponse](x: Self) {
    
    inline def setGeoLocationDetails(value: GeoLocationDetails): Self = StObject.set(x, "GeoLocationDetails", value.asInstanceOf[js.Any])
  }
}
