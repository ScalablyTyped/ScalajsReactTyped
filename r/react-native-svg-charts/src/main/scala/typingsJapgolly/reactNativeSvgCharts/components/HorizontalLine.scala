package typingsJapgolly.reactNativeSvgCharts.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativeSvgCharts.mod.HorizontalLineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HorizontalLine {
  
  inline def apply(stroke: String): Default[typingsJapgolly.reactNativeSvgCharts.mod.Decorators.HorizontalLine] = {
    val __props = js.Dynamic.literal(stroke = stroke.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reactNativeSvgCharts.mod.Decorators.HorizontalLine](js.Array(this.component, __props.asInstanceOf[HorizontalLineProps]))
  }
  
  @JSImport("react-native-svg-charts", "Decorators.HorizontalLine")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: HorizontalLineProps): Default[typingsJapgolly.reactNativeSvgCharts.mod.Decorators.HorizontalLine] = new Default[typingsJapgolly.reactNativeSvgCharts.mod.Decorators.HorizontalLine](js.Array(this.component, p.asInstanceOf[js.Any]))
}
