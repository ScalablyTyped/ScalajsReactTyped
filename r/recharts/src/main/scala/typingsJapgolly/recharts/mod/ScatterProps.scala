package typingsJapgolly.recharts.mod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.d3Path.mod.Path_
import typingsJapgolly.d3Shape.mod.CurveGenerator
import typingsJapgolly.recharts.rechartsInts.`100`
import typingsJapgolly.recharts.rechartsInts.`200`
import typingsJapgolly.recharts.rechartsInts.`300`
import typingsJapgolly.recharts.rechartsInts.`400`
import typingsJapgolly.recharts.rechartsInts.`500`
import typingsJapgolly.recharts.rechartsInts.`600`
import typingsJapgolly.recharts.rechartsInts.`700`
import typingsJapgolly.recharts.rechartsInts.`800`
import typingsJapgolly.recharts.rechartsInts.`900`
import typingsJapgolly.recharts.rechartsStrings.auto
import typingsJapgolly.recharts.rechartsStrings.bold
import typingsJapgolly.recharts.rechartsStrings.bolder
import typingsJapgolly.recharts.rechartsStrings.circle
import typingsJapgolly.recharts.rechartsStrings.crispEdges
import typingsJapgolly.recharts.rechartsStrings.cross
import typingsJapgolly.recharts.rechartsStrings.diamond
import typingsJapgolly.recharts.rechartsStrings.fitting
import typingsJapgolly.recharts.rechartsStrings.geometricPrecision
import typingsJapgolly.recharts.rechartsStrings.inherit
import typingsJapgolly.recharts.rechartsStrings.joint
import typingsJapgolly.recharts.rechartsStrings.lighter
import typingsJapgolly.recharts.rechartsStrings.normal
import typingsJapgolly.recharts.rechartsStrings.optimizeLegibility
import typingsJapgolly.recharts.rechartsStrings.optimizeQuality
import typingsJapgolly.recharts.rechartsStrings.optimizeSpeed
import typingsJapgolly.recharts.rechartsStrings.square
import typingsJapgolly.recharts.rechartsStrings.star
import typingsJapgolly.recharts.rechartsStrings.triangle
import typingsJapgolly.recharts.rechartsStrings.wye
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent recharts.recharts.EventAttributes */
/* Inlined parent std.Partial<recharts.recharts.PresentationAttributes<number, number>> */
/* Inlined parent recharts.recharts.Animatable */
trait ScatterProps extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.undefined
  
  var activeShape: js.UndefOr[js.Object | RechartsFunction | Element] = js.undefined
  
  var alignmentBaseline: js.UndefOr[String] = js.undefined
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var animationBegin: js.UndefOr[Double] = js.undefined
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var animationEasing: js.UndefOr[AnimationEasingType] = js.undefined
  
  var animationId: js.UndefOr[Double] = js.undefined
  
  var baselineShift: js.UndefOr[String] = js.undefined
  
  var clip: js.UndefOr[String] = js.undefined
  
  var clipPath: js.UndefOr[String] = js.undefined
  
  var clipRule: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var colorInterpolation: js.UndefOr[String] = js.undefined
  
  var colorInterpolationFilters: js.UndefOr[String] = js.undefined
  
  var colorProfile: js.UndefOr[String] = js.undefined
  
  var colorRendering: js.UndefOr[String] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var dataKey: js.UndefOr[DataKey] = js.undefined
  
  var direction: js.UndefOr[String] = js.undefined
  
  var display: js.UndefOr[String] = js.undefined
  
  var dominantBaseline: js.UndefOr[String] = js.undefined
  
  var dx: js.UndefOr[Double] = js.undefined
  
  var dy: js.UndefOr[Double] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double | String] = js.undefined
  
  var fillRule: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var floodColor: js.UndefOr[String] = js.undefined
  
  var floodOpacity: js.UndefOr[String] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double | String] = js.undefined
  
  var fontSizeAdjust: js.UndefOr[Double | String] = js.undefined
  
  var fontStretch: js.UndefOr[String] = js.undefined
  
  var fontStyle: js.UndefOr[String] = js.undefined
  
  var fontVariant: js.UndefOr[String] = js.undefined
  
  var fontWeight: js.UndefOr[
    normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit
  ] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hide: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var imageRendering: js.UndefOr[auto | optimizeSpeed | optimizeQuality | inherit] = js.undefined
  
  var isAnimationActive: js.UndefOr[Boolean] = js.undefined
  
  var isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined
  
  var kerning: js.UndefOr[Double | String] = js.undefined
  
  var legendType: js.UndefOr[LegendType] = js.undefined
  
  var letterSpacing: js.UndefOr[String] = js.undefined
  
  var lightingColor: js.UndefOr[String] = js.undefined
  
  var line: js.UndefOr[Boolean | js.Object | RechartsFunction | Element] = js.undefined
  
  var lineJointType: js.UndefOr[LineType] = js.undefined
  
  var lineType: js.UndefOr[joint | fitting] = js.undefined
  
  var markerEnd: js.UndefOr[String] = js.undefined
  
  var markerMid: js.UndefOr[String] = js.undefined
  
  var markerStart: js.UndefOr[String] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String | Double] = js.undefined
  
  var onAnimationEnd: js.UndefOr[RechartsFunction] = js.undefined
  
  var onAnimationStart: js.UndefOr[RechartsFunction] = js.undefined
  
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseDown: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseMove: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseOut: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseOver: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseUp: js.UndefOr[RechartsFunction] = js.undefined
  
  var onTouchCancel: js.UndefOr[RechartsFunction] = js.undefined
  
  var onTouchEnd: js.UndefOr[RechartsFunction] = js.undefined
  
  var onTouchMove: js.UndefOr[RechartsFunction] = js.undefined
  
  var onTouchStart: js.UndefOr[RechartsFunction] = js.undefined
  
  var opacity: js.UndefOr[Double | String] = js.undefined
  
  var overflow: js.UndefOr[String] = js.undefined
  
  var pointerEvents: js.UndefOr[String] = js.undefined
  
  var points: js.UndefOr[js.Array[ScatterPoint]] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
  
  var shape: js.UndefOr[
    circle | cross | diamond | square | star | triangle | wye | Element | ContentRenderer[Any]
  ] = js.undefined
  
  var shapeRendering: js.UndefOr[auto | optimizeSpeed | crispEdges | geometricPrecision | inherit] = js.undefined
  
  var stopColor: js.UndefOr[String] = js.undefined
  
  var stopOpacity: js.UndefOr[Double | String] = js.undefined
  
  var stroke: js.UndefOr[Double | String] = js.undefined
  
  var strokeDasharray: js.UndefOr[String] = js.undefined
  
  var strokeDashoffset: js.UndefOr[Double | String] = js.undefined
  
  var strokeLinecap: js.UndefOr[String] = js.undefined
  
  var strokeLinejoin: js.UndefOr[String] = js.undefined
  
  var strokeMiterlimit: js.UndefOr[Double | String] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double | String] = js.undefined
  
  var strokeWidth: js.UndefOr[Double | String] = js.undefined
  
  var style: js.UndefOr[js.Object] = js.undefined
  
  var textAnchor: js.UndefOr[String] = js.undefined
  
  var textDecoration: js.UndefOr[String] = js.undefined
  
  var textRendering: js.UndefOr[auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit] = js.undefined
  
  var transform: js.UndefOr[String] = js.undefined
  
  var unicodeBidi: js.UndefOr[String] = js.undefined
  
  var visibility: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var wordSpacing: js.UndefOr[Double | String] = js.undefined
  
  var writingMode: js.UndefOr[String] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var xAxisId: js.UndefOr[String | Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var yAxisId: js.UndefOr[String | Double] = js.undefined
  
  var zAxisId: js.UndefOr[String | Double] = js.undefined
}
object ScatterProps {
  
