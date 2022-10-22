package typingsJapgolly.amapJsApiOverview

import typingsJapgolly.amapJsApi.AMap.TileLayer
import typingsJapgolly.amapJsApiOverview.AMap.OverView.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    /**
      * 地图鹰眼插件
      */
    @JSGlobal("AMap.OverView")
    @js.native
    open class OverView[L /* <: TileLayer */] ()
      extends StObject
         with typingsJapgolly.amapJsApiOverview.AMap.OverView[L] {
      def this(options: Options[L]) = this()
    }
  }
}
