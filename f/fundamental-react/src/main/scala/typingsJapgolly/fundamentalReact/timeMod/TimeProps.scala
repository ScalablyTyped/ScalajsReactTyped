package typingsJapgolly.fundamentalReact.timeMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.AnonHour
import typingsJapgolly.fundamentalReact.AnonMeridiemAM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  disabled ? :boolean,   hoursDownButtonProps ? :{[x: string] : any},   hoursInputProps ? :{[x: string] : any},   hoursUpButtonProps ? :{[x: string] : any},   id ? :string,   localizedText ? :{  meridiemAM  :string,   meridiemPM  :string},   meridiemDownButtonProps ? :{[x: string] : any},   meridiemInputProps ? :{[x: string] : any},   meridiemUpButtonProps ? :{[x: string] : any},   minutesDownButtonProps ? :{[x: string] : any},   minutesInputProps ? :{[x: string] : any},   minutesUpButtonProps ? :{[x: string] : any},   secondsDownButtonProps ? :{[x: string] : any},   secondsInputProps ? :{[x: string] : any},   secondsUpButtonProps ? :{[x: string] : any}, onChange ? (time : {  hour  :string,   minute  :string,   second  :string,   meridiem  :0 | 1}): void, [x: string] : any} & fundamental-react.fundamental-react/lib/Time/Time.TimeBaseProps */
trait TimeProps
  extends /* x */ StringDictionary[js.Any] {
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to use the 12-hour clock (hours ranging from 01 to 12) and to display a meridiem control. */
  var format12Hours: js.UndefOr[Boolean] = js.undefined
  /* Additional props to be spread to the hours down `<button>` element. */
  var hoursDownButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the hours `<input>` element. */
  var hoursInputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the hours up `<button>` element. */
  var hoursUpButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var localizedText: js.UndefOr[AnonMeridiemAM] = js.undefined
  /* Additional props to be spread to the meridiem down `<button>` element. */
  var meridiemDownButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the meridiem `<input>` element. */
  var meridiemInputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the meridiem up `<button>` element. */
  var meridiemUpButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the minutes down `<button>` element. */
  var minutesDownButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the minutes `<input>` element. */
  var minutesInputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the minutes up `<button>` element. */
  var minutesUpButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* time */ AnonHour, Unit]] = js.undefined
  /* Additional props to be spread to the seconds down `<button>` element. */
  var secondsDownButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the seconds `<input>` element. */
  var secondsInputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the seconds up `<button>` element. */
  var secondsUpButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Enables the input for hours. */
  var showHour: js.UndefOr[Boolean] = js.undefined
  /* Enables the input for minutes. */
  var showMinute: js.UndefOr[Boolean] = js.undefined
  /* Enables the input for seconds. */
  var showSecond: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to show up/down buttons for each input. */
  var spinners: js.UndefOr[Boolean] = js.undefined
  /* The time component values. Contains four properties:
    **hour** (with values from 01 to 12 when `format12Hours` is true or 00 to 23 when `format12Hours` is false),
    **minute** (with values from 00 to 59), **second** (with values from 00 to 59),
    **meridiem** (with values 0 for AM or 1 for PM). */
  var time: js.UndefOr[AnonHour] = js.undefined
}

object TimeProps {
  @scala.inline
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
    time: AnonHour = null
  ): TimeProps = {
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
    __obj.asInstanceOf[TimeProps]
  }
}

