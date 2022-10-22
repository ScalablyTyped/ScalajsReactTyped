package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ChartElementNamed class.
  */
trait ASPxClientWebChartElementNamed
  extends StObject
     with ASPxClientWebChartElement {
  
  /**
    * Gets the name of the chart element.
    */
  var name: String
}
object ASPxClientWebChartElementNamed {
  
  inline def apply(chart: ASPxClientWebChart, name: String): ASPxClientWebChartElementNamed = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartElementNamed]
  }
  
  extension [Self <: ASPxClientWebChartElementNamed](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
