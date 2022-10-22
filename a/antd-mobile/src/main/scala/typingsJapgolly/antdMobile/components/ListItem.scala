package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsListListItemMod.ListItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  @JSImport("antd-mobile/es/components/list/list-item", "ListItem")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ListItem.type): SharedBuilder_ListItemProps437040287 = new SharedBuilder_ListItemProps437040287(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemProps): SharedBuilder_ListItemProps437040287 = new SharedBuilder_ListItemProps437040287(js.Array(this.component, p.asInstanceOf[js.Any]))
}
