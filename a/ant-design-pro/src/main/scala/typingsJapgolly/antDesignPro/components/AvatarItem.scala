package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.libAvatarListAvatarItemMod.AvatarItemProps
import typingsJapgolly.antDesignPro.libAvatarListAvatarItemMod.SizeType
import typingsJapgolly.antDesignPro.libAvatarListAvatarItemMod.default
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AvatarItem {
  
  inline def apply(src: String): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AvatarItemProps]))
  }
  
  @JSImport("ant-design-pro/lib/AvatarList/AvatarItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def onClick(value: Callback): this.type = set("onClick", value.toJsFn)
    
    inline def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tips(value: VdomNode): this.type = set("tips", value.rawNode.asInstanceOf[js.Any])
    
    inline def tipsNull: this.type = set("tips", null)
    
    inline def tipsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("tips", js.Array(value*))
    
    inline def tipsVdomElement(value: VdomElement): this.type = set("tips", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
