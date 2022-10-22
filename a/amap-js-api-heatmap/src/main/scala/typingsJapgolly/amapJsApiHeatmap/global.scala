package typingsJapgolly.amapJsApiHeatmap

import typingsJapgolly.amapJsApi.AMap.Map
import typingsJapgolly.amapJsApiHeatmap.AMap.Heatmap.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap.Heatmap")
    @js.native
    open class Heatmap protected ()
      extends StObject
         with typingsJapgolly.amapJsApiHeatmap.AMap.Heatmap {
      /**
        * 热力图
        * @param map 地图对象
        * @param opts 热力图选项
        */
      def this(map: Map) = this()
      def this(map: Map, opts: Options) = this()
    }
  }
}
