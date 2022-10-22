package typingsJapgolly.meteor.meteorMod.Meteor

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Connection **/
trait Connection extends StObject {
  
  var clientAddress: String
  
  def close(): Unit
  
  var httpHeaders: js.Object
  
  var id: String
  
  def onClose(callback: js.Function0[Unit]): Unit
}
object Connection {
  
  inline def apply(
    clientAddress: String,
    close: Callback,
    httpHeaders: js.Object,
    id: String,
    onClose: js.Function0[Unit] => Callback
  ): Connection = {
    val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], close = close.toJsFn, httpHeaders = httpHeaders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClose = js.Any.fromFunction1((t0: js.Function0[Unit]) => onClose(t0).runNow()))
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setClientAddress(value: String): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setHttpHeaders(value: js.Object): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnClose(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
  }
}
