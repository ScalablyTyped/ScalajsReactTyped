package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAccordionSrcAccordionContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src/AccordionContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src/AccordionContext", "AccordionContext")
  @js.native
  val AccordionContext: Context[AccordionContextType] = js.native
  
  inline def useAccordionContext(): AccordionContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useAccordionContext")().asInstanceOf[AccordionContextType]
  
  trait AccordionContextType extends StObject {
    
    var expandedKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var onToggle: js.UndefOr[js.Function2[/* event */ ReactEventFrom[Element], /* toggledKey */ String, Unit]] = js.undefined
  }
  object AccordionContextType {
    
    inline def apply(): AccordionContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionContextType]
    }
    
    extension [Self <: AccordionContextType](x: Self) {
      
      inline def setExpandedKeys(value: js.Array[String]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setExpandedKeysVarargs(value: String*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
      
      inline def setOnToggle(value: (/* event */ ReactEventFrom[Element], /* toggledKey */ String) => Callback): Self = StObject.set(x, "onToggle", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* toggledKey */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    }
  }
}
