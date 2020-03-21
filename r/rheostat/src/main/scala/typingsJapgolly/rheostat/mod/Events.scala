package typingsJapgolly.rheostat.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var getNextHandlePosition: js.UndefOr[js.Function2[/* handleIdx */ Double, /* percentPosition */ Double, Double]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* publicState */ PublicState, _]] = js.undefined
  var onClick: js.UndefOr[js.Function0[_]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function0[_]] = js.undefined
  var onSliderDragEnd: js.UndefOr[js.Function0[_]] = js.undefined
  var onSliderDragMove: js.UndefOr[js.Function0[_]] = js.undefined
  var onSliderDragStart: js.UndefOr[js.Function0[_]] = js.undefined
  var onValuesUpdated: js.UndefOr[js.Function1[/* publicState */ PublicState, _]] = js.undefined
}

object Events {
  @scala.inline
  def apply(
    getNextHandlePosition: (/* handleIdx */ Double, /* percentPosition */ Double) => CallbackTo[Double] = null,
    onChange: /* publicState */ PublicState => CallbackTo[js.Any] = null,
    onClick: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onKeyPress: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onSliderDragEnd: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onSliderDragMove: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onSliderDragStart: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onValuesUpdated: /* publicState */ PublicState => CallbackTo[js.Any] = null
  ): Events = {
    val __obj = js.Dynamic.literal()
    if (getNextHandlePosition != null) __obj.updateDynamic("getNextHandlePosition")(js.Any.fromFunction2((t0: /* handleIdx */ scala.Double, t1: /* percentPosition */ scala.Double) => getNextHandlePosition(t0, t1).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* publicState */ typingsJapgolly.rheostat.mod.PublicState) => onChange(t0).runNow()))
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    onKeyPress.foreach(p => __obj.updateDynamic("onKeyPress")(p.toJsFn))
    onSliderDragEnd.foreach(p => __obj.updateDynamic("onSliderDragEnd")(p.toJsFn))
    onSliderDragMove.foreach(p => __obj.updateDynamic("onSliderDragMove")(p.toJsFn))
    onSliderDragStart.foreach(p => __obj.updateDynamic("onSliderDragStart")(p.toJsFn))
    if (onValuesUpdated != null) __obj.updateDynamic("onValuesUpdated")(js.Any.fromFunction1((t0: /* publicState */ typingsJapgolly.rheostat.mod.PublicState) => onValuesUpdated(t0).runNow()))
    __obj.asInstanceOf[Events]
  }
}

