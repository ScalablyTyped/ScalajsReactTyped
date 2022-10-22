package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.progressBarTypesMod.Size
import typingsJapgolly.baseui.progressBarTypesMod.StyleProps
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledBarProgress {
  
  inline def apply[C /* <: ElementType */](
    $index: Double,
    $infinite: Boolean,
    $maxValue: Double,
    $minValue: Double,
    $size: Size,
    $steps: Double,
    $successValue: Double,
    $value: Double
  ): SharedBuilder_AsOverrideProps_654990409[C] = {
    val __props = js.Dynamic.literal($index = $index.asInstanceOf[js.Any], $infinite = $infinite.asInstanceOf[js.Any], $maxValue = $maxValue.asInstanceOf[js.Any], $minValue = $minValue.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $steps = $steps.asInstanceOf[js.Any], $successValue = $successValue.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps_654990409[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, StyleProps])]))
  }
  
  @JSImport("baseui/progress-bar", "StyledBarProgress")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, StyleProps])): SharedBuilder_AsOverrideProps_654990409[C] = new SharedBuilder_AsOverrideProps_654990409[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
