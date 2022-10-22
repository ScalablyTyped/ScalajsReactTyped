package typingsJapgolly.nivoScatterplot

import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodeMod {
  
  @JSImport("@nivo/scatterplot/dist/types/Node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Node[RawDatum /* <: ScatterPlotDatum */](
    hasNodeStyleBlendModeIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClick: ScatterPlotNodeProps[RawDatum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Node")(hasNodeStyleBlendModeIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
}
