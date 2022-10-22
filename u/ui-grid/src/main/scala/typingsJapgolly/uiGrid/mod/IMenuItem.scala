package typingsJapgolly.uiGrid.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IAngularEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMenuItem extends StObject {
  
  /** the method to call when the menu is clicked */
  var action: js.UndefOr[js.Function1[/* $event */ IAngularEvent, Unit]] = js.undefined
  
  /** a function to evaluate to determine whether or not the item is currently selected */
  var active: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** context to pass to the action function, available in this.context in your handler */
  var context: js.UndefOr[Any] = js.undefined
  
  /** the icon shown alongside that title */
  var icon: js.UndefOr[String] = js.undefined
  
  /** if set to true, the menu should stay open after the action, defaults to false */
  var leaveOpen: js.UndefOr[Boolean] = js.undefined
  
  /** a function to evaluate to determine whether or not to show the item */
  var shown: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** controls the title that is displayed in the menu */
  var title: js.UndefOr[String] = js.undefined
}
object IMenuItem {
  
  inline def apply(): IMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenuItem]
  }
  
  extension [Self <: IMenuItem](x: Self) {
    
    inline def setAction(value: /* $event */ IAngularEvent => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: /* $event */ IAngularEvent) => value(t0).runNow()))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "active", value.toJsFn)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLeaveOpen(value: Boolean): Self = StObject.set(x, "leaveOpen", value.asInstanceOf[js.Any])
    
    inline def setLeaveOpenUndefined: Self = StObject.set(x, "leaveOpen", js.undefined)
    
    inline def setShown(value: CallbackTo[Boolean]): Self = StObject.set(x, "shown", value.toJsFn)
    
    inline def setShownUndefined: Self = StObject.set(x, "shown", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
