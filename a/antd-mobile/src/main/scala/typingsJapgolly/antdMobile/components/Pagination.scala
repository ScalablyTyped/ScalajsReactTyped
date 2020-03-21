package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.antdMobileStrings.button
import typingsJapgolly.antdMobile.antdMobileStrings.number
import typingsJapgolly.antdMobile.antdMobileStrings.pointer
import typingsJapgolly.antdMobile.paginationMod.PaginationProps
import typingsJapgolly.antdMobile.paginationMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination {
  def apply(
    current: Double,
    total: Double,
    className: String = null,
    mode: button | number | pointer = null,
    nextText: String = null,
    onChange: /* current */ Double => Callback = null,
    onNext: js.UndefOr[Callback] = js.undefined,
    onPrev: js.UndefOr[Callback] = js.undefined,
    prefixCls: String = null,
    prevText: String = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PaginationProps, default, Unit, PaginationProps] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* current */ scala.Double) => onChange(t0).runNow()))
    onNext.foreach(p => __obj.updateDynamic("onNext")(p.toJsFn))
    onPrev.foreach(p => __obj.updateDynamic("onPrev")(p.toJsFn))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.paginationMod.PaginationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.paginationMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.paginationMod.PaginationProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/pagination", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

