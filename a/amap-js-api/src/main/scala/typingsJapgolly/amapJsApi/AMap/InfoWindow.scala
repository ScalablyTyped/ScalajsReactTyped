package typingsJapgolly.amapJsApi.AMap

import org.scalajs.dom.HTMLElement
import typingsJapgolly.amapJsApi.AMap.InfoWindow.Anchor
import typingsJapgolly.amapJsApi.amapJsApiStrings.change
import typingsJapgolly.amapJsApi.amapJsApiStrings.close
import typingsJapgolly.amapJsApi.amapJsApiStrings.open
import typingsJapgolly.amapJsApi.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoWindow[ExtraData]
  extends StObject
     with Overlay[ExtraData] {
  
  /**
    * 关闭信息窗体
    */
  def close(): Unit = js.native
  
  /**
    * 获取锚点
    */
  def getAnchor(): js.UndefOr[Anchor] = js.native
  
  /**
    * 获取信息窗体内容
    */
  def getContent(): js.UndefOr[String | HTMLElement] = js.native
  
  /**
    * 获取信息窗体是否打开
    */
  def getIsOpen(): Boolean = js.native
  
  /**
    * 获取信息窗体显示基点位置
    */
  def getPosition(): js.UndefOr[LngLat] = js.native
  
  /**
    * 获取信息窗体大小
    */
  def getSize(): js.UndefOr[Size] = js.native
  
  /**
    * 在地图的指定位置打开信息窗体
    * @param map 地图
    * @param position 打开的位置
    */
  def open(map: Map): Unit = js.native
  def open(map: Map, position: LocationValue): Unit = js.native
  
  /**
    * 设置锚点
    * @param anchor 锚点
    */
  def setAnchor(): Unit = js.native
  def setAnchor(anchor: Anchor): Unit = js.native
  
  /**
    * 设置信息窗体内容
    * @param content 窗体内容
    */
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  
  // internal
  def setOffset(offset: Pixel): Unit = js.native
  
  /**
    * 设置信息窗体显示基点位置
    * @param lnglat 位置经纬度
    */
  def setPosition(lnglat: LocationValue): Unit = js.native
  
  /**
    * 设置信息窗体大小
    * @param size 大小
    */
  def setSize(size: SizeValue): Unit = js.native
}
object InfoWindow {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.amapJsApi.amapJsApiStrings.`top-left`
    - typingsJapgolly.amapJsApi.amapJsApiStrings.`top-center`
    - typingsJapgolly.amapJsApi.amapJsApiStrings.`top-right`
    - typingsJapgolly.amapJsApi.amapJsApiStrings.`middle-left`
    - typingsJapgolly.amapJsApi.amapJsApiStrings.center
    - typingsJapgolly.amapJsApi.amapJsApiStrings.`middle-right`
    - typingsJapgolly.amapJsApi.amapJsApiStrings.`bottom-left`
    - typingsJapgolly.amapJsApi.amapJsApiStrings.`bottom-center`
    - typingsJapgolly.amapJsApi.amapJsApiStrings.`bottom-right`
  */
  trait Anchor extends StObject
  object Anchor {
    
    inline def `bottom-center`: typingsJapgolly.amapJsApi.amapJsApiStrings.`bottom-center` = "bottom-center".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.`bottom-center`]
    
    inline def `bottom-left`: typingsJapgolly.amapJsApi.amapJsApiStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.`bottom-left`]
    
    inline def `bottom-right`: typingsJapgolly.amapJsApi.amapJsApiStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.`bottom-right`]
    
    inline def center: typingsJapgolly.amapJsApi.amapJsApiStrings.center = "center".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.center]
    
    inline def `middle-left`: typingsJapgolly.amapJsApi.amapJsApiStrings.`middle-left` = "middle-left".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.`middle-left`]
    
    inline def `middle-right`: typingsJapgolly.amapJsApi.amapJsApiStrings.`middle-right` = "middle-right".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.`middle-right`]
    
    inline def `top-center`: typingsJapgolly.amapJsApi.amapJsApiStrings.`top-center` = "top-center".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.`top-center`]
    
    inline def `top-left`: typingsJapgolly.amapJsApi.amapJsApiStrings.`top-left` = "top-left".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.`top-left`]
    
    inline def `top-right`: typingsJapgolly.amapJsApi.amapJsApiStrings.`top-right` = "top-right".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.`top-right`]
  }
  
  trait EventMap[I] extends StObject {
    
    var change: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.change, Target[I]]
    
    var close: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.close, Target[I]]
    
    var open: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.open, Target[I]]
  }
  object EventMap {
    
    inline def apply[I](change: Event_[change, Target[I]], close: Event_[close, Target[I]], open: Event_[open, Target[I]]): EventMap[I] = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    extension [Self <: EventMap[?], I](x: Self & EventMap[I]) {
      
      inline def setChange(value: Event_[change, Target[I]]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setClose(value: Event_[close, Target[I]]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Event_[open, Target[I]]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[ExtraData]
    extends StObject
       with typingsJapgolly.amapJsApi.AMap.Overlay.Options[ExtraData] {
    
    /**
      * 信息窗体锚点
      */
    var anchor: js.UndefOr[Anchor] = js.undefined
    
    /**
      * 是否自动调整窗体到视野内
      */
    var autoMove: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 控制是否在鼠标点击地图后关闭信息窗体
      */
    var closeWhenClickMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 显示内容
      */
    var content: js.UndefOr[String | HTMLElement] = js.undefined
    
    // internal
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * 是否自定义窗体
      */
    var isCustom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 信息窗体显示位置偏移量
      */
    var offset: js.UndefOr[Pixel] = js.undefined
    
    /**
      * 信息窗体显示基点位置
      */
    var position: js.UndefOr[LocationValue] = js.undefined
    
    /**
      * 是否显示信息窗体阴影
      */
    var showShadow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 信息窗体尺寸
      */
    var size: js.UndefOr[SizeValue] = js.undefined
  }
  object Options {
    
    inline def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    extension [Self <: Options[?], ExtraData](x: Self & Options[ExtraData]) {
      
      inline def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAutoMove(value: Boolean): Self = StObject.set(x, "autoMove", value.asInstanceOf[js.Any])
      
      inline def setAutoMoveUndefined: Self = StObject.set(x, "autoMove", js.undefined)
      
      inline def setCloseWhenClickMap(value: Boolean): Self = StObject.set(x, "closeWhenClickMap", value.asInstanceOf[js.Any])
      
      inline def setCloseWhenClickMapUndefined: Self = StObject.set(x, "closeWhenClickMap", js.undefined)
      
      inline def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsCustom(value: Boolean): Self = StObject.set(x, "isCustom", value.asInstanceOf[js.Any])
      
      inline def setIsCustomUndefined: Self = StObject.set(x, "isCustom", js.undefined)
      
      inline def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPosition(value: LocationValue): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
      
      inline def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
      
      inline def setSize(value: SizeValue): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
