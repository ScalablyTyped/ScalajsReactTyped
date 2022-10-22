package typingsJapgolly.nodeRedRuntime.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommsConnection extends StObject {
  
  def send(): Unit
  
  var session: String
  
  var user: js.Object
}
object CommsConnection {
  
  inline def apply(send: Callback, session: String, user: js.Object): CommsConnection = {
    val __obj = js.Dynamic.literal(send = send.toJsFn, session = session.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommsConnection]
  }
  
  extension [Self <: CommsConnection](x: Self) {
    
    inline def setSend(value: Callback): Self = StObject.set(x, "send", value.toJsFn)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setUser(value: js.Object): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
