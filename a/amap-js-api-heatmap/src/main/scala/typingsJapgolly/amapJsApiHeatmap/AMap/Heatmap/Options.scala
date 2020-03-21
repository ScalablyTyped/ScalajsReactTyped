package typingsJapgolly.amapJsApiHeatmap.AMap.Heatmap

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.amapJsApiHeatmap.AnonDrawGridLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var `3d`: js.UndefOr[AnonDrawGridLine] = js.undefined
  var blur: js.UndefOr[Double] = js.undefined
  /**
    * 热力图的渐变区间
    */
  var gradient: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * 热力图透明度数组，取值范围[0,1]，0表示完全透明，1表示不透明
    * 默认：[0,1]
    */
  var opacity: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  /**
    * 热力图中单个点的半径，默认：30，单位：pixel
    */
  var radius: js.UndefOr[Double] = js.undefined
  var radiusUnit: js.UndefOr[String] = js.undefined
  var rejectMapMask: js.UndefOr[Boolean] = js.undefined
  var renderOnZooming: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  /**
    * 支持的缩放级别范围，取值范围[3-18]
    * 默认：[3,18]
    */
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    `3d`: AnonDrawGridLine = null,
    blur: Int | Double = null,
    gradient: StringDictionary[String] = null,
    opacity: js.Tuple2[Double, Double] = null,
    radius: Int | Double = null,
    radiusUnit: String = null,
    rejectMapMask: js.UndefOr[Boolean] = js.undefined,
    renderOnZooming: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    zooms: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (`3d` != null) __obj.updateDynamic("3d")(`3d`.asInstanceOf[js.Any])
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusUnit != null) __obj.updateDynamic("radiusUnit")(radiusUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectMapMask)) __obj.updateDynamic("rejectMapMask")(rejectMapMask.asInstanceOf[js.Any])
    if (!js.isUndefined(renderOnZooming)) __obj.updateDynamic("renderOnZooming")(renderOnZooming.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

