package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseListener extends StObject {
  
  /**
    * Waits for the next client to connect.
    */
  def accept(): js.Promise[SocketConnection]
  
  /**
    * Closes the listener, releasing resources related to it. Once the listener is closed, all other operations
    * will fail. Closing a listener multiple times is allowed and will not result in an error.
    */
  def close(): js.Promise[Unit]
}
object BaseListener {
  
  inline def apply(accept: CallbackTo[js.Promise[SocketConnection]], close: CallbackTo[js.Promise[Unit]]): BaseListener = {
    val __obj = js.Dynamic.literal(accept = accept.toJsFn, close = close.toJsFn)
    __obj.asInstanceOf[BaseListener]
  }
  
  extension [Self <: BaseListener](x: Self) {
    
    inline def setAccept(value: CallbackTo[js.Promise[SocketConnection]]): Self = StObject.set(x, "accept", value.toJsFn)
    
    inline def setClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
  }
}
