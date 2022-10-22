package typingsJapgolly.nivoHeatmap

import typingsJapgolly.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.BoundAnnotation
import typingsJapgolly.nivoHeatmap.anon.ActiveCell
import typingsJapgolly.nivoHeatmap.anon.Cells
import typingsJapgolly.nivoHeatmap.anon.Data
import typingsJapgolly.nivoHeatmap.anon.Width
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.ComputedCell
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapCommonProps
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.activeOpacity
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.borderColor
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.colors
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.emptyColor
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.forceSquare
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.hoverTarget
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.inactiveOpacity
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.label
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.labelTextColor
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.opacity
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.sizeVariation
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.valueFormat
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.xInnerPadding
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.xOuterPadding
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.yInnerPadding
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.yOuterPadding
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/heatmap/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCellAnnotations[Datum /* <: HeatMapDatum */](
    cells: js.Array[ComputedCell[Datum]],
    annotations: js.Array[AnnotationMatcher[ComputedCell[Datum]]]
  ): js.Array[BoundAnnotation[ComputedCell[Datum]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCellAnnotations")(cells.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[js.Array[BoundAnnotation[ComputedCell[Datum]]]]
  
  inline def useComputeCells[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    hasDataWidthHeightXInnerPaddingXOuterPaddingYInnerPaddingYOuterPaddingForceSquare: (Data[Datum, ExtraProps]) & (Pick[
      HeatMapCommonProps[Datum], 
      forceSquare | xInnerPadding | xOuterPadding | yInnerPadding | yOuterPadding
    ])
  ): Cells[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useComputeCells")(hasDataWidthHeightXInnerPaddingXOuterPaddingYInnerPaddingYOuterPaddingForceSquare.asInstanceOf[js.Any]).asInstanceOf[Cells[Datum]]
  
  inline def useHeatMap[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    hasDataValueFormat_width_heightXOuterPaddingXInnerPaddingYOuterPaddingYInnerPaddingForceSquareSizeVariationColorsEmptyColorOpacityActiveOpacityInactiveOpacityBorderColorLabelLabelTextColorHoverTarget: (Width[Datum, ExtraProps]) & (Partial[
      Pick[
        HeatMapCommonProps[Datum], 
        borderColor | opacity | label | labelTextColor | valueFormat | forceSquare | sizeVariation | xInnerPadding | xOuterPadding | yInnerPadding | yOuterPadding | activeOpacity | inactiveOpacity | colors | emptyColor | hoverTarget
      ]
    ])
  ): ActiveCell[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHeatMap")(hasDataValueFormat_width_heightXOuterPaddingXInnerPaddingYOuterPaddingYInnerPaddingForceSquareSizeVariationColorsEmptyColorOpacityActiveOpacityInactiveOpacityBorderColorLabelLabelTextColorHoverTarget.asInstanceOf[js.Any]).asInstanceOf[ActiveCell[Datum]]
}
