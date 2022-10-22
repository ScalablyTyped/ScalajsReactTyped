package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.libAvatarListAvatarItemMod.SizeType
import typingsJapgolly.antDesignPro.libAvatarListMod.AvatarListProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AvatarList {
  
  inline def apply(children: Element | js.Array[Element]): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AvatarListProps]))
  }
  
  @JSImport("ant-design-pro", "AvatarList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.mod.AvatarList] {
    
    inline def Item(value: VdomElement): this.type = set("Item", value.rawElement.asInstanceOf[js.Any])
    
    inline def excessItemsStyle(value: CSSProperties): this.type = set("excessItemsStyle", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
