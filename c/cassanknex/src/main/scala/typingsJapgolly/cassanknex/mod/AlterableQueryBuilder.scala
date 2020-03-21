package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterableQueryBuilder[T] extends js.Object {
  def alter[K /* <: String */](column: K, newType: String): this.type
  def drop[K /* <: String */](columns: K*): this.type
  def rename[K /* <: String */](column: K, newColumn: K): this.type
}

object AlterableQueryBuilder {
  @scala.inline
  def apply[T](
    alter: (js.Any, String) => CallbackTo[AlterableQueryBuilder[T]],
    drop: /* repeated */ js.Any => CallbackTo[AlterableQueryBuilder[T]],
    rename: (js.Any, js.Any) => CallbackTo[AlterableQueryBuilder[T]]
  ): AlterableQueryBuilder[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alter")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => alter(t0, t1).runNow()))
    __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => drop(t0).runNow()))
    __obj.updateDynamic("rename")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => rename(t0, t1).runNow()))
    __obj.asInstanceOf[AlterableQueryBuilder[T]]
  }
}

