package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for a chart control's ASPxClientWebChartControl.CustomDrawCrosshair event.
  */
@JSGlobal("ASPxClientWebChartControlCustomDrawCrosshairEventArgs")
@js.native
open class ASPxClientWebChartControlCustomDrawCrosshairEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientWebChartControlCustomDrawCrosshairEventArgs {
  /**
    * Initializes a new object of the ASPxClientWebChartControlCustomDrawCrosshairEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param cursorCrosshairAxisLabelElements An array of ASPxClientCrosshairAxisLabelElement objects that contain the crosshair axis label elements for custom drawing a crosshair cursor.
    * @param cursorCrosshairLineElement An ASPxClientCrosshairLineElement object that contains the crosshair line element for custom drawing a crosshair cursor.
    * @param crosshairElementGroups An array of ASPxClientCrosshairElementGroup objects that contain crosshair element groups for custom drawing a crosshair cursor.
    * @param crosshairLegendElements An array of ASPxClientCrosshairLegendElement objects that contain crosshair legend elements for custom drawing a crosshair cursor.
    */
  def this(
    processOnServer: Boolean,
    cursorCrosshairAxisLabelElements: js.Array[typingsJapgolly.devexpressWeb.ASPxClientCrosshairAxisLabelElement],
    cursorCrosshairLineElement: typingsJapgolly.devexpressWeb.ASPxClientCrosshairLineElement,
    crosshairElementGroups: js.Array[typingsJapgolly.devexpressWeb.ASPxClientCrosshairElementGroup],
    crosshairLegendElements: js.Array[typingsJapgolly.devexpressWeb.ASPxClientCrosshairLegendElement]
  ) = this()
  
  /**
    * Provides access to the settings of crosshair elements and crosshair group header elements to customize their appearance.
    */
  /* CompleteClass */
  var crosshairElementGroups: js.Array[typingsJapgolly.devexpressWeb.ASPxClientCrosshairElementGroup] = js.native
  
  /** @deprecated This property is now obsolete. Use the crosshairElementGroup.CrosshairElements property instead. */
  /**
    * Returns crosshair elements settings to custom draw a crosshair cursor.
    */
  /* CompleteClass */
  var crosshairElements: js.Array[typingsJapgolly.devexpressWeb.ASPxClientCrosshairElement] = js.native
  
  /** @deprecated This property is now obsolete. Use the crosshairElementGroup.HeaderElement property instead. */
  /**
    * Returns the crosshair group header elements to customize their appearance.
    */
  /* CompleteClass */
  var crosshairGroupHeaderElements: js.Array[typingsJapgolly.devexpressWeb.ASPxClientCrosshairGroupHeaderElement] = js.native
  
  /**
    * Returns the array of indicator elements that the Crosshair Cursor displays in a legend.
    */
  /* CompleteClass */
  var crosshairIndicatorLegendElements: js.Array[typingsJapgolly.devexpressWeb.ASPxClientCrosshairIndicatorLegendElement] = js.native
  
  /**
    * Returns the crosshair legend elements to custom draw the Crosshair.
    */
  /* CompleteClass */
  var crosshairLegendElements: js.Array[typingsJapgolly.devexpressWeb.ASPxClientCrosshairLegendElement] = js.native
  
  /**
    * Returns the crosshair axis label elements to customize their appearance.
    */
  /* CompleteClass */
  var cursorCrosshairAxisLabelElements: js.Array[typingsJapgolly.devexpressWeb.ASPxClientCrosshairAxisLabelElement] = js.native
  
  /**
    * Gets crosshair line element settings that are used to custom draw a crosshair cursor.
    */
  /* CompleteClass */
  var cursorCrosshairLineElement: typingsJapgolly.devexpressWeb.ASPxClientCrosshairLineElement = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
