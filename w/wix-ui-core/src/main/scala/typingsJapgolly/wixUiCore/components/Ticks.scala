package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsSliderTicksMod.TicksProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ticks {
  
  inline def apply(
    max: Double,
    min: Double,
    onTickClick: Any => Callback,
    step: Double,
    thumbSize: Double,
    tickMarksShape: String,
    trackSize: Double,
    vertical: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onTickClick = js.Any.fromFunction1((t0: Any) => onTickClick(t0).runNow()), step = step.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any], tickMarksShape = tickMarksShape.asInstanceOf[js.Any], trackSize = trackSize.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TicksProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/slider/Ticks", "Ticks")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcComponentsSliderTicksMod.Ticks] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TicksProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
