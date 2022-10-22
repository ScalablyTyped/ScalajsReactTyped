package typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestNodeRequest extends StObject {
  
  /**
    * JavaScript object id to convert into node.
    */
  var objectId: RemoteObjectId
}
object RequestNodeRequest {
  
  inline def apply(objectId: RemoteObjectId): RequestNodeRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestNodeRequest]
  }
  
  extension [Self <: RequestNodeRequest](x: Self) {
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
