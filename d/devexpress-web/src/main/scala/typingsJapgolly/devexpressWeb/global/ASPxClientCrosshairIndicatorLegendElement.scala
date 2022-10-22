package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CrosshairIndicatorLegendElement class's client-side equivalent.
  */
@JSGlobal("ASPxClientCrosshairIndicatorLegendElement")
@js.native
open class ASPxClientCrosshairIndicatorLegendElement ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientCrosshairIndicatorLegendElement {
  
  /**
    * Provides access to the crosshair axis label element to custom draw the crosshair.
    */
  /* CompleteClass */
  var AxisLabelElement: typingsJapgolly.devexpressWeb.ASPxClientCrosshairAxisLabelElement = js.native
  
  /**
    * Returns the Indicator whose point the legend element displays.
    */
  /* CompleteClass */
  var Indicator: typingsJapgolly.devexpressWeb.ASPxClientIndicator = js.native
  
  /**
    * Returns the Crosshair Cursor's line element to custom draw the crosshair.
    */
  /* CompleteClass */
  var LineElement: typingsJapgolly.devexpressWeb.ASPxClientCrosshairLineElement = js.native
  
  /**
    * Returns the series or indicator point for which the Crosshair Cursor creates this element.
    */
  /* CompleteClass */
  var Point: typingsJapgolly.devexpressWeb.ASPxClientSeriesPoint = js.native
  
  /**
    * Returns the value that specifies whether the crosshair legend element is visible.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
