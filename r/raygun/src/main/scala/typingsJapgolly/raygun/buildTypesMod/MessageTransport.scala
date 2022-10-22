package typingsJapgolly.raygun.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageTransport extends StObject {
  
  def send(message: String): Unit
}
object MessageTransport {
  
  inline def apply(send: String => japgolly.scalajs.react.Callback): MessageTransport = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1((t0: String) => send(t0).runNow()))
    __obj.asInstanceOf[MessageTransport]
  }
  
  extension [Self <: MessageTransport](x: Self) {
    
    inline def setSend(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
