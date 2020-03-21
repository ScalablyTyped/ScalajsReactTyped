package typingsJapgolly.chartJs.mod

import typingsJapgolly.chartJs.chartJsStrings.bottom
import typingsJapgolly.chartJs.chartJsStrings.default
import typingsJapgolly.chartJs.chartJsStrings.monotone
import typingsJapgolly.chartJs.chartJsStrings.top
import typingsJapgolly.chartJs.chartJsStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLineOptions extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor] = js.undefined
  var borderCapStyle: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[ChartColor] = js.undefined
  var borderDash: js.UndefOr[js.Array[_]] = js.undefined
  var borderDashOffset: js.UndefOr[Double] = js.undefined
  var borderJoinStyle: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var capBezierPoints: js.UndefOr[Boolean] = js.undefined
  var cubicInterpolationMode: js.UndefOr[default | monotone] = js.undefined
  var fill: js.UndefOr[zero | top | bottom | Boolean] = js.undefined
  var stepped: js.UndefOr[Boolean] = js.undefined
  var tension: js.UndefOr[Double] = js.undefined
}

object ChartLineOptions {
  @scala.inline
  def apply(
    backgroundColor: ChartColor = null,
    borderCapStyle: String = null,
    borderColor: ChartColor = null,
    borderDash: js.Array[_] = null,
    borderDashOffset: Int | Double = null,
    borderJoinStyle: String = null,
    borderWidth: Int | Double = null,
    capBezierPoints: js.UndefOr[Boolean] = js.undefined,
    cubicInterpolationMode: default | monotone = null,
    fill: zero | top | bottom | Boolean = null,
    stepped: js.UndefOr[Boolean] = js.undefined,
    tension: Int | Double = null
  ): ChartLineOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderCapStyle != null) __obj.updateDynamic("borderCapStyle")(borderCapStyle.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderDash != null) __obj.updateDynamic("borderDash")(borderDash.asInstanceOf[js.Any])
    if (borderDashOffset != null) __obj.updateDynamic("borderDashOffset")(borderDashOffset.asInstanceOf[js.Any])
    if (borderJoinStyle != null) __obj.updateDynamic("borderJoinStyle")(borderJoinStyle.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(capBezierPoints)) __obj.updateDynamic("capBezierPoints")(capBezierPoints.asInstanceOf[js.Any])
    if (cubicInterpolationMode != null) __obj.updateDynamic("cubicInterpolationMode")(cubicInterpolationMode.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(stepped)) __obj.updateDynamic("stepped")(stepped.asInstanceOf[js.Any])
    if (tension != null) __obj.updateDynamic("tension")(tension.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLineOptions]
  }
}

