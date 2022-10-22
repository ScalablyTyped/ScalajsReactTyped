package typingsJapgolly.antdMobile.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antdMobile.esComponentsSliderTicksMod.TicksProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ticks {
  
  inline def apply(lowerBound: Double, max: Double, min: Double, points: js.Array[Double], upperBound: Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(lowerBound = lowerBound.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[TicksProps]))
  }
  
  @JSImport("antd-mobile/es/components/slider/ticks", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TicksProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
