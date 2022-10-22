package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  /** Set up a listener for popstate event on window */
  def init(): Unit
  
  /**
    * Check if pushState option is true, and if browser supports it
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean
  
  /**
    * Handler for the popstate event
    *
    * @param event The native popstate event
    */
  def pop(event: Event): Unit
  
  /**
    * Update the URL data using pushState
    *
    * @param data An object with the parameters we want to push
    */
  def push(data: js.Object): Unit
}
object State {
  
  inline def apply(
    init: Callback,
    initOnLoad: CallbackTo[Boolean],
    pop: Event => Callback,
    push: js.Object => Callback
  ): State = {
    val __obj = js.Dynamic.literal(init = init.toJsFn, initOnLoad = initOnLoad.toJsFn, pop = js.Any.fromFunction1((t0: Event) => pop(t0).runNow()), push = js.Any.fromFunction1((t0: js.Object) => push(t0).runNow()))
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInitOnLoad(value: CallbackTo[Boolean]): Self = StObject.set(x, "initOnLoad", value.toJsFn)
    
    inline def setPop(value: Event => Callback): Self = StObject.set(x, "pop", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setPush(value: js.Object => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
