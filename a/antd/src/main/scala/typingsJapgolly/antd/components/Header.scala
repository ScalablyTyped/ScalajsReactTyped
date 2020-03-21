package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.generateCalendarMod.CalendarMode
import typingsJapgolly.antd.headerMod.CalendarHeaderProps
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  def apply[DateType](
    fullscreen: Boolean,
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    mode: CalendarMode,
    prefixCls: String,
    value: DateType,
    onChange: DateType => Callback,
    onModeChange: CalendarMode => Callback,
    validRange: js.Tuple2[DateType, DateType] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    CalendarHeaderProps[DateType], 
    MountedWithRawType[
      CalendarHeaderProps[DateType], 
      js.Object, 
      RawMounted[CalendarHeaderProps[DateType], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: DateType) => onChange(t0).runNow()))
    __obj.updateDynamic("onModeChange")(js.Any.fromFunction1((t0: typingsJapgolly.antd.generateCalendarMod.CalendarMode) => onModeChange(t0).runNow()))
    if (validRange != null) __obj.updateDynamic("validRange")(validRange.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.headerMod.CalendarHeaderProps[DateType], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.headerMod.CalendarHeaderProps[DateType]])(children: _*)
  }
  @JSImport("antd/lib/calendar/Header", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

