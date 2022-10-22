package typingsJapgolly.amapJsApiMapType

import typingsJapgolly.amapJsApi.AMap.EventEmitter
import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiMapType.amapJsApiMapTypeInts.`0`
import typingsJapgolly.amapJsApiMapType.amapJsApiMapTypeInts.`1`
import typingsJapgolly.amapJsApiMapType.amapJsApiMapTypeStrings.hide
import typingsJapgolly.amapJsApiMapType.amapJsApiMapTypeStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait MapType
    extends StObject
       with EventEmitter {
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
  object MapType {
    
    trait EventMap extends StObject {
      
      var hide: Event_[typingsJapgolly.amapJsApiMapType.amapJsApiMapTypeStrings.hide, Unit]
      
      var show: Event_[typingsJapgolly.amapJsApiMapType.amapJsApiMapTypeStrings.show, Unit]
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
        * 初始化默认图层类型，默认为0
        * 取值为0：默认底图
        * 取值为1：卫星图
        */
      var defaultType: js.UndefOr[`0` | `1`] = js.undefined
      
      /**
        * 是否叠加路网图层，默认false
        */
      var showRoad: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 是否叠加实时交通图层，默认false
        */
      var showTraffic: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setDefaultType(value: `0` | `1`): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
        
        inline def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
        
        inline def setShowRoad(value: Boolean): Self = StObject.set(x, "showRoad", value.asInstanceOf[js.Any])
        
        inline def setShowRoadUndefined: Self = StObject.set(x, "showRoad", js.undefined)
        
        inline def setShowTraffic(value: Boolean): Self = StObject.set(x, "showTraffic", value.asInstanceOf[js.Any])
        
        inline def setShowTrafficUndefined: Self = StObject.set(x, "showTraffic", js.undefined)
      }
    }
  }
}
