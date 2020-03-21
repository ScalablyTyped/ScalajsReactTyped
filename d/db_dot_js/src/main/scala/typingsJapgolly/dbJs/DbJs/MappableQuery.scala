package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappableQuery[T] extends js.Object {
  def map[TMap](fn: js.Function1[/* value */ T, TMap]): Query[TMap]
}

object MappableQuery {
  @scala.inline
  def apply[T](map: js.Function1[/* value */ T, js.Any] => CallbackTo[Query[js.Any]]): MappableQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Function1[/* value */ T, js.Any]) => map(t0).runNow()))
    __obj.asInstanceOf[MappableQuery[T]]
  }
}

