package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.propsMod.AlignmentBaseline
import typingsJapgolly.reactSketchapp.propsMod.BaselineShift
import typingsJapgolly.reactSketchapp.propsMod.Font
import typingsJapgolly.reactSketchapp.propsMod.FontFamily
import typingsJapgolly.reactSketchapp.propsMod.FontFeatureSettings
import typingsJapgolly.reactSketchapp.propsMod.FontStretch
import typingsJapgolly.reactSketchapp.propsMod.FontStyle
import typingsJapgolly.reactSketchapp.propsMod.FontVariant
import typingsJapgolly.reactSketchapp.propsMod.FontVariantLigatures
import typingsJapgolly.reactSketchapp.propsMod.FontWeight
import typingsJapgolly.reactSketchapp.propsMod.Kerning
import typingsJapgolly.reactSketchapp.propsMod.LengthAdjust
import typingsJapgolly.reactSketchapp.propsMod.LetterSpacing
import typingsJapgolly.reactSketchapp.propsMod.Method
import typingsJapgolly.reactSketchapp.propsMod.MidLine
import typingsJapgolly.reactSketchapp.propsMod.NumberArrayProp
import typingsJapgolly.reactSketchapp.propsMod.NumberProp
import typingsJapgolly.reactSketchapp.propsMod.Side
import typingsJapgolly.reactSketchapp.propsMod.Spacing
import typingsJapgolly.reactSketchapp.propsMod.StartOffset
import typingsJapgolly.reactSketchapp.propsMod.TextAnchor
import typingsJapgolly.reactSketchapp.propsMod.TextDecoration
import typingsJapgolly.reactSketchapp.propsMod.TextLength
import typingsJapgolly.reactSketchapp.propsMod.TextPathProps
import typingsJapgolly.reactSketchapp.propsMod.VerticalAlign
import typingsJapgolly.reactSketchapp.propsMod.WordSpacing
import typingsJapgolly.reactSketchapp.propsMod.fontSize
import typingsJapgolly.reactSketchapp.reactSketchappStrings.bevel
import typingsJapgolly.reactSketchapp.reactSketchappStrings.butt
import typingsJapgolly.reactSketchapp.reactSketchappStrings.evenodd
import typingsJapgolly.reactSketchapp.reactSketchappStrings.miter
import typingsJapgolly.reactSketchapp.reactSketchappStrings.nonzero
import typingsJapgolly.reactSketchapp.reactSketchappStrings.round
import typingsJapgolly.reactSketchapp.reactSketchappStrings.square
import typingsJapgolly.reactSketchapp.textPathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextPath {
  def apply(
    href: String,
    alignmentBaseline: AlignmentBaseline = null,
    baselineShift: BaselineShift = null,
    clipPath: String = null,
    clipRule: evenodd | nonzero = null,
    fill: String = null,
    fillOpacity: NumberProp = null,
    fillRule: evenodd | nonzero = null,
    font: Font = null,
    fontData: js.Object = null,
    fontFamily: FontFamily = null,
    fontFeatureSettings: FontFeatureSettings = null,
    fontSize: fontSize = null,
    fontStretch: FontStretch = null,
    fontStyle: FontStyle = null,
    fontVariant: FontVariant = null,
    fontVariantLigatures: FontVariantLigatures = null,
    fontWeight: FontWeight = null,
    kerning: Kerning = null,
    lengthAdjust: LengthAdjust = null,
    letterSpacing: LetterSpacing = null,
    method: Method = null,
    midLine: MidLine = null,
    name: String = null,
    origin: NumberProp = null,
    originX: NumberProp = null,
    originY: NumberProp = null,
    rotate: NumberProp = null,
    rotation: NumberProp = null,
    scale: NumberProp = null,
    scaleX: NumberProp = null,
    scaleY: NumberProp = null,
    side: Side = null,
    skew: NumberProp = null,
    skewX: NumberProp = null,
    skewY: NumberProp = null,
    spacing: Spacing = null,
    startOffset: StartOffset = null,
    stroke: String = null,
    strokeDasharray: NumberArrayProp = null,
    strokeDashoffset: NumberProp = null,
    strokeLinecap: butt | square | round = null,
    strokeLinejoin: miter | bevel | round = null,
    strokeMiterlimit: NumberProp = null,
    strokeOpacity: NumberProp = null,
    strokeWidth: NumberProp = null,
    textAnchor: TextAnchor = null,
    textDecoration: TextDecoration = null,
    textLength: TextLength = null,
    transform: js.Object | String = null,
    translate: NumberProp = null,
    translateX: NumberProp = null,
    translateY: NumberProp = null,
    verticalAlign: VerticalAlign = null,
    wordSpacing: WordSpacing = null,
    x: NumberProp = null,
    y: NumberProp = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TextPathProps, default, Unit, TextPathProps] = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
  
      if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontData != null) __obj.updateDynamic("fontData")(fontData.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontFeatureSettings != null) __obj.updateDynamic("fontFeatureSettings")(fontFeatureSettings.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontVariantLigatures != null) __obj.updateDynamic("fontVariantLigatures")(fontVariantLigatures.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (lengthAdjust != null) __obj.updateDynamic("lengthAdjust")(lengthAdjust.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (midLine != null) __obj.updateDynamic("midLine")(midLine.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (skew != null) __obj.updateDynamic("skew")(skew.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (startOffset != null) __obj.updateDynamic("startOffset")(startOffset.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textLength != null) __obj.updateDynamic("textLength")(textLength.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (wordSpacing != null) __obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.propsMod.TextPathProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSketchapp.textPathMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.propsMod.TextPathProps])(children: _*)
  }
  @JSImport("react-sketchapp/lib/components/Svg/TextPath", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

