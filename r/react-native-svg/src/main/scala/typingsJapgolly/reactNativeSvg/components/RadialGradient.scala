package typingsJapgolly.reactNativeSvg.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeSvg.mod.ColumnMajorTransformMatrix
import typingsJapgolly.reactNativeSvg.mod.NumberProp
import typingsJapgolly.reactNativeSvg.mod.RadialGradientProps
import typingsJapgolly.reactNativeSvg.mod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadialGradient {
  def apply(
    cx: NumberProp = null,
    cy: NumberProp = null,
    fx: NumberProp = null,
    fy: NumberProp = null,
    gradientTransform: ColumnMajorTransformMatrix | String = null,
    gradientUnits: Units = null,
    id: String = null,
    r: NumberProp = null,
    rx: NumberProp = null,
    ry: NumberProp = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RadialGradientProps, 
    typingsJapgolly.reactNativeSvg.mod.RadialGradient, 
    Unit, 
    RadialGradientProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (fy != null) __obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
    if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSvg.mod.RadialGradientProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvg.mod.RadialGradient](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvg.mod.RadialGradientProps])(children: _*)
  }
  @JSImport("react-native-svg", "RadialGradient")
  @js.native
  object componentImport extends js.Object
  
}

