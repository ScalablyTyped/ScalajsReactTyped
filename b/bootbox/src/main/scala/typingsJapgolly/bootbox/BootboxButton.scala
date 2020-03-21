package typingsJapgolly.bootbox

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootboxButton extends js.Object {
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object BootboxButton {
  @scala.inline
  def apply(
    callback: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    className: String = null,
    label: String = null
  ): BootboxButton = {
    val __obj = js.Dynamic.literal()
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxButton]
  }
}

