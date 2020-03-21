package typingsJapgolly.reactAlert.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertCustomOptionsWithType extends AlertCustomOptions {
  var `type`: js.UndefOr[AlertType] = js.undefined
}

object AlertCustomOptionsWithType {
  @scala.inline
  def apply(
    onClose: js.UndefOr[Callback] = js.undefined,
    onOpen: js.UndefOr[Callback] = js.undefined,
    timeout: Int | Double = null,
    `type`: AlertType = null
  ): AlertCustomOptionsWithType = {
    val __obj = js.Dynamic.literal()
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertCustomOptionsWithType]
  }
}

