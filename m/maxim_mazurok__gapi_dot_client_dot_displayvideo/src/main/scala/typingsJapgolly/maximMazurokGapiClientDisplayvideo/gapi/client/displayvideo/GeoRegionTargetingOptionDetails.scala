package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoRegionTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the geographic region (e.g., "Ontario, Canada"). */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The type of geographic region targeting. */
  var geoRegionType: js.UndefOr[String] = js.undefined
}
object GeoRegionTargetingOptionDetails {
  
  inline def apply(): GeoRegionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoRegionTargetingOptionDetails]
  }
  
  extension [Self <: GeoRegionTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGeoRegionType(value: String): Self = StObject.set(x, "geoRegionType", value.asInstanceOf[js.Any])
    
    inline def setGeoRegionTypeUndefined: Self = StObject.set(x, "geoRegionType", js.undefined)
  }
}
