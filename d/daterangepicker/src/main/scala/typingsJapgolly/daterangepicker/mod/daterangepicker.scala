package typingsJapgolly.daterangepicker.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.daterangepicker.mod._Global_.JQuery
import typingsJapgolly.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait daterangepicker extends js.Object {
  var container: JQuery
  var endDate: Moment
  var startDate: Moment
  def remove(): Unit
  def setEndDate(date: DateOrString): Unit
  def setStartDate(date: DateOrString): Unit
}

object daterangepicker {
  @scala.inline
  def apply(
    container: JQuery,
    endDate: Moment,
    remove: Callback,
    setEndDate: DateOrString => Callback,
    setStartDate: DateOrString => Callback,
    startDate: Moment
  ): daterangepicker = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setEndDate")(js.Any.fromFunction1((t0: typingsJapgolly.daterangepicker.mod.DateOrString) => setEndDate(t0).runNow()))
    __obj.updateDynamic("setStartDate")(js.Any.fromFunction1((t0: typingsJapgolly.daterangepicker.mod.DateOrString) => setStartDate(t0).runNow()))
    __obj.asInstanceOf[daterangepicker]
  }
}

