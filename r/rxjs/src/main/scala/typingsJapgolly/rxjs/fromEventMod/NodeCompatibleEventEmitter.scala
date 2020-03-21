package typingsJapgolly.rxjs.fromEventMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCompatibleEventEmitter
  extends EventTargetLike[js.Any] {
  def addListener(eventName: String, handler: NodeEventHandler): Unit | js.Object
  def removeListener(eventName: String, handler: NodeEventHandler): Unit | js.Object
}

object NodeCompatibleEventEmitter {
  @scala.inline
  def apply(
    addListener: (String, NodeEventHandler) => CallbackTo[Unit | js.Object],
    removeListener: (String, NodeEventHandler) => CallbackTo[Unit | js.Object]
  ): NodeCompatibleEventEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.rxjs.fromEventMod.NodeEventHandler) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.rxjs.fromEventMod.NodeEventHandler) => removeListener(t0, t1).runNow()))
    __obj.asInstanceOf[NodeCompatibleEventEmitter]
  }
}

