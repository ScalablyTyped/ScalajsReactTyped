package typingsJapgolly.slonik

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.slonik.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: String
  var test: js.UndefOr[js.Function1[/* field */ FieldType, Boolean]] = js.undefined
}

object AnonFormat {
  @scala.inline
  def apply(format: String, test: /* field */ FieldType => CallbackTo[Boolean] = null): AnonFormat = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction1((t0: /* field */ typingsJapgolly.slonik.mod.FieldType) => test(t0).runNow()))
    __obj.asInstanceOf[AnonFormat]
  }
}

