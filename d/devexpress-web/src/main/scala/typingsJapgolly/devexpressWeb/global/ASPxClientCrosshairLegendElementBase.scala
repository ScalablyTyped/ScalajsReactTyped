package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for elements the Crosshair Cursor displays in the legend.
  */
@JSGlobal("ASPxClientCrosshairLegendElementBase")
@js.native
open class ASPxClientCrosshairLegendElementBase ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientCrosshairLegendElementBase {
  
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
    * Returns the value that specifies whether the crosshair legend element is visible.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
