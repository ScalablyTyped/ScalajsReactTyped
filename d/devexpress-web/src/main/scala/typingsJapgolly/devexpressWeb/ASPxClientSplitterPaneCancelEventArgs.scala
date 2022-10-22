package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for a splitter control's cancelable client events concerning manipulations with a pane.
  */
trait ASPxClientSplitterPaneCancelEventArgs
  extends StObject
     with ASPxClientSplitterPaneEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
}
object ASPxClientSplitterPaneCancelEventArgs {
  
  inline def apply(cancel: Boolean, pane: ASPxClientSplitterPane): ASPxClientSplitterPaneCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSplitterPaneCancelEventArgs]
  }
  
  extension [Self <: ASPxClientSplitterPaneCancelEventArgs](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
