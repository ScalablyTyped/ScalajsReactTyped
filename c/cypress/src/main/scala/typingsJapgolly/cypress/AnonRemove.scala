package typingsJapgolly.cypress

import japgolly.scalajs.react.Callback
import typingsJapgolly.cypress.JQuery_.HandleObject
import typingsJapgolly.cypress.JQuery_._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemove[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  /**
    * When an event handler is removed from an element using an API such as `.off()`, this hook is called. The `this` keyword will be the element where the handler is being removed, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#remove-function-handleobj }\`
    */
  def remove(handleObj: HandleObject[TTarget, TData]): Unit
}

object AnonRemove {
  @scala.inline
  def apply[TTarget, TData](remove: HandleObject[TTarget, TData] => Callback): AnonRemove[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.JQuery_.HandleObject[TTarget, TData]) => remove(t0).runNow()))
    __obj.asInstanceOf[AnonRemove[TTarget, TData]]
  }
}

