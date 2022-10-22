package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsElementsListListItemMod.ListItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  @JSImport("semantic-ui-react", "ListItem")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ListItem.type): SharedBuilder_ListItemProps_1291039995 = new SharedBuilder_ListItemProps_1291039995(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemProps): SharedBuilder_ListItemProps_1291039995 = new SharedBuilder_ListItemProps_1291039995(js.Array(this.component, p.asInstanceOf[js.Any]))
}
