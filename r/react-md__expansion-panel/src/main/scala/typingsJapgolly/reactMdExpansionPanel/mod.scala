package typingsJapgolly.reactMdExpansionPanel

import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdExpansionPanel.typesExpansionListMod.ExpansionListProps
import typingsJapgolly.reactMdExpansionPanel.typesExpansionPanelHeaderMod.ExpansionPanelHeaderProps
import typingsJapgolly.reactMdExpansionPanel.typesExpansionPanelMod.ExpansionPanelProps
import typingsJapgolly.reactMdExpansionPanel.typesUsePanelsMod.ReturnValue
import typingsJapgolly.reactMdExpansionPanel.typesUsePanelsMod.UsePanelsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/expansion-panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/expansion-panel", "ExpansionList")
  @js.native
  val ExpansionList: ForwardRefExoticComponent[ExpansionListProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/expansion-panel", "ExpansionPanel")
  @js.native
  val ExpansionPanel: ForwardRefExoticComponent[ExpansionPanelProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/expansion-panel", "ExpansionPanelHeader")
  @js.native
  val ExpansionPanelHeader: ForwardRefExoticComponent[ExpansionPanelHeaderProps & RefAttributes[HTMLButtonElement]] = js.native
  
  inline def usePanels(hasIdPrefixCountMultiplePreventAllClosedDefaultExpandedIndex: UsePanelsOptions): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("usePanels")(hasIdPrefixCountMultiplePreventAllClosedDefaultExpandedIndex.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
}
