package typingsJapgolly.nivoHeatmap

import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapCanvasProps
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.height
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveHeatMapCanvasMod {
  
  @JSImport("@nivo/heatmap/dist/types/ResponsiveHeatMapCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveHeatMapCanvas[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](props: Omit[HeatMapCanvasProps[Datum, ExtraProps], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveHeatMapCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
