package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.baseui.accordionTypesMod.AccordionProps
import typingsJapgolly.baseui.accordionTypesMod.AccordionState
import typingsJapgolly.baseui.accordionTypesMod.StateChangeType
import typingsJapgolly.baseui.anon.Expanded
import typingsJapgolly.baseui.anon.PartialAccordionProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionAccordionMod {
  
  @JSImport("baseui/accordion/accordion", JSImport.Default)
  @js.native
  open class default () extends Accordion
  /* static members */
  object default {
    
    @JSImport("baseui/accordion/accordion", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/accordion/accordion", "default.defaultProps")
    @js.native
    def defaultProps: PartialAccordionProps = js.native
    inline def defaultProps_=(x: PartialAccordionProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Accordion extends Component[AccordionProps, AccordionState, Any] {
    
    def getItems(): Any = js.native
    
    def handleKeyDown(e: KeyboardEvent): Unit = js.native
    
    def internalSetState(`type`: StateChangeType, changes: AccordionState): Unit = js.native
    
    var itemRefs: js.Array[RefHandle[HTMLDivElement]] = js.native
    
    def onPanelChange(key: Key, onChange: js.Function1[/* repeated */ Any, js.Object], args: Any*): Unit = js.native
    
    @JSName("state")
    var state_Accordion: Expanded = js.native
  }
}
