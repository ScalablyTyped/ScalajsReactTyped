package typingsJapgolly.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonSize extends js.Object {
  var buttonSize: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabledColor: js.UndefOr[String] = js.undefined
  var disabledTextColor: js.UndefOr[String] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var miniSize: js.UndefOr[Double] = js.undefined
  var secondaryColor: js.UndefOr[String] = js.undefined
  var secondaryIconColor: js.UndefOr[String] = js.undefined
}

object AnonButtonSize {
  @scala.inline
  def apply(
    buttonSize: Int | Double = null,
    color: String = null,
    disabledColor: String = null,
    disabledTextColor: String = null,
    iconColor: String = null,
    miniSize: Int | Double = null,
    secondaryColor: String = null,
    secondaryIconColor: String = null
  ): AnonButtonSize = {
    val __obj = js.Dynamic.literal()
    if (buttonSize != null) __obj.updateDynamic("buttonSize")(buttonSize.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (disabledColor != null) __obj.updateDynamic("disabledColor")(disabledColor.asInstanceOf[js.Any])
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (miniSize != null) __obj.updateDynamic("miniSize")(miniSize.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    if (secondaryIconColor != null) __obj.updateDynamic("secondaryIconColor")(secondaryIconColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonSize]
  }
}

