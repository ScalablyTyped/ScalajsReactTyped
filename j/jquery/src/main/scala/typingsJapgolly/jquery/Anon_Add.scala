package typingsJapgolly.jquery

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQuery.HandleObject
import typingsJapgolly.jquery.JQuery._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  /**
    * Each time an event handler is added to an element through an API such as `.on()`, jQuery calls this hook. The `this` keyword will be the element to which the event handler is being added, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#add-function-handleobj }\`
    */
  def add(`this`: TTarget, handleObj: HandleObject[TTarget, TData]): Unit
}

object Anon_Add {
  @scala.inline
  def apply[TTarget, TData](add: (TTarget, HandleObject[TTarget, TData]) => Callback): Anon_Add[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: TTarget, t1: typingsJapgolly.jquery.JQuery.HandleObject[TTarget, TData]) => add(t0, t1).runNow()))
    __obj.asInstanceOf[Anon_Add[TTarget, TData]]
  }
}

