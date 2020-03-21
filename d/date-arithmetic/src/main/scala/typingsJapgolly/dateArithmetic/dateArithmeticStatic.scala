package typingsJapgolly.dateArithmetic

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** dateArithmetic Public Instance Methods */
trait dateArithmeticStatic extends js.Object {
  /** Add specified amount of units to a provided date and return new date as a result */
  def add(date: js.Date, num: Double, unit: Unit): js.Date
  /** Compare two dates and return true if they are equal */
  def eq(date: js.Date, date2: js.Date): Boolean
  /** Compare two dates and return true if date is greater than date2 */
  def gt(date: js.Date, date2: js.Date): Boolean
  /** Compare two dates and return true if date is greater or equal than date2 */
  def gte(date: js.Date, date2: js.Date): Boolean
  /** Compare two dates and return true if date is less than date2 */
  def lt(date: js.Date, date2: js.Date): Boolean
  /** Compare two dates and return true if date is less or equal than date2 */
  def lte(date: js.Date, date2: js.Date): Boolean
  /** Compare two dates and return false if they are equal */
  def neq(date: js.Date, date2: js.Date): Boolean
  /** Subtract specified amount of units from a provided date and return new date as a result */
  def subtract(date: js.Date, num: Double, unit: Unit): js.Date
}

object dateArithmeticStatic {
  @scala.inline
  def apply(
    add: (js.Date, Double, Unit) => CallbackTo[js.Date],
    eq: (js.Date, js.Date) => CallbackTo[Boolean],
    gt: (js.Date, js.Date) => CallbackTo[Boolean],
    gte: (js.Date, js.Date) => CallbackTo[Boolean],
    lt: (js.Date, js.Date) => CallbackTo[Boolean],
    lte: (js.Date, js.Date) => CallbackTo[Boolean],
    neq: (js.Date, js.Date) => CallbackTo[Boolean],
    subtract: (js.Date, Double, Unit) => CallbackTo[js.Date]
  ): dateArithmeticStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction3((t0: js.Date, t1: scala.Double, t2: typingsJapgolly.dateArithmetic.Unit) => add(t0, t1, t2).runNow()))
    __obj.updateDynamic("eq")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => eq(t0, t1).runNow()))
    __obj.updateDynamic("gt")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => gt(t0, t1).runNow()))
    __obj.updateDynamic("gte")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => gte(t0, t1).runNow()))
    __obj.updateDynamic("lt")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => lt(t0, t1).runNow()))
    __obj.updateDynamic("lte")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => lte(t0, t1).runNow()))
    __obj.updateDynamic("neq")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => neq(t0, t1).runNow()))
    __obj.updateDynamic("subtract")(js.Any.fromFunction3((t0: js.Date, t1: scala.Double, t2: typingsJapgolly.dateArithmetic.Unit) => subtract(t0, t1, t2).runNow()))
    __obj.asInstanceOf[dateArithmeticStatic]
  }
}

