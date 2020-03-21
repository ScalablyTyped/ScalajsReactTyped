package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.linearGradientMod.LinearGradientProps
import typingsJapgolly.reactSketchapp.linearGradientMod.default
import typingsJapgolly.reactSketchapp.propsMod.NumberProp
import typingsJapgolly.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typingsJapgolly.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinearGradient {
  def apply(
    x1: NumberProp,
    x2: NumberProp,
    y1: NumberProp,
    y2: NumberProp,
    gradientUnits: objectBoundingBox | userSpaceOnUse = null,
    id: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] | Node = null
  ): UnmountedWithRoot[LinearGradientProps, default, Unit, LinearGradientProps] = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.linearGradientMod.LinearGradientProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSketchapp.linearGradientMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.linearGradientMod.LinearGradientProps])
  }
  @JSImport("react-sketchapp/lib/components/Svg/LinearGradient", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

