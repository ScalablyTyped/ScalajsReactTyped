package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInvitationRequest extends StObject {
  
  /**
    * The unique ID of the detector of the GuardDuty member account.
    */
  var DetectorId: typingsJapgolly.awsSdk.clientsGuarddutyMod.DetectorId
  
  /**
    * The value that is used to validate the administrator account to the member account.
    */
  var InvitationId: String
  
  /**
    * The account ID of the GuardDuty administrator account whose invitation you're accepting.
    */
  var MasterId: String
}
object AcceptInvitationRequest {
  
  inline def apply(DetectorId: DetectorId, InvitationId: String, MasterId: String): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], InvitationId = InvitationId.asInstanceOf[js.Any], MasterId = MasterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
  
  extension [Self <: AcceptInvitationRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setInvitationId(value: String): Self = StObject.set(x, "InvitationId", value.asInstanceOf[js.Any])
    
    inline def setMasterId(value: String): Self = StObject.set(x, "MasterId", value.asInstanceOf[js.Any])
  }
}
