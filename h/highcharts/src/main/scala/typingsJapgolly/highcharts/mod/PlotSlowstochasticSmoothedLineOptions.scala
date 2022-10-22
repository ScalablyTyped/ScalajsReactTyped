package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSlowstochasticSmoothedLineOptions extends StObject {
  
  /**
    * (Highstock) Styles for a smoothed line.
    */
  var styles: js.UndefOr[PlotSlowstochasticSmoothedLineStylesOptions] = js.undefined
}
object PlotSlowstochasticSmoothedLineOptions {
  
  inline def apply(): PlotSlowstochasticSmoothedLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSlowstochasticSmoothedLineOptions]
  }
  
  extension [Self <: PlotSlowstochasticSmoothedLineOptions](x: Self) {
    
    inline def setStyles(value: PlotSlowstochasticSmoothedLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
