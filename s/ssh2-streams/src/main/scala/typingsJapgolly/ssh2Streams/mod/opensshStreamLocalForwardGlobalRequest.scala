package typingsJapgolly.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait opensshStreamLocalForwardGlobalRequest
  extends StObject
     with _GlobalRequest {
  
  var socketPath: String
}
object opensshStreamLocalForwardGlobalRequest {
  
  inline def apply(socketPath: String): opensshStreamLocalForwardGlobalRequest = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[opensshStreamLocalForwardGlobalRequest]
  }
  
  extension [Self <: opensshStreamLocalForwardGlobalRequest](x: Self) {
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
  }
}
