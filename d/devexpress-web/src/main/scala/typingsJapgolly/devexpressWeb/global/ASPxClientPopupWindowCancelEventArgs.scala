package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the popup control's cancellable client events, such as the ASPxClientPopupControlBase.Closing.
  */
@JSGlobal("ASPxClientPopupWindowCancelEventArgs")
@js.native
open class ASPxClientPopupWindowCancelEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientPopupWindowCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowCancelEventArgs class with the specified settings.
    * @param window An ASPxClientPopupWindow object that is a popup window related to the generated event.
    * @param closeReason One of the ASPxClientPopupControlCloseReason enumeration values that specifies the reason the popup window is about to close.
    */
  def this(
    window: typingsJapgolly.devexpressWeb.ASPxClientPopupWindow,
    closeReason: typingsJapgolly.devexpressWeb.ASPxClientPopupControlCloseReason
  ) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the value that identifies the reason the popup window is about to close.
    */
  /* CompleteClass */
  var closeReason: typingsJapgolly.devexpressWeb.ASPxClientPopupControlCloseReason = js.native
  
  /**
    * Gets the popup window object related to the event.
    */
  /* CompleteClass */
  var window: typingsJapgolly.devexpressWeb.ASPxClientPopupWindow = js.native
}
