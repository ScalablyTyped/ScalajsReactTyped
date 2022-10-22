package typingsJapgolly.kendoUi.kendo.dataviz.map

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeLayer
  extends StObject
     with Layer_ {
  
  @JSName("options")
  var options_ShapeLayer: ShapeLayerOptions
  
  def setDataSource(): Unit
}
object ShapeLayer {
  
  inline def apply(hide: Callback, map: Map, options: ShapeLayerOptions, setDataSource: Callback, show: Callback): ShapeLayer = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setDataSource = setDataSource.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[ShapeLayer]
  }
  
  extension [Self <: ShapeLayer](x: Self) {
    
    inline def setOptions(value: ShapeLayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSetDataSource(value: Callback): Self = StObject.set(x, "setDataSource", value.toJsFn)
  }
}
