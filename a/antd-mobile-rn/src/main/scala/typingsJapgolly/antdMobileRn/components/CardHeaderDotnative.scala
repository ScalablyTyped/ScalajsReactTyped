package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.cardHeaderNativeMod.CardHeaderProps
import typingsJapgolly.antdMobileRn.cardHeaderNativeMod.default
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardHeaderDotnative {
  def apply(
    extra: VdomNode = null,
    style: StyleProp[ViewStyle] = null,
    styles: js.Any = null,
    thumb: VdomNode = null,
    thumbStyle: StyleProp[ImageStyle] = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardHeaderProps, default, Unit, CardHeaderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.rawNode.asInstanceOf[js.Any])
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.cardHeaderNativeMod.CardHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.cardHeaderNativeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.cardHeaderNativeMod.CardHeaderProps])(children: _*)
  }
  @JSImport("antd-mobile-rn/lib/card/CardHeader.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

