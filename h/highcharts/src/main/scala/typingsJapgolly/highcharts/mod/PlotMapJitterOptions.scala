package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMapJitterOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) The maximal X offset for the random jitter
    * effect.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock) The maximal Y offset for the random jitter
    * effect.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object PlotMapJitterOptions {
  
  inline def apply(): PlotMapJitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMapJitterOptions]
  }
  
  extension [Self <: PlotMapJitterOptions](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
