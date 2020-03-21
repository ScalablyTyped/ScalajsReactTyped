package typingsJapgolly.rheostat.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends Events {
  var algorithm: js.UndefOr[Algorithm] = js.undefined
  var autoAdjustVerticalPosition: js.UndefOr[Boolean] = js.undefined
  var background: js.UndefOr[ReactType[_]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var handle: js.UndefOr[ReactType[_]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[Orientation] = js.undefined
  var pitComponent: js.UndefOr[ReactType[_]] = js.undefined
  var pitPoints: js.UndefOr[js.Array[Double]] = js.undefined
  var progressBar: js.UndefOr[ReactType[_]] = js.undefined
  var snap: js.UndefOr[Boolean] = js.undefined
  var snapPoints: js.UndefOr[js.Array[Double]] = js.undefined
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    algorithm: Algorithm = null,
    autoAdjustVerticalPosition: js.UndefOr[Boolean] = js.undefined,
    background: ReactType[_] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getNextHandlePosition: (/* handleIdx */ Double, /* percentPosition */ Double) => CallbackTo[Double] = null,
    handle: ReactType[_] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* publicState */ PublicState => CallbackTo[js.Any] = null,
    onClick: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onKeyPress: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onSliderDragEnd: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onSliderDragMove: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onSliderDragStart: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onValuesUpdated: /* publicState */ PublicState => CallbackTo[js.Any] = null,
    orientation: Orientation = null,
    pitComponent: ReactType[_] = null,
    pitPoints: js.Array[Double] = null,
    progressBar: ReactType[_] = null,
    snap: js.UndefOr[Boolean] = js.undefined,
    snapPoints: js.Array[Double] = null,
    values: js.Array[Double] = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjustVerticalPosition)) __obj.updateDynamic("autoAdjustVerticalPosition")(autoAdjustVerticalPosition.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (getNextHandlePosition != null) __obj.updateDynamic("getNextHandlePosition")(js.Any.fromFunction2((t0: /* handleIdx */ scala.Double, t1: /* percentPosition */ scala.Double) => getNextHandlePosition(t0, t1).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* publicState */ typingsJapgolly.rheostat.mod.PublicState) => onChange(t0).runNow()))
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    onKeyPress.foreach(p => __obj.updateDynamic("onKeyPress")(p.toJsFn))
    onSliderDragEnd.foreach(p => __obj.updateDynamic("onSliderDragEnd")(p.toJsFn))
    onSliderDragMove.foreach(p => __obj.updateDynamic("onSliderDragMove")(p.toJsFn))
    onSliderDragStart.foreach(p => __obj.updateDynamic("onSliderDragStart")(p.toJsFn))
    if (onValuesUpdated != null) __obj.updateDynamic("onValuesUpdated")(js.Any.fromFunction1((t0: /* publicState */ typingsJapgolly.rheostat.mod.PublicState) => onValuesUpdated(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pitComponent != null) __obj.updateDynamic("pitComponent")(pitComponent.asInstanceOf[js.Any])
    if (pitPoints != null) __obj.updateDynamic("pitPoints")(pitPoints.asInstanceOf[js.Any])
    if (progressBar != null) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (snapPoints != null) __obj.updateDynamic("snapPoints")(snapPoints.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

