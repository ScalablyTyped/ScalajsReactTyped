package typingsJapgolly.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckedColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var checkedColor: js.UndefOr[String] = js.undefined
  var disabledColor: js.UndefOr[String] = js.undefined
  var labelColor: js.UndefOr[String] = js.undefined
  var labelDisabledColor: js.UndefOr[String] = js.undefined
  var requiredColor: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object AnonCheckedColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    checkedColor: String = null,
    disabledColor: String = null,
    labelColor: String = null,
    labelDisabledColor: String = null,
    requiredColor: String = null,
    size: Int | Double = null
  ): AnonCheckedColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (checkedColor != null) __obj.updateDynamic("checkedColor")(checkedColor.asInstanceOf[js.Any])
    if (disabledColor != null) __obj.updateDynamic("disabledColor")(disabledColor.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor.asInstanceOf[js.Any])
    if (labelDisabledColor != null) __obj.updateDynamic("labelDisabledColor")(labelDisabledColor.asInstanceOf[js.Any])
    if (requiredColor != null) __obj.updateDynamic("requiredColor")(requiredColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckedColor]
  }
}

