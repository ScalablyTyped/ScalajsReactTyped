package typingsJapgolly.jui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecked extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  var toggleEvent: js.UndefOr[String] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object AnonChecked {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    toggleEvent: String = null,
    tpl: js.Any = null
  ): AnonChecked = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (toggleEvent != null) __obj.updateDynamic("toggleEvent")(toggleEvent.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChecked]
  }
}

