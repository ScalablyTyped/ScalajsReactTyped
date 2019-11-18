package typingsJapgolly.react.reactMod

import typingsJapgolly.csstype.csstypeMod.AlignmentBaselineProperty
import typingsJapgolly.csstype.csstypeMod.BaselineShiftProperty
import typingsJapgolly.csstype.csstypeMod.ClipRuleProperty
import typingsJapgolly.csstype.csstypeMod.ColorInterpolationProperty
import typingsJapgolly.csstype.csstypeMod.ColorRenderingProperty
import typingsJapgolly.csstype.csstypeMod.DominantBaselineProperty
import typingsJapgolly.csstype.csstypeMod.FillProperty
import typingsJapgolly.csstype.csstypeMod.FillRuleProperty
import typingsJapgolly.csstype.csstypeMod.FloodColorProperty
import typingsJapgolly.csstype.csstypeMod.GlobalsNumber
import typingsJapgolly.csstype.csstypeMod.GlyphOrientationVerticalProperty
import typingsJapgolly.csstype.csstypeMod.LightingColorProperty
import typingsJapgolly.csstype.csstypeMod.MarkerEndProperty
import typingsJapgolly.csstype.csstypeMod.MarkerMidProperty
import typingsJapgolly.csstype.csstypeMod.MarkerProperty
import typingsJapgolly.csstype.csstypeMod.MarkerStartProperty
import typingsJapgolly.csstype.csstypeMod.ObsoleteProperties
import typingsJapgolly.csstype.csstypeMod.ShapeRenderingProperty
import typingsJapgolly.csstype.csstypeMod.StandardLonghandProperties
import typingsJapgolly.csstype.csstypeMod.StandardShorthandProperties
import typingsJapgolly.csstype.csstypeMod.StopColorProperty
import typingsJapgolly.csstype.csstypeMod.StrokeDasharrayProperty
import typingsJapgolly.csstype.csstypeMod.StrokeDashoffsetProperty
import typingsJapgolly.csstype.csstypeMod.StrokeLinecapProperty
import typingsJapgolly.csstype.csstypeMod.StrokeLinejoinProperty
import typingsJapgolly.csstype.csstypeMod.StrokeProperty
import typingsJapgolly.csstype.csstypeMod.StrokeWidthProperty
import typingsJapgolly.csstype.csstypeMod.TextAnchorProperty
import typingsJapgolly.csstype.csstypeMod.VectorEffectProperty
import typingsJapgolly.csstype.csstypeMod.VendorLonghandProperties
import typingsJapgolly.csstype.csstypeMod.VendorShorthandProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.csstype.csstypeMod.SvgProperties because var conflicts: clip, clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ trait CSSProperties
  extends StandardLonghandProperties[String | Double]
     with StandardShorthandProperties[String | Double]
     with VendorLonghandProperties[String | Double]
     with VendorShorthandProperties[String | Double]
     with ObsoleteProperties[String | Double] {
  var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty] = js.undefined
  var baselineShift: js.UndefOr[BaselineShiftProperty[String | Double]] = js.undefined
  var clipRule: js.UndefOr[ClipRuleProperty] = js.undefined
  var colorInterpolation: js.UndefOr[ColorInterpolationProperty] = js.undefined
  var colorRendering: js.UndefOr[ColorRenderingProperty] = js.undefined
  var dominantBaseline: js.UndefOr[DominantBaselineProperty] = js.undefined
  var fill: js.UndefOr[FillProperty] = js.undefined
  var fillOpacity: js.UndefOr[GlobalsNumber] = js.undefined
  var fillRule: js.UndefOr[FillRuleProperty] = js.undefined
  var floodColor: js.UndefOr[FloodColorProperty] = js.undefined
  var floodOpacity: js.UndefOr[GlobalsNumber] = js.undefined
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty] = js.undefined
  var lightingColor: js.UndefOr[LightingColorProperty] = js.undefined
  var marker: js.UndefOr[MarkerProperty] = js.undefined
  var markerEnd: js.UndefOr[MarkerEndProperty] = js.undefined
  var markerMid: js.UndefOr[MarkerMidProperty] = js.undefined
  var markerStart: js.UndefOr[MarkerStartProperty] = js.undefined
  var shapeRendering: js.UndefOr[ShapeRenderingProperty] = js.undefined
  var stopColor: js.UndefOr[StopColorProperty] = js.undefined
  var stopOpacity: js.UndefOr[GlobalsNumber] = js.undefined
  var stroke: js.UndefOr[StrokeProperty] = js.undefined
  var strokeDasharray: js.UndefOr[StrokeDasharrayProperty[String | Double]] = js.undefined
  var strokeDashoffset: js.UndefOr[StrokeDashoffsetProperty[String | Double]] = js.undefined
  var strokeLinecap: js.UndefOr[StrokeLinecapProperty] = js.undefined
  var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty] = js.undefined
  var strokeMiterlimit: js.UndefOr[GlobalsNumber] = js.undefined
  var strokeOpacity: js.UndefOr[GlobalsNumber] = js.undefined
  var strokeWidth: js.UndefOr[StrokeWidthProperty[String | Double]] = js.undefined
  var textAnchor: js.UndefOr[TextAnchorProperty] = js.undefined
  var vectorEffect: js.UndefOr[VectorEffectProperty] = js.undefined
}

