package typingsJapgolly.kendoUi.kendo.dataviz.map

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BingLayer
  extends StObject
     with TileLayer {
  
  def imagerySet(): Unit
  
  @JSName("options")
  var options_BingLayer: BingLayerOptions
}
object BingLayer {
  
  inline def apply(hide: Callback, imagerySet: Callback, map: Map, options: BingLayerOptions, show: Callback): BingLayer = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, imagerySet = imagerySet.toJsFn, map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = show.toJsFn)
    __obj.asInstanceOf[BingLayer]
  }
  
  extension [Self <: BingLayer](x: Self) {
    
    inline def setImagerySet(value: Callback): Self = StObject.set(x, "imagerySet", value.toJsFn)
    
    inline def setOptions(value: BingLayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
