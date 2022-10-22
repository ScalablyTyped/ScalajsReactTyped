package typingsJapgolly.nivoScatterplot

import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotSvgProps
import typingsJapgolly.nivoScatterplot.nivoScatterplotStrings.height
import typingsJapgolly.nivoScatterplot.nivoScatterplotStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveScatterPlotMod {
  
  @JSImport("@nivo/scatterplot/dist/types/ResponsiveScatterPlot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveScatterPlot[RawDatum /* <: ScatterPlotDatum */](props: Omit[ScatterPlotSvgProps[RawDatum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveScatterPlot")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
