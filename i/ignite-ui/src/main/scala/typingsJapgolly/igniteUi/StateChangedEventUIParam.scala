package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateChangedEventUIParam extends StObject {
  
  /**
    * Gets the name of the action. That can be one of the following: "open" - the dialog was opened. Note: the event is raised before a possible "openAnimation" started. "close" - the dialog was closed. Note: the event is raised before a possible "closeAnimation" started. "minimize" - the dialog was minimized. "maximize" - the dialog was maximized. "restore" - the dialog was restored from minimized or maximized state. "pin" - the dialog was pinned. "unpin" - the dialog was unpinned.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the name of the button, which triggered the event. Note: if the state was modified from the code, then "button" is undefined.
    */
  var button: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the boolean value of the old pin state of the dialog.
    */
  var oldPinned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the old state of the dialog, which can be one of the following: "opened", "minimized", "maximized", "closed".
    */
  var oldState: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the igDialog widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object StateChangedEventUIParam {
  
  inline def apply(): StateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateChangedEventUIParam]
  }
  
  extension [Self <: StateChangedEventUIParam](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setOldPinned(value: Boolean): Self = StObject.set(x, "oldPinned", value.asInstanceOf[js.Any])
    
    inline def setOldPinnedUndefined: Self = StObject.set(x, "oldPinned", js.undefined)
    
    inline def setOldState(value: String): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
    inline def setOldStateUndefined: Self = StObject.set(x, "oldState", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
