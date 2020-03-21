package typingsJapgolly.amapJsApi.AMap.Circle

import typingsJapgolly.amapJsApi.AMap.LocationValue
import typingsJapgolly.amapJsApi.AMap.Map
import typingsJapgolly.amapJsApi.AMap.StrokeStyle
import typingsJapgolly.amapJsApi.amapJsApiStrings.meter
import typingsJapgolly.amapJsApi.amapJsApiStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[ExtraData] extends js.Object {
  var bubble: js.UndefOr[Boolean] = js.undefined
  var center: js.UndefOr[LocationValue] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var extData: js.UndefOr[ExtraData] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeStyle: js.UndefOr[StrokeStyle] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[meter | px] = js.undefined
  // internal
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[ExtraData](
    bubble: js.UndefOr[Boolean] = js.undefined,
    center: LocationValue = null,
    cursor: String = null,
    extData: ExtraData = null,
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    map: Map = null,
    radius: Int | Double = null,
    strokeColor: String = null,
    strokeDasharray: js.Array[Double] = null,
    strokeOpacity: Int | Double = null,
    strokeStyle: StrokeStyle = null,
    strokeWeight: Int | Double = null,
    unit: meter | px = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubble)) __obj.updateDynamic("bubble")(bubble.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[ExtraData]]
  }
}

