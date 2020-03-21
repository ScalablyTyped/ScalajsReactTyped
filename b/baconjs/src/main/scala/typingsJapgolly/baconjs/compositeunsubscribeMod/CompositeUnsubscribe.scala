package typingsJapgolly.baconjs.compositeunsubscribeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositeUnsubscribe extends js.Object {
  var starting: js.Array[Subscription]
  var subscriptions: js.Array[Unsub]
  var unsubscribed: Boolean
  def add(subscription: Subscription): Unit
  def count(): Double
  def empty(): Boolean
  def remove(unsub: Unsub): Unit
  def unsubscribe(): Unit
}

object CompositeUnsubscribe {
  @scala.inline
  def apply(
    add: Subscription => Callback,
    count: CallbackTo[Double],
    empty: CallbackTo[Boolean],
    remove: Unsub => Callback,
    starting: js.Array[Subscription],
    subscriptions: js.Array[Unsub],
    unsubscribe: Callback,
    unsubscribed: Boolean
  ): CompositeUnsubscribe = {
    val __obj = js.Dynamic.literal(starting = starting.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], unsubscribed = unsubscribed.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.baconjs.compositeunsubscribeMod.Subscription) => add(t0).runNow()))
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("empty")(empty.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.baconjs.typesMod.Unsub) => remove(t0).runNow()))
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[CompositeUnsubscribe]
  }
}

