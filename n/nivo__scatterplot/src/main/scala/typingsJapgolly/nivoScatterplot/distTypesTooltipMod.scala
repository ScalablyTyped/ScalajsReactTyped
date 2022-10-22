package typingsJapgolly.nivoScatterplot

import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotTooltipProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTooltipMod {
  
  @JSImport("@nivo/scatterplot/dist/types/Tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Tooltip[RawDatum /* <: ScatterPlotDatum */](hasNode: ScatterPlotTooltipProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Tooltip")(hasNode.asInstanceOf[js.Any]).asInstanceOf[Element]
}
