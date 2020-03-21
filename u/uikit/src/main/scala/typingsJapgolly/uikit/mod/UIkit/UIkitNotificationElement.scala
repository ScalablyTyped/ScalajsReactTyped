package typingsJapgolly.uikit.mod.UIkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitNotificationElement extends js.Object {
  def close(immediate: Boolean): Unit
}

object UIkitNotificationElement {
  @scala.inline
  def apply(close: Boolean => Callback): UIkitNotificationElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(js.Any.fromFunction1((t0: scala.Boolean) => close(t0).runNow()))
    __obj.asInstanceOf[UIkitNotificationElement]
  }
}

