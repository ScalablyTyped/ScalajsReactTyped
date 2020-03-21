package typingsJapgolly.jui

import typingsJapgolly.jui.juiStrings.bottom
import typingsJapgolly.jui.juiStrings.left
import typingsJapgolly.jui.juiStrings.right
import typingsJapgolly.jui.juiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlign extends js.Object {
  var align: js.UndefOr[left | right] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  var valign: js.UndefOr[top | bottom] = js.undefined
}

object AnonAlign {
  @scala.inline
  def apply(
    align: left | right = null,
    event: js.Any = null,
    items: js.Array[_] = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    tpl: js.Any = null,
    valign: top | bottom = null
  ): AnonAlign = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlign]
  }
}

