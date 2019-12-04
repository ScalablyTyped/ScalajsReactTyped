package typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesLibEventPoolMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Event
import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventPool extends js.Object {
  val handlerSets: js.Any
  val poolName: js.Any
  def addHandlers(eventType: String, eventHandlers: EventListeners): EventPool
  def dispatchEvent(eventType: String, event: Event): Unit
  def hasHandlers(): Boolean
  def removeHandlers(eventType: String, eventHandlers: EventListeners): EventPool
}

object EventPool {
  @scala.inline
  def apply(
    addHandlers: (String, EventListeners) => CallbackTo[EventPool],
    dispatchEvent: (String, Event) => Callback,
    handlerSets: js.Any,
    hasHandlers: CallbackTo[Boolean],
    poolName: js.Any,
    removeHandlers: (String, EventListeners) => CallbackTo[EventPool]
  ): EventPool = {
    val __obj = js.Dynamic.literal(handlerSets = handlerSets.asInstanceOf[js.Any], poolName = poolName.asInstanceOf[js.Any])
    __obj.updateDynamic("addHandlers")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners) => addHandlers(t0, t1).runNow()))
    __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: org.scalajs.dom.raw.Event) => dispatchEvent(t0, t1).runNow()))
    __obj.updateDynamic("hasHandlers")(hasHandlers.toJsFn)
    __obj.updateDynamic("removeHandlers")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners) => removeHandlers(t0, t1).runNow()))
    __obj.asInstanceOf[EventPool]
  }
}

