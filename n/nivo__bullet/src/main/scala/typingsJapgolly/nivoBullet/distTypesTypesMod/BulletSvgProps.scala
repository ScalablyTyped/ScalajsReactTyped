package typingsJapgolly.nivoBullet.distTypesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGLineElement
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.nivoBullet.anon.WithDatumIdComputedMarker
import typingsJapgolly.nivoBullet.anon.WithDatumIdComputedRangeD
import typingsJapgolly.nivoBullet.nivoBulletStrings.after
import typingsJapgolly.nivoBullet.nivoBulletStrings.auto
import typingsJapgolly.nivoBullet.nivoBulletStrings.before
import typingsJapgolly.nivoBullet.nivoBulletStrings.end
import typingsJapgolly.nivoBullet.nivoBulletStrings.horizontal
import typingsJapgolly.nivoBullet.nivoBulletStrings.middle
import typingsJapgolly.nivoBullet.nivoBulletStrings.start
import typingsJapgolly.nivoBullet.nivoBulletStrings.vertical
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.Colors
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@nivo/bullet.@nivo/bullet/dist/types/types.CommonBulletProps> & @nivo/core.@nivo/core.Dimensions & @nivo/bullet.@nivo/bullet/dist/types/types.BulletHandlers & @nivo/core.@nivo/core.ModernMotionProps & {  data :std.Array<@nivo/bullet.@nivo/bullet/dist/types/types.Datum>} */
trait BulletSvgProps extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var axisPosition: js.UndefOr[before | after] = js.undefined
  
  var data: js.Array[Datum]
  
  var height: js.UndefOr[Double] & Double
  
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  
  var margin: js.UndefOr[Box] = js.undefined
  
  var markerColors: js.UndefOr[Colors] = js.undefined
  
  var markerComponent: js.UndefOr[ComponentType[BulletMarkersItemProps]] = js.undefined
  
  var markerSize: js.UndefOr[Double] = js.undefined
  
  var maxValue: js.UndefOr[auto | Double] = js.undefined
  
  var measureBorderColor: js.UndefOr[InheritedColorConfig[ComputedRangeDatum]] = js.undefined
  
  var measureBorderWidth: js.UndefOr[Double] = js.undefined
  
  var measureColors: js.UndefOr[Colors] = js.undefined
  
  var measureComponent: js.UndefOr[ComponentType[BulletRectsItemProps]] = js.undefined
  
  var measureSize: js.UndefOr[Double] = js.undefined
  
  var minValue: js.UndefOr[auto | Double] = js.undefined
  
  var motionConfig: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
  ] = js.undefined
  
  var onMarkerClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedMarker, SVGLineElement]] = js.undefined
  
  var onMeasureClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedRangeD, SVGRectElement]] = js.undefined
  
  var onRangeClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedRangeD, SVGRectElement]] = js.undefined
  
  var rangeBorderColor: js.UndefOr[InheritedColorConfig[ComputedRangeDatum]] = js.undefined
  
  var rangeBorderWidth: js.UndefOr[Double] = js.undefined
  
  var rangeColors: js.UndefOr[Colors] = js.undefined
  
  var rangeComponent: js.UndefOr[ComponentType[BulletRectsItemProps]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var titleAlign: js.UndefOr[start | middle | end] = js.undefined
  
  var titleOffsetX: js.UndefOr[Double] = js.undefined
  
  var titleOffsetY: js.UndefOr[Double] = js.undefined
  
  var titlePosition: js.UndefOr[before | after] = js.undefined
  
  var titleRotation: js.UndefOr[Double] = js.undefined
  
  var tooltip: js.UndefOr[ComponentType[BulletTooltipProps]] = js.undefined
  
  var width: js.UndefOr[Double] & Double
}
object BulletSvgProps {
  
