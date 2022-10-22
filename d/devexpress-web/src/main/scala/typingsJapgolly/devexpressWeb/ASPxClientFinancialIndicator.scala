package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the FinancialIndicator class.
  */
trait ASPxClientFinancialIndicator
  extends StObject
     with ASPxClientIndicator {
  
  /**
    * Gets the first point of the financial indicator.
    */
  var point1: ASPxClientFinancialIndicatorPoint
  
  /**
    * Gets the second point of the financial indicator.
    */
  var point2: ASPxClientFinancialIndicatorPoint
}
object ASPxClientFinancialIndicator {
  
  inline def apply(
    chart: ASPxClientWebChart,
    name: String,
    point1: ASPxClientFinancialIndicatorPoint,
    point2: ASPxClientFinancialIndicatorPoint,
    series: ASPxClientSeries
  ): ASPxClientFinancialIndicator = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], point1 = point1.asInstanceOf[js.Any], point2 = point2.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFinancialIndicator]
  }
  
  extension [Self <: ASPxClientFinancialIndicator](x: Self) {
    
    inline def setPoint1(value: ASPxClientFinancialIndicatorPoint): Self = StObject.set(x, "point1", value.asInstanceOf[js.Any])
    
    inline def setPoint2(value: ASPxClientFinancialIndicatorPoint): Self = StObject.set(x, "point2", value.asInstanceOf[js.Any])
  }
}
