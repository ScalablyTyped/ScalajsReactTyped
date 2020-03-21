package typingsJapgolly.anydbSql

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHaving[T] extends js.Object {
  def having(nodes: js.Any*): T
}

object AnonHaving {
  @scala.inline
  def apply[T](having: /* repeated */ js.Any => CallbackTo[T]): AnonHaving[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("having")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => having(t0).runNow()))
    __obj.asInstanceOf[AnonHaving[T]]
  }
}

