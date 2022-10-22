package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDetectorRequest extends StObject {
  
  /**
    * The unique ID of the detector that you want to get.
    */
  var DetectorId: typingsJapgolly.awsSdk.clientsGuarddutyMod.DetectorId
}
object GetDetectorRequest {
  
  inline def apply(DetectorId: DetectorId): GetDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorRequest]
  }
  
  extension [Self <: GetDetectorRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
