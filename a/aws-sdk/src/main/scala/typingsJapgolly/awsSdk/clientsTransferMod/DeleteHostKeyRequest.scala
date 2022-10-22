package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHostKeyRequest extends StObject {
  
  /**
    * The identifier of the host key that you are deleting.
    */
  var HostKeyId: typingsJapgolly.awsSdk.clientsTransferMod.HostKeyId
  
  /**
    * The identifier of the server that contains the host key that you are deleting.
    */
  var ServerId: typingsJapgolly.awsSdk.clientsTransferMod.ServerId
}
object DeleteHostKeyRequest {
  
  inline def apply(HostKeyId: HostKeyId, ServerId: ServerId): DeleteHostKeyRequest = {
    val __obj = js.Dynamic.literal(HostKeyId = HostKeyId.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHostKeyRequest]
  }
  
  extension [Self <: DeleteHostKeyRequest](x: Self) {
    
    inline def setHostKeyId(value: HostKeyId): Self = StObject.set(x, "HostKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
