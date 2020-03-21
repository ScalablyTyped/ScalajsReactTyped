package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.AnonHour
import typingsJapgolly.fundamentalReact.AnonMeridiemAM
import typingsJapgolly.fundamentalReact.timeMod.TimeProps
import typingsJapgolly.fundamentalReact.timeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Time {
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format12Hours: js.UndefOr[Boolean] = js.undefined,
    hoursDownButtonProps: StringDictionary[js.Any] = null,
    hoursInputProps: StringDictionary[js.Any] = null,
    hoursUpButtonProps: StringDictionary[js.Any] = null,
    id: String = null,
    localizedText: AnonMeridiemAM = null,
    meridiemDownButtonProps: StringDictionary[js.Any] = null,
    meridiemInputProps: StringDictionary[js.Any] = null,
    meridiemUpButtonProps: StringDictionary[js.Any] = null,
    minutesDownButtonProps: StringDictionary[js.Any] = null,
    minutesInputProps: StringDictionary[js.Any] = null,
    minutesUpButtonProps: StringDictionary[js.Any] = null,
    onChange: /* time */ AnonHour => Callback = null,
    secondsDownButtonProps: StringDictionary[js.Any] = null,
    secondsInputProps: StringDictionary[js.Any] = null,
    secondsUpButtonProps: StringDictionary[js.Any] = null,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    spinners: js.UndefOr[Boolean] = js.undefined,
    time: AnonHour = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TimeProps, default, Unit, TimeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(format12Hours)) __obj.updateDynamic("format12Hours")(format12Hours.asInstanceOf[js.Any])
    if (hoursDownButtonProps != null) __obj.updateDynamic("hoursDownButtonProps")(hoursDownButtonProps.asInstanceOf[js.Any])
    if (hoursInputProps != null) __obj.updateDynamic("hoursInputProps")(hoursInputProps.asInstanceOf[js.Any])
    if (hoursUpButtonProps != null) __obj.updateDynamic("hoursUpButtonProps")(hoursUpButtonProps.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (meridiemDownButtonProps != null) __obj.updateDynamic("meridiemDownButtonProps")(meridiemDownButtonProps.asInstanceOf[js.Any])
    if (meridiemInputProps != null) __obj.updateDynamic("meridiemInputProps")(meridiemInputProps.asInstanceOf[js.Any])
    if (meridiemUpButtonProps != null) __obj.updateDynamic("meridiemUpButtonProps")(meridiemUpButtonProps.asInstanceOf[js.Any])
    if (minutesDownButtonProps != null) __obj.updateDynamic("minutesDownButtonProps")(minutesDownButtonProps.asInstanceOf[js.Any])
    if (minutesInputProps != null) __obj.updateDynamic("minutesInputProps")(minutesInputProps.asInstanceOf[js.Any])
    if (minutesUpButtonProps != null) __obj.updateDynamic("minutesUpButtonProps")(minutesUpButtonProps.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* time */ typingsJapgolly.fundamentalReact.AnonHour) => onChange(t0).runNow()))
    if (secondsDownButtonProps != null) __obj.updateDynamic("secondsDownButtonProps")(secondsDownButtonProps.asInstanceOf[js.Any])
    if (secondsInputProps != null) __obj.updateDynamic("secondsInputProps")(secondsInputProps.asInstanceOf[js.Any])
    if (secondsUpButtonProps != null) __obj.updateDynamic("secondsUpButtonProps")(secondsUpButtonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.asInstanceOf[js.Any])
    if (!js.isUndefined(spinners)) __obj.updateDynamic("spinners")(spinners.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fundamentalReact.timeMod.TimeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fundamentalReact.timeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fundamentalReact.timeMod.TimeProps])(children: _*)
  }
  @JSImport("fundamental-react/lib/Time/Time", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

