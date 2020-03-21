package typingsJapgolly.titanium.Titanium.Calendar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import typingsJapgolly.titanium.daysOfTheWeekDictionary
import typingsJapgolly.titanium.recurrenceEndDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that is used to describe the recurrence pattern for a recurring event.
		 */
trait RecurrenceRule extends Proxy {
  /**
  			 * Identifier for the recurrence rule's calendar.
  			 */
  val calendarID: String
  /**
  			 * The days of the month that the event occurs, as an array of number objects.
  			 * Values can be from 1 to 31 and from -1 to -31. This parameter is only valid for
  			 * recurrence rules of type
  			 * [RECURRENCEFREQUENCY_MONTHLY](Titanium.Calendar.RECURRENCEFREQUENCY_MONTHLY).
  			 */
  val daysOfTheMonth: js.Array[Double]
  /**
  			 * The days of the week that the event occurs, as an Dictionay of `daysOfWeek` and `Week`.
  			 */
  val daysOfTheWeek: daysOfTheWeekDictionary
  /**
  			 * The days of the year that the event occurs, as an array of number objects.
  			 * Values can be from 1 to 366 and from -1 to -366. This parameter is only valid for
  			 * recurrence rules of type [RECURRENCEFREQUENCY_YEARLY](Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY).
  			 */
  val daysOfTheYear: js.Array[Double]
  /**
  			 * End of a recurrence rule.
  			 */
  val end: recurrenceEndDictionary
  /**
  			 * Frequency of the recurrence rule.
  			 */
  val frequency: Double
  /**
  			 * The interval between instances of this recurrence. For example, a weekly
  			 * recurrence rule with an interval of 2 occurs every other week. Must be greater than 0.
  			 */
  val interval: Double
  /**
  			 * The months of the year that the event occurs, as an array of Number objects.
  			 * Values can be from 1 to 12. This parameter is only valid for recurrence rules of
  			 * type [RECURRENCEFREQUENCY_YEARLY](Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY).
  			 */
  val monthsOfTheYear: js.Array[Double]
  /**
  			 * An array of ordinal numbers that filters which recurrences to include in the
  			 * recurrence rule's frequency. For example, a yearly recurrence rule that has a
  			 * [daysOfTheWeek](Titanium.Calendar.RecurrenceRule.daysOfTheWeek) value that specifies
  			 * Monday through Friday, and a `setPositions` array containing 2 and -1, occurs only
  			 * on the second weekday and last weekday of every year.
  			 */
  val setPositions: js.Array[Double]
  /**
  			 * The weeks of the year that the event occurs, as an array of number objects.
  			 * Values can be from 1 to 53 and from -1 to -53. This parameter is only valid for
  			 * recurrence rules of type [RECURRENCEFREQUENCY_YEARLY](Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY).
  			 */
  val weeksOfTheYear: js.Array[Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.calendarID> property.
  			 */
  def getCalendarID(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.daysOfTheMonth> property.
  			 */
  def getDaysOfTheMonth(): js.Array[Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.daysOfTheWeek> property.
  			 */
  def getDaysOfTheWeek(): daysOfTheWeekDictionary
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.daysOfTheYear> property.
  			 */
  def getDaysOfTheYear(): js.Array[Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.end> property.
  			 */
  def getEnd(): recurrenceEndDictionary
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.frequency> property.
  			 */
  def getFrequency(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.interval> property.
  			 */
  def getInterval(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.monthsOfTheYear> property.
  			 */
  def getMonthsOfTheYear(): js.Array[Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.setPositions> property.
  			 */
  def getSetPositions(): js.Array[Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.weeksOfTheYear> property.
  			 */
  def getWeeksOfTheYear(): js.Array[Double]
}

object RecurrenceRule {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    calendarID: String,
    daysOfTheMonth: js.Array[Double],
    daysOfTheWeek: daysOfTheWeekDictionary,
    daysOfTheYear: js.Array[Double],
    end: recurrenceEndDictionary,
    fireEvent: (String, js.Any) => Callback,
    frequency: Double,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getCalendarID: CallbackTo[String],
    getDaysOfTheMonth: CallbackTo[js.Array[Double]],
    getDaysOfTheWeek: CallbackTo[daysOfTheWeekDictionary],
    getDaysOfTheYear: CallbackTo[js.Array[Double]],
    getEnd: CallbackTo[recurrenceEndDictionary],
    getFrequency: CallbackTo[Double],
    getInterval: CallbackTo[Double],
    getMonthsOfTheYear: CallbackTo[js.Array[Double]],
    getSetPositions: CallbackTo[js.Array[Double]],
    getWeeksOfTheYear: CallbackTo[js.Array[Double]],
    interval: Double,
    monthsOfTheYear: js.Array[Double],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setPositions: js.Array[Double],
    weeksOfTheYear: js.Array[Double],
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): RecurrenceRule = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], calendarID = calendarID.asInstanceOf[js.Any], daysOfTheMonth = daysOfTheMonth.asInstanceOf[js.Any], daysOfTheWeek = daysOfTheWeek.asInstanceOf[js.Any], daysOfTheYear = daysOfTheYear.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], monthsOfTheYear = monthsOfTheYear.asInstanceOf[js.Any], setPositions = setPositions.asInstanceOf[js.Any], weeksOfTheYear = weeksOfTheYear.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getCalendarID")(getCalendarID.toJsFn)
    __obj.updateDynamic("getDaysOfTheMonth")(getDaysOfTheMonth.toJsFn)
    __obj.updateDynamic("getDaysOfTheWeek")(getDaysOfTheWeek.toJsFn)
    __obj.updateDynamic("getDaysOfTheYear")(getDaysOfTheYear.toJsFn)
    __obj.updateDynamic("getEnd")(getEnd.toJsFn)
    __obj.updateDynamic("getFrequency")(getFrequency.toJsFn)
    __obj.updateDynamic("getInterval")(getInterval.toJsFn)
    __obj.updateDynamic("getMonthsOfTheYear")(getMonthsOfTheYear.toJsFn)
    __obj.updateDynamic("getSetPositions")(getSetPositions.toJsFn)
    __obj.updateDynamic("getWeeksOfTheYear")(getWeeksOfTheYear.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceRule]
  }
}

