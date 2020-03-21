package typingsJapgolly.reactNotificationSystem.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionObject extends js.Object {
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var label: String
}

object ActionObject {
  @scala.inline
  def apply(label: String, callback: js.UndefOr[Callback] = js.undefined): ActionObject = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    __obj.asInstanceOf[ActionObject]
  }
}

