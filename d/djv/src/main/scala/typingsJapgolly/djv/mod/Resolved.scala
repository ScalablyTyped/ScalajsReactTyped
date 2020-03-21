package typingsJapgolly.djv.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolved extends js.Object {
  var schema: js.Object
  def fn(args: js.Any*): js.Any
}

object Resolved {
  @scala.inline
  def apply(fn: /* repeated */ js.Any => CallbackTo[js.Any], schema: js.Object): Resolved = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fn(t0).runNow()))
    __obj.asInstanceOf[Resolved]
  }
}

