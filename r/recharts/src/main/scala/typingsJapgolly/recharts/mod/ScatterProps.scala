package typingsJapgolly.recharts.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.recharts.rechartsNumbers.`100`
import typingsJapgolly.recharts.rechartsNumbers.`200`
import typingsJapgolly.recharts.rechartsNumbers.`300`
import typingsJapgolly.recharts.rechartsNumbers.`400`
import typingsJapgolly.recharts.rechartsNumbers.`500`
import typingsJapgolly.recharts.rechartsNumbers.`600`
import typingsJapgolly.recharts.rechartsNumbers.`700`
import typingsJapgolly.recharts.rechartsNumbers.`800`
import typingsJapgolly.recharts.rechartsNumbers.`900`
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent recharts.recharts.EventAttributes */
/* Inlined parent std.Partial<recharts.recharts.PresentationAttributes<number, number>> */
/* Inlined parent recharts.recharts.Animatable */
trait ScatterProps extends js.Object {
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
  var enableBackground: js.UndefOr[String] = js.undefined
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
  var glyphOrientationHorizontal: js.UndefOr[String] = js.undefined
  var glyphOrientationVertical: js.UndefOr[String] = js.undefined
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
    circle | cross | diamond | square | star | triangle | wye | Element | ContentRenderer[_]
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
  @scala.inline
  def apply(
    activeIndex: Int | Double = null,
    activeShape: js.Object | RechartsFunction | Element = null,
    alignmentBaseline: String = null,
    angle: Int | Double = null,
    animationBegin: Int | Double = null,
    animationDuration: Int | Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: Int | Double = null,
    baselineShift: String = null,
    clip: String = null,
    clipPath: String = null,
    clipRule: String = null,
    color: String = null,
    colorInterpolation: String = null,
    colorInterpolationFilters: String = null,
    colorProfile: String = null,
    colorRendering: String = null,
    cursor: String = null,
    data: js.Array[js.Object] = null,
    dataKey: DataKey = null,
    direction: String = null,
    display: String = null,
    dominantBaseline: String = null,
    dx: Int | Double = null,
    dy: Int | Double = null,
    enableBackground: String = null,
    fill: String = null,
    fillOpacity: Double | String = null,
    fillRule: String = null,
    filter: String = null,
    floodColor: String = null,
    floodOpacity: String = null,
    font: String = null,
    fontFamily: String = null,
    fontSize: Double | String = null,
    fontSizeAdjust: Double | String = null,
    fontStretch: String = null,
    fontStyle: String = null,
    fontVariant: String = null,
    fontWeight: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit = null,
    glyphOrientationHorizontal: String = null,
    glyphOrientationVertical: String = null,
    height: Int | Double = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    imageRendering: auto | optimizeSpeed | optimizeQuality | inherit = null,
    isAnimationActive: js.UndefOr[Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined,
    kerning: Double | String = null,
    legendType: LegendType = null,
    letterSpacing: String = null,
    lightingColor: String = null,
    line: Boolean | js.Object | RechartsFunction | Element = null,
    lineJointType: LineType = null,
    lineType: joint | fitting = null,
    markerEnd: String = null,
    markerMid: String = null,
    markerStart: String = null,
    mask: String = null,
    name: String | Double = null,
    onAnimationEnd: /* repeated */ js.Any => Callback = null,
    onAnimationStart: /* repeated */ js.Any => Callback = null,
    onClick: /* repeated */ js.Any => Callback = null,
    onMouseDown: /* repeated */ js.Any => Callback = null,
    onMouseEnter: /* repeated */ js.Any => Callback = null,
    onMouseLeave: /* repeated */ js.Any => Callback = null,
    onMouseMove: /* repeated */ js.Any => Callback = null,
    onMouseOut: /* repeated */ js.Any => Callback = null,
    onMouseOver: /* repeated */ js.Any => Callback = null,
    onMouseUp: /* repeated */ js.Any => Callback = null,
    onTouchCancel: /* repeated */ js.Any => Callback = null,
    onTouchEnd: /* repeated */ js.Any => Callback = null,
    onTouchMove: /* repeated */ js.Any => Callback = null,
    onTouchStart: /* repeated */ js.Any => Callback = null,
    opacity: Double | String = null,
    overflow: String = null,
    pointerEvents: String = null,
    points: js.Array[ScatterPoint] = null,
    r: Int | Double = null,
    shape: circle | cross | diamond | square | star | triangle | wye | Element | ContentRenderer[_] = null,
    shapeRendering: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit = null,
    stopColor: String = null,
    stopOpacity: Double | String = null,
    stroke: Double | String = null,
    strokeDasharray: String = null,
    strokeDashoffset: Double | String = null,
    strokeLinecap: String = null,
    strokeLinejoin: String = null,
    strokeMiterlimit: Double | String = null,
    strokeOpacity: Double | String = null,
    strokeWidth: Double | String = null,
    style: js.Object = null,
    textAnchor: String = null,
    textDecoration: String = null,
    textRendering: auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit = null,
    transform: String = null,
    unicodeBidi: String = null,
    visibility: String = null,
    width: Int | Double = null,
    wordSpacing: Double | String = null,
    writingMode: String = null,
    x: Int | Double = null,
    xAxisId: String | Double = null,
    y: Int | Double = null,
    yAxisId: String | Double = null,
    zAxisId: String | Double = null
  ): ScatterProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (activeShape != null) __obj.updateDynamic("activeShape")(activeShape.asInstanceOf[js.Any])
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorInterpolation != null) __obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
    if (colorInterpolationFilters != null) __obj.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
    if (colorProfile != null) __obj.updateDynamic("colorProfile")(colorProfile.asInstanceOf[js.Any])
    if (colorRendering != null) __obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (dominantBaseline != null) __obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (enableBackground != null) __obj.updateDynamic("enableBackground")(enableBackground.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (floodColor != null) __obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
    if (floodOpacity != null) __obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeAdjust != null) __obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (glyphOrientationHorizontal != null) __obj.updateDynamic("glyphOrientationHorizontal")(glyphOrientationHorizontal.asInstanceOf[js.Any])
    if (glyphOrientationVertical != null) __obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageRendering != null) __obj.updateDynamic("imageRendering")(imageRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive.asInstanceOf[js.Any])
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive.asInstanceOf[js.Any])
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (legendType != null) __obj.updateDynamic("legendType")(legendType.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lightingColor != null) __obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lineJointType != null) __obj.updateDynamic("lineJointType")(lineJointType.asInstanceOf[js.Any])
    if (lineType != null) __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onAnimationEnd(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onAnimationStart(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseUp(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTouchStart(t0).runNow()))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textRendering != null) __obj.updateDynamic("textRendering")(textRendering.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (unicodeBidi != null) __obj.updateDynamic("unicodeBidi")(unicodeBidi.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wordSpacing != null) __obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
    if (writingMode != null) __obj.updateDynamic("writingMode")(writingMode.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    if (zAxisId != null) __obj.updateDynamic("zAxisId")(zAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterProps]
  }
}

