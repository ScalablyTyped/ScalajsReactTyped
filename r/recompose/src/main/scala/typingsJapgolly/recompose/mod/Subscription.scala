package typingsJapgolly.recompose.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  def unsubscribe(): Unit
}

object Subscription {
  @scala.inline
  def apply(unsubscribe: Callback): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[Subscription]
  }
}

