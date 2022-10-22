package typingsJapgolly.nivoScatterplot

import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoScatterplot.anon.FormatX
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeData
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeDynamicSizeSpec
import typingsJapgolly.nivoScatterplot.nivoScatterplotStrings.color
import typingsJapgolly.nivoScatterplot.nivoScatterplotStrings.size
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMod {
  
  @JSImport("@nivo/scatterplot/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computePoints[RawDatum /* <: ScatterPlotDatum */](hasSeriesFormatXFormatYGetNodeId: FormatX[RawDatum]): js.Array[Omit[ScatterPlotNodeData[RawDatum], color | size]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computePoints")(hasSeriesFormatXFormatYGetNodeId.asInstanceOf[js.Any]).asInstanceOf[js.Array[Omit[ScatterPlotNodeData[RawDatum], color | size]]]
  
  inline def getNodeSizeGenerator[RawDatum /* <: ScatterPlotDatum */](size: Double): js.Function1[/* datum */ Omit[ScatterPlotNodeData[RawDatum], color | size], Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeSizeGenerator")(size.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* datum */ Omit[ScatterPlotNodeData[RawDatum], color | size], Double]]
  inline def getNodeSizeGenerator[RawDatum /* <: ScatterPlotDatum */](size: PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], color | size], Double]): js.Function1[/* datum */ Omit[ScatterPlotNodeData[RawDatum], color | size], Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeSizeGenerator")(size.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* datum */ Omit[ScatterPlotNodeData[RawDatum], color | size], Double]]
  inline def getNodeSizeGenerator[RawDatum /* <: ScatterPlotDatum */](size: ScatterPlotNodeDynamicSizeSpec): js.Function1[/* datum */ Omit[ScatterPlotNodeData[RawDatum], color | size], Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeSizeGenerator")(size.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* datum */ Omit[ScatterPlotNodeData[RawDatum], color | size], Double]]
}
