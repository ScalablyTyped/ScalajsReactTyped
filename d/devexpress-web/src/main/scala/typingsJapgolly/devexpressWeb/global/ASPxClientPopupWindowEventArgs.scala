package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events concerning client manipulations on popup windows.
  */
@JSGlobal("ASPxClientPopupWindowEventArgs")
@js.native
open class ASPxClientPopupWindowEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientPopupWindowEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowEventArgs class.
    * @param window A ASPxClientPopupWindow object representing the popup window related to the generated event.
    */
  def this(window: typingsJapgolly.devexpressWeb.ASPxClientPopupWindow) = this()
  
  /**
    * Gets the popup window object related to the event.
    */
  /* CompleteClass */
  var window: typingsJapgolly.devexpressWeb.ASPxClientPopupWindow = js.native
}
