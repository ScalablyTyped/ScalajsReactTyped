package typingsJapgolly.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSessionEvents extends StObject {
  
  def ended(session: ClientSession): Unit
}
object ClientSessionEvents {
  
  inline def apply(ended: ClientSession => japgolly.scalajs.react.Callback): ClientSessionEvents = {
    val __obj = js.Dynamic.literal(ended = js.Any.fromFunction1((t0: ClientSession) => ended(t0).runNow()))
    __obj.asInstanceOf[ClientSessionEvents]
  }
  
  extension [Self <: ClientSessionEvents](x: Self) {
    
    inline def setEnded(value: ClientSession => japgolly.scalajs.react.Callback): Self = StObject.set(x, "ended", js.Any.fromFunction1((t0: ClientSession) => value(t0).runNow()))
  }
}
