package typingsJapgolly.nivoBullet

import typingsJapgolly.nivoBullet.anon.From
import typingsJapgolly.nivoBullet.anon.OmitBulletSvgPropsheightw
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletItemProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletMarkersItemProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletRectsItemProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletSvgProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletTooltipProps
import typingsJapgolly.nivoBullet.nivoBulletBooleans.`false`
import typingsJapgolly.nivoBullet.nivoBulletBooleans.`true`
import typingsJapgolly.nivoBullet.nivoBulletDoubles.`0.4`
import typingsJapgolly.nivoBullet.nivoBulletDoubles.`0.6`
import typingsJapgolly.nivoBullet.nivoBulletInts.`0`
import typingsJapgolly.nivoBullet.nivoBulletInts.`30`
import typingsJapgolly.nivoBullet.nivoBulletStrings.after
import typingsJapgolly.nivoBullet.nivoBulletStrings.auto
import typingsJapgolly.nivoBullet.nivoBulletStrings.before
import typingsJapgolly.nivoBullet.nivoBulletStrings.default
import typingsJapgolly.nivoBullet.nivoBulletStrings.horizontal
import typingsJapgolly.nivoBullet.nivoBulletStrings.img
import typingsJapgolly.nivoBullet.nivoBulletStrings.middle
import typingsJapgolly.nivoBullet.nivoBulletStrings.seqColoncool
import typingsJapgolly.nivoBullet.nivoBulletStrings.seqColonred_purple
import typingsJapgolly.nivoCore.mod.DefaultMargin_
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/bullet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Bullet(props: BulletSvgProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Bullet")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def BulletItem(
    hasIdScaleLayoutReverseAxisPositionXYWidthHeightTitleTitlePositionTitleAlignTitleOffsetXTitleOffsetYTitleRotationTooltipRangeBorderColorRangeBorderWidthRangeComponentRangeColorsRangesMeasureBorderColorMeasureBorderWidthMeasureComponentMeasureHeightMeasureColorsMeasuresMarkerComponentMarkerColorsMarkerHeightMarkersOnRangeClickOnMeasureClickOnMarkerClick: BulletItemProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BulletItem")(hasIdScaleLayoutReverseAxisPositionXYWidthHeightTitleTitlePositionTitleAlignTitleOffsetXTitleOffsetYTitleRotationTooltipRangeBorderColorRangeBorderWidthRangeComponentRangeColorsRangesMeasureBorderColorMeasureBorderWidthMeasureComponentMeasureHeightMeasureColorsMeasuresMarkerComponentMarkerColorsMarkerHeightMarkersOnRangeClickOnMeasureClickOnMarkerClick.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveBullet(props: OmitBulletSvgPropsheightw): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveBullet")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object defaultProps {
    
    @JSImport("@nivo/bullet", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.animate")
    @js.native
    val animate: `true` = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.axisPosition")
    @js.native
    val axisPosition: after = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.isInteractive")
    @js.native
    val isInteractive: `true` = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.layout")
    @js.native
    val layout: horizontal = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.margin")
    @js.native
    val margin: DefaultMargin_ = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.markerColors")
    @js.native
    val markerColors: seqColonred_purple = js.native
    
    inline def markerComponent(hasHasColorTransformXY1Y2DataOnMouseEnterOnMouseMoveOnMouseLeaveOnClick: BulletMarkersItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("markerComponent")(hasHasColorTransformXY1Y2DataOnMouseEnterOnMouseMoveOnMouseLeaveOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/bullet", "defaultProps.markerSize")
    @js.native
    val markerSize: `0.6` = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.markers")
    @js.native
    val markers: js.Array[Any] = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.maxValue")
    @js.native
    val maxValue: auto = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.measureBorderColor")
    @js.native
    val measureBorderColor: From = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.measureBorderWidth")
    @js.native
    val measureBorderWidth: `0` = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.measureColors")
    @js.native
    val measureColors: seqColonred_purple = js.native
    
    inline def measureComponent(
      hasHasXYWidthHeightColorBorderColorBorderWidthDataOnMouseEnterOnMouseMoveOnMouseLeaveOnClick: BulletRectsItemProps
    ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("measureComponent")(hasHasXYWidthHeightColorBorderColorBorderWidthDataOnMouseEnterOnMouseMoveOnMouseLeaveOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/bullet", "defaultProps.measureSize")
    @js.native
    val measureSize: `0.4` = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.minValue")
    @js.native
    val minValue: `0` = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.motionConfig")
    @js.native
    val motionConfig: default = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.rangeBorderColor")
    @js.native
    val rangeBorderColor: From = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.rangeBorderWidth")
    @js.native
    val rangeBorderWidth: `0` = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.rangeColors")
    @js.native
    val rangeColors: seqColoncool = js.native
    
    inline def rangeComponent(
      hasHasXYWidthHeightColorBorderColorBorderWidthDataOnMouseEnterOnMouseMoveOnMouseLeaveOnClick: BulletRectsItemProps
    ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeComponent")(hasHasXYWidthHeightColorBorderColorBorderWidthDataOnMouseEnterOnMouseMoveOnMouseLeaveOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/bullet", "defaultProps.reverse")
    @js.native
    val reverse: `false` = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.role")
    @js.native
    val role: img = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.spacing")
    @js.native
    val spacing: `30` = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.titleAlign")
    @js.native
    val titleAlign: middle = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.titleOffsetX")
    @js.native
    val titleOffsetX: `0` = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.titleOffsetY")
    @js.native
    val titleOffsetY: `0` = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.titlePosition")
    @js.native
    val titlePosition: before = js.native
    
    @JSImport("@nivo/bullet", "defaultProps.titleRotation")
    @js.native
    val titleRotation: `0` = js.native
    
    inline def tooltip(hasColorV0V1: BulletTooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(hasColorV0V1.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
}
