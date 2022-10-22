package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactFlightClientResponse extends StObject {
  
  def readRoot(): Any
}
object ReactFlightClientResponse {
  
  inline def apply(readRoot: CallbackTo[Any]): ReactFlightClientResponse = {
    val __obj = js.Dynamic.literal(readRoot = readRoot.toJsFn)
    __obj.asInstanceOf[ReactFlightClientResponse]
  }
  
  extension [Self <: ReactFlightClientResponse](x: Self) {
    
    inline def setReadRoot(value: CallbackTo[Any]): Self = StObject.set(x, "readRoot", value.toJsFn)
  }
}
