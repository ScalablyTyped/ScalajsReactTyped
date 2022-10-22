package typingsJapgolly.nivoBar.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoBar.distTypesBarLegendsMod.BarLegendsProps
import typingsJapgolly.nivoBar.distTypesTypesMod.BarLegendProps
import typingsJapgolly.nivoBar.distTypesTypesMod.LegendData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BarLegends {
  
  inline def apply(
    height: Double,
    legends: js.Array[js.Tuple2[BarLegendProps, js.Array[LegendData]]],
    toggleSerie: Double | String => Callback,
    width: Double
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], toggleSerie = js.Any.fromFunction1((t0: Double | String) => toggleSerie(t0).runNow()), width = width.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[BarLegendsProps]))
  }
  
  @JSImport("@nivo/bar/dist/types/BarLegends", "BarLegends")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BarLegendsProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
