package typingsJapgolly.reactNativeSvg.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeSvg.mod.ColumnMajorTransformMatrix
import typingsJapgolly.reactNativeSvg.mod.NumberProp
import typingsJapgolly.reactNativeSvg.mod.PatternProps
import typingsJapgolly.reactNativeSvg.mod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pattern {
  def apply(
    height: NumberProp = null,
    id: String = null,
    patternContentUnits: Units = null,
    patternTransform: ColumnMajorTransformMatrix | String = null,
    patternUnits: Units = null,
    preserveAspectRatio: String = null,
    viewBox: String = null,
    width: NumberProp = null,
    x: NumberProp = null,
    y: NumberProp = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PatternProps, typingsJapgolly.reactNativeSvg.mod.Pattern, Unit, PatternProps] = {
    val __obj = js.Dynamic.literal()
  
      if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (patternContentUnits != null) __obj.updateDynamic("patternContentUnits")(patternContentUnits.asInstanceOf[js.Any])
    if (patternTransform != null) __obj.updateDynamic("patternTransform")(patternTransform.asInstanceOf[js.Any])
    if (patternUnits != null) __obj.updateDynamic("patternUnits")(patternUnits.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSvg.mod.PatternProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvg.mod.Pattern](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvg.mod.PatternProps])(children: _*)
  }
  @JSImport("react-native-svg", "Pattern")
  @js.native
  object componentImport extends js.Object
  
}

