package typingsJapgolly.firebaseDatabase

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddExpectedEvents extends js.Object {
  var initPromise: js.Promise[_]
  var promise: js.Promise[_]
  def addExpectedEvents(moreEvents: js.Any): Unit
  def unregister(): Unit
  def waiter(): Boolean
  def watchesInitializedWaiter(): Boolean
}

object AnonAddExpectedEvents {
  @scala.inline
  def apply(
    addExpectedEvents: js.Any => Callback,
    initPromise: js.Promise[_],
    promise: js.Promise[_],
    unregister: Callback,
    waiter: CallbackTo[Boolean],
    watchesInitializedWaiter: CallbackTo[Boolean]
  ): AnonAddExpectedEvents = {
    val __obj = js.Dynamic.literal(initPromise = initPromise.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    __obj.updateDynamic("addExpectedEvents")(js.Any.fromFunction1((t0: js.Any) => addExpectedEvents(t0).runNow()))
    __obj.updateDynamic("unregister")(unregister.toJsFn)
    __obj.updateDynamic("waiter")(waiter.toJsFn)
    __obj.updateDynamic("watchesInitializedWaiter")(watchesInitializedWaiter.toJsFn)
    __obj.asInstanceOf[AnonAddExpectedEvents]
  }
}

