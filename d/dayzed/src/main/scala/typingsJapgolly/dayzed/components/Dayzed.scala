package typingsJapgolly.dayzed.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dayzed.dayzedNumbers.`0`
import typingsJapgolly.dayzed.dayzedNumbers.`1`
import typingsJapgolly.dayzed.dayzedNumbers.`2`
import typingsJapgolly.dayzed.dayzedNumbers.`3`
import typingsJapgolly.dayzed.dayzedNumbers.`4`
import typingsJapgolly.dayzed.dayzedNumbers.`5`
import typingsJapgolly.dayzed.dayzedNumbers.`6`
import typingsJapgolly.dayzed.mod.DateObj
import typingsJapgolly.dayzed.mod.Props
import typingsJapgolly.dayzed.mod.RenderProps
import typingsJapgolly.dayzed.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dayzed {
  def apply(
    onDateSelected: DateObj => Callback,
    date: js.Date = null,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    monthsToDisplay: Int | Double = null,
    offset: Int | Double = null,
    onOffsetChanged: /* offset */ Double => Callback = null,
    render: /* renderProps */ RenderProps => CallbackTo[Node] = null,
    selected: js.Date | js.Array[js.Date] = null,
    showOutsideDays: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* renderProps */ RenderProps => CallbackTo[Node] = null
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* renderProps */ typingsJapgolly.dayzed.mod.RenderProps) => children(t0).runNow()))
    __obj.updateDynamic("onDateSelected")(js.Any.fromFunction1((t0: typingsJapgolly.dayzed.mod.DateObj) => onDateSelected(t0).runNow()))
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthsToDisplay != null) __obj.updateDynamic("monthsToDisplay")(monthsToDisplay.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onOffsetChanged != null) __obj.updateDynamic("onOffsetChanged")(js.Any.fromFunction1((t0: /* offset */ scala.Double) => onOffsetChanged(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* renderProps */ typingsJapgolly.dayzed.mod.RenderProps) => render(t0).runNow()))
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutsideDays)) __obj.updateDynamic("showOutsideDays")(showOutsideDays.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.dayzed.mod.Props, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.dayzed.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.dayzed.mod.Props])
  }
  @JSImport("dayzed", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

