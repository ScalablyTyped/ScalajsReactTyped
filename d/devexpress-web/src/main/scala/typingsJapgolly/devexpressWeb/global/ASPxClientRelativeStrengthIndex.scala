package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the RelativeStrengthIndex class.
  */
@JSGlobal("ASPxClientRelativeStrengthIndex")
@js.native
open class ASPxClientRelativeStrengthIndex ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientRelativeStrengthIndex {
  
  /**
    * Returns the name of the Y-axis that is used to plot the current indicator on a ASPxClientXYDiagram.
    */
  /* CompleteClass */
  var axisY: String = js.native
  
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
    * Returns the name of a pane, used to plot the separate pane indicator on an XYDiagram.
    */
  /* CompleteClass */
  var pane: String = js.native
  
  /**
    * Gets the number of data points used to calculate the indicator values.
    */
  /* CompleteClass */
  var pointsCount: Double = js.native
  
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  var series: typingsJapgolly.devexpressWeb.ASPxClientSeries = js.native
  
  /**
    * Gets a value, indicating whose series point values are used to calculate the indicator's values.
    */
  /* CompleteClass */
  var valueLevel: String = js.native
}
