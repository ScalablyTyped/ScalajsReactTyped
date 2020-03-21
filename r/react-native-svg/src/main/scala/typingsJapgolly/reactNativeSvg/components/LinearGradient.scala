package typingsJapgolly.reactNativeSvg.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeSvg.mod.ColumnMajorTransformMatrix
import typingsJapgolly.reactNativeSvg.mod.LinearGradientProps
import typingsJapgolly.reactNativeSvg.mod.NumberProp
import typingsJapgolly.reactNativeSvg.mod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinearGradient {
  def apply(
    gradientTransform: ColumnMajorTransformMatrix | String = null,
    gradientUnits: Units = null,
    id: String = null,
    x1: NumberProp = null,
    x2: NumberProp = null,
    y1: NumberProp = null,
    y2: NumberProp = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    LinearGradientProps, 
    typingsJapgolly.reactNativeSvg.mod.LinearGradient, 
    Unit, 
    LinearGradientProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSvg.mod.LinearGradientProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvg.mod.LinearGradient](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvg.mod.LinearGradientProps])(children: _*)
  }
  @JSImport("react-native-svg", "LinearGradient")
  @js.native
  object componentImport extends js.Object
  
}

