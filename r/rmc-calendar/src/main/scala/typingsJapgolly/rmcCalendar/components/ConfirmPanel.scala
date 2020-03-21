package typingsJapgolly.rmcCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcCalendar.confirmPanelMod.ConfirmPanelPropsType
import typingsJapgolly.rmcCalendar.confirmPanelMod.default
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.one
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfirmPanel {
  def apply(
    locale: Locale,
    onConfirm: Callback,
    disableBtn: js.UndefOr[Boolean] = js.undefined,
    endDateTime: js.Date = null,
    formatStr: String = null,
    onlyConfirm: js.UndefOr[Boolean] = js.undefined,
    startDateTime: js.Date = null,
    `type`: one | range = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ConfirmPanelPropsType, default, Unit, ConfirmPanelPropsType] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onConfirm")(onConfirm.toJsFn)
    if (!js.isUndefined(disableBtn)) __obj.updateDynamic("disableBtn")(disableBtn.asInstanceOf[js.Any])
    if (endDateTime != null) __obj.updateDynamic("endDateTime")(endDateTime.asInstanceOf[js.Any])
    if (formatStr != null) __obj.updateDynamic("formatStr")(formatStr.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyConfirm)) __obj.updateDynamic("onlyConfirm")(onlyConfirm.asInstanceOf[js.Any])
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcCalendar.confirmPanelMod.ConfirmPanelPropsType, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcCalendar.confirmPanelMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcCalendar.confirmPanelMod.ConfirmPanelPropsType])(children: _*)
  }
  @JSImport("rmc-calendar/lib/calendar/ConfirmPanel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

