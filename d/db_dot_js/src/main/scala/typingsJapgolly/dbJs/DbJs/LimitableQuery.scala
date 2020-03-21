package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitableQuery[T] extends js.Object {
  def limit(n: js.Any, m: js.Any): ExecutableQuery[T]
}

object LimitableQuery {
  @scala.inline
  def apply[T](limit: (js.Any, js.Any) => CallbackTo[ExecutableQuery[T]]): LimitableQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("limit")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => limit(t0, t1).runNow()))
    __obj.asInstanceOf[LimitableQuery[T]]
  }
}

