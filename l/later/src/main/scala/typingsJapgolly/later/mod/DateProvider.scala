package typingsJapgolly.later.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateProvider extends js.Object {
  /**
    * Set later to use UTC time.
    */
  def UTC(): Unit
  /**
    * Set later to use local time.
    */
  def localTime(): Unit
  /**
    * Builds and returns a new Date using the specified values.  Date
    * returned is either using Local time or UTC based on isLocal.
    *
    * @param [Y]: Four digit year
    * @param [M]: Month between 1 and 12, defaults to 1
    * @param [D]: Date between 1 and 31, defaults to 1
    * @param [h]: Hour between 0 and 23, defaults to 0
    * @param [m]: Minute between 0 and 59, defaults to 0
    * @param [s]: Second between 0 and 59, defaults to 0
    */
  def next(
    Y: js.UndefOr[Double],
    M: js.UndefOr[Double],
    D: js.UndefOr[Double],
    h: js.UndefOr[Double],
    m: js.UndefOr[Double],
    s: js.UndefOr[Double]
  ): js.Date
  /**
    * Determines if a value will cause a particular constraint to rollover to the
    * next largest time period. Used primarily when a constraint has a
    * variable extent.
    *
    * @param d: Date
    * @param val: Value
    * @param constraint: A modifier
    * @param period: A time period
    */
  def nextRollover(d: js.Date, `val`: Double, constraint: Modifier, period: TimePeriod): js.Date
  /**
    * Builds and returns a new Date using the specified values.  Date
    * returned is either using Local time or UTC based on isLocal.
    *
    * @param [Y]: Four digit year
    * @param [M]: Month between 0 and 11, defaults to 11
    * @param [D]: Date between 1 and 31, defaults to last day of month
    * @param [h]: Hour between 0 and 23, defaults to 23
    * @param [m]: Minute between 0 and 59, defaults to 59
    * @param [s]: Second between 0 and 59, defaults to 59
    */
  def prev(
    Y: js.UndefOr[Double],
    M: js.UndefOr[Double],
    D: js.UndefOr[Double],
    h: js.UndefOr[Double],
    m: js.UndefOr[Double],
    s: js.UndefOr[Double]
  ): js.Date
  /**
    * Determines if a value will cause a particular constraint to rollover to the
    * previous largest time period. Used primarily when a constraint has a
    * variable extent.
    *
    * @param d: Date
    * @param val: Value
    * @param constraint: A modifier
    * @param period: A time period
    */
  def prevRollover(d: js.Date, `val`: Double, constraint: Modifier, period: TimePeriod): js.Date
}

object DateProvider {
  @scala.inline
  def apply(
    UTC: Callback,
    localTime: Callback,
    next: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double]) => CallbackTo[js.Date],
    nextRollover: (js.Date, Double, Modifier, TimePeriod) => CallbackTo[js.Date],
    prev: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double]) => CallbackTo[js.Date],
    prevRollover: (js.Date, Double, Modifier, TimePeriod) => CallbackTo[js.Date]
  ): DateProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("UTC")(UTC.toJsFn)
    __obj.updateDynamic("localTime")(localTime.toJsFn)
    __obj.updateDynamic("next")(js.Any.fromFunction6((t0: js.UndefOr[scala.Double], t1: js.UndefOr[scala.Double], t2: js.UndefOr[scala.Double], t3: js.UndefOr[scala.Double], t4: js.UndefOr[scala.Double], t5: js.UndefOr[scala.Double]) => next(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("nextRollover")(js.Any.fromFunction4((t0: js.Date, t1: scala.Double, t2: typingsJapgolly.later.mod.Modifier, t3: typingsJapgolly.later.mod.TimePeriod) => nextRollover(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("prev")(js.Any.fromFunction6((t0: js.UndefOr[scala.Double], t1: js.UndefOr[scala.Double], t2: js.UndefOr[scala.Double], t3: js.UndefOr[scala.Double], t4: js.UndefOr[scala.Double], t5: js.UndefOr[scala.Double]) => prev(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("prevRollover")(js.Any.fromFunction4((t0: js.Date, t1: scala.Double, t2: typingsJapgolly.later.mod.Modifier, t3: typingsJapgolly.later.mod.TimePeriod) => prevRollover(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[DateProvider]
  }
}

