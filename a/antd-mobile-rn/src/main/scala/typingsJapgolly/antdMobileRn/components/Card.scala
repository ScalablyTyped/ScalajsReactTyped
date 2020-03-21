package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.cardIndexNativeMod.CardNativeProps
import typingsJapgolly.antdMobileRn.cardStyleIndexNativeMod.ICardStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card {
  def apply(
    full: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: ICardStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardNativeProps, typingsJapgolly.antdMobileRn.mod.Card, Unit, CardNativeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.cardIndexNativeMod.CardNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.Card](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.cardIndexNativeMod.CardNativeProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "Card")
  @js.native
  object componentImport extends js.Object
  
}

