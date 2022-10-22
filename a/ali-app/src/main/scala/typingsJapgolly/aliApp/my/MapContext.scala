package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapContext
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 获取当前地图中心的经纬度，返回 gcj02 坐标系的值，可以用于 my.openLocation
    *
    * @param options
    */
  def getCenterLocation(options: GetCenterLocationOptions): Unit
  
  /**
    * 将地图中心移动到当前定位点，需要配合 map 组件的 show-location 使用
    */
  def moveToLocation(): Unit
}
object MapContext {
  
  inline def apply(getCenterLocation: GetCenterLocationOptions => Callback, moveToLocation: Callback): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1((t0: GetCenterLocationOptions) => getCenterLocation(t0).runNow()), moveToLocation = moveToLocation.toJsFn)
    __obj.asInstanceOf[MapContext]
  }
  
  extension [Self <: MapContext](x: Self) {
    
    inline def setGetCenterLocation(value: GetCenterLocationOptions => Callback): Self = StObject.set(x, "getCenterLocation", js.Any.fromFunction1((t0: GetCenterLocationOptions) => value(t0).runNow()))
    
    inline def setMoveToLocation(value: Callback): Self = StObject.set(x, "moveToLocation", value.toJsFn)
  }
}
