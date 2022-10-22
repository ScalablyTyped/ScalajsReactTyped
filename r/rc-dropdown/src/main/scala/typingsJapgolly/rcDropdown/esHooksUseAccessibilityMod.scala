package typingsJapgolly.rcDropdown

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseAccessibilityMod {
  
  @JSImport("rc-dropdown/es/hooks/useAccessibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasVisibleSetTriggerVisibleTriggerRefOnVisibleChangeAutoFocus: UseAccessibilityProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasVisibleSetTriggerVisibleTriggerRefOnVisibleChangeAutoFocus.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait UseAccessibilityProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    def setTriggerVisible(visible: Boolean): Unit
    
    var triggerRef: RefHandle[Any]
    
    var visible: Boolean
  }
  object UseAccessibilityProps {
    
    inline def apply(setTriggerVisible: Boolean => Callback, triggerRef: RefHandle[Any], visible: Boolean): UseAccessibilityProps = {
      val __obj = js.Dynamic.literal(setTriggerVisible = js.Any.fromFunction1((t0: Boolean) => setTriggerVisible(t0).runNow()), triggerRef = triggerRef.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseAccessibilityProps]
    }
    
    extension [Self <: UseAccessibilityProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setSetTriggerVisible(value: Boolean => Callback): Self = StObject.set(x, "setTriggerVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setTriggerRef(value: RefHandle[Any]): Self = StObject.set(x, "triggerRef", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
