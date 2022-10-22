package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the CrosshairLegendElement class.
  */
@JSGlobal("ASPxClientCrosshairLegendElement")
@js.native
open class ASPxClientCrosshairLegendElement ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientCrosshairLegendElement {
  
  /**
    * Provides access to the crosshair axis label element to custom draw the crosshair.
    */
  /* CompleteClass */
  var AxisLabelElement: typingsJapgolly.devexpressWeb.ASPxClientCrosshairAxisLabelElement = js.native
  
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
    * Returns a series whose point the Crosshair Cursor legend element highlights.
    */
  /* CompleteClass */
  var Series: typingsJapgolly.devexpressWeb.ASPxClientSeries = js.native
  
  /**
    * Returns the value that specifies whether the crosshair legend element is visible.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
