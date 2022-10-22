package typingsJapgolly.detox.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.detox.mod.global.Detox.CircusTestEventListenerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEventsListener extends StObject {
  
  /**
    * Registers a listener such as an adapter or reporter
    * @example
    * detoxCircus.getEnv().addEventsListener(adapter)
    * detoxCircus.getEnv().addEventsListener(assignReporter)
    */
  def addEventsListener(listener: CircusTestEventListenerBase): Unit
}
object AddEventsListener {
  
  inline def apply(addEventsListener: CircusTestEventListenerBase => Callback): AddEventsListener = {
    val __obj = js.Dynamic.literal(addEventsListener = js.Any.fromFunction1((t0: CircusTestEventListenerBase) => addEventsListener(t0).runNow()))
    __obj.asInstanceOf[AddEventsListener]
  }
  
  extension [Self <: AddEventsListener](x: Self) {
    
    inline def setAddEventsListener(value: CircusTestEventListenerBase => Callback): Self = StObject.set(x, "addEventsListener", js.Any.fromFunction1((t0: CircusTestEventListenerBase) => value(t0).runNow()))
  }
}