  inline def apply(): ScatterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterProps]
  }
  
  extension [Self <: ScatterProps](x: Self) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    inline def setActiveShape(value: js.Object | RechartsFunction | Element): Self = StObject.set(x, "activeShape", value.asInstanceOf[js.Any])
    
    inline def setActiveShapeUndefined: Self = StObject.set(x, "activeShape", js.undefined)
    
    inline def setActiveShapeVdomElement(value: VdomElement): Self = StObject.set(x, "activeShape", value.rawElement.asInstanceOf[js.Any])
    
    inline def setAlignmentBaseline(value: String): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
    
    inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAnimationBegin(value: Double): Self = StObject.set(x, "animationBegin", value.asInstanceOf[js.Any])
    
    inline def setAnimationBeginUndefined: Self = StObject.set(x, "animationBegin", js.undefined)
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationEasing(value: AnimationEasingType): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
    
    inline def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
    
    inline def setAnimationId(value: Double): Self = StObject.set(x, "animationId", value.asInstanceOf[js.Any])
    
    inline def setAnimationIdUndefined: Self = StObject.set(x, "animationId", js.undefined)
    
    inline def setBaselineShift(value: String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
    
    inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
    
    inline def setClip(value: String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    inline def setClipRule(value: String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
    
    inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorInterpolation(value: String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
    
    inline def setColorInterpolationFilters(value: String): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
    
    inline def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
    
    inline def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
    
    inline def setColorProfile(value: String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
    
    inline def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
    
    inline def setColorRendering(value: String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
    
    inline def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataKey(value: DataKey): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    inline def setDataKeyFunction1(value: /* dataObject */ Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = StObject.set(x, "dataKey", js.Any.fromFunction1(value))
    
    inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDominantBaseline(value: String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
    
    inline def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillRule(value: String): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFloodColor(value: String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
    
    inline def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
    
    inline def setFloodOpacity(value: String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
    
    inline def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
    
    inline def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    inline def setFontWeight(
      value: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit
    ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImageRendering(value: auto | optimizeSpeed | optimizeQuality | inherit): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
    
    inline def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
    
    inline def setIsAnimationActive(value: Boolean): Self = StObject.set(x, "isAnimationActive", value.asInstanceOf[js.Any])
    
    inline def setIsAnimationActiveUndefined: Self = StObject.set(x, "isAnimationActive", js.undefined)
    
    inline def setIsUpdateAnimationActive(value: Boolean): Self = StObject.set(x, "isUpdateAnimationActive", value.asInstanceOf[js.Any])
    
    inline def setIsUpdateAnimationActiveUndefined: Self = StObject.set(x, "isUpdateAnimationActive", js.undefined)
    
    inline def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    inline def setLegendType(value: LegendType): Self = StObject.set(x, "legendType", value.asInstanceOf[js.Any])
    
    inline def setLegendTypeUndefined: Self = StObject.set(x, "legendType", js.undefined)
    
    inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLightingColor(value: String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
    
    inline def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
    
    inline def setLine(value: Boolean | js.Object | RechartsFunction | Element): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineJointType(value: LineType): Self = StObject.set(x, "lineJointType", value.asInstanceOf[js.Any])
    
    inline def setLineJointTypeFunction1(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): Self = StObject.set(x, "lineJointType", js.Any.fromFunction1(value))
    
    inline def setLineJointTypeUndefined: Self = StObject.set(x, "lineJointType", js.undefined)
    
    inline def setLineType(value: joint | fitting): Self = StObject.set(x, "lineType", value.asInstanceOf[js.Any])
    
    inline def setLineTypeUndefined: Self = StObject.set(x, "lineType", js.undefined)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLineVdomElement(value: VdomElement): Self = StObject.set(x, "line", value.rawElement.asInstanceOf[js.Any])
    
    inline def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
    
    inline def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
    
    inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
    
    inline def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
    
    inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnAnimationEnd(value: RechartsFunction): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationStart(value: RechartsFunction): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnClick(value: RechartsFunction): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseDown(value: RechartsFunction): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: RechartsFunction): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: RechartsFunction): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: RechartsFunction): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: RechartsFunction): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: RechartsFunction): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: RechartsFunction): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnTouchCancel(value: RechartsFunction): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: RechartsFunction): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: RechartsFunction): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: RechartsFunction): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOpacity(value: Double | String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setPoints(value: js.Array[ScatterPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: ScatterPoint*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setShape(value: circle | cross | diamond | square | star | triangle | wye | Element | ContentRenderer[Any]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeFunction1(value: Any => Node): Self = StObject.set(x, "shape", js.Any.fromFunction1(value))
    
    inline def setShapeRendering(value: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setShapeVdomElement(value: VdomElement): Self = StObject.set(x, "shape", value.rawElement.asInstanceOf[js.Any])
    
    inline def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    inline def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
    
    inline def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
    
    inline def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
    
    inline def setStroke(value: Double | String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharray(value: String): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    inline def setStrokeDashoffset(value: Double | String): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
    
    inline def setStrokeLinecap(value: String): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    inline def setStrokeLinejoin(value: String): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
    
    inline def setStrokeMiterlimit(value: Double | String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
    
    inline def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
    
    inline def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    inline def setTextRendering(value: auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
    
    inline def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUnicodeBidi(value: String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
    
    inline def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
    
    inline def setWritingMode(value: String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
    
    inline def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXAxisId(value: String | Double): Self = StObject.set(x, "xAxisId", value.asInstanceOf[js.Any])
    
    inline def setXAxisIdUndefined: Self = StObject.set(x, "xAxisId", js.undefined)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYAxisId(value: String | Double): Self = StObject.set(x, "yAxisId", value.asInstanceOf[js.Any])
    
    inline def setYAxisIdUndefined: Self = StObject.set(x, "yAxisId", js.undefined)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZAxisId(value: String | Double): Self = StObject.set(x, "zAxisId", value.asInstanceOf[js.Any])
    
    inline def setZAxisIdUndefined: Self = StObject.set(x, "zAxisId", js.undefined)
  }
}
