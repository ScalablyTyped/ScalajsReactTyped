package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServerRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a server.
    */
  var ServerId: typingsJapgolly.awsSdk.clientsTransferMod.ServerId
}
object DescribeServerRequest {
  
  inline def apply(ServerId: ServerId): DescribeServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServerRequest]
  }
  
  extension [Self <: DescribeServerRequest](x: Self) {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
