package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the FibonacciIndicator class.
  */
@JSGlobal("ASPxClientFibonacciIndicator")
@js.native
open class ASPxClientFibonacciIndicator ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientFinancialIndicator {
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typingsJapgolly.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the first point of the financial indicator.
    */
  /* CompleteClass */
  var point1: typingsJapgolly.devexpressWeb.ASPxClientFinancialIndicatorPoint = js.native
  
  /**
    * Gets the second point of the financial indicator.
    */
  /* CompleteClass */
  var point2: typingsJapgolly.devexpressWeb.ASPxClientFinancialIndicatorPoint = js.native
  
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  var series: typingsJapgolly.devexpressWeb.ASPxClientSeries = js.native
}
