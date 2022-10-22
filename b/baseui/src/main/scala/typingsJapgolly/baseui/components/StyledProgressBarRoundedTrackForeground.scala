package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.PathLength
import typingsJapgolly.baseui.progressBarTypesMod.Size
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledProgressBarRoundedTrackForeground {
  
  inline def apply[C /* <: ElementType */]($pathLength: Double, $pathProgress: Double, $size: Size, $visible: Boolean): Builder[C] = {
    val __props = js.Dynamic.literal($pathLength = $pathLength.asInstanceOf[js.Any], $pathProgress = $pathProgress.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $visible = $visible.asInstanceOf[js.Any])
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, PathLength])]))
  }
  
  @JSImport("baseui/progress-bar", "StyledProgressBarRoundedTrackForeground")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[PathLength, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: PathLength => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, PathLength])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
