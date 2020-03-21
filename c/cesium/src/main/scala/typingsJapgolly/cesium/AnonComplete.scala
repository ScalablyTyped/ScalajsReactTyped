package typingsJapgolly.cesium

import japgolly.scalajs.react.Callback
import typingsJapgolly.cesium.mod.Camera.FlightCancelledCallback
import typingsJapgolly.cesium.mod.Camera.FlightCompleteCallback
import typingsJapgolly.cesium.mod.EasingFunction
import typingsJapgolly.cesium.mod.HeadingPitchRange
import typingsJapgolly.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete extends js.Object {
  var cancel: js.UndefOr[FlightCancelledCallback] = js.undefined
  var complete: js.UndefOr[FlightCompleteCallback] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easingFunction: js.UndefOr[EasingFunction] = js.undefined
  var endTransform: js.UndefOr[Matrix4] = js.undefined
  var flyOverLongitude: js.UndefOr[Double] = js.undefined
  var flyOverLongitudeWeight: js.UndefOr[Double] = js.undefined
  var maximumHeight: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[HeadingPitchRange] = js.undefined
  var pitchAdjustHeight: js.UndefOr[Double] = js.undefined
}

object AnonComplete {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: js.UndefOr[Callback] = js.undefined,
    duration: Int | Double = null,
    easingFunction: EasingFunction = null,
    endTransform: Matrix4 = null,
    flyOverLongitude: Int | Double = null,
    flyOverLongitudeWeight: Int | Double = null,
    maximumHeight: Int | Double = null,
    offset: HeadingPitchRange = null,
    pitchAdjustHeight: Int | Double = null
  ): AnonComplete = {
    val __obj = js.Dynamic.literal()
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easingFunction != null) __obj.updateDynamic("easingFunction")(easingFunction.asInstanceOf[js.Any])
    if (endTransform != null) __obj.updateDynamic("endTransform")(endTransform.asInstanceOf[js.Any])
    if (flyOverLongitude != null) __obj.updateDynamic("flyOverLongitude")(flyOverLongitude.asInstanceOf[js.Any])
    if (flyOverLongitudeWeight != null) __obj.updateDynamic("flyOverLongitudeWeight")(flyOverLongitudeWeight.asInstanceOf[js.Any])
    if (maximumHeight != null) __obj.updateDynamic("maximumHeight")(maximumHeight.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pitchAdjustHeight != null) __obj.updateDynamic("pitchAdjustHeight")(pitchAdjustHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComplete]
  }
}

