package typingsJapgolly.atStorybookApi.distModulesNotificationsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var id: String
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Notification {
  @scala.inline
  def apply(id: String, onClear: js.UndefOr[Callback] = js.undefined): Notification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    onClear.foreach(p => __obj.updateDynamic("onClear")(p.toJsFn))
    __obj.asInstanceOf[Notification]
  }
}

