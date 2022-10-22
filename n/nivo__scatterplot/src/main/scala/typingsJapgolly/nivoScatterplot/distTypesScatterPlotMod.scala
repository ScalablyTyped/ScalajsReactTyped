package typingsJapgolly.nivoScatterplot

import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotSvgProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesScatterPlotMod {
  
  @JSImport("@nivo/scatterplot/dist/types/ScatterPlot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ScatterPlot[RawDatum /* <: ScatterPlotDatum */](hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: ScatterPlotSvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScatterPlot")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
