package typingsJapgolly.angularStrap.mgcrea.ngStrap.timepicker

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularStrap.AnonHide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimepickerOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var arrowBehaviour: js.UndefOr[String] = js.undefined
  var autoclose: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var delay: js.UndefOr[Double | AnonHide] = js.undefined
  var hourStep: js.UndefOr[Double] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var iconDown: js.UndefOr[String] = js.undefined
  var iconUp: js.UndefOr[String] = js.undefined
   // TODO
  var length: js.UndefOr[Double] = js.undefined
   // TODO
  var maxTime: js.UndefOr[js.Date] = js.undefined
  var minTime: js.UndefOr[js.Date] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var modelTimeFormat: js.UndefOr[String] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var roundDisplay: js.UndefOr[Boolean] = js.undefined
  var secondStep: js.UndefOr[Double] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var timeFormat: js.UndefOr[String] = js.undefined
  var timeType: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
  var useNative: js.UndefOr[Boolean] = js.undefined
}

object ITimepickerOptions {
  @scala.inline
  def apply(
    animation: String = null,
    arrowBehaviour: String = null,
    autoclose: js.UndefOr[Boolean] = js.undefined,
    container: String | Boolean = null,
    delay: Double | AnonHide = null,
    hourStep: Int | Double = null,
    html: js.UndefOr[Boolean] = js.undefined,
    iconDown: String = null,
    iconUp: String = null,
    length: Int | Double = null,
    maxTime: js.Date = null,
    minTime: js.Date = null,
    minuteStep: Int | Double = null,
    modelTimeFormat: String = null,
    onBeforeHide: /* timepicker */ ITimepicker => Callback = null,
    onBeforeShow: /* timepicker */ ITimepicker => Callback = null,
    onHide: /* timepicker */ ITimepicker => Callback = null,
    onShow: /* timepicker */ ITimepicker => Callback = null,
    placement: String = null,
    roundDisplay: js.UndefOr[Boolean] = js.undefined,
    secondStep: Int | Double = null,
    template: String = null,
    timeFormat: String = null,
    timeType: String = null,
    trigger: String = null,
    useNative: js.UndefOr[Boolean] = js.undefined
  ): ITimepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (arrowBehaviour != null) __obj.updateDynamic("arrowBehaviour")(arrowBehaviour.asInstanceOf[js.Any])
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (iconDown != null) __obj.updateDynamic("iconDown")(iconDown.asInstanceOf[js.Any])
    if (iconUp != null) __obj.updateDynamic("iconUp")(iconUp.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (modelTimeFormat != null) __obj.updateDynamic("modelTimeFormat")(modelTimeFormat.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1((t0: /* timepicker */ typingsJapgolly.angularStrap.mgcrea.ngStrap.timepicker.ITimepicker) => onBeforeHide(t0).runNow()))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1((t0: /* timepicker */ typingsJapgolly.angularStrap.mgcrea.ngStrap.timepicker.ITimepicker) => onBeforeShow(t0).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: /* timepicker */ typingsJapgolly.angularStrap.mgcrea.ngStrap.timepicker.ITimepicker) => onHide(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* timepicker */ typingsJapgolly.angularStrap.mgcrea.ngStrap.timepicker.ITimepicker) => onShow(t0).runNow()))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(roundDisplay)) __obj.updateDynamic("roundDisplay")(roundDisplay.asInstanceOf[js.Any])
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (timeType != null) __obj.updateDynamic("timeType")(timeType.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimepickerOptions]
  }
}

