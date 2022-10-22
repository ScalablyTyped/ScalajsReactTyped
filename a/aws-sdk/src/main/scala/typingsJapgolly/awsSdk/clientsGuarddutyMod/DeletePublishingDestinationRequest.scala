package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePublishingDestinationRequest extends StObject {
  
  /**
    * The ID of the publishing destination to delete.
    */
  var DestinationId: String
  
  /**
    * The unique ID of the detector associated with the publishing destination to delete.
    */
  var DetectorId: typingsJapgolly.awsSdk.clientsGuarddutyMod.DetectorId
}
object DeletePublishingDestinationRequest {
  
  inline def apply(DestinationId: String, DetectorId: DetectorId): DeletePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePublishingDestinationRequest]
  }
  
  extension [Self <: DeletePublishingDestinationRequest](x: Self) {
    
    inline def setDestinationId(value: String): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
