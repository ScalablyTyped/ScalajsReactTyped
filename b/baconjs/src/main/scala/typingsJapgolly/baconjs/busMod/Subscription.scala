package typingsJapgolly.baconjs.busMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription[V] extends js.Object {
  var input: typingsJapgolly.baconjs.observableMod.default[V]
  var unsub: js.UndefOr[Unsub] = js.undefined
}

object Subscription {
  @scala.inline
  def apply[V](
    input: typingsJapgolly.baconjs.observableMod.default[V],
    unsub: js.UndefOr[Callback] = js.undefined
  ): Subscription[V] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    unsub.foreach(p => __obj.updateDynamic("unsub")(p.toJsFn))
    __obj.asInstanceOf[Subscription[V]]
  }
}

