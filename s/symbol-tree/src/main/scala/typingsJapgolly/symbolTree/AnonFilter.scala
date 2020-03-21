package typingsJapgolly.symbolTree

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter[THIS, T /* <: js.Object */] extends js.Object {
  var thisArg: THIS
  def filter(`object`: T): js.Any
}

object AnonFilter {
  @scala.inline
  def apply[THIS, T /* <: js.Object */](filter: T => CallbackTo[js.Any], thisArg: THIS): AnonFilter[THIS, T] = {
    val __obj = js.Dynamic.literal(thisArg = thisArg.asInstanceOf[js.Any])
    __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: T) => filter(t0).runNow()))
    __obj.asInstanceOf[AnonFilter[THIS, T]]
  }
}

