package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.anon.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * mapContext 通过 mapId 跟一个 <map/> 组件绑定，通过它可以操作对应的 <map/> 组件。
  */
trait MapContext extends StObject {
  
  /**
    * 获取当前地图中心的经纬度，返回的是 gcj02 坐标系，可以用于 swan.openLocation
    */
  def getCenterLocation(options: GetCenterLocationOptions): OpenLocationOptions
  
  def getRegion(options: GetRegionOptions): Unit
  
  def includePoints(options: Padding): Unit
  
  /**
    * 将地图中心移动到当前定位点，需要配合map组件的show-location使用
    */
  def moveToLocation(): Unit
  
  def translateMarker(options: TranslateMarkerOptions): Unit
}
object MapContext {
  
  inline def apply(
    getCenterLocation: GetCenterLocationOptions => OpenLocationOptions,
    getRegion: GetRegionOptions => Callback,
    includePoints: Padding => Callback,
    moveToLocation: Callback,
    translateMarker: TranslateMarkerOptions => Callback
  ): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1(getCenterLocation), getRegion = js.Any.fromFunction1((t0: GetRegionOptions) => getRegion(t0).runNow()), includePoints = js.Any.fromFunction1((t0: Padding) => includePoints(t0).runNow()), moveToLocation = moveToLocation.toJsFn, translateMarker = js.Any.fromFunction1((t0: TranslateMarkerOptions) => translateMarker(t0).runNow()))
    __obj.asInstanceOf[MapContext]
  }
  
  extension [Self <: MapContext](x: Self) {
    
    inline def setGetCenterLocation(value: GetCenterLocationOptions => OpenLocationOptions): Self = StObject.set(x, "getCenterLocation", js.Any.fromFunction1(value))
    
    inline def setGetRegion(value: GetRegionOptions => Callback): Self = StObject.set(x, "getRegion", js.Any.fromFunction1((t0: GetRegionOptions) => value(t0).runNow()))
    
    inline def setIncludePoints(value: Padding => Callback): Self = StObject.set(x, "includePoints", js.Any.fromFunction1((t0: Padding) => value(t0).runNow()))
    
    inline def setMoveToLocation(value: Callback): Self = StObject.set(x, "moveToLocation", value.toJsFn)
    
    inline def setTranslateMarker(value: TranslateMarkerOptions => Callback): Self = StObject.set(x, "translateMarker", js.Any.fromFunction1((t0: TranslateMarkerOptions) => value(t0).runNow()))
  }
}
