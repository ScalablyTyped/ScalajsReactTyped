package typingsJapgolly.cathoQuantum

import typingsJapgolly.cathoQuantum.anon.BaseFontSize
import typingsJapgolly.cathoQuantum.anon.Content
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("@catho/quantum/Accordion", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AccordionProps, js.Object, Any]
  
  type Accordion = japgolly.scalajs.react.facade.React.Component[AccordionProps & js.Object, js.Object]
  
  trait AccordionProps extends StObject {
    
    var items: js.Array[Content]
    
    var keepOnlyOneOpen: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[BaseFontSize] = js.undefined
  }
  object AccordionProps {
    
    inline def apply(items: js.Array[Content]): AccordionProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionProps]
    }
    
    extension [Self <: AccordionProps](x: Self) {
      
      inline def setItems(value: js.Array[Content]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Content*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKeepOnlyOneOpen(value: Boolean): Self = StObject.set(x, "keepOnlyOneOpen", value.asInstanceOf[js.Any])
      
      inline def setKeepOnlyOneOpenUndefined: Self = StObject.set(x, "keepOnlyOneOpen", js.undefined)
      
      inline def setTheme(value: BaseFontSize): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
