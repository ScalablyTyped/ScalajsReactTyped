package typingsJapgolly.chui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecked extends js.Object {
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var checked: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object AnonChecked {
  @scala.inline
  def apply(
    callback: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    checked: String = null,
    id: String = null,
    name: String = null,
    state: String = null,
    style: String = null,
    value: String | Double = null
  ): AnonChecked = {
    val __obj = js.Dynamic.literal()
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChecked]
  }
}

