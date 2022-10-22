package typingsJapgolly.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMissionProfileRequest extends StObject {
  
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: String
}
object GetMissionProfileRequest {
  
  inline def apply(missionProfileId: String): GetMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMissionProfileRequest]
  }
  
  extension [Self <: GetMissionProfileRequest](x: Self) {
    
    inline def setMissionProfileId(value: String): Self = StObject.set(x, "missionProfileId", value.asInstanceOf[js.Any])
  }
}
