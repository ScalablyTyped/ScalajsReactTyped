package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Props
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionSummaryAccordionSummaryMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Accordion](https://mui.com/components/accordion/)
    *
    * API:
    *
    * - [AccordionSummary API](https://mui.com/api/accordion-summary/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/AccordionSummary/AccordionSummary", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[AccordionSummaryTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.expanded
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focused
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.content
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.expandIcon
  */
  trait AccordionSummaryClassKey extends StObject
  object AccordionSummaryClassKey {
    
    inline def content: typingsJapgolly.materialUiCore.materialUiCoreStrings.content = "content".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.content]
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def expandIcon: typingsJapgolly.materialUiCore.materialUiCoreStrings.expandIcon = "expandIcon".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.expandIcon]
    
    inline def expanded: typingsJapgolly.materialUiCore.materialUiCoreStrings.expanded = "expanded".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.expanded]
    
    inline def focusVisible: typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def focused: typingsJapgolly.materialUiCore.materialUiCoreStrings.focused = "focused".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focused]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type AccordionSummaryProps[D /* <: ElementType */, P] = OverrideProps[AccordionSummaryTypeMap[P, D], D]
  
  type AccordionSummaryTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[Props[P, D]]
  
  type _To = ExtendButtonBase[AccordionSummaryTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `accordionSummaryAccordionSummaryMod.foo` */
  override def _to: ExtendButtonBase[AccordionSummaryTypeMap[js.Object, div]] = default
}
