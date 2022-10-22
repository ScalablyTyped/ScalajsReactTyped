package typingsJapgolly.amapJsApiScale

import typingsJapgolly.amapJsApi.AMap.EventEmitter
import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApi.AMap.Pixel
import typingsJapgolly.amapJsApiScale.AMap.Scale.Position
import typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.hide
import typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  /**
    * 比例尺插件
    */
  @js.native
  trait Scale
    extends StObject
       with EventEmitter {
    
    /**
      * 隐藏比例尺
      */
    def hide(): Unit = js.native
    
    /**
      * 相对于地图容器左上角的偏移量
      */
    var offset: Pixel = js.native
    
    /**
      * 控件停靠位置
      */
    var position: Position = js.native
    
    /**
      * 显示比例尺
      */
    def show(): Unit = js.native
    
    /**
      * 是否可见
      */
    var visible: Boolean = js.native
  }
  object Scale {
    
    trait EventMap extends StObject {
      
      var hide: Event_[typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.hide, Unit]
      
      var show: Event_[typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.show, Unit]
    }
    object EventMap {
      
      inline def apply(hide: Event_[hide, Unit], show: Event_[show, Unit]): EventMap = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      extension [Self <: EventMap](x: Self) {
        
        inline def setHide(value: Event_[hide, Unit]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        inline def setShow(value: Event_[show, Unit]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
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
        * 默认位置：LB
        */
      var position: js.UndefOr[Position] = js.undefined
      
      /**
        * 是否可见
        */
      var visible: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.LT
      - typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.RT
      - typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.LB
      - typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.RB
    */
    trait Position extends StObject
    object Position {
      
      inline def LB: typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.LB = "LB".asInstanceOf[typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.LB]
      
      inline def LT: typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.LT = "LT".asInstanceOf[typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.LT]
      
      inline def RB: typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.RB = "RB".asInstanceOf[typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.RB]
      
      inline def RT: typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.RT = "RT".asInstanceOf[typingsJapgolly.amapJsApiScale.amapJsApiScaleStrings.RT]
    }
  }
}
