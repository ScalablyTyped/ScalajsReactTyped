package typingsJapgolly.reactWheelpicker.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactWheelpicker.mod.Props
import typingsJapgolly.reactWheelpicker.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactWheelpicker {
  
  inline def apply(
    animation: String,
    data: js.Array[String],
    defaultSelection: Double,
    fontSize: Double,
    height: Double,
    parentHeight: Double,
    scrollerId: String,
    updateSelection: Double => Callback
  ): Default[default] = {
    val __props = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultSelection = defaultSelection.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], parentHeight = parentHeight.asInstanceOf[js.Any], scrollerId = scrollerId.asInstanceOf[js.Any], updateSelection = js.Any.fromFunction1((t0: Double) => updateSelection(t0).runNow()))
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-wheelpicker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
