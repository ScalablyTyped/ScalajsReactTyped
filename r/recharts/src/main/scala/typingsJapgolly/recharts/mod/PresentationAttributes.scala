package typingsJapgolly.recharts.mod

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
import typingsJapgolly.recharts.rechartsStrings.crispEdges
import typingsJapgolly.recharts.rechartsStrings.geometricPrecision
import typingsJapgolly.recharts.rechartsStrings.inherit
import typingsJapgolly.recharts.rechartsStrings.lighter
import typingsJapgolly.recharts.rechartsStrings.normal
import typingsJapgolly.recharts.rechartsStrings.optimizeLegibility
import typingsJapgolly.recharts.rechartsStrings.optimizeQuality
import typingsJapgolly.recharts.rechartsStrings.optimizeSpeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<std.CSSStyleDeclaration, recharts.recharts.PickedCSSStyleDeclarationKeys> */
trait PresentationAttributes[X, Y] extends js.Object {
  var alignmentBaseline: String
  var angle: Double
  var baselineShift: String
  var clip: String
  var clipPath: String
  var clipRule: String
  var color: String
  var colorInterpolation: String
  var colorInterpolationFilters: String
  var colorProfile: String
  var colorRendering: String
  var cursor: String
  var direction: String
  var display: String
  var dominantBaseline: String
  var dx: Double
  var dy: Double
  var enableBackground: js.UndefOr[String] = js.undefined
  var fill: String
  var fillOpacity: Double | String
  var fillRule: String
  var filter: String
  var floodColor: String
  var floodOpacity: String
  var font: String
  var fontFamily: String
  var fontSize: Double | String
  var fontSizeAdjust: Double | String
  var fontStretch: String
  var fontStyle: String
  var fontVariant: String
  var fontWeight: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit
  var glyphOrientationHorizontal: js.UndefOr[String] = js.undefined
  var glyphOrientationVertical: String
  var height: Double
  var imageRendering: auto | optimizeSpeed | optimizeQuality | inherit
  var kerning: Double | String
  var letterSpacing: String
  var lightingColor: String
  var markerEnd: String
  var markerMid: String
  var markerStart: String
  var mask: String
  var opacity: Double | String
  var overflow: String
  var pointerEvents: js.UndefOr[String] = js.undefined
  var r: Double
  var shapeRendering: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit
  var stopColor: String
  var stopOpacity: Double | String
  var stroke: Double | String
  var strokeDasharray: String
  var strokeDashoffset: Double | String
  var strokeLinecap: String
  var strokeLinejoin: String
  var strokeMiterlimit: Double | String
  var strokeOpacity: Double | String
  var strokeWidth: Double | String
  var style: js.Object
  var textAnchor: String
  var textDecoration: String
  var textRendering: auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit
  var transform: String
  var unicodeBidi: String
  var visibility: String
  var width: Double
  var wordSpacing: Double | String
  var writingMode: String
  var x: X
  var y: Y
}

object PresentationAttributes {
  @scala.inline
  def apply[X, Y](
    alignmentBaseline: String,
    angle: Double,
    baselineShift: String,
    clip: String,
    clipPath: String,
    clipRule: String,
    color: String,
    colorInterpolation: String,
    colorInterpolationFilters: String,
    colorProfile: String,
    colorRendering: String,
    cursor: String,
    direction: String,
    display: String,
    dominantBaseline: String,
    dx: Double,
    dy: Double,
    fill: String,
    fillOpacity: Double | String,
    fillRule: String,
    filter: String,
    floodColor: String,
    floodOpacity: String,
    font: String,
    fontFamily: String,
    fontSize: Double | String,
    fontSizeAdjust: Double | String,
    fontStretch: String,
    fontStyle: String,
    fontVariant: String,
    fontWeight: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit,
    glyphOrientationVertical: String,
    height: Double,
    imageRendering: auto | optimizeSpeed | optimizeQuality | inherit,
    kerning: Double | String,
    letterSpacing: String,
    lightingColor: String,
    markerEnd: String,
    markerMid: String,
    markerStart: String,
    mask: String,
    opacity: Double | String,
    overflow: String,
    r: Double,
    shapeRendering: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit,
    stopColor: String,
    stopOpacity: Double | String,
    stroke: Double | String,
    strokeDasharray: String,
    strokeDashoffset: Double | String,
    strokeLinecap: String,
    strokeLinejoin: String,
    strokeMiterlimit: Double | String,
    strokeOpacity: Double | String,
    strokeWidth: Double | String,
    style: js.Object,
    textAnchor: String,
    textDecoration: String,
    textRendering: auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit,
    transform: String,
    unicodeBidi: String,
    visibility: String,
    width: Double,
    wordSpacing: Double | String,
    writingMode: String,
    x: X,
    y: Y,
    enableBackground: String = null,
    glyphOrientationHorizontal: String = null,
    pointerEvents: String = null
  ): PresentationAttributes[X, Y] = {
    val __obj = js.Dynamic.literal(alignmentBaseline = alignmentBaseline.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], baselineShift = baselineShift.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any], clipRule = clipRule.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorInterpolation = colorInterpolation.asInstanceOf[js.Any], colorInterpolationFilters = colorInterpolationFilters.asInstanceOf[js.Any], colorProfile = colorProfile.asInstanceOf[js.Any], colorRendering = colorRendering.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], dominantBaseline = dominantBaseline.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], fillRule = fillRule.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], floodColor = floodColor.asInstanceOf[js.Any], floodOpacity = floodOpacity.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontSizeAdjust = fontSizeAdjust.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontVariant = fontVariant.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], glyphOrientationVertical = glyphOrientationVertical.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imageRendering = imageRendering.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lightingColor = lightingColor.asInstanceOf[js.Any], markerEnd = markerEnd.asInstanceOf[js.Any], markerMid = markerMid.asInstanceOf[js.Any], markerStart = markerStart.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], shapeRendering = shapeRendering.asInstanceOf[js.Any], stopColor = stopColor.asInstanceOf[js.Any], stopOpacity = stopOpacity.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeDashoffset = strokeDashoffset.asInstanceOf[js.Any], strokeLinecap = strokeLinecap.asInstanceOf[js.Any], strokeLinejoin = strokeLinejoin.asInstanceOf[js.Any], strokeMiterlimit = strokeMiterlimit.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any], textRendering = textRendering.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], unicodeBidi = unicodeBidi.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], wordSpacing = wordSpacing.asInstanceOf[js.Any], writingMode = writingMode.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (enableBackground != null) __obj.updateDynamic("enableBackground")(enableBackground.asInstanceOf[js.Any])
    if (glyphOrientationHorizontal != null) __obj.updateDynamic("glyphOrientationHorizontal")(glyphOrientationHorizontal.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresentationAttributes[X, Y]]
  }
}