  inline def apply(data: js.Array[Datum], height: js.UndefOr[Double] & Double, width: js.UndefOr[Double] & Double): BulletSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletSvgProps]
  }
  
  extension [Self <: BulletSvgProps](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAxisPosition(value: before | after): Self = StObject.set(x, "axisPosition", value.asInstanceOf[js.Any])
    
    inline def setAxisPositionUndefined: Self = StObject.set(x, "axisPosition", js.undefined)
    
    inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setHeight(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarkerColors(value: Colors): Self = StObject.set(x, "markerColors", value.asInstanceOf[js.Any])
    
    inline def setMarkerColorsUndefined: Self = StObject.set(x, "markerColors", js.undefined)
    
    inline def setMarkerColorsVarargs(value: String*): Self = StObject.set(x, "markerColors", js.Array(value*))
    
    inline def setMarkerComponent(value: ComponentType[BulletMarkersItemProps]): Self = StObject.set(x, "markerComponent", value.asInstanceOf[js.Any])
    
    inline def setMarkerComponentUndefined: Self = StObject.set(x, "markerComponent", js.undefined)
    
    inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    inline def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    inline def setMaxValue(value: auto | Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMeasureBorderColor(value: InheritedColorConfig[ComputedRangeDatum]): Self = StObject.set(x, "measureBorderColor", value.asInstanceOf[js.Any])
    
    inline def setMeasureBorderColorUndefined: Self = StObject.set(x, "measureBorderColor", js.undefined)
    
    inline def setMeasureBorderWidth(value: Double): Self = StObject.set(x, "measureBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setMeasureBorderWidthUndefined: Self = StObject.set(x, "measureBorderWidth", js.undefined)
    
    inline def setMeasureColors(value: Colors): Self = StObject.set(x, "measureColors", value.asInstanceOf[js.Any])
    
    inline def setMeasureColorsUndefined: Self = StObject.set(x, "measureColors", js.undefined)
    
    inline def setMeasureColorsVarargs(value: String*): Self = StObject.set(x, "measureColors", js.Array(value*))
    
    inline def setMeasureComponent(value: ComponentType[BulletRectsItemProps]): Self = StObject.set(x, "measureComponent", value.asInstanceOf[js.Any])
    
    inline def setMeasureComponentUndefined: Self = StObject.set(x, "measureComponent", js.undefined)
    
    inline def setMeasureSize(value: Double): Self = StObject.set(x, "measureSize", value.asInstanceOf[js.Any])
    
    inline def setMeasureSizeUndefined: Self = StObject.set(x, "measureSize", js.undefined)
    
    inline def setMinValue(value: auto | Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setMotionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setOnMarkerClick(
      value: (WithDatumIdComputedMarker, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback
    ): Self = StObject.set(x, "onMarkerClick", js.Any.fromFunction2((t0: WithDatumIdComputedMarker, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMarkerClickUndefined: Self = StObject.set(x, "onMarkerClick", js.undefined)
    
    inline def setOnMeasureClick(
      value: (WithDatumIdComputedRangeD, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback
    ): Self = StObject.set(x, "onMeasureClick", js.Any.fromFunction2((t0: WithDatumIdComputedRangeD, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMeasureClickUndefined: Self = StObject.set(x, "onMeasureClick", js.undefined)
    
    inline def setOnRangeClick(
      value: (WithDatumIdComputedRangeD, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback
    ): Self = StObject.set(x, "onRangeClick", js.Any.fromFunction2((t0: WithDatumIdComputedRangeD, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnRangeClickUndefined: Self = StObject.set(x, "onRangeClick", js.undefined)
    
    inline def setRangeBorderColor(value: InheritedColorConfig[ComputedRangeDatum]): Self = StObject.set(x, "rangeBorderColor", value.asInstanceOf[js.Any])
    
    inline def setRangeBorderColorUndefined: Self = StObject.set(x, "rangeBorderColor", js.undefined)
    
    inline def setRangeBorderWidth(value: Double): Self = StObject.set(x, "rangeBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setRangeBorderWidthUndefined: Self = StObject.set(x, "rangeBorderWidth", js.undefined)
    
    inline def setRangeColors(value: Colors): Self = StObject.set(x, "rangeColors", value.asInstanceOf[js.Any])
    
    inline def setRangeColorsUndefined: Self = StObject.set(x, "rangeColors", js.undefined)
    
    inline def setRangeColorsVarargs(value: String*): Self = StObject.set(x, "rangeColors", js.Array(value*))
    
    inline def setRangeComponent(value: ComponentType[BulletRectsItemProps]): Self = StObject.set(x, "rangeComponent", value.asInstanceOf[js.Any])
    
    inline def setRangeComponentUndefined: Self = StObject.set(x, "rangeComponent", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitleAlign(value: start | middle | end): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
    
    inline def setTitleOffsetX(value: Double): Self = StObject.set(x, "titleOffsetX", value.asInstanceOf[js.Any])
    
    inline def setTitleOffsetXUndefined: Self = StObject.set(x, "titleOffsetX", js.undefined)
    
    inline def setTitleOffsetY(value: Double): Self = StObject.set(x, "titleOffsetY", value.asInstanceOf[js.Any])
    
    inline def setTitleOffsetYUndefined: Self = StObject.set(x, "titleOffsetY", js.undefined)
    
    inline def setTitlePosition(value: before | after): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
    
    inline def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
    
    inline def setTitleRotation(value: Double): Self = StObject.set(x, "titleRotation", value.asInstanceOf[js.Any])
    
    inline def setTitleRotationUndefined: Self = StObject.set(x, "titleRotation", js.undefined)
    
    inline def setTooltip(value: ComponentType[BulletTooltipProps]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setWidth(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
