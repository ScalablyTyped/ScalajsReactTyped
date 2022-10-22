package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.HorizontalOffset
import typingsJapgolly.baseui.badgeTypesMod.Placement
import typingsJapgolly.baseui.badgeTypesMod.Role
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledPositioner {
  
  inline def apply[C /* <: ElementType */]($placement: Placement, $role: Role): Builder[C] = {
    val __props = js.Dynamic.literal($placement = $placement.asInstanceOf[js.Any], $role = $role.asInstanceOf[js.Any])
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, HorizontalOffset])]))
  }
  
  @JSImport("baseui/badge", "StyledPositioner")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $horizontalOffset(value: String): this.type = set("$horizontalOffset", value.asInstanceOf[js.Any])
    
    inline def $horizontalOffsetNull: this.type = set("$horizontalOffset", null)
    
    inline def $style(value: StyleObject | (js.Function1[HorizontalOffset, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: HorizontalOffset => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def $verticalOffset(value: String): this.type = set("$verticalOffset", value.asInstanceOf[js.Any])
    
    inline def $verticalOffsetNull: this.type = set("$verticalOffset", null)
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, HorizontalOffset])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
