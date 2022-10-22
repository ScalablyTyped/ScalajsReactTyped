package typingsJapgolly.antd.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.libListItemMod.ListItemMetaProps
import typingsJapgolly.antd.libListItemMod.ListItemProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  object Meta {
    
    @JSImport("antd/lib/list/Item", "default.Meta")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Meta.type): SharedBuilder_ListItemMetaProps1032327803 = new SharedBuilder_ListItemMetaProps1032327803(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ListItemMetaProps): SharedBuilder_ListItemMetaProps1032327803 = new SharedBuilder_ListItemMetaProps1032327803(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd/lib/list/Item", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Item.type): SharedBuilder_ListItemPropsRefAttributes_1011249451[HTMLElement] = new SharedBuilder_ListItemPropsRefAttributes_1011249451[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemProps & RefAttributes[HTMLElement]): SharedBuilder_ListItemPropsRefAttributes_1011249451[HTMLElement] = new SharedBuilder_ListItemPropsRefAttributes_1011249451[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
