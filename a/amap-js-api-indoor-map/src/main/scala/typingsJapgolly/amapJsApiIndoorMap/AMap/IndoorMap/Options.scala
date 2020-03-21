package typingsJapgolly.amapJsApiIndoorMap.AMap.IndoorMap

import typingsJapgolly.amapJsApi.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typingsJapgolly.amapJsApi.AMap.Layer.Options {
  /**
    * 是否持续显示
    */
  var alaysShow: js.UndefOr[Boolean] = js.undefined
  var autoLoadBuildingsInTile: js.UndefOr[Boolean] = js.undefined
  /**
    * 鼠标悬停到店铺面时的鼠标样式
    */
  var cursor: js.UndefOr[String] = js.undefined
  var disableHoverMarker: js.UndefOr[Boolean] = js.undefined
  var disableIconRender: js.UndefOr[Boolean] = js.undefined
  var disableLabelRender: js.UndefOr[Boolean] = js.undefined
  var featurezIndex: js.UndefOr[Double] = js.undefined
  /**
    * 是否隐藏楼层切换控件
    */
  var hideFloorBar: js.UndefOr[Boolean] = js.undefined
  /**
    * 图层的透明度
    */
  var opacity: js.UndefOr[Double] = js.undefined
  // internal
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * 图层叠加的顺序值
    */
  var zIndex: js.UndefOr[Double] = js.undefined
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alaysShow: js.UndefOr[Boolean] = js.undefined,
    autoLoadBuildingsInTile: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    disableHoverMarker: js.UndefOr[Boolean] = js.undefined,
    disableIconRender: js.UndefOr[Boolean] = js.undefined,
    disableLabelRender: js.UndefOr[Boolean] = js.undefined,
    featurezIndex: Int | Double = null,
    hideFloorBar: js.UndefOr[Boolean] = js.undefined,
    map: Map = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    zooms: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alaysShow)) __obj.updateDynamic("alaysShow")(alaysShow.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoadBuildingsInTile)) __obj.updateDynamic("autoLoadBuildingsInTile")(autoLoadBuildingsInTile.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHoverMarker)) __obj.updateDynamic("disableHoverMarker")(disableHoverMarker.asInstanceOf[js.Any])
    if (!js.isUndefined(disableIconRender)) __obj.updateDynamic("disableIconRender")(disableIconRender.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLabelRender)) __obj.updateDynamic("disableLabelRender")(disableLabelRender.asInstanceOf[js.Any])
    if (featurezIndex != null) __obj.updateDynamic("featurezIndex")(featurezIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFloorBar)) __obj.updateDynamic("hideFloorBar")(hideFloorBar.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

