package typingsJapgolly.rcPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcPicker.dateBodyMod.DateBodyProps
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.rcPicker.interfaceMod.Locale
import typingsJapgolly.rcPicker.rcPickerStrings.key
import typingsJapgolly.rcPicker.rcPickerStrings.mouse
import typingsJapgolly.rcPicker.rcPickerStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateBody {
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    prefixCls: String,
    rowCount: Double,
    viewDate: DateType,
    onSelect: (DateType, /* type */ key | mouse | submit) => Callback,
    dateRender: (DateType, DateType) => CallbackTo[Node] = null,
    disabledDate: DateType => CallbackTo[Boolean] = null,
    prefixColumn: DateType => CallbackTo[Node] = null,
    rowClassName: DateType => CallbackTo[String] = null,
    value: DateType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    DateBodyProps[DateType], 
    MountedWithRawType[DateBodyProps[DateType], js.Object, RawMounted[DateBodyProps[DateType], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: DateType, t1: /* type */ typingsJapgolly.rcPicker.rcPickerStrings.key | typingsJapgolly.rcPicker.rcPickerStrings.mouse | typingsJapgolly.rcPicker.rcPickerStrings.submit) => onSelect(t0, t1).runNow()))
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2((t0: DateType, t1: DateType) => dateRender(t0, t1).runNow()))
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: DateType) => disabledDate(t0).runNow()))
    if (prefixColumn != null) __obj.updateDynamic("prefixColumn")(js.Any.fromFunction1((t0: DateType) => prefixColumn(t0).runNow()))
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1((t0: DateType) => rowClassName(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.rcPicker.dateBodyMod.DateBodyProps[DateType], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcPicker.dateBodyMod.DateBodyProps[DateType]])(children: _*)
  }
  @JSImport("rc-picker/lib/panels/DatePanel/DateBody", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

