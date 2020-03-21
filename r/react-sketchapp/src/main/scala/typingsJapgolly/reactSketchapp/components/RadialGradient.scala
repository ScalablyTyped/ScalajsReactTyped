package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.propsMod.NumberProp
import typingsJapgolly.reactSketchapp.radialGradientMod.RadialGradientProps
import typingsJapgolly.reactSketchapp.radialGradientMod.default
import typingsJapgolly.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typingsJapgolly.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadialGradient {
  def apply(
    cx: NumberProp,
    cy: NumberProp,
    fx: NumberProp,
    fy: NumberProp,
    id: String,
    gradientUnits: objectBoundingBox | userSpaceOnUse = null,
    r: NumberProp = null,
    rx: NumberProp = null,
    ry: NumberProp = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] | Node = null
  ): UnmountedWithRoot[RadialGradientProps, default, Unit, RadialGradientProps] = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.radialGradientMod.RadialGradientProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSketchapp.radialGradientMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.radialGradientMod.RadialGradientProps])
  }
  @JSImport("react-sketchapp/lib/components/Svg/RadialGradient", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

