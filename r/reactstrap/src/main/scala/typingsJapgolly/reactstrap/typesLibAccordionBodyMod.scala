package typingsJapgolly.reactstrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibAccordionBodyMod {
  
  @JSImport("reactstrap/types/lib/AccordionBody", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AccordionBodyProps, js.Object, Any]
  
  type AccordionBody = japgolly.scalajs.react.facade.React.Component[AccordionBodyProps & js.Object, js.Object]
  
  trait AccordionBodyProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var accordionId: String
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
  }
  object AccordionBodyProps {
    
    inline def apply(accordionId: String): AccordionBodyProps = {
      val __obj = js.Dynamic.literal(accordionId = accordionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionBodyProps]
    }
    
    extension [Self <: AccordionBodyProps](x: Self) {
      
      inline def setAccordionId(value: String): Self = StObject.set(x, "accordionId", value.asInstanceOf[js.Any])
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
