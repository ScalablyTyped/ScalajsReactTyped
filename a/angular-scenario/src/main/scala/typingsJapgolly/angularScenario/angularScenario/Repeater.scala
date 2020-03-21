package typingsJapgolly.angularScenario.angularScenario

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repeater extends js.Object {
  def column(ngBindingExpression: String): Future
  def count(): Future
  def row(index: Double): Future
}

object Repeater {
  @scala.inline
  def apply(column: String => CallbackTo[Future], count: CallbackTo[Future], row: Double => CallbackTo[Future]): Repeater = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(js.Any.fromFunction1((t0: java.lang.String) => column(t0).runNow()))
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("row")(js.Any.fromFunction1((t0: scala.Double) => row(t0).runNow()))
    __obj.asInstanceOf[Repeater]
  }
}

