package typingsJapgolly.grommet

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsAccordionPanelMod {
  
  @JSImport("grommet/es6/components/AccordionPanel", "AccordionPanel")
  @js.native
  val AccordionPanel: FC[AccordionPanelExtendedProps] = js.native
  
  trait AccordionPanelExtendedProps
    extends StObject
       with AccordionPanelProps
       with ClassAttributes[HTMLDivElement]
       with HTMLAttributes[HTMLDivElement]
  object AccordionPanelExtendedProps {
    
    inline def apply(): AccordionPanelExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionPanelExtendedProps]
    }
  }
  
  trait AccordionPanelProps extends StObject {
    
    var header: js.UndefOr[Node] = js.undefined
    
    var label: js.UndefOr[String | Node] = js.undefined
  }
  object AccordionPanelProps {
    
    inline def apply(): AccordionPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionPanelProps]
    }
    
    extension [Self <: AccordionPanelProps](x: Self) {
      
      inline def setHeader(value: VdomNode): Self = StObject.set(x, "header", value.rawNode.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabel(value: String | Node): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type divType = DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
}
