package typingsJapgolly.nivoScatterplot.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeData
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  inline def apply[RawDatum /* <: ScatterPlotDatum */](node: ScatterPlotNodeData[RawDatum]): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[ScatterPlotTooltipProps[RawDatum]]))
  }
  
  @JSImport("@nivo/scatterplot/dist/types/Tooltip", "Tooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: ScatterPlotDatum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[RawDatum /* <: ScatterPlotDatum */](p: ScatterPlotTooltipProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
