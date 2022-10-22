package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISplitButton
  extends StObject
     with typingsJapgolly.extjs.Ext.button.IButton {
  
  /** [Config Option] (Function) */
  var arrowHandler: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var arrowTooltip: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets this button s arrow click handler
    * @param handler Function The function to call when the arrow is clicked.
    * @param scope Object Scope for the function passed above.
    */
  var setArrowHandler: js.UndefOr[js.Function2[/* handler */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
}
object ISplitButton {
  
  inline def apply(): ISplitButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISplitButton]
  }
  
  extension [Self <: ISplitButton](x: Self) {
    
    inline def setArrowHandler(value: Any): Self = StObject.set(x, "arrowHandler", value.asInstanceOf[js.Any])
    
    inline def setArrowHandlerUndefined: Self = StObject.set(x, "arrowHandler", js.undefined)
    
    inline def setArrowTooltip(value: java.lang.String): Self = StObject.set(x, "arrowTooltip", value.asInstanceOf[js.Any])
    
    inline def setArrowTooltipUndefined: Self = StObject.set(x, "arrowTooltip", js.undefined)
    
    inline def setSetArrowHandler(value: (/* handler */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "setArrowHandler", js.Any.fromFunction2((t0: /* handler */ js.UndefOr[Any], t1: /* scope */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setSetArrowHandlerUndefined: Self = StObject.set(x, "setArrowHandler", js.undefined)
  }
}
