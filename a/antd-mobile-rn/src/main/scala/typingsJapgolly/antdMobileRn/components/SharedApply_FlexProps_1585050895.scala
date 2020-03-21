package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`column-reverse`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`row-reverse`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`wrap-reverse`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.around
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.baseline
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.between
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.center
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.column
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.end
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.nowrap
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.row
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.start
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.stretch
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.wrap
import typingsJapgolly.antdMobileRn.flexNativeMod.FlexProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_FlexProps_1585050895[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    align: start | center | end | baseline | stretch = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    onLongPress: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    onPressIn: js.UndefOr[Callback] = js.undefined,
    onPressOut: js.UndefOr[Callback] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    wrap: nowrap | wrap | `wrap-reverse` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FlexProps, ComponentRef, Unit, FlexProps] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    onLongPress.foreach(p => __obj.updateDynamic("onLongPress")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    onPressIn.foreach(p => __obj.updateDynamic("onPressIn")(p.toJsFn))
    onPressOut.foreach(p => __obj.updateDynamic("onPressOut")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.flexNativeMod.FlexProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.flexNativeMod.FlexProps])(children: _*)
  }
}

