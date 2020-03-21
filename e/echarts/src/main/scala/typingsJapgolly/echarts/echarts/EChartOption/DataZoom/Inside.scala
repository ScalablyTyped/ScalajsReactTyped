package typingsJapgolly.echarts.echarts.EChartOption.DataZoom

import typingsJapgolly.echarts.echartsStrings.empty
import typingsJapgolly.echarts.echartsStrings.filter
import typingsJapgolly.echarts.echartsStrings.none
import typingsJapgolly.echarts.echartsStrings.weakFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data zoom component of inside type.
  * Refer to dataZoom for more information.
  * The inside means it's inside the coordinates.
  * Translation: data area can be translated when moving in coordinates.
  * Scaling:
  * PC: when mouse rolls (similar with touch pad) in coordinates.
  * Mobile: when touches and moved with two fingers in coordinates
  * on touch screens.
  *
  * @see https://echarts.apache.org/en/option.html#dataZoom-inside
  */
trait Inside extends js.Object {
  var angleAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var disable: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var endValue: js.UndefOr[Double | String | js.Date] = js.undefined
  var filterMode: js.UndefOr[filter | weakFilter | empty | none] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var maxSpan: js.UndefOr[Double] = js.undefined
  var maxValueSpan: js.UndefOr[Double | String | js.Date] = js.undefined
  var minSpan: js.UndefOr[Double] = js.undefined
  var minValueSpan: js.UndefOr[Double | String | js.Date] = js.undefined
  var moveOnMouseMove: js.UndefOr[Boolean] = js.undefined
  var moveOnMouseWheel: js.UndefOr[Boolean] = js.undefined
  var orient: js.UndefOr[String] = js.undefined
  var preventDefaultMouseMove: js.UndefOr[Boolean] = js.undefined
  var radiusAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var rangeMode: js.UndefOr[js.Array[String]] = js.undefined
  var singleAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var startValue: js.UndefOr[Double | String | js.Date] = js.undefined
  var throttle: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var xAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var yAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var zoomLock: js.UndefOr[Boolean] = js.undefined
  var zoomOnMouseWheel: js.UndefOr[Boolean] = js.undefined
}

object Inside {
  @scala.inline
  def apply(
    angleAxisIndex: Double | js.Array[Double] = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    endValue: Double | String | js.Date = null,
    filterMode: filter | weakFilter | empty | none = null,
    id: String = null,
    maxSpan: Int | Double = null,
    maxValueSpan: Double | String | js.Date = null,
    minSpan: Int | Double = null,
    minValueSpan: Double | String | js.Date = null,
    moveOnMouseMove: js.UndefOr[Boolean] = js.undefined,
    moveOnMouseWheel: js.UndefOr[Boolean] = js.undefined,
    orient: String = null,
    preventDefaultMouseMove: js.UndefOr[Boolean] = js.undefined,
    radiusAxisIndex: Double | js.Array[Double] = null,
    rangeMode: js.Array[String] = null,
    singleAxisIndex: Double | js.Array[Double] = null,
    start: Int | Double = null,
    startValue: Double | String | js.Date = null,
    throttle: Int | Double = null,
    `type`: String = null,
    xAxisIndex: Double | js.Array[Double] = null,
    yAxisIndex: Double | js.Array[Double] = null,
    zoomLock: js.UndefOr[Boolean] = js.undefined,
    zoomOnMouseWheel: js.UndefOr[Boolean] = js.undefined
  ): Inside = {
    val __obj = js.Dynamic.literal()
    if (angleAxisIndex != null) __obj.updateDynamic("angleAxisIndex")(angleAxisIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxSpan != null) __obj.updateDynamic("maxSpan")(maxSpan.asInstanceOf[js.Any])
    if (maxValueSpan != null) __obj.updateDynamic("maxValueSpan")(maxValueSpan.asInstanceOf[js.Any])
    if (minSpan != null) __obj.updateDynamic("minSpan")(minSpan.asInstanceOf[js.Any])
    if (minValueSpan != null) __obj.updateDynamic("minValueSpan")(minValueSpan.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOnMouseMove)) __obj.updateDynamic("moveOnMouseMove")(moveOnMouseMove.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOnMouseWheel)) __obj.updateDynamic("moveOnMouseWheel")(moveOnMouseWheel.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDefaultMouseMove)) __obj.updateDynamic("preventDefaultMouseMove")(preventDefaultMouseMove.asInstanceOf[js.Any])
    if (radiusAxisIndex != null) __obj.updateDynamic("radiusAxisIndex")(radiusAxisIndex.asInstanceOf[js.Any])
    if (rangeMode != null) __obj.updateDynamic("rangeMode")(rangeMode.asInstanceOf[js.Any])
    if (singleAxisIndex != null) __obj.updateDynamic("singleAxisIndex")(singleAxisIndex.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xAxisIndex != null) __obj.updateDynamic("xAxisIndex")(xAxisIndex.asInstanceOf[js.Any])
    if (yAxisIndex != null) __obj.updateDynamic("yAxisIndex")(yAxisIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomLock)) __obj.updateDynamic("zoomLock")(zoomLock.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomOnMouseWheel)) __obj.updateDynamic("zoomOnMouseWheel")(zoomOnMouseWheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inside]
  }
}

