package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * mapContext 通过 mapId 跟一个 <map/> 组件绑定，通过它可以操作对应的 <map/> 组件。
  */
trait MapContext extends StObject {
  
  /**
    * 获取当前地图中心的经纬度，返回的是 gcj02 坐标系，可以用于 wx.openLocation
    */
  def getCenterLocation(options: GetCenterLocationOptions): OpenLocationOptions
  
  /**
    * 将地图中心移动到当前定位点，需要配合map组件的show-location使用
    */
  def moveToLocation(): Unit
}
object MapContext {
  
  inline def apply(getCenterLocation: GetCenterLocationOptions => OpenLocationOptions, moveToLocation: Callback): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1(getCenterLocation), moveToLocation = moveToLocation.toJsFn)
    __obj.asInstanceOf[MapContext]
  }
  
  extension [Self <: MapContext](x: Self) {
    
    inline def setGetCenterLocation(value: GetCenterLocationOptions => OpenLocationOptions): Self = StObject.set(x, "getCenterLocation", js.Any.fromFunction1(value))
    
    inline def setMoveToLocation(value: Callback): Self = StObject.set(x, "moveToLocation", value.toJsFn)
  }
}
