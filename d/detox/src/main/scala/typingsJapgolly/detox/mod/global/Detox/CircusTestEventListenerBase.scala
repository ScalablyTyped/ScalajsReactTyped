package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircusTestEventListenerBase extends StObject {
  
  def handleTestEvent(event: Any, state: Any): js.Promise[Unit]
}
object CircusTestEventListenerBase {
  
  inline def apply(handleTestEvent: (Any, Any) => js.Promise[Unit]): CircusTestEventListenerBase = {
    val __obj = js.Dynamic.literal(handleTestEvent = js.Any.fromFunction2(handleTestEvent))
    __obj.asInstanceOf[CircusTestEventListenerBase]
  }
  
  extension [Self <: CircusTestEventListenerBase](x: Self) {
    
    inline def setHandleTestEvent(value: (Any, Any) => js.Promise[Unit]): Self = StObject.set(x, "handleTestEvent", js.Any.fromFunction2(value))
  }
}
