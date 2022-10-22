package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events concerning client manipulations on popup windows.
  */
trait ASPxClientPopupWindowEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the popup window object related to the event.
    */
  var window: ASPxClientPopupWindow
}
object ASPxClientPopupWindowEventArgs {
  
  inline def apply(window: ASPxClientPopupWindow): ASPxClientPopupWindowEventArgs = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowEventArgs]
  }
  
  extension [Self <: ASPxClientPopupWindowEventArgs](x: Self) {
    
    inline def setWindow(value: ASPxClientPopupWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
