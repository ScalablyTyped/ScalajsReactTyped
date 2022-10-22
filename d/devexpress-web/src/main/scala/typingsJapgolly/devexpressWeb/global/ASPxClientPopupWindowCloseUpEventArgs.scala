package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPopupControlBase.CloseUp event.
  */
@JSGlobal("ASPxClientPopupWindowCloseUpEventArgs")
@js.native
open class ASPxClientPopupWindowCloseUpEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientPopupWindowCloseUpEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowCloseUpEventArgs class with the specified settings.
    * @param window An ASPxClientPopupWindow object that is a popup window related to the generated event.
    * @param closeReason One of the ASPxClientPopupControlCloseReason enumeration values that specifies the reason the popup window closes.
    */
  def this(
    window: typingsJapgolly.devexpressWeb.ASPxClientPopupWindow,
    closeReason: typingsJapgolly.devexpressWeb.ASPxClientPopupControlCloseReason
  ) = this()
  
  /**
    * Gets the value that identifies the reason the popup window closes.
    */
  /* CompleteClass */
  var closeReason: typingsJapgolly.devexpressWeb.ASPxClientPopupControlCloseReason = js.native
  
  /**
    * Gets the popup window object related to the event.
    */
  /* CompleteClass */
  var window: typingsJapgolly.devexpressWeb.ASPxClientPopupWindow = js.native
}
