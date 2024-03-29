package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProximityLocationListAssignedTargetingOptionDetails extends StObject {
  
  /** Required. ID of the proximity location list. Should refer to the location_list_id field of a LocationList resource whose type is `TARGETING_LOCATION_TYPE_PROXIMITY`. */
  var proximityLocationListId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Radius range for proximity location list. This represents the size of the area around a chosen location that will be targeted. `All` proximity location targeting under a
    * single resource must have the same radius range value. Set this value to match any existing targeting. If updated, this field will change the radius range for all proximity
    * targeting under the resource.
    */
  var proximityRadiusRange: js.UndefOr[String] = js.undefined
}
object ProximityLocationListAssignedTargetingOptionDetails {
  
  inline def apply(): ProximityLocationListAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProximityLocationListAssignedTargetingOptionDetails]
  }
  
  extension [Self <: ProximityLocationListAssignedTargetingOptionDetails](x: Self) {
    
    inline def setProximityLocationListId(value: String): Self = StObject.set(x, "proximityLocationListId", value.asInstanceOf[js.Any])
    
    inline def setProximityLocationListIdUndefined: Self = StObject.set(x, "proximityLocationListId", js.undefined)
    
    inline def setProximityRadiusRange(value: String): Self = StObject.set(x, "proximityRadiusRange", value.asInstanceOf[js.Any])
    
    inline def setProximityRadiusRangeUndefined: Self = StObject.set(x, "proximityRadiusRange", js.undefined)
  }
}
