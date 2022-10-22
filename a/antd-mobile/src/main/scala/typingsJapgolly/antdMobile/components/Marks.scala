package typingsJapgolly.antdMobile.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antdMobile.esComponentsSliderMarksMod.MarksProps
import typingsJapgolly.antdMobile.esComponentsSliderMarksMod.SliderMarks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Marks {
  
  inline def apply(lowerBound: Double, marks: SliderMarks, max: Double, min: Double, upperBound: Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(lowerBound = lowerBound.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[MarksProps]))
  }
  
  @JSImport("antd-mobile/es/components/slider/marks", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MarksProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
