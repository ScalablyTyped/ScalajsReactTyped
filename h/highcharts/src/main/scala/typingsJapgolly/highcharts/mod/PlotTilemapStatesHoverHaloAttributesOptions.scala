package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTilemapStatesHoverHaloAttributesOptions extends StObject {
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object PlotTilemapStatesHoverHaloAttributesOptions {
  
  inline def apply(): PlotTilemapStatesHoverHaloAttributesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTilemapStatesHoverHaloAttributesOptions]
  }
  
  extension [Self <: PlotTilemapStatesHoverHaloAttributesOptions](x: Self) {
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
