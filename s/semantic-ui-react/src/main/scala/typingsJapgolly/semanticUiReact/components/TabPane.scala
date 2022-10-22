package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsModulesTabTabPaneMod.TabPaneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPane {
  
  @JSImport("semantic-ui-react", "TabPane")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TabPane.type): SharedBuilder_TabPaneProps33467167 = new SharedBuilder_TabPaneProps33467167(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabPaneProps): SharedBuilder_TabPaneProps33467167 = new SharedBuilder_TabPaneProps33467167(js.Array(this.component, p.asInstanceOf[js.Any]))
}
