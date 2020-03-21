package typingsJapgolly.reactSketchapp.useMod

import typingsJapgolly.reactSketchapp.propsMod.ClipProps
import typingsJapgolly.reactSketchapp.propsMod.DefinationProps
import typingsJapgolly.reactSketchapp.propsMod.FillProps
import typingsJapgolly.reactSketchapp.propsMod.NumberArrayProp
import typingsJapgolly.reactSketchapp.propsMod.NumberProp
import typingsJapgolly.reactSketchapp.propsMod.StrokeProps
import typingsJapgolly.reactSketchapp.propsMod.TransformProps
import typingsJapgolly.reactSketchapp.reactSketchappStrings.bevel
import typingsJapgolly.reactSketchapp.reactSketchappStrings.butt
import typingsJapgolly.reactSketchapp.reactSketchappStrings.evenodd
import typingsJapgolly.reactSketchapp.reactSketchappStrings.miter
import typingsJapgolly.reactSketchapp.reactSketchappStrings.nonzero
import typingsJapgolly.reactSketchapp.reactSketchappStrings.round
import typingsJapgolly.reactSketchapp.reactSketchappStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseProps
  extends FillProps
     with StrokeProps
     with ClipProps
     with TransformProps
     with DefinationProps {
   // Just for reusing `Symbol`
  var height: js.UndefOr[NumberProp] = js.undefined
  var href: String
  var width: js.UndefOr[NumberProp] = js.undefined
}

object UseProps {
  @scala.inline
  def apply(
    href: String,
    clipPath: String = null,
    clipRule: evenodd | nonzero = null,
    fill: String = null,
    fillOpacity: NumberProp = null,
    fillRule: evenodd | nonzero = null,
    height: NumberProp = null,
    name: String = null,
    origin: NumberProp = null,
    originX: NumberProp = null,
    originY: NumberProp = null,
    rotate: NumberProp = null,
    rotation: NumberProp = null,
    scale: NumberProp = null,
    scaleX: NumberProp = null,
    scaleY: NumberProp = null,
    skew: NumberProp = null,
    skewX: NumberProp = null,
    skewY: NumberProp = null,
    stroke: String = null,
    strokeDasharray: NumberArrayProp = null,
    strokeDashoffset: NumberProp = null,
    strokeLinecap: butt | square | round = null,
    strokeLinejoin: miter | bevel | round = null,
    strokeMiterlimit: NumberProp = null,
    strokeOpacity: NumberProp = null,
    strokeWidth: NumberProp = null,
    transform: js.Object | String = null,
    translate: NumberProp = null,
    translateX: NumberProp = null,
    translateY: NumberProp = null,
    width: NumberProp = null,
    x: NumberProp = null,
    y: NumberProp = null
  ): UseProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (skew != null) __obj.updateDynamic("skew")(skew.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseProps]
  }
}

