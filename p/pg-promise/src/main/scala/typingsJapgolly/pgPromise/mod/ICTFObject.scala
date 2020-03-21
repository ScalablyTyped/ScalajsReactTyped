package typingsJapgolly.pgPromise.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Custom-Type Formatting object
// API: https://github.com/vitaly-t/pg-promise#custom-type-formatting
trait ICTFObject extends js.Object {
  def toPostgres(a: js.Any): js.Any
}

object ICTFObject {
  @scala.inline
  def apply(toPostgres: js.Any => CallbackTo[js.Any]): ICTFObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toPostgres")(js.Any.fromFunction1((t0: js.Any) => toPostgres(t0).runNow()))
    __obj.asInstanceOf[ICTFObject]
  }
}

