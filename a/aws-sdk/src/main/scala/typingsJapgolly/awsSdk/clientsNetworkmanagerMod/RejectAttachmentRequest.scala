package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectAttachmentRequest extends StObject {
  
  /**
    * The ID of the attachment.
    */
  var AttachmentId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.AttachmentId
}
object RejectAttachmentRequest {
  
  inline def apply(AttachmentId: AttachmentId): RejectAttachmentRequest = {
    val __obj = js.Dynamic.literal(AttachmentId = AttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectAttachmentRequest]
  }
  
  extension [Self <: RejectAttachmentRequest](x: Self) {
    
    inline def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
  }
}
