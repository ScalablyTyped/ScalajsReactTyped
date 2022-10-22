package typingsJapgolly.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalBarSeriesProps
  extends StObject
     with AbstractSeriesProps[HorizontalBarSeriesPoint] {
  
  var barWidth: Double
}
object HorizontalBarSeriesProps {
  
  inline def apply(barWidth: Double): HorizontalBarSeriesProps = {
    val __obj = js.Dynamic.literal(barWidth = barWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalBarSeriesProps]
  }
  
  extension [Self <: HorizontalBarSeriesProps](x: Self) {
    
    inline def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
  }
}
