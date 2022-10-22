package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemGroupMod.ItemGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ItemGroup {
  
  @JSImport("semantic-ui-react", "ItemGroup")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ItemGroup.type): SharedBuilder_ItemGroupProps238763249 = new SharedBuilder_ItemGroupProps238763249(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ItemGroupProps): SharedBuilder_ItemGroupProps238763249 = new SharedBuilder_ItemGroupProps238763249(js.Array(this.component, p.asInstanceOf[js.Any]))
}
