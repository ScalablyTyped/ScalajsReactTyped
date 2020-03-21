package typingsJapgolly.rmcCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.headerMod.PropsType
import typingsJapgolly.rmcCalendar.headerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  def apply(
    clearIcon: VdomNode = null,
    closeIcon: VdomNode = null,
    locale: Locale = null,
    onCancel: js.UndefOr[Callback] = js.undefined,
    onClear: js.UndefOr[Callback] = js.undefined,
    showClear: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PropsType, default, Unit, PropsType] = {
    val __obj = js.Dynamic.literal()
  
      if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.rawNode.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.rawNode.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    onCancel.foreach(p => __obj.updateDynamic("onCancel")(p.toJsFn))
    onClear.foreach(p => __obj.updateDynamic("onClear")(p.toJsFn))
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcCalendar.headerMod.PropsType, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcCalendar.headerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcCalendar.headerMod.PropsType])(children: _*)
  }
  @JSImport("rmc-calendar/lib/calendar/Header", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

