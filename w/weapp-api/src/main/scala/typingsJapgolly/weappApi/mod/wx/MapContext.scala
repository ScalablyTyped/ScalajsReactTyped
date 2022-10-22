package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapContext extends StObject {
  
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
  
  inline def apply(
    getCenterLocation: GetCenterLocationSuccCbOptions => Callback,
    getRegion: GetReginOptions => Callback,
    getScale: GetScaleOptions => Callback,
    includePoints: zoomPointsOptions => Callback,
    moveToLocation: Callback,
    translateMarker: translateMarkerOptions => Callback
  ): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1((t0: GetCenterLocationSuccCbOptions) => getCenterLocation(t0).runNow()), getRegion = js.Any.fromFunction1((t0: GetReginOptions) => getRegion(t0).runNow()), getScale = js.Any.fromFunction1((t0: GetScaleOptions) => getScale(t0).runNow()), includePoints = js.Any.fromFunction1((t0: zoomPointsOptions) => includePoints(t0).runNow()), moveToLocation = moveToLocation.toJsFn, translateMarker = js.Any.fromFunction1((t0: translateMarkerOptions) => translateMarker(t0).runNow()))
    __obj.asInstanceOf[MapContext]
  }
  
  extension [Self <: MapContext](x: Self) {
    
    inline def setGetCenterLocation(value: GetCenterLocationSuccCbOptions => Callback): Self = StObject.set(x, "getCenterLocation", js.Any.fromFunction1((t0: GetCenterLocationSuccCbOptions) => value(t0).runNow()))
    
    inline def setGetRegion(value: GetReginOptions => Callback): Self = StObject.set(x, "getRegion", js.Any.fromFunction1((t0: GetReginOptions) => value(t0).runNow()))
    
    inline def setGetScale(value: GetScaleOptions => Callback): Self = StObject.set(x, "getScale", js.Any.fromFunction1((t0: GetScaleOptions) => value(t0).runNow()))
    
    inline def setIncludePoints(value: zoomPointsOptions => Callback): Self = StObject.set(x, "includePoints", js.Any.fromFunction1((t0: zoomPointsOptions) => value(t0).runNow()))
    
    inline def setMoveToLocation(value: Callback): Self = StObject.set(x, "moveToLocation", value.toJsFn)
    
    inline def setTranslateMarker(value: translateMarkerOptions => Callback): Self = StObject.set(x, "translateMarker", js.Any.fromFunction1((t0: translateMarkerOptions) => value(t0).runNow()))
  }
}
