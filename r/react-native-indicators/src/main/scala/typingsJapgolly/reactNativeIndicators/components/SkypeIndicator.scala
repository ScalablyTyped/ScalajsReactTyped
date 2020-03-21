package typingsJapgolly.reactNativeIndicators.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeIndicators.mod.SkypeIndicatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SkypeIndicator {
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: /* value */ Double => CallbackTo[Double] = null,
    color: String = null,
    count: Int | Double = null,
    hidesWhenStopped: js.UndefOr[Boolean] = js.undefined,
    interaction: js.UndefOr[Boolean] = js.undefined,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    size: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SkypeIndicatorProps, 
    typingsJapgolly.reactNativeIndicators.mod.SkypeIndicator, 
    Unit, 
    SkypeIndicatorProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(js.Any.fromFunction1((t0: /* value */ scala.Double) => animationEasing(t0).runNow()))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(hidesWhenStopped)) __obj.updateDynamic("hidesWhenStopped")(hidesWhenStopped.asInstanceOf[js.Any])
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeIndicators.mod.SkypeIndicatorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeIndicators.mod.SkypeIndicator](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeIndicators.mod.SkypeIndicatorProps])(children: _*)
  }
  @JSImport("react-native-indicators", "SkypeIndicator")
  @js.native
  object componentImport extends js.Object
  
}

