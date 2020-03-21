package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.button
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.number
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.pointer
import typingsJapgolly.antdMobileRn.paginationIndexNativeMod.PaginationNativeProps
import typingsJapgolly.antdMobileRn.paginationStyleIndexNativeMod.IPaginationStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination {
  def apply(
    current: Double,
    total: Double,
    indicatorStyle: StyleProp[ViewStyle] = null,
    mode: button | number | pointer = null,
    nextText: String = null,
    onChange: /* current */ Double => Callback = null,
    onNext: js.UndefOr[Callback] = js.undefined,
    onPrev: js.UndefOr[Callback] = js.undefined,
    prevText: String = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: IPaginationStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PaginationNativeProps, 
    typingsJapgolly.antdMobileRn.mod.Pagination, 
    Unit, 
    PaginationNativeProps
  ] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
      if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* current */ scala.Double) => onChange(t0).runNow()))
    onNext.foreach(p => __obj.updateDynamic("onNext")(p.toJsFn))
    onPrev.foreach(p => __obj.updateDynamic("onPrev")(p.toJsFn))
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.paginationIndexNativeMod.PaginationNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.Pagination](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.paginationIndexNativeMod.PaginationNativeProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "Pagination")
  @js.native
  object componentImport extends js.Object
  
}

