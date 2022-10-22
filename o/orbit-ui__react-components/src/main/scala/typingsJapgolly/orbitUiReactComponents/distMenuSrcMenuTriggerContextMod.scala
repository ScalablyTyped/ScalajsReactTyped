package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMenuSrcMenuTriggerContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/MenuTriggerContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/MenuTriggerContext", "MenuTriggerContext")
  @js.native
  val MenuTriggerContext: Context[MenuTriggerContextType] = js.native
  
  inline def useMenuTriggerContext(): MenuTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuTriggerContext")().asInstanceOf[MenuTriggerContextType]
  
  trait MenuTriggerContextType extends StObject {
    
    var close: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var open: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[Element], /* focusTarget */ String, Unit]
      ] = js.undefined
  }
  object MenuTriggerContextType {
    
    inline def apply(): MenuTriggerContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuTriggerContextType]
    }
    
    extension [Self <: MenuTriggerContextType](x: Self) {
      
      inline def setClose(value: /* event */ ReactEventFrom[Element] => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[Element]) => value(t0).runNow()))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setOpen(value: (/* event */ ReactEventFrom[Element], /* focusTarget */ String) => Callback): Self = StObject.set(x, "open", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* focusTarget */ String) => (value(t0, t1)).runNow()))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
}
