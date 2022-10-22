package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.ColorHeight
import typingsJapgolly.baseui.mapMarkerTypesMod.PinHeadSize
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledContentItem {
  
  inline def apply[C /* <: ElementType */]($color: String, $height: Double, $size: PinHeadSize): Builder[C] = {
    val __props = js.Dynamic.literal($color = $color.asInstanceOf[js.Any], $height = $height.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, ColorHeight])]))
  }
  
  @JSImport("baseui/map-marker/styled-components", "StyledContentItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[ColorHeight, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: ColorHeight => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, ColorHeight])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
