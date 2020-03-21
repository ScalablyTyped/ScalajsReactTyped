package typingsJapgolly.clndr.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEvents extends js.Object {
  /**
    * Fired whenever a calendar box is clicked. Returns a 'target' object
    * containing the DOM element, any events, and the date as a moment.js
    * object.
    */
  var click: js.UndefOr[js.Function1[/* target */ Target, Unit]] = js.undefined
  /**
    * Fired when a user goes forward a period. Returns moment.js objects
    * for the updated start and end date.
    */
  var nextInterval: js.UndefOr[js.Function2[/* start */ Moment, /* end */ Moment, Unit]] = js.undefined
  /**
    * Fired when a user goes forward a month. Returns a moment.js object
    * set to the correct month.
    */
  var nextMonth: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
  /**
    * Fired when the next year button is clicked. Returns a moment.js
    * object set to the correct month and year.
    */
  var nextYear: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
  /**
    * Fired whenever the time period changes as configured in lengthOfTime.
    * Returns moment.js objects for the updated start and end date.
    */
  var onIntervalChange: js.UndefOr[js.Function2[/* start */ Moment, /* end */ Moment, Unit]] = js.undefined
  /**
    * Fires any time the month changes as a result of a click action.
    * Returns a moment.js object set to the correct month.
    */
  var onMonthChange: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
  /**
    * Fires any time the year changes as a result of a click action. If
    * onMonthChange is also set, it is fired BEFORE onYearChange. Returns
    * a moment.js object set to the correct month and year.
    */
  var onYearChange: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
  /**
    * Fired when a user goes back an interval. Returns moment.js objects for
    * the updated start and end date.
    */
  var previousInterval: js.UndefOr[js.Function2[/* start */ Moment, /* end */ Moment, Unit]] = js.undefined
  /**
    * Fired when a user goes back a month. Returns a moment.js object set
    * to the correct month.
    *
    */
  var previousMonth: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
  /**
    * Fired when the previous year button is clicked. Returns a moment.js
    * object set to the correct month and year.
    */
  var previousYear: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
  /**
    * Fired when a user goes to the current month and year. Returns a
    * moment.js object set to the correct month.
    */
  var today: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.undefined
}

object ClickEvents {
  @scala.inline
  def apply(
    click: /* target */ Target => Callback = null,
    nextInterval: (/* start */ Moment, /* end */ Moment) => Callback = null,
    nextMonth: /* month */ Moment => Callback = null,
    nextYear: /* month */ Moment => Callback = null,
    onIntervalChange: (/* start */ Moment, /* end */ Moment) => Callback = null,
    onMonthChange: /* month */ Moment => Callback = null,
    onYearChange: /* month */ Moment => Callback = null,
    previousInterval: (/* start */ Moment, /* end */ Moment) => Callback = null,
    previousMonth: /* month */ Moment => Callback = null,
    previousYear: /* month */ Moment => Callback = null,
    today: /* month */ Moment => Callback = null
  ): ClickEvents = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* target */ typingsJapgolly.clndr.mod.Target) => click(t0).runNow()))
    if (nextInterval != null) __obj.updateDynamic("nextInterval")(js.Any.fromFunction2((t0: /* start */ typingsJapgolly.moment.mod.Moment, t1: /* end */ typingsJapgolly.moment.mod.Moment) => nextInterval(t0, t1).runNow()))
    if (nextMonth != null) __obj.updateDynamic("nextMonth")(js.Any.fromFunction1((t0: /* month */ typingsJapgolly.moment.mod.Moment) => nextMonth(t0).runNow()))
    if (nextYear != null) __obj.updateDynamic("nextYear")(js.Any.fromFunction1((t0: /* month */ typingsJapgolly.moment.mod.Moment) => nextYear(t0).runNow()))
    if (onIntervalChange != null) __obj.updateDynamic("onIntervalChange")(js.Any.fromFunction2((t0: /* start */ typingsJapgolly.moment.mod.Moment, t1: /* end */ typingsJapgolly.moment.mod.Moment) => onIntervalChange(t0, t1).runNow()))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1((t0: /* month */ typingsJapgolly.moment.mod.Moment) => onMonthChange(t0).runNow()))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1((t0: /* month */ typingsJapgolly.moment.mod.Moment) => onYearChange(t0).runNow()))
    if (previousInterval != null) __obj.updateDynamic("previousInterval")(js.Any.fromFunction2((t0: /* start */ typingsJapgolly.moment.mod.Moment, t1: /* end */ typingsJapgolly.moment.mod.Moment) => previousInterval(t0, t1).runNow()))
    if (previousMonth != null) __obj.updateDynamic("previousMonth")(js.Any.fromFunction1((t0: /* month */ typingsJapgolly.moment.mod.Moment) => previousMonth(t0).runNow()))
    if (previousYear != null) __obj.updateDynamic("previousYear")(js.Any.fromFunction1((t0: /* month */ typingsJapgolly.moment.mod.Moment) => previousYear(t0).runNow()))
    if (today != null) __obj.updateDynamic("today")(js.Any.fromFunction1((t0: /* month */ typingsJapgolly.moment.mod.Moment) => today(t0).runNow()))
    __obj.asInstanceOf[ClickEvents]
  }
}

