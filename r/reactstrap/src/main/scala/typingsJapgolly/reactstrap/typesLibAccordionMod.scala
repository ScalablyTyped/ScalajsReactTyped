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

object typesLibAccordionMod {
  
  @JSImport("reactstrap/types/lib/Accordion", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AccordionProps, js.Object, Any]
  
  type Accordion = japgolly.scalajs.react.facade.React.Component[AccordionProps & js.Object, js.Object]
  
  trait AccordionProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var flush: js.UndefOr[Boolean] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var open: String | js.Array[String]
    
    var tag: js.UndefOr[ElementType] = js.undefined
  }
  object AccordionProps {
    
    inline def apply(open: String | js.Array[String]): AccordionProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionProps]
    }
    
    extension [Self <: AccordionProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setFlush(value: Boolean): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setOpen(value: String | js.Array[String]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenVarargs(value: String*): Self = StObject.set(x, "open", js.Array(value*))
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait UncontrolledAccordionProps
    extends StObject
       with AccordionProps {
    
    var defaultOpen: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var stayOpen: js.UndefOr[Boolean] = js.undefined
  }
  object UncontrolledAccordionProps {
    
    inline def apply(open: String | js.Array[String]): UncontrolledAccordionProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[UncontrolledAccordionProps]
    }
    
    extension [Self <: UncontrolledAccordionProps](x: Self) {
      
      inline def setDefaultOpen(value: String | js.Array[String]): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDefaultOpenVarargs(value: String*): Self = StObject.set(x, "defaultOpen", js.Array(value*))
      
      inline def setStayOpen(value: Boolean): Self = StObject.set(x, "stayOpen", value.asInstanceOf[js.Any])
      
      inline def setStayOpenUndefined: Self = StObject.set(x, "stayOpen", js.undefined)
    }
  }
}
