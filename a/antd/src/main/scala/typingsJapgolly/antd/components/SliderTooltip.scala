package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antd.libTooltipMod.TooltipProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object SliderTooltip {
  
  def apply(p: TooltipProps & RefAttributes[Any]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("antd/lib/slider/SliderTooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SliderTooltip.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
