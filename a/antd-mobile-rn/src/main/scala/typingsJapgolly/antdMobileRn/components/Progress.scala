package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.fixed
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.normal
import typingsJapgolly.antdMobileRn.progressIndexNativeMod.ProgressProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Progress {
  def apply(
    appearTransition: js.UndefOr[Boolean] = js.undefined,
    barStyle: StyleProp[ViewStyle] = null,
    percent: Int | Double = null,
    position: fixed | normal = null,
    style: StyleProp[ViewStyle] = null,
    styles: js.Any = null,
    unfilled: js.UndefOr[Boolean] = js.undefined,
    wrapWidth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ProgressProps, typingsJapgolly.antdMobileRn.mod.Progress, Unit, ProgressProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(appearTransition)) __obj.updateDynamic("appearTransition")(appearTransition.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(unfilled)) __obj.updateDynamic("unfilled")(unfilled.asInstanceOf[js.Any])
    if (wrapWidth != null) __obj.updateDynamic("wrapWidth")(wrapWidth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.progressIndexNativeMod.ProgressProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.Progress](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.progressIndexNativeMod.ProgressProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "Progress")
  @js.native
  object componentImport extends js.Object
  
}

