package typingsJapgolly.reactCalendarHeatmap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCalendarHeatmap.mod.Props
import typingsJapgolly.reactCalendarHeatmap.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCalendarHeatmap {
  def apply(
    values: js.Array[_],
    classForValue: /* value */ js.Any => CallbackTo[js.Any] = null,
    endDate: String | Double | js.Date = null,
    gutterSize: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    monthLabels: js.Array[String] = null,
    numDays: Int | Double = null,
    onClick: /* value */ js.Any => Callback = null,
    onMouseLeave: (/* e */ js.Any, /* value */ js.Any) => Callback = null,
    onMouseOver: (/* e */ js.Any, /* value */ js.Any) => Callback = null,
    showMonthLabels: js.UndefOr[Boolean] = js.undefined,
    showOutOfRangeDays: js.UndefOr[Boolean] = js.undefined,
    showWeekdayLabels: js.UndefOr[Boolean] = js.undefined,
    startDate: String | Double | js.Date = null,
    titleForValue: /* value */ js.Any => CallbackTo[js.Any] = null,
    tooltipDataAttrs: js.Object = null,
    transformDayElement: (/* rect */ js.Any, /* value */ js.Any, /* index */ Double) => CallbackTo[js.Any] = null,
    weekdayLabels: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
  
      if (classForValue != null) __obj.updateDynamic("classForValue")(js.Any.fromFunction1((t0: /* value */ js.Any) => classForValue(t0).runNow()))
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (gutterSize != null) __obj.updateDynamic("gutterSize")(gutterSize.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (monthLabels != null) __obj.updateDynamic("monthLabels")(monthLabels.asInstanceOf[js.Any])
    if (numDays != null) __obj.updateDynamic("numDays")(numDays.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* value */ js.Any) => onClick(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* value */ js.Any) => onMouseLeave(t0, t1).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* value */ js.Any) => onMouseOver(t0, t1).runNow()))
    if (!js.isUndefined(showMonthLabels)) __obj.updateDynamic("showMonthLabels")(showMonthLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutOfRangeDays)) __obj.updateDynamic("showOutOfRangeDays")(showOutOfRangeDays.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekdayLabels)) __obj.updateDynamic("showWeekdayLabels")(showWeekdayLabels.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (titleForValue != null) __obj.updateDynamic("titleForValue")(js.Any.fromFunction1((t0: /* value */ js.Any) => titleForValue(t0).runNow()))
    if (tooltipDataAttrs != null) __obj.updateDynamic("tooltipDataAttrs")(tooltipDataAttrs.asInstanceOf[js.Any])
    if (transformDayElement != null) __obj.updateDynamic("transformDayElement")(js.Any.fromFunction3((t0: /* rect */ js.Any, t1: /* value */ js.Any, t2: /* index */ scala.Double) => transformDayElement(t0, t1, t2).runNow()))
    if (weekdayLabels != null) __obj.updateDynamic("weekdayLabels")(weekdayLabels.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCalendarHeatmap.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCalendarHeatmap.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCalendarHeatmap.mod.Props])(children: _*)
  }
  @JSImport("react-calendar-heatmap", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

