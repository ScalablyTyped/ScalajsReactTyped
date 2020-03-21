package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContext extends js.Object {
  //  获取当前地图中心的经纬度。返回的是 gcj02 坐标系，可以用于 wx.openLocation()
  def getCenterLocation(options: GetCenterLocationSuccCbOptions): Unit
  //  获取当前地图的视野范围
  def getRegion(options: GetReginOptions): Unit
  //  获取当前地图的缩放级别
  def getScale(options: GetScaleOptions): Unit
  //  缩放视野展示所有经纬度
  def includePoints(options: zoomPointsOptions): Unit
  //  将地图中心移动到当前定位点。需要配合map组件的show-location使用
  def moveToLocation(): Unit
  //  平移marker，带动画
  def translateMarker(options: translateMarkerOptions): Unit
}

object MapContext {
  @scala.inline
  def apply(
    getCenterLocation: GetCenterLocationSuccCbOptions => Callback,
    getRegion: GetReginOptions => Callback,
    getScale: GetScaleOptions => Callback,
    includePoints: zoomPointsOptions => Callback,
    moveToLocation: Callback,
    translateMarker: translateMarkerOptions => Callback
  ): MapContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCenterLocation")(js.Any.fromFunction1((t0: typingsJapgolly.weappApi.mod.wx.GetCenterLocationSuccCbOptions) => getCenterLocation(t0).runNow()))
    __obj.updateDynamic("getRegion")(js.Any.fromFunction1((t0: typingsJapgolly.weappApi.mod.wx.GetReginOptions) => getRegion(t0).runNow()))
    __obj.updateDynamic("getScale")(js.Any.fromFunction1((t0: typingsJapgolly.weappApi.mod.wx.GetScaleOptions) => getScale(t0).runNow()))
    __obj.updateDynamic("includePoints")(js.Any.fromFunction1((t0: typingsJapgolly.weappApi.mod.wx.zoomPointsOptions) => includePoints(t0).runNow()))
    __obj.updateDynamic("moveToLocation")(moveToLocation.toJsFn)
    __obj.updateDynamic("translateMarker")(js.Any.fromFunction1((t0: typingsJapgolly.weappApi.mod.wx.translateMarkerOptions) => translateMarker(t0).runNow()))
    __obj.asInstanceOf[MapContext]
  }
}

