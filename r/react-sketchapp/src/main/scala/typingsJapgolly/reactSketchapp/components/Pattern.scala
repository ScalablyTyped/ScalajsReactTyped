package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.patternMod.PatternProps
import typingsJapgolly.reactSketchapp.patternMod.default
import typingsJapgolly.reactSketchapp.propsMod.NumberProp
import typingsJapgolly.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typingsJapgolly.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pattern {
  def apply(
    patternContentUnits: userSpaceOnUse | objectBoundingBox = null,
    patternTransform: String = null,
    patternUnits: userSpaceOnUse | objectBoundingBox = null,
    x1: NumberProp = null,
    x2: NumberProp = null,
    y1: NumberProp = null,
    y2: NumberProp = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] | Node = null
  ): UnmountedWithRoot[PatternProps, default, Unit, PatternProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (patternContentUnits != null) __obj.updateDynamic("patternContentUnits")(patternContentUnits.asInstanceOf[js.Any])
    if (patternTransform != null) __obj.updateDynamic("patternTransform")(patternTransform.asInstanceOf[js.Any])
    if (patternUnits != null) __obj.updateDynamic("patternUnits")(patternUnits.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.patternMod.PatternProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSketchapp.patternMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.patternMod.PatternProps])
  }
  @JSImport("react-sketchapp/lib/components/Svg/Pattern", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

