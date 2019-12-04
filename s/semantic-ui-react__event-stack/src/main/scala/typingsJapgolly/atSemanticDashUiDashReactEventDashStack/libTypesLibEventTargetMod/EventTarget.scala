package typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesLibEventTargetMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTarget extends js.Object {
  var addTargetHandler: js.Any
  var createEmitter: js.Any
  val handlers: js.Any
  val pools: js.Any
  var removeTargetHandler: js.Any
  val target: js.Any
  def addHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit
  def hasHandlers(): Boolean
  def removeHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit
}

object EventTarget {
  @scala.inline
  def apply(
    addHandlers: (String, String, EventListeners) => Callback,
    addTargetHandler: js.Any,
    createEmitter: js.Any,
    handlers: js.Any,
    hasHandlers: CallbackTo[Boolean],
    pools: js.Any,
    removeHandlers: (String, String, EventListeners) => Callback,
    removeTargetHandler: js.Any,
    target: js.Any
  ): EventTarget = {
    val __obj = js.Dynamic.literal(addTargetHandler = addTargetHandler.asInstanceOf[js.Any], createEmitter = createEmitter.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any], pools = pools.asInstanceOf[js.Any], removeTargetHandler = removeTargetHandler.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("addHandlers")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners) => addHandlers(t0, t1, t2).runNow()))
    __obj.updateDynamic("hasHandlers")(hasHandlers.toJsFn)
    __obj.updateDynamic("removeHandlers")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners) => removeHandlers(t0, t1, t2).runNow()))
    __obj.asInstanceOf[EventTarget]
  }
}

