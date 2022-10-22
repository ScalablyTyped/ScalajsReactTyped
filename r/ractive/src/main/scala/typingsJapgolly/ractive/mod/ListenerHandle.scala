package typingsJapgolly.ractive.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerHandle extends StObject {
  
  /**
  	 * Removes the listener from the event.j
  	 */
  def cancel(): Unit
}
object ListenerHandle {
  
  inline def apply(cancel: Callback): ListenerHandle = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn)
    __obj.asInstanceOf[ListenerHandle]
  }
  
  extension [Self <: ListenerHandle](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
  }
}
