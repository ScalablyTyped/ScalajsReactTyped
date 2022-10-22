package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.BackgroundPosition
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.baseuiStrings.trailing
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledImage {
  
  inline def apply[C /* <: ElementType */](
    $backgroundPosition: String,
    $imageLayout: /* keyof baseui.anon.Readonlyreadonlytoptoprea */ top | trailing,
    $src: String
  ): Builder[C] = {
    val __props = js.Dynamic.literal($backgroundPosition = $backgroundPosition.asInstanceOf[js.Any], $imageLayout = $imageLayout.asInstanceOf[js.Any], $src = $src.asInstanceOf[js.Any])
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, BackgroundPosition])]))
  }
  
  @JSImport("baseui/message-card", "StyledImage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[BackgroundPosition, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: BackgroundPosition => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, BackgroundPosition])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
