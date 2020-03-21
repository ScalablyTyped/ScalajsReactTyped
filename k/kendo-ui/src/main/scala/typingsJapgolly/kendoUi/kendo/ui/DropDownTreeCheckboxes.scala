package typingsJapgolly.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownTreeCheckboxes extends js.Object {
  var checkChildren: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
}

object DropDownTreeCheckboxes {
  @scala.inline
  def apply(
    checkChildren: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    template: String | js.Function = null
  ): DropDownTreeCheckboxes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkChildren)) __obj.updateDynamic("checkChildren")(checkChildren.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownTreeCheckboxes]
  }
}

