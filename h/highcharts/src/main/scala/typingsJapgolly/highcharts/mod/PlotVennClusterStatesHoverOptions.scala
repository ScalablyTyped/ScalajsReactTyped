package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotVennClusterStatesHoverOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) The fill color of the cluster marker in hover
    * state. When `undefined`, the series' or point's fillColor for normal
    * state is used.
    */
  var fillColor: js.UndefOr[ColorType] = js.undefined
}
object PlotVennClusterStatesHoverOptions {
  
  inline def apply(): PlotVennClusterStatesHoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVennClusterStatesHoverOptions]
  }
  
  extension [Self <: PlotVennClusterStatesHoverOptions](x: Self) {
    
    inline def setFillColor(value: ColorType): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
  }
}
