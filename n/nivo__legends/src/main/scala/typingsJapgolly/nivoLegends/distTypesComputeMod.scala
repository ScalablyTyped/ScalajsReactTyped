package typingsJapgolly.nivoLegends

import typingsJapgolly.nivoLegends.anon.ColorStops
import typingsJapgolly.nivoLegends.anon.Height
import typingsJapgolly.nivoLegends.anon.LabelAlignment
import typingsJapgolly.nivoLegends.anon.PickBoxLegendSvgPropsdire
import typingsJapgolly.nivoLegends.anon.X
import typingsJapgolly.nivoLegends.anon.anchorLegendAnchorRecordt
import typingsJapgolly.nivoLegends.anon.directionLegendItemDirect
import typingsJapgolly.nivoLegends.distTypesTypesMod.ContinuousColorsLegendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMod {
  
  @JSImport("@nivo/legends/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeContinuousColorsLegend(
    hasScaleTicksLengthThicknessDirectionTickPositionTickSizeTickSpacingTickOverlapTickFormatTitleTitleAlignTitleOffset: ContinuousColorsLegendProps
  ): ColorStops = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorsLegend")(hasScaleTicksLengthThicknessDirectionTickPositionTickSizeTickSpacingTickOverlapTickFormatTitleTitleAlignTitleOffset.asInstanceOf[js.Any]).asInstanceOf[ColorStops]
  
  inline def computeDimensions(hasDirectionItemsSpacing_paddingItemCountItemWidthItemHeight: PickBoxLegendSvgPropsdire): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("computeDimensions")(hasDirectionItemsSpacing_paddingItemCountItemWidthItemHeight.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  inline def computeItemLayout(hasDirectionJustifySymbolSizeSymbolSpacingWidthHeight: directionLegendItemDirect): LabelAlignment = ^.asInstanceOf[js.Dynamic].applyDynamic("computeItemLayout")(hasDirectionJustifySymbolSizeSymbolSpacingWidthHeight.asInstanceOf[js.Any]).asInstanceOf[LabelAlignment]
  
  inline def computePositionFromAnchor(hasAnchorTranslateXTranslateYContainerWidthContainerHeightWidthHeight: anchorLegendAnchorRecordt): X = ^.asInstanceOf[js.Dynamic].applyDynamic("computePositionFromAnchor")(hasAnchorTranslateXTranslateYContainerWidthContainerHeightWidthHeight.asInstanceOf[js.Any]).asInstanceOf[X]
}
