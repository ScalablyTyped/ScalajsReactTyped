package typingsJapgolly.amapJsApi.AMap

import typingsJapgolly.amapJsApi.amapJsApiStrings.change
import typingsJapgolly.amapJsApi.amapJsApiStrings.click
import typingsJapgolly.amapJsApi.amapJsApiStrings.dblclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.hide
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousemove
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup
import typingsJapgolly.amapJsApi.amapJsApiStrings.options
import typingsJapgolly.amapJsApi.amapJsApiStrings.rightclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.show
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchend
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchmove
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchstart
import typingsJapgolly.amapJsApi.anon.TargetI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeOverlay[ExtraData]
  extends StObject
     with Overlay[ExtraData] {
  
  /**
    * 获得属性
    */
  def getOptions(): js.Object = js.native
  
  /**
    * 返回可见
    */
  def getVisible(): Boolean = js.native
  
  /**
    * 获得层级
    */
  def getzIndex(): Double = js.native
  
  /**
    * 设置是否可以拖拽
    */
  def setDraggable(draggable: Boolean): Unit = js.native
  
  /**
    * 设置覆盖物属性
    * @param options 属性
    */
  def setOptions(options: js.Object): Unit = js.native
  
  /**
    * 设置层级
    * @param zIndex 层级
    */
  def setzIndex(zIndex: Double): Unit = js.native
}
object ShapeOverlay {
  
  trait EventMap[I]
    extends StObject
       with typingsJapgolly.amapJsApi.AMap.Overlay.EventMap[I] {
    
    var change: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.change, TargetI[I]]
    
    var hide: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.hide, TargetI[I]]
    
    var options: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.options, Unit]
    
    var show: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.show, TargetI[I]]
  }
  object EventMap {
    
    inline def apply[I](
      change: Event_[change, TargetI[I]],
      click: MapsEvent[click, I],
      dblclick: MapsEvent[dblclick, I],
      hide: Event_[hide, TargetI[I]],
      mousedown: MapsEvent[mousedown, I],
      mousemove: MapsEvent[mousemove, I],
      mouseover: MapsEvent[mouseover, I],
      mouseup: MapsEvent[mouseup, I],
      options: Event_[options, Unit],
      rightclick: MapsEvent[rightclick, I],
      show: Event_[show, TargetI[I]],
      touchend: MapsEvent[touchend, I],
      touchmove: MapsEvent[touchmove, I],
      touchstart: MapsEvent[touchstart, I]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    extension [Self <: EventMap[?], I](x: Self & EventMap[I]) {
      
      inline def setChange(value: Event_[change, TargetI[I]]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setHide(value: Event_[hide, TargetI[I]]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Event_[options, Unit]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Event_[show, TargetI[I]]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetOptionsResult[ExtraData] extends StObject {
    
    /**
      * 事件是否穿透到地图
      */
    var bubble: Boolean
    
    /**
      * 是否支持点击
      */
    var clickable: Boolean
    
    /**
      * 自定义属性
      */
    var extData: ExtraData | js.Object
    
    /**
      * 所属地图
      */
    var map: Map
    
    /**
      * 线条颜色
      */
    var strokeColor: String
    
    /**
      * 虚线的分段
      */
    var strokeDasharray: js.Array[Double]
    
    /**
      * 线条透明度
      */
    var strokeOpacity: Double
    
    /**
      * 线条样式，虚线或者实线
      */
    var strokeStyle: StrokeStyle
    
    /**
      * 线条宽度
      */
    var strokeWeight: Double
    
    /**
      * 层级
      */
    var zIndex: Double
  }
  object GetOptionsResult {
    
    inline def apply[ExtraData](
      bubble: Boolean,
      clickable: Boolean,
      extData: ExtraData | js.Object,
      map: Map,
      strokeColor: String,
      strokeDasharray: js.Array[Double],
      strokeOpacity: Double,
      strokeStyle: StrokeStyle,
      strokeWeight: Double,
      zIndex: Double
    ): GetOptionsResult[ExtraData] = {
      val __obj = js.Dynamic.literal(bubble = bubble.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], extData = extData.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOptionsResult[ExtraData]]
    }
    
    extension [Self <: GetOptionsResult[?], ExtraData](x: Self & GetOptionsResult[ExtraData]) {
      
      inline def setBubble(value: Boolean): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setExtData(value: ExtraData | js.Object): Self = StObject.set(x, "extData", value.asInstanceOf[js.Any])
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharray(value: js.Array[Double]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharrayVarargs(value: Double*): Self = StObject.set(x, "strokeDasharray", js.Array(value*))
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyle(value: StrokeStyle): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
}
