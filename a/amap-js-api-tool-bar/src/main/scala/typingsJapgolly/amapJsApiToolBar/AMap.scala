package typingsJapgolly.amapJsApiToolBar

import typingsJapgolly.amapJsApi.AMap.EventEmitter
import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApi.AMap.Marker
import typingsJapgolly.amapJsApi.AMap.Pixel
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.hide
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.location
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.show
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.zoomin
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.zoomout
import typingsJapgolly.amapJsApiToolBar.anon.Lnglat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait ToolBar
    extends StObject
       with EventEmitter {
    
    /**
      * 进行位置定位
      */
    def doLocation(): Unit = js.native
    
    /**
      * 获取上次定位的结果
      */
    def getLocation(): js.UndefOr[LngLat | Null] = js.native
    
    /**
      * 获取工具条相对于地图容器左上角的偏移量
      */
    def getOffset(): Pixel = js.native
    
    /**
      * 隐藏工具条
      */
    def hide(): Unit = js.native
    
    /**
      * 隐藏方向键盘
      */
    def hideDirection(): Unit = js.native
    
    /**
      * 隐藏定位小部件
      */
    def hideLocation(): Unit = js.native
    
    /**
      * 隐藏缩放级别等级条
      */
    def hideRuler(): Unit = js.native
    
    /**
      * 设置工具条相对于地图容器左上角的偏移量
      * @param offset 偏移量
      */
    def setOffset(offset: Pixel): Unit = js.native
    
    /**
      * 显示工具条
      */
    def show(): Unit = js.native
    
    /**
      * 显示方向键盘
      */
    def showDirection(): Unit = js.native
    
    /**
      * 显示定位小部件
      */
    def showLocation(): Unit = js.native
    
    /**
      * 显示缩放级别等级条
      */
    def showRuler(): Unit = js.native
  }
  object ToolBar {
    
    trait EventMap extends StObject {
      
      var hide: Event_[typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.hide, Unit]
      
      var location: Event_[typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.location, Lnglat]
      
      // TODO geolocation.getCurrentPosition
      var `location-failed`: Event_[typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`, Unit]
      
      // internal
      var `location-success`: Event_[typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`, Unit]
      
      var show: Event_[typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.show, Unit]
      
      var zoomchanged: Event_[zoomin | zoomout, Unit]
    }
    object EventMap {
      
      inline def apply(
        hide: Event_[hide, Unit],
        location: Event_[location, Lnglat],
        `location-failed`: Event_[`location-failed`, Unit],
        `location-success`: Event_[`location-success`, Unit],
        show: Event_[show, Unit],
        zoomchanged: Event_[zoomin | zoomout, Unit]
      ): EventMap = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], zoomchanged = zoomchanged.asInstanceOf[js.Any])
        __obj.updateDynamic("location-failed")(`location-failed`.asInstanceOf[js.Any])
        __obj.updateDynamic("location-success")(`location-success`.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      extension [Self <: EventMap](x: Self) {
        
        inline def setHide(value: Event_[hide, Unit]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        inline def setLocation(value: Event_[location, Lnglat]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def `setLocation-failed`(value: Event_[`location-failed`, Unit]): Self = StObject.set(x, "location-failed", value.asInstanceOf[js.Any])
        
        inline def `setLocation-success`(value: Event_[`location-success`, Unit]): Self = StObject.set(x, "location-success", value.asInstanceOf[js.Any])
        
        inline def setShow(value: Event_[show, Unit]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
        
        inline def setZoomchanged(value: Event_[zoomin | zoomout, Unit]): Self = StObject.set(x, "zoomchanged", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      /**
        * 是否自动定位，即地图初始化加载完成后，是否自动定位的用户所在地，仅在支持HTML5的浏览器中有效
        */
      var autoPosition: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 方向键盘是否可见
        */
      var direction: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 是否使用精简模式
        */
      var liteStyle: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 是否显示定位按钮
        */
      var locate: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 自定义定位图标，值为Marker对象
        */
      var locationMarker: js.UndefOr[Marker[Any]] = js.undefined
      
      /**
        * 定位失败后，是否开启IP定位
        */
      var noIpLocate: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 相对于地图容器左上角的偏移量
        */
      var offset: js.UndefOr[Pixel] = js.undefined
      
      /**
        * 控件停靠位置
        * LT:左上角;
        * RT:右上角;
        * LB:左下角;
        * RB:右下角;
        */
      var position: js.UndefOr[Position] = js.undefined
      
      /**
        * 标尺键盘是否可见
        */
      var ruler: js.UndefOr[Boolean] = js.undefined
      
      // internal
      var timeout: js.UndefOr[Double] = js.undefined
      
      /**
        * 是否使用高德定位sdk用来辅助优化定位效果
        */
      var useNative: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAutoPosition(value: Boolean): Self = StObject.set(x, "autoPosition", value.asInstanceOf[js.Any])
        
        inline def setAutoPositionUndefined: Self = StObject.set(x, "autoPosition", js.undefined)
        
        inline def setDirection(value: Boolean): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
        
        inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
        
        inline def setLiteStyle(value: Boolean): Self = StObject.set(x, "liteStyle", value.asInstanceOf[js.Any])
        
        inline def setLiteStyleUndefined: Self = StObject.set(x, "liteStyle", js.undefined)
        
        inline def setLocate(value: Boolean): Self = StObject.set(x, "locate", value.asInstanceOf[js.Any])
        
        inline def setLocateUndefined: Self = StObject.set(x, "locate", js.undefined)
        
        inline def setLocationMarker(value: Marker[Any]): Self = StObject.set(x, "locationMarker", value.asInstanceOf[js.Any])
        
        inline def setLocationMarkerUndefined: Self = StObject.set(x, "locationMarker", js.undefined)
        
        inline def setNoIpLocate(value: Boolean): Self = StObject.set(x, "noIpLocate", value.asInstanceOf[js.Any])
        
        inline def setNoIpLocateUndefined: Self = StObject.set(x, "noIpLocate", js.undefined)
        
        inline def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setRuler(value: Boolean): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
        
        inline def setRulerUndefined: Self = StObject.set(x, "ruler", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        
        inline def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
        
        inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.LT
      - typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.RT
      - typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.LB
      - typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.RB
    */
    trait Position extends StObject
    object Position {
      
      inline def LB: typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.LB = "LB".asInstanceOf[typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.LB]
      
      inline def LT: typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.LT = "LT".asInstanceOf[typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.LT]
      
      inline def RB: typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.RB = "RB".asInstanceOf[typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.RB]
      
      inline def RT: typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.RT = "RT".asInstanceOf[typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.RT]
    }
  }
}
