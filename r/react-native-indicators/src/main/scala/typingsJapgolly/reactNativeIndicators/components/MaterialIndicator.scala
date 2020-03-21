package typingsJapgolly.reactNativeIndicators.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeIndicators.mod.MaterialIndicatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MaterialIndicator {
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: /* value */ Double => CallbackTo[Double] = null,
    color: String = null,
    hidesWhenStopped: js.UndefOr[Boolean] = js.undefined,
    interaction: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    trackWidth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MaterialIndicatorProps, 
    typingsJapgolly.reactNativeIndicators.mod.MaterialIndicator, 
    Unit, 
    MaterialIndicatorProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(js.Any.fromFunction1((t0: /* value */ scala.Double) => animationEasing(t0).runNow()))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(hidesWhenStopped)) __obj.updateDynamic("hidesWhenStopped")(hidesWhenStopped.asInstanceOf[js.Any])
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (trackWidth != null) __obj.updateDynamic("trackWidth")(trackWidth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeIndicators.mod.MaterialIndicatorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeIndicators.mod.MaterialIndicator](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeIndicators.mod.MaterialIndicatorProps])(children: _*)
  }
  @JSImport("react-native-indicators", "MaterialIndicator")
  @js.native
  object componentImport extends js.Object
  
}

