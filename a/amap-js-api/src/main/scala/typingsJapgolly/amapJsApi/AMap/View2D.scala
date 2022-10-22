package typingsJapgolly.amapJsApi.AMap

import typingsJapgolly.amapJsApi.amapJsApiStrings.EPGS3395
import typingsJapgolly.amapJsApi.amapJsApiStrings.EPGS3857
import typingsJapgolly.amapJsApi.amapJsApiStrings.EPGS4326
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object View2D {
  
  trait Options extends StObject {
    
    /**
      * 地图中心点坐标值
      */
    var center: js.UndefOr[LocationValue] = js.undefined
    
    /**
      * 地图显示的参考坐标系
      */
    var crs: js.UndefOr[EPGS3857 | EPGS3395 | EPGS4326] = js.undefined
    
    /**
      * 地图顺时针旋转角度
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * 地图显示的缩放级别
      */
    var zoom: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCenter(value: LocationValue): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setCrs(value: EPGS3857 | EPGS3395 | EPGS4326): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
      
      inline def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
