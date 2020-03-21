package typingsJapgolly.pubsubJs.PubSubJS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearAllSubscriptions extends js.Object {
  def clearAllSubscriptions(): js.Any
}

object ClearAllSubscriptions {
  @scala.inline
  def apply(clearAllSubscriptions: CallbackTo[js.Any]): ClearAllSubscriptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearAllSubscriptions")(clearAllSubscriptions.toJsFn)
    __obj.asInstanceOf[ClearAllSubscriptions]
  }
}

