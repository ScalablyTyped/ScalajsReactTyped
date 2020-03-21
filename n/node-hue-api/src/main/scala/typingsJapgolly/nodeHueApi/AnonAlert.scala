package typingsJapgolly.nodeHueApi

import typingsJapgolly.nodeHueApi.mod.ColorMode
import typingsJapgolly.nodeHueApi.mod.LightAlert
import typingsJapgolly.nodeHueApi.mod.LightEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlert extends js.Object {
  var alert: LightAlert
  var bri: Double
  var colormode: js.UndefOr[ColorMode] = js.undefined
  var ct: js.UndefOr[Double] = js.undefined
  var effect: js.UndefOr[LightEffect] = js.undefined
  var hue: js.UndefOr[Double] = js.undefined
  var on: Boolean
  var reachable: Boolean
  var rgb: js.UndefOr[js.Array[Double]] = js.undefined
  var sat: js.UndefOr[Double] = js.undefined
  var xy: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object AnonAlert {
  @scala.inline
  def apply(
    alert: LightAlert,
    bri: Double,
    on: Boolean,
    reachable: Boolean,
    colormode: ColorMode = null,
    ct: Int | Double = null,
    effect: LightEffect = null,
    hue: Int | Double = null,
    rgb: js.Array[Double] = null,
    sat: Int | Double = null,
    xy: js.Tuple2[Double, Double] = null
  ): AnonAlert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], bri = bri.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], reachable = reachable.asInstanceOf[js.Any])
    if (colormode != null) __obj.updateDynamic("colormode")(colormode.asInstanceOf[js.Any])
    if (ct != null) __obj.updateDynamic("ct")(ct.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (rgb != null) __obj.updateDynamic("rgb")(rgb.asInstanceOf[js.Any])
    if (sat != null) __obj.updateDynamic("sat")(sat.asInstanceOf[js.Any])
    if (xy != null) __obj.updateDynamic("xy")(xy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlert]
  }
}

