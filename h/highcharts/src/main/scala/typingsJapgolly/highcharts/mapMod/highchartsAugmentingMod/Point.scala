package typingsJapgolly.highcharts.mapMod.highchartsAugmentingMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var pointPadding: js.UndefOr[Double] = js.undefined
  /**
    * In Highmaps, when data is loaded from GeoJSON, the GeoJSON item's
    * properies are copied over here.
    */
  var properties: js.Any
  var value: js.UndefOr[Double | Null] = js.undefined
  /**
    * Highmaps only. Zoom in on the point using the global animation.
    */
  def zoomTo(): Unit
}

object Point {
  @scala.inline
  def apply(
    properties: js.Any,
    zoomTo: Callback,
    pointPadding: Int | Double = null,
    value: Int | Double = null
  ): Point = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("zoomTo")(zoomTo.toJsFn)
    if (pointPadding != null) __obj.updateDynamic("pointPadding")(pointPadding.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

