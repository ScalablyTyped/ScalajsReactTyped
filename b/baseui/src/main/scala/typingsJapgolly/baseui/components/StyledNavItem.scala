package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.SharedPropsitemanyundefin
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledNavItem {
  
  inline def apply[C /* <: ElementType */]($active: Boolean, $disabled: Boolean, $level: Double, $selectable: Boolean): Builder[C] = {
    val __props = js.Dynamic.literal($active = $active.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $level = $level.asInstanceOf[js.Any], $selectable = $selectable.asInstanceOf[js.Any])
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedPropsitemanyundefin])]))
  }
  
  @JSImport("baseui/side-navigation", "StyledNavItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[SharedPropsitemanyundefin, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: SharedPropsitemanyundefin => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def item(value: Any): this.type = set("item", value.asInstanceOf[js.Any])
  }
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedPropsitemanyundefin])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
