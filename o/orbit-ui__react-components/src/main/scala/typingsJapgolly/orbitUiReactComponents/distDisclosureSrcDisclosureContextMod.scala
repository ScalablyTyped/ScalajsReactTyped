package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisclosureSrcDisclosureContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/disclosure/src/DisclosureContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/disclosure/src/DisclosureContext", "DisclosureContext")
  @js.native
  val DisclosureContext: Context[DisclosureContextType] = js.native
  
  inline def useDisclosureContext(): DisclosureContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useDisclosureContext")().asInstanceOf[DisclosureContextType]
  
  trait DisclosureContextType extends StObject {
    
    var close: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
  }
  object DisclosureContextType {
    
    inline def apply(): DisclosureContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisclosureContextType]
    }
    
    extension [Self <: DisclosureContextType](x: Self) {
      
      inline def setClose(value: /* event */ ReactEventFrom[Element] => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[Element]) => value(t0).runNow()))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    }
  }
}
