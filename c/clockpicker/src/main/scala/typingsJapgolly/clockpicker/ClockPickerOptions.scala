package typingsJapgolly.clockpicker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClockPickerOptions extends js.Object {
  var afterDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterHourSelect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var align: js.UndefOr[String] = js.undefined
  var autoclose: js.UndefOr[Boolean] = js.undefined
  var beforeDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeHourSelect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var donetext: js.UndefOr[String] = js.undefined
  var fromnow: js.UndefOr[Double] = js.undefined
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var twelvehour: js.UndefOr[Boolean] = js.undefined
  var vibrate: js.UndefOr[Boolean] = js.undefined
}

object ClockPickerOptions {
  @scala.inline
  def apply(
    afterDone: js.UndefOr[Callback] = js.undefined,
    afterHide: js.UndefOr[Callback] = js.undefined,
    afterHourSelect: js.UndefOr[Callback] = js.undefined,
    afterShow: js.UndefOr[Callback] = js.undefined,
    align: String = null,
    autoclose: js.UndefOr[Boolean] = js.undefined,
    beforeDone: js.UndefOr[Callback] = js.undefined,
    beforeHide: js.UndefOr[Callback] = js.undefined,
    beforeHourSelect: js.UndefOr[Callback] = js.undefined,
    beforeShow: js.UndefOr[Callback] = js.undefined,
    default: String = null,
    donetext: String = null,
    fromnow: Int | Double = null,
    init: js.UndefOr[Callback] = js.undefined,
    placement: String = null,
    twelvehour: js.UndefOr[Boolean] = js.undefined,
    vibrate: js.UndefOr[Boolean] = js.undefined
  ): ClockPickerOptions = {
    val __obj = js.Dynamic.literal()
    afterDone.foreach(p => __obj.updateDynamic("afterDone")(p.toJsFn))
    afterHide.foreach(p => __obj.updateDynamic("afterHide")(p.toJsFn))
    afterHourSelect.foreach(p => __obj.updateDynamic("afterHourSelect")(p.toJsFn))
    afterShow.foreach(p => __obj.updateDynamic("afterShow")(p.toJsFn))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose.asInstanceOf[js.Any])
    beforeDone.foreach(p => __obj.updateDynamic("beforeDone")(p.toJsFn))
    beforeHide.foreach(p => __obj.updateDynamic("beforeHide")(p.toJsFn))
    beforeHourSelect.foreach(p => __obj.updateDynamic("beforeHourSelect")(p.toJsFn))
    beforeShow.foreach(p => __obj.updateDynamic("beforeShow")(p.toJsFn))
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (donetext != null) __obj.updateDynamic("donetext")(donetext.asInstanceOf[js.Any])
    if (fromnow != null) __obj.updateDynamic("fromnow")(fromnow.asInstanceOf[js.Any])
    init.foreach(p => __obj.updateDynamic("init")(p.toJsFn))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(twelvehour)) __obj.updateDynamic("twelvehour")(twelvehour.asInstanceOf[js.Any])
    if (!js.isUndefined(vibrate)) __obj.updateDynamic("vibrate")(vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockPickerOptions]
  }
}

