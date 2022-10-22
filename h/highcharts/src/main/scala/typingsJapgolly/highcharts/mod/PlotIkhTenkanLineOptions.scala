package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotIkhTenkanLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotIkhTenkanLineStylesOptions] = js.undefined
}
object PlotIkhTenkanLineOptions {
  
  inline def apply(): PlotIkhTenkanLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhTenkanLineOptions]
  }
  
  extension [Self <: PlotIkhTenkanLineOptions](x: Self) {
    
    inline def setStyles(value: PlotIkhTenkanLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
