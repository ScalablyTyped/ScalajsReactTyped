package typingsJapgolly.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitAttachmentStateChangesResponse extends StObject {
  
  /**
    * Acknowledgement of the state change.
    */
  var acknowledgment: js.UndefOr[String] = js.undefined
}
object SubmitAttachmentStateChangesResponse {
  
  inline def apply(): SubmitAttachmentStateChangesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitAttachmentStateChangesResponse]
  }
  
  extension [Self <: SubmitAttachmentStateChangesResponse](x: Self) {
    
    inline def setAcknowledgment(value: String): Self = StObject.set(x, "acknowledgment", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgmentUndefined: Self = StObject.set(x, "acknowledgment", js.undefined)
  }
}
