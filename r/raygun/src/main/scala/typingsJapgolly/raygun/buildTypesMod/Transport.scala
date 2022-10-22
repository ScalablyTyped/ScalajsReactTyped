package typingsJapgolly.raygun.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transport extends StObject {
  
  def send(options: SendOptions): Unit
}
object Transport {
  
  inline def apply(send: SendOptions => japgolly.scalajs.react.Callback): Transport = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1((t0: SendOptions) => send(t0).runNow()))
    __obj.asInstanceOf[Transport]
  }
  
  extension [Self <: Transport](x: Self) {
    
    inline def setSend(value: SendOptions => japgolly.scalajs.react.Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: SendOptions) => value(t0).runNow()))
  }
}
