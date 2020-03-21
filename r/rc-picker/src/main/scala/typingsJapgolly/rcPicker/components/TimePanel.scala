package typingsJapgolly.rcPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.rcPicker.interfaceMod.Locale
import typingsJapgolly.rcPicker.interfaceMod.NullableDateType
import typingsJapgolly.rcPicker.interfaceMod.PanelMode
import typingsJapgolly.rcPicker.interfaceMod.PanelRefProps
import typingsJapgolly.rcPicker.rcPickerStrings.key
import typingsJapgolly.rcPicker.rcPickerStrings.mouse
import typingsJapgolly.rcPicker.rcPickerStrings.submit
import typingsJapgolly.rcPicker.timePanelMod.TimePanelProps
import typingsJapgolly.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimePanel {
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    operationRef: MutableRefObject[PanelRefProps],
    prefixCls: String,
    viewDate: DateType,
    onPanelChange: (Null | PanelMode, DateType) => Callback,
    onSelect: (DateType, /* type */ key | mouse | submit) => Callback,
    onViewDateChange: DateType => Callback,
    active: js.UndefOr[Boolean] = js.undefined,
    defaultPickerValue: DateType = null,
    defaultValue: DateType = null,
    disabledDate: DateType => CallbackTo[Boolean] = null,
    disabledHours: js.UndefOr[CallbackTo[js.Array[Double]]] = js.undefined,
    disabledMinutes: /* hour */ Double => CallbackTo[js.Array[Double]] = null,
    disabledSeconds: (/* hour */ Double, /* minute */ Double) => CallbackTo[js.Array[Double]] = null,
    format: String = null,
    hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
    hourStep: Int | Double = null,
    minuteStep: Int | Double = null,
    nextIcon: VdomNode = null,
    prevIcon: VdomNode = null,
    secondStep: Int | Double = null,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    superNextIcon: VdomNode = null,
    superPrevIcon: VdomNode = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: NullableDateType[DateType] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TimePanelProps[DateType], 
    MountedWithRawType[TimePanelProps[DateType], js.Object, RawMounted[TimePanelProps[DateType], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2((t0: scala.Null | typingsJapgolly.rcPicker.interfaceMod.PanelMode, t1: DateType) => onPanelChange(t0, t1).runNow()))
    __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: DateType, t1: /* type */ typingsJapgolly.rcPicker.rcPickerStrings.key | typingsJapgolly.rcPicker.rcPickerStrings.mouse | typingsJapgolly.rcPicker.rcPickerStrings.submit) => onSelect(t0, t1).runNow()))
    __obj.updateDynamic("onViewDateChange")(js.Any.fromFunction1((t0: DateType) => onViewDateChange(t0).runNow()))
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: DateType) => disabledDate(t0).runNow()))
    disabledHours.foreach(p => __obj.updateDynamic("disabledHours")(p.toJsFn))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1((t0: /* hour */ scala.Double) => disabledMinutes(t0).runNow()))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2((t0: /* hour */ scala.Double, t1: /* minute */ scala.Double) => disabledSeconds(t0, t1).runNow()))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDisabledOptions)) __obj.updateDynamic("hideDisabledOptions")(hideDisabledOptions.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.rawNode.asInstanceOf[js.Any])
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.rawNode.asInstanceOf[js.Any])
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.asInstanceOf[js.Any])
    if (superNextIcon != null) __obj.updateDynamic("superNextIcon")(superNextIcon.rawNode.asInstanceOf[js.Any])
    if (superPrevIcon != null) __obj.updateDynamic("superPrevIcon")(superPrevIcon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.rcPicker.timePanelMod.TimePanelProps[DateType], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcPicker.timePanelMod.TimePanelProps[DateType]])(children: _*)
  }
  @JSImport("rc-picker/lib/panels/TimePanel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

