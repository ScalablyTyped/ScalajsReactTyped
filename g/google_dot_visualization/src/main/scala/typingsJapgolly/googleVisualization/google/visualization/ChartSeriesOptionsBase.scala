package typingsJapgolly.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesOptionsBase extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object ChartSeriesOptionsBase {
  
  inline def apply(): ChartSeriesOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesOptionsBase]
  }
  
  extension [Self <: ChartSeriesOptionsBase](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
