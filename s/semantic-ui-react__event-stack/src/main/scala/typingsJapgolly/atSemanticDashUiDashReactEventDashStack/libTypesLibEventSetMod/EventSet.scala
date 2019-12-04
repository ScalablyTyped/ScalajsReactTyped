package typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesLibEventSetMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Event
import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners
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
  def dispatchEvent(event: Event, dispatchAll: Boolean): Unit
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
    dispatchEvent: (Event, Boolean) => Callback,
    handlers: js.Any,
    hasHandlers: CallbackTo[Boolean],
    removeHandlers: EventListeners => CallbackTo[EventSet]
  ): EventSet = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
    __obj.updateDynamic("addHandlers")(js.Any.fromFunction1((t0: typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners) => addHandlers(t0).runNow()))
    __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Event, t1: scala.Boolean) => dispatchEvent(t0, t1).runNow()))
    __obj.updateDynamic("hasHandlers")(hasHandlers.toJsFn)
    __obj.updateDynamic("removeHandlers")(js.Any.fromFunction1((t0: typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners) => removeHandlers(t0).runNow()))
    __obj.asInstanceOf[EventSet]
  }
}

