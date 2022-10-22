package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesVerticalTabsItemMod.VerticalTabsItemProps
import typingsJapgolly.wixStyleReact.distTypesVerticalTabsItemMod.VerticalTabsItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VerticalTabsItem {
  
  @JSImport("wix-style-react", "VerticalTabsItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.VerticalTabsItem] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def id(value: Double): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def prefixIcon(value: VdomElement): this.type = set("prefixIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def suffixIcon(value: VdomElement): this.type = set("suffixIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def `type`(value: VerticalTabsItemType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VerticalTabsItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VerticalTabsItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
