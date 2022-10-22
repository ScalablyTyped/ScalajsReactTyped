package typingsJapgolly.kendoUi.kendo.dataviz.map

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayer
  extends StObject
     with Layer_ {
  
  @JSName("options")
  var options_TileLayer: TileLayerOptions
}
object TileLayer {
  
  inline def apply(hide: Callback, map: Map, options: TileLayerOptions, show: Callback): TileLayer = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = show.toJsFn)
    __obj.asInstanceOf[TileLayer]
  }
  
  extension [Self <: TileLayer](x: Self) {
    
    inline def setOptions(value: TileLayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
