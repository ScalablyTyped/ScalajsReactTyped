package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHostKeyRequest extends StObject {
  
  /**
    * The identifier of the host key that you want described.
    */
  var HostKeyId: typingsJapgolly.awsSdk.clientsTransferMod.HostKeyId
  
  /**
    * The identifier of the server that contains the host key that you want described.
    */
  var ServerId: typingsJapgolly.awsSdk.clientsTransferMod.ServerId
}
object DescribeHostKeyRequest {
  
  inline def apply(HostKeyId: HostKeyId, ServerId: ServerId): DescribeHostKeyRequest = {
    val __obj = js.Dynamic.literal(HostKeyId = HostKeyId.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHostKeyRequest]
  }
  
  extension [Self <: DescribeHostKeyRequest](x: Self) {
    
    inline def setHostKeyId(value: HostKeyId): Self = StObject.set(x, "HostKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
