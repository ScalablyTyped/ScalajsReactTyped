package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSiteToSiteVpnAttachmentRequest extends StObject {
  
  /**
    * The ID of the attachment.
    */
  var AttachmentId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.AttachmentId
}
object GetSiteToSiteVpnAttachmentRequest {
  
  inline def apply(AttachmentId: AttachmentId): GetSiteToSiteVpnAttachmentRequest = {
    val __obj = js.Dynamic.literal(AttachmentId = AttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSiteToSiteVpnAttachmentRequest]
  }
  
  extension [Self <: GetSiteToSiteVpnAttachmentRequest](x: Self) {
    
    inline def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
  }
}