object CSSProperties {
  @scala.inline
  def apply(
    ObsoleteProperties: ObsoleteProperties[String | Double] = null,
    StandardLonghandProperties: StandardLonghandProperties[String | Double] = null,
    StandardShorthandProperties: StandardShorthandProperties[String | Double] = null,
    VendorLonghandProperties: VendorLonghandProperties[String | Double] = null,
    VendorShorthandProperties: VendorShorthandProperties[String | Double] = null,
    alignmentBaseline: AlignmentBaselineProperty = null,
    baselineShift: BaselineShiftProperty[String | Double] = null,
    clipRule: ClipRuleProperty = null,
    colorInterpolation: ColorInterpolationProperty = null,
    colorRendering: ColorRenderingProperty = null,
    dominantBaseline: DominantBaselineProperty = null,
    fill: FillProperty = null,
    fillOpacity: GlobalsNumber = null,
    fillRule: FillRuleProperty = null,
    floodColor: FloodColorProperty = null,
    floodOpacity: GlobalsNumber = null,
    glyphOrientationVertical: GlyphOrientationVerticalProperty = null,
    lightingColor: LightingColorProperty = null,
    marker: MarkerProperty = null,
    markerEnd: MarkerEndProperty = null,
    markerMid: MarkerMidProperty = null,
    markerStart: MarkerStartProperty = null,
    shapeRendering: ShapeRenderingProperty = null,
    stopColor: StopColorProperty = null,
    stopOpacity: GlobalsNumber = null,
    stroke: StrokeProperty = null,
    strokeDasharray: StrokeDasharrayProperty[String | Double] = null,
    strokeDashoffset: StrokeDashoffsetProperty[String | Double] = null,
    strokeLinecap: StrokeLinecapProperty = null,
    strokeLinejoin: StrokeLinejoinProperty = null,
    strokeMiterlimit: GlobalsNumber = null,
    strokeOpacity: GlobalsNumber = null,
    strokeWidth: StrokeWidthProperty[String | Double] = null,
    textAnchor: TextAnchorProperty = null,
    vectorEffect: VectorEffectProperty = null
  ): CSSProperties = {
    val __obj = js.Dynamic.literal()
    if (ObsoleteProperties != null) js.Dynamic.global.Object.assign(__obj, ObsoleteProperties)
    if (StandardLonghandProperties != null) js.Dynamic.global.Object.assign(__obj, StandardLonghandProperties)
    if (StandardShorthandProperties != null) js.Dynamic.global.Object.assign(__obj, StandardShorthandProperties)
    if (VendorLonghandProperties != null) js.Dynamic.global.Object.assign(__obj, VendorLonghandProperties)
    if (VendorShorthandProperties != null) js.Dynamic.global.Object.assign(__obj, VendorShorthandProperties)
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (colorInterpolation != null) __obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
    if (colorRendering != null) __obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
    if (dominantBaseline != null) __obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (floodColor != null) __obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
    if (floodOpacity != null) __obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
    if (glyphOrientationVertical != null) __obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
    if (lightingColor != null) __obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
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
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSProperties]
  }
}

