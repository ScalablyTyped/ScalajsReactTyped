package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.Animating
import typingsJapgolly.baseui.snackbarTypesMod.Placement
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledPlacementContainer {
  
  inline def apply[C /* <: ElementType */]($animating: Boolean, $placement: Placement, $translateHeight: Double): Builder[C] = {
    val __props = js.Dynamic.literal($animating = $animating.asInstanceOf[js.Any], $placement = $placement.asInstanceOf[js.Any], $translateHeight = $translateHeight.asInstanceOf[js.Any])
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, Animating])]))
  }
  
  @JSImport("baseui/snackbar", "StyledPlacementContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[Animating, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: Animating => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, Animating])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
