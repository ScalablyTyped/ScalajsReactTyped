package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the MovingAverage class.
  */
@JSGlobal("ASPxClientMovingAverage")
@js.native
open class ASPxClientMovingAverage ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientMovingAverage {
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typingsJapgolly.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Gets a value specifying the Envelope percent.
    */
  /* CompleteClass */
  var envelopePercent: Double = js.native
  
  /**
    * Gets a value specifying whether to display a Moving Average, Envelope, or both.
    */
  /* CompleteClass */
  var kind: String = js.native
  
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the number of data points used to calculate the moving average.
    */
  /* CompleteClass */
  var pointsCount: Double = js.native
  
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  var series: typingsJapgolly.devexpressWeb.ASPxClientSeries = js.native
  
  /**
    * Gets a value specifying the value level to which the single-level indicator corresponds.
    */
  /* CompleteClass */
  var valueLevel: String = js.native
}
