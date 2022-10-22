package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Path to the pattern image
    * required by VML browsers in order to draw radial gradients.
    */
  var VMLRadialGradientURL: js.UndefOr[String] = js.undefined
}
object GlobalOptions {
  
  inline def apply(): GlobalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalOptions]
  }
  
  extension [Self <: GlobalOptions](x: Self) {
    
    inline def setVMLRadialGradientURL(value: String): Self = StObject.set(x, "VMLRadialGradientURL", value.asInstanceOf[js.Any])
    
    inline def setVMLRadialGradientURLUndefined: Self = StObject.set(x, "VMLRadialGradientURL", js.undefined)
  }
}
