package typingsJapgolly.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTypeStyler extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var gamma: js.UndefOr[Double] = js.undefined
  var hue: js.UndefOr[String] = js.undefined
  var invert_lightness: js.UndefOr[Boolean] = js.undefined
  var lightness: js.UndefOr[Double] = js.undefined
  var saturation: js.UndefOr[Double] = js.undefined
  var visibility: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object MapTypeStyler {
  @scala.inline
  def apply(
    color: String = null,
    gamma: Int | Double = null,
    hue: String = null,
    invert_lightness: js.UndefOr[Boolean] = js.undefined,
    lightness: Int | Double = null,
    saturation: Int | Double = null,
    visibility: String = null,
    weight: Int | Double = null
  ): MapTypeStyler = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (!js.isUndefined(invert_lightness)) __obj.updateDynamic("invert_lightness")(invert_lightness.asInstanceOf[js.Any])
    if (lightness != null) __obj.updateDynamic("lightness")(lightness.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeStyler]
  }
}

