package typingsJapgolly.jquery

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQuery.HandleObject
import typingsJapgolly.jquery.JQuery._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandleObj[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  /**
    * When an event handler is removed from an element using an API such as `.off()`, this hook is called. The `this` keyword will be the element where the handler is being removed, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#remove-function-handleobj }\`
    */
  def remove(`this`: TTarget, handleObj: HandleObject[TTarget, TData]): Unit
}

object Anon_HandleObj {
  @scala.inline
  def apply[TTarget, TData](remove: (TTarget, HandleObject[TTarget, TData]) => Callback): Anon_HandleObj[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: TTarget, t1: typingsJapgolly.jquery.JQuery.HandleObject[TTarget, TData]) => remove(t0, t1).runNow()))
    __obj.asInstanceOf[Anon_HandleObj[TTarget, TData]]
  }
}

