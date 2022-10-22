package typingsJapgolly.nivoHeatmap

import typingsJapgolly.nivoHeatmap.anon.Cells
import typingsJapgolly.nivoHeatmap.anon.Columns
import typingsJapgolly.nivoHeatmap.anon.Data
import typingsJapgolly.nivoHeatmap.anon.Height
import typingsJapgolly.nivoHeatmap.anon.Size
import typingsJapgolly.nivoHeatmap.anon.X
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.ComputedCell
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapCommonProps
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.SizeVariationConfig
import typingsJapgolly.nivoHeatmap.nivoHeatmapBooleans.`false`
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.forceSquare
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.xInnerPadding
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.xOuterPadding
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.yInnerPadding
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.yOuterPadding
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMod {
  
  @JSImport("@nivo/heatmap/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCells[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    hasData_width_heightXInnerPaddingXOuterPaddingYInnerPaddingYOuterPaddingForceSquare: (Data[Datum, ExtraProps]) & (Pick[
      HeatMapCommonProps[Datum], 
      forceSquare | xInnerPadding | xOuterPadding | yInnerPadding | yOuterPadding
    ])
  ): Cells[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCells")(hasData_width_heightXInnerPaddingXOuterPaddingYInnerPaddingYOuterPaddingForceSquare.asInstanceOf[js.Any]).asInstanceOf[Cells[Datum]]
  
  inline def computeLayout(has_width_heightRowsColumnsForceSquare: Columns): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLayout")(has_width_heightRowsColumnsForceSquare.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  inline def computeSizeScale(size: SizeVariationConfig, min: Double, max: Double): js.Function1[/* value */ Double | Null, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSizeScale")(size.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Double | Null, Double]]
  
  inline def computeSizeScale_false(size: `false`, min: Double, max: Double): js.Function1[/* value */ Double | Null, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSizeScale")(size.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Double | Null, Double]]
  
  inline def getCellAnnotationDimensions[Datum /* <: HeatMapDatum */](cell: ComputedCell[Datum]): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellAnnotationDimensions")(cell.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  inline def getCellAnnotationPosition[Datum /* <: HeatMapDatum */](cell: ComputedCell[Datum]): X = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellAnnotationPosition")(cell.asInstanceOf[js.Any]).asInstanceOf[X]
}
