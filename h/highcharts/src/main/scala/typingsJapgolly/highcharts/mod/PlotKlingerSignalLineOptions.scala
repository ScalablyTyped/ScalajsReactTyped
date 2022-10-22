package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotKlingerSignalLineOptions extends StObject {
  
  /**
    * (Highstock) Styles for a signal line.
    */
  var styles: js.UndefOr[PlotKlingerSignalLineStylesOptions] = js.undefined
}
object PlotKlingerSignalLineOptions {
  
  inline def apply(): PlotKlingerSignalLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotKlingerSignalLineOptions]
  }
  
  extension [Self <: PlotKlingerSignalLineOptions](x: Self) {
    
    inline def setStyles(value: PlotKlingerSignalLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
