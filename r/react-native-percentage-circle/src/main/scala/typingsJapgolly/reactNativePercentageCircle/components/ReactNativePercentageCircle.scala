package typingsJapgolly.reactNativePercentageCircle.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativePercentageCircle.mod.PercentageCircleProps
import typingsJapgolly.reactNativePercentageCircle.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativePercentageCircle {
  def apply(
    bgcolor: String = null,
    borderWidth: Int | Double = null,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    innerColor: String = null,
    percent: Int | Double = null,
    radius: Int | Double = null,
    textStyle: js.Array[TextStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PercentageCircleProps, default, Unit, PercentageCircleProps] = {
    val __obj = js.Dynamic.literal()
  
      if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (innerColor != null) __obj.updateDynamic("innerColor")(innerColor.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativePercentageCircle.mod.PercentageCircleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativePercentageCircle.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativePercentageCircle.mod.PercentageCircleProps])(children: _*)
  }
  @JSImport("react-native-percentage-circle", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

