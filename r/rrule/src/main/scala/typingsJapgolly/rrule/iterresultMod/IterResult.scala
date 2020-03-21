package typingsJapgolly.rrule.iterresultMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rrule.PartialIterArgs
import typingsJapgolly.rrule.typesMod.IterResultType
import typingsJapgolly.rrule.typesMod.QueryMethodTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterResult[M /* <: QueryMethodTypes */] extends js.Object {
  var _result: js.Array[js.Date]
  val args: PartialIterArgs
  val maxDate: js.Date | Null
  val method: M
  val minDate: js.Date | Null
  var total: Double
  /**
    * Possibly adds a date into the result.
    *
    * @param {Date} date - the date isn't necessarly added to the result
    *                      list (if it is too late/too early)
    * @return {Boolean} true if it makes sense to continue the iteration
    *                   false if we're done.
    */
  def accept(date: js.Date): Boolean
  /**
    *
    * @param {Date} date that is part of the result.
    * @return {Boolean} whether we are interested in more values.
    */
  def add(date: js.Date): Boolean
  /**
    * 'before' and 'after' return only one date, whereas 'all'
    * and 'between' an array.
    * @return {Date,Array?}
    */
  def getValue(): IterResultType[M]
}

object IterResult {
  @scala.inline
  def apply[M /* <: QueryMethodTypes */](
    _result: js.Array[js.Date],
    accept: js.Date => CallbackTo[Boolean],
    add: js.Date => CallbackTo[Boolean],
    args: PartialIterArgs,
    getValue: CallbackTo[IterResultType[M]],
    method: M,
    total: Double,
    maxDate: js.Date = null,
    minDate: js.Date = null
  ): IterResult[M] = {
    val __obj = js.Dynamic.literal(_result = _result.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("accept")(js.Any.fromFunction1((t0: js.Date) => accept(t0).runNow()))
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: js.Date) => add(t0).runNow()))
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterResult[M]]
  }
}

