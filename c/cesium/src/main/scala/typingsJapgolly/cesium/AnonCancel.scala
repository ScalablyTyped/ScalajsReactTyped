package typingsJapgolly.cesium

import japgolly.scalajs.react.Callback
import typingsJapgolly.cesium.mod.Camera.FlightCancelledCallback
import typingsJapgolly.cesium.mod.Camera.FlightCompleteCallback
import typingsJapgolly.cesium.mod.Cartesian3
import typingsJapgolly.cesium.mod.EasingFunction
import typingsJapgolly.cesium.mod.Matrix4
import typingsJapgolly.cesium.mod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var cancel: js.UndefOr[FlightCancelledCallback] = js.undefined
  var complete: js.UndefOr[FlightCompleteCallback] = js.undefined
  var convert: js.UndefOr[Boolean] = js.undefined
  var destination: Cartesian3 | Rectangle
  var duration: js.UndefOr[Double] = js.undefined
  var easingFunction: js.UndefOr[EasingFunction] = js.undefined
  var endTransform: js.UndefOr[Matrix4] = js.undefined
  var flyOverLongitude: js.UndefOr[Double] = js.undefined
  var flyOverLongitudeWeight: js.UndefOr[Double] = js.undefined
  var maximumHeight: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[AnonDirection | AnonHeading] = js.undefined
  var pitchAdjustHeight: js.UndefOr[Double] = js.undefined
}

object AnonCancel {
  @scala.inline
  def apply(
    destination: Cartesian3 | Rectangle,
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: js.UndefOr[Callback] = js.undefined,
    convert: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easingFunction: EasingFunction = null,
    endTransform: Matrix4 = null,
    flyOverLongitude: Int | Double = null,
    flyOverLongitudeWeight: Int | Double = null,
    maximumHeight: Int | Double = null,
    orientation: AnonDirection | AnonHeading = null,
    pitchAdjustHeight: Int | Double = null
  ): AnonCancel = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easingFunction != null) __obj.updateDynamic("easingFunction")(easingFunction.asInstanceOf[js.Any])
    if (endTransform != null) __obj.updateDynamic("endTransform")(endTransform.asInstanceOf[js.Any])
    if (flyOverLongitude != null) __obj.updateDynamic("flyOverLongitude")(flyOverLongitude.asInstanceOf[js.Any])
    if (flyOverLongitudeWeight != null) __obj.updateDynamic("flyOverLongitudeWeight")(flyOverLongitudeWeight.asInstanceOf[js.Any])
    if (maximumHeight != null) __obj.updateDynamic("maximumHeight")(maximumHeight.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pitchAdjustHeight != null) __obj.updateDynamic("pitchAdjustHeight")(pitchAdjustHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
}

