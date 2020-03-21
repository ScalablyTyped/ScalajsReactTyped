package typingsJapgolly.semanticUiReactEventStack.eventSetMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.semanticUiReactEventStack.typesMod.EventListeners
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSet extends js.Object {
  val handlers: js.Any
  /**
    * @see https://jsperf.com/suir-eventset-addhandlers
    */
  def addHandlers(additionalHandlers: EventListeners): EventSet
  /**
    * @see https://jsperf.com/suir-eventset-dispatchsingle
    * @see https://jsperf.com/suir-eventset-dispatchmultiple2
    */
  def dispatchEvent(event: Event_, dispatchAll: Boolean): Unit
  def hasHandlers(): Boolean
  /**
    * @see https://jsperf.com/suir-eventset-removehandlers
    */
  def removeHandlers(removalHandlers: EventListeners): EventSet
}

object EventSet {
  @scala.inline
  def apply(
    addHandlers: EventListeners => CallbackTo[EventSet],
    dispatchEvent: (Event_, Boolean) => Callback,
    handlers: js.Any,
    hasHandlers: CallbackTo[Boolean],
    removeHandlers: EventListeners => CallbackTo[EventSet]
  ): EventSet = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
    __obj.updateDynamic("addHandlers")(js.Any.fromFunction1((t0: typingsJapgolly.semanticUiReactEventStack.typesMod.EventListeners) => addHandlers(t0).runNow()))
    __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: scala.Boolean) => dispatchEvent(t0, t1).runNow()))
    __obj.updateDynamic("hasHandlers")(hasHandlers.toJsFn)
    __obj.updateDynamic("removeHandlers")(js.Any.fromFunction1((t0: typingsJapgolly.semanticUiReactEventStack.typesMod.EventListeners) => removeHandlers(t0).runNow()))
    __obj.asInstanceOf[EventSet]
  }
}

