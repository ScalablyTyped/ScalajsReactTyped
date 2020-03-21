package typingsJapgolly.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlipswitchOptions extends js.Object {
  var corners: js.UndefOr[Boolean] = js.undefined
  var defaults: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var enhanced: js.UndefOr[Boolean] = js.undefined
  var mini: js.UndefOr[Boolean] = js.undefined
  var offText: js.UndefOr[String] = js.undefined
  var onText: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var wrapperClass: js.UndefOr[String] = js.undefined
}

object FlipswitchOptions {
  @scala.inline
  def apply(
    corners: js.UndefOr[Boolean] = js.undefined,
    defaults: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enhanced: js.UndefOr[Boolean] = js.undefined,
    mini: js.UndefOr[Boolean] = js.undefined,
    offText: String = null,
    onText: String = null,
    theme: String = null,
    wrapperClass: String = null
  ): FlipswitchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(corners)) __obj.updateDynamic("corners")(corners.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enhanced)) __obj.updateDynamic("enhanced")(enhanced.asInstanceOf[js.Any])
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini.asInstanceOf[js.Any])
    if (offText != null) __obj.updateDynamic("offText")(offText.asInstanceOf[js.Any])
    if (onText != null) __obj.updateDynamic("onText")(onText.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (wrapperClass != null) __obj.updateDynamic("wrapperClass")(wrapperClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlipswitchOptions]
  }
}

