package typingsJapgolly.amapJsApi.AMap

import typingsJapgolly.amapJsApi.amapJsApiStrings.click
import typingsJapgolly.amapJsApi.amapJsApiStrings.dblclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousemove
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup
import typingsJapgolly.amapJsApi.amapJsApiStrings.rightclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchend
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchmove
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overlay[ExtraData]
  extends StObject
     with EventEmitter {
  
  /**
    * 获取自定义数据
    */
  def getExtData(): ExtraData | js.Object = js.native
  
  def getHeight(): Double | String = js.native
  
  /**
    * 获取所属地图
    */
  def getMap(): js.UndefOr[Map | Null] = js.native
  
  /**
    * 隐藏覆盖物
    */
  def hide(): Unit = js.native
  
  /**
    * 设置自定义数据
    * @param extData 自定义数据
    */
  def setExtData(extData: ExtraData): Unit = js.native
  
  // internal
  def setHeight(): Unit = js.native
  def setHeight(height: String): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  
  /**
    * 设置所属地图
    * @param map 地图
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  /**
    * 显示覆盖物
    */
  def show(): Unit = js.native
}
object Overlay {
  
  trait EventMap[I] extends StObject {
    
    var click: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.click, I]
    
    var dblclick: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.dblclick, I]
    
    var mousedown: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown, I]
    
    var mousemove: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mousemove, I]
    
    var mouseover: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover, I]
    
    var mouseup: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup, I]
    
    var rightclick: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.rightclick, I]
    
    var touchend: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.touchend, I]
    
    var touchmove: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.touchmove, I]
    
    var touchstart: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.touchstart, I]
  }
  object EventMap {
    
    inline def apply[I](
      click: MapsEvent[click, I],
      dblclick: MapsEvent[dblclick, I],
      mousedown: MapsEvent[mousedown, I],
      mousemove: MapsEvent[mousemove, I],
      mouseover: MapsEvent[mouseover, I],
      mouseup: MapsEvent[mouseup, I],
      rightclick: MapsEvent[rightclick, I],
      touchend: MapsEvent[touchend, I],
      touchmove: MapsEvent[touchmove, I],
      touchstart: MapsEvent[touchstart, I]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    extension [Self <: EventMap[?], I](x: Self & EventMap[I]) {
      
      inline def setClick(value: MapsEvent[click, I]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setDblclick(value: MapsEvent[dblclick, I]): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      inline def setMousedown(value: MapsEvent[mousedown, I]): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      inline def setMousemove(value: MapsEvent[mousemove, I]): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      inline def setMouseover(value: MapsEvent[mouseover, I]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      inline def setMouseup(value: MapsEvent[mouseup, I]): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      inline def setRightclick(value: MapsEvent[rightclick, I]): Self = StObject.set(x, "rightclick", value.asInstanceOf[js.Any])
      
      inline def setTouchend(value: MapsEvent[touchend, I]): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      inline def setTouchmove(value: MapsEvent[touchmove, I]): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      inline def setTouchstart(value: MapsEvent[touchstart, I]): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[ExtraData] extends StObject {
    
    /**
      * 事件是否穿透到地图
      */
    var bubble: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 是否支持点击
      */
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 鼠标悬停时的鼠标样式
      */
    var cursor: js.UndefOr[String] = js.undefined
    
    /**
      * 是否支持拖拽
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 自定义数据
      */
    var extData: js.UndefOr[ExtraData] = js.undefined
    
    /**
      * 所属地图
      */
    var map: js.UndefOr[Map] = js.undefined
  }
  object Options {
    
    inline def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    extension [Self <: Options[?], ExtraData](x: Self & Options[ExtraData]) {
      
      inline def setBubble(value: Boolean): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
      
      inline def setBubbleUndefined: Self = StObject.set(x, "bubble", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setExtData(value: ExtraData): Self = StObject.set(x, "extData", value.asInstanceOf[js.Any])
      
      inline def setExtDataUndefined: Self = StObject.set(x, "extData", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
}
