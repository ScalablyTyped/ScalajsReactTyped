package typingsJapgolly.ionicCore.selectPopoverInterfaceMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectPopoverOption extends js.Object {
  var checked: Boolean
  var disabled: Boolean
  var handler: js.UndefOr[js.Function0[Unit]] = js.undefined
  var text: String
  var value: String
}

object SelectPopoverOption {
  @scala.inline
  def apply(
    checked: Boolean,
    disabled: Boolean,
    text: String,
    value: String,
    handler: js.UndefOr[Callback] = js.undefined
  ): SelectPopoverOption = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    handler.foreach(p => __obj.updateDynamic("handler")(p.toJsFn))
    __obj.asInstanceOf[SelectPopoverOption]
  }
}

