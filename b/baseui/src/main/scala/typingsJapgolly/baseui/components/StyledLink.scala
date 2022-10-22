package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.AnimateUnderline
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledLink {
  
  inline def apply[C /* <: ElementType */](): Builder[C] = {
    val __props = js.Dynamic.literal()
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, AnimateUnderline])]))
  }
  
  @JSImport("baseui/link", "StyledLink")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $isAnimateUnderline(value: Boolean): this.type = set("$isAnimateUnderline", value.asInstanceOf[js.Any])
    
    inline def $isFocusVisible(value: Boolean): this.type = set("$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[AnimateUnderline, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: AnimateUnderline => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def animateUnderline(value: Boolean): this.type = set("animateUnderline", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  implicit def make[C /* <: ElementType */](companion: StyledLink.type): Builder[C] = new Builder[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, AnimateUnderline])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
