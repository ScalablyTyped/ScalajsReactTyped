package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.DefaultComponentD
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expansionPanelSummaryExpansionPanelSummaryMod extends Shortcut {
  
  /**
    * ⚠️ The ExpansionPanelSummary component was renamed to AccordionSummary to use a more common naming convention.
    *
    * You should use `import { AccordionSummary } from '@material-ui/core'`
    * or `import AccordionSummary from '@material-ui/core/AccordionSummary'`.
    * API:
    *
    * - [ExpansionPanelSummary API](https://mui.com/api/expansion-panel-summary/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/ExpansionPanelSummary/ExpansionPanelSummary", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[ExpansionPanelSummaryTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.expanded
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focused
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.content
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.expandIcon
  */
  trait ExpansionPanelSummaryClassKey extends StObject
  object ExpansionPanelSummaryClassKey {
    
    inline def content: typingsJapgolly.materialUiCore.materialUiCoreStrings.content = "content".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.content]
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def expandIcon: typingsJapgolly.materialUiCore.materialUiCoreStrings.expandIcon = "expandIcon".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.expandIcon]
    
    inline def expanded: typingsJapgolly.materialUiCore.materialUiCoreStrings.expanded = "expanded".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.expanded]
    
    inline def focused: typingsJapgolly.materialUiCore.materialUiCoreStrings.focused = "focused".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focused]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type ExpansionPanelSummaryProps[D /* <: ElementType */, P] = OverrideProps[ExpansionPanelSummaryTypeMap[P, D], D]
  
  type ExpansionPanelSummaryTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[DefaultComponentD[P, D]]
  
  type _To = ExtendButtonBase[ExpansionPanelSummaryTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `expansionPanelSummaryExpansionPanelSummaryMod.foo` */
  override def _to: ExtendButtonBase[ExpansionPanelSummaryTypeMap[js.Object, div]] = default
}
