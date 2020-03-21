package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.lg
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.md
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.sm
import typingsJapgolly.antdMobileRn.wingBlankIndexNativeMod.WingBlankProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WingBlank {
  def apply(
    size: sm | md | lg = null,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[WingBlankProps, typingsJapgolly.antdMobileRn.mod.WingBlank, Unit, WingBlankProps] = {
    val __obj = js.Dynamic.literal()
  
      if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.wingBlankIndexNativeMod.WingBlankProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.WingBlank](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.wingBlankIndexNativeMod.WingBlankProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "WingBlank")
  @js.native
  object componentImport extends js.Object
  
}

