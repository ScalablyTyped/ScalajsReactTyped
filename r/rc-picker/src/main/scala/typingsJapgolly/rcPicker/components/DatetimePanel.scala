package typingsJapgolly.rcPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcPicker.datetimePanelMod.DatetimePanelProps
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.rcPicker.interfaceMod.DisabledTimes
import typingsJapgolly.rcPicker.interfaceMod.Locale
import typingsJapgolly.rcPicker.interfaceMod.NullableDateType
import typingsJapgolly.rcPicker.interfaceMod.PanelMode
import typingsJapgolly.rcPicker.interfaceMod.PanelRefProps
import typingsJapgolly.rcPicker.rcPickerStrings.key
import typingsJapgolly.rcPicker.rcPickerStrings.mouse
import typingsJapgolly.rcPicker.rcPickerStrings.submit
import typingsJapgolly.rcPicker.timePanelMod.SharedTimeProps
import typingsJapgolly.rcPicker.uiUtilMod.KeyboardConfig
import typingsJapgolly.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatetimePanel {
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    operationRef: MutableRefObject[PanelRefProps],
    prefixCls: String,
    viewDate: DateType,
    onPanelChange: (/* mode */ PanelMode | Null, DateType) => Callback,
    onSelect: (DateType, /* type */ key | mouse | submit) => Callback,
    onViewDateChange: DateType => Callback,
    active: js.UndefOr[Boolean] = js.undefined,
    dateRender: (DateType, DateType) => CallbackTo[Node] = null,
    defaultPickerValue: DateType = null,
    defaultValue: DateType = null,
    disabledDate: DateType => CallbackTo[Boolean] = null,
    disabledTime: /* date */ DateType | Null => CallbackTo[DisabledTimes] = null,
    keyboardConfig: KeyboardConfig = null,
    nextIcon: VdomNode = null,
    panelName: String = null,
    prefixColumn: DateType => CallbackTo[Node] = null,
    prevIcon: VdomNode = null,
    rowClassName: DateType => CallbackTo[String] = null,
    showTime: Boolean | SharedTimeProps[DateType] = null,
    superNextIcon: VdomNode = null,
    superPrevIcon: VdomNode = null,
    value: NullableDateType[DateType] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    DatetimePanelProps[DateType], 
    MountedWithRawType[
      DatetimePanelProps[DateType], 
      js.Object, 
      RawMounted[DatetimePanelProps[DateType], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2((t0: /* mode */ typingsJapgolly.rcPicker.interfaceMod.PanelMode | scala.Null, t1: DateType) => onPanelChange(t0, t1).runNow()))
    __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: DateType, t1: /* type */ typingsJapgolly.rcPicker.rcPickerStrings.key | typingsJapgolly.rcPicker.rcPickerStrings.mouse | typingsJapgolly.rcPicker.rcPickerStrings.submit) => onSelect(t0, t1).runNow()))
    __obj.updateDynamic("onViewDateChange")(js.Any.fromFunction1((t0: DateType) => onViewDateChange(t0).runNow()))
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2((t0: DateType, t1: DateType) => dateRender(t0, t1).runNow()))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: DateType) => disabledDate(t0).runNow()))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction1((t0: /* date */ DateType | scala.Null) => disabledTime(t0).runNow()))
    if (keyboardConfig != null) __obj.updateDynamic("keyboardConfig")(keyboardConfig.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.rawNode.asInstanceOf[js.Any])
    if (panelName != null) __obj.updateDynamic("panelName")(panelName.asInstanceOf[js.Any])
    if (prefixColumn != null) __obj.updateDynamic("prefixColumn")(js.Any.fromFunction1((t0: DateType) => prefixColumn(t0).runNow()))
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.rawNode.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1((t0: DateType) => rowClassName(t0).runNow()))
    if (showTime != null) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (superNextIcon != null) __obj.updateDynamic("superNextIcon")(superNextIcon.rawNode.asInstanceOf[js.Any])
    if (superPrevIcon != null) __obj.updateDynamic("superPrevIcon")(superPrevIcon.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.rcPicker.datetimePanelMod.DatetimePanelProps[DateType], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcPicker.datetimePanelMod.DatetimePanelProps[DateType]])(children: _*)
  }
  @JSImport("rc-picker/lib/panels/DatetimePanel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

