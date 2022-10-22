package typingsJapgolly.cypress.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.cypress.JQuery.HandleObject
import typingsJapgolly.cypress.JQuery._SpecialEventHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add[TTarget, TData]
  extends StObject
     with _SpecialEventHook[TTarget, TData] {
  
  /**
    * Each time an event handler is added to an element through an API such as `.on()`, jQuery calls this hook. The `this` keyword will be the element to which the event handler is being added, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#add-function-handleobj }\`
    */
  def add(handleObj: HandleObject[TTarget, TData]): Unit
}
object Add {
  
  inline def apply[TTarget, TData](add: HandleObject[TTarget, TData] => Callback): Add[TTarget, TData] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: HandleObject[TTarget, TData]) => add(t0).runNow()))
    __obj.asInstanceOf[Add[TTarget, TData]]
  }
  
  extension [Self <: Add[?, ?], TTarget, TData](x: Self & (Add[TTarget, TData])) {
    
    inline def setAdd(value: HandleObject[TTarget, TData] => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: HandleObject[TTarget, TData]) => value(t0).runNow()))
  }
}
