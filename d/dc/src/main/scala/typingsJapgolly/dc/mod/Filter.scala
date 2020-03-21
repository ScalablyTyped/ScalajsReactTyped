package typingsJapgolly.dc.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  def isFiltered(value: js.Any): Boolean
}

object Filter {
  @scala.inline
  def apply(isFiltered: js.Any => CallbackTo[Boolean]): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isFiltered")(js.Any.fromFunction1((t0: js.Any) => isFiltered(t0).runNow()))
    __obj.asInstanceOf[Filter]
  }
}

