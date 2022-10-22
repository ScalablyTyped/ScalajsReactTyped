package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnixListener
  extends StObject
     with BaseListener
     with SocketListener {
  
  /**
    * Path being listened on.
    */
  var path: String
}
object UnixListener {
  
  inline def apply(
    accept: CallbackTo[js.Promise[SocketConnection]],
    close: CallbackTo[js.Promise[Unit]],
    path: String
  ): UnixListener = {
    val __obj = js.Dynamic.literal(accept = accept.toJsFn, close = close.toJsFn, path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixListener]
  }
  
  extension [Self <: UnixListener](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
