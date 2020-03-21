package typingsJapgolly.stompjs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var id: String
  def unsubscribe(): Unit
}

object Subscription {
  @scala.inline
  def apply(id: String, unsubscribe: Callback): Subscription = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[Subscription]
  }
}

