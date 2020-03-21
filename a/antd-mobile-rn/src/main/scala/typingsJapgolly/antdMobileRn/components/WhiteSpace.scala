package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.lg
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.md
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.sm
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.xl
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.xs
import typingsJapgolly.antdMobileRn.whiteSpaceIndexNativeMod.WhiteSpaceProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WhiteSpace {
  def apply(
    size: xs | sm | md | lg | xl = null,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[WhiteSpaceProps, typingsJapgolly.antdMobileRn.mod.WhiteSpace, Unit, WhiteSpaceProps] = {
    val __obj = js.Dynamic.literal()
  
      if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.whiteSpaceIndexNativeMod.WhiteSpaceProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.WhiteSpace](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.whiteSpaceIndexNativeMod.WhiteSpaceProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "WhiteSpace")
  @js.native
  object componentImport extends js.Object
  
}

