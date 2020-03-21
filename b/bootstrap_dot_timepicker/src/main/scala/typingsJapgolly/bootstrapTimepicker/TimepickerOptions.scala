package typingsJapgolly.bootstrapTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimepickerOptions extends js.Object {
  var appendWidgetTo: js.UndefOr[String] = js.undefined
  var defaultTime: js.UndefOr[String | Boolean | js.Date] = js.undefined
  var disableFocus: js.UndefOr[Boolean] = js.undefined
  var disableMousewheel: js.UndefOr[Boolean] = js.undefined
  var explicitMode: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[TimepickerIconOptions] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var maxHours: js.UndefOr[Double] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var modalBackdrop: js.UndefOr[Boolean] = js.undefined
  var secondStep: js.UndefOr[Double] = js.undefined
  var showInputs: js.UndefOr[Boolean] = js.undefined
  var showMeridian: js.UndefOr[Boolean] = js.undefined
  var showSeconds: js.UndefOr[Boolean] = js.undefined
  var snapToStep: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String | Boolean] = js.undefined
}

object TimepickerOptions {
  @scala.inline
  def apply(
    appendWidgetTo: String = null,
    defaultTime: String | Boolean | js.Date = null,
    disableFocus: js.UndefOr[Boolean] = js.undefined,
    disableMousewheel: js.UndefOr[Boolean] = js.undefined,
    explicitMode: js.UndefOr[Boolean] = js.undefined,
    icons: TimepickerIconOptions = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    maxHours: Int | Double = null,
    minuteStep: Int | Double = null,
    modalBackdrop: js.UndefOr[Boolean] = js.undefined,
    secondStep: Int | Double = null,
    showInputs: js.UndefOr[Boolean] = js.undefined,
    showMeridian: js.UndefOr[Boolean] = js.undefined,
    showSeconds: js.UndefOr[Boolean] = js.undefined,
    snapToStep: js.UndefOr[Boolean] = js.undefined,
    template: String | Boolean = null
  ): TimepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (appendWidgetTo != null) __obj.updateDynamic("appendWidgetTo")(appendWidgetTo.asInstanceOf[js.Any])
    if (defaultTime != null) __obj.updateDynamic("defaultTime")(defaultTime.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocus)) __obj.updateDynamic("disableFocus")(disableFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMousewheel)) __obj.updateDynamic("disableMousewheel")(disableMousewheel.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitMode)) __obj.updateDynamic("explicitMode")(explicitMode.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (maxHours != null) __obj.updateDynamic("maxHours")(maxHours.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (!js.isUndefined(modalBackdrop)) __obj.updateDynamic("modalBackdrop")(modalBackdrop.asInstanceOf[js.Any])
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (!js.isUndefined(showInputs)) __obj.updateDynamic("showInputs")(showInputs.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeridian)) __obj.updateDynamic("showMeridian")(showMeridian.asInstanceOf[js.Any])
    if (!js.isUndefined(showSeconds)) __obj.updateDynamic("showSeconds")(showSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToStep)) __obj.updateDynamic("snapToStep")(snapToStep.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimepickerOptions]
  }
}

