package typingsJapgolly.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplayXHRRequest extends StObject {
  
  /**
    * Identifier of XHR to replay.
    */
  var requestId: RequestId
}
object ReplayXHRRequest {
  
  inline def apply(requestId: RequestId): ReplayXHRRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplayXHRRequest]
  }
  
  extension [Self <: ReplayXHRRequest](x: Self) {
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
