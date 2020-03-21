package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbJsStatic extends js.Object {
  def cmp(key1: js.Any, key2: js.Any): Double
  def delete(dbName: String): js.Promise[Unit]
  def open(options: OpenOptions): js.Promise[Server]
}

object DbJsStatic {
  @scala.inline
  def apply(
    cmp: (js.Any, js.Any) => CallbackTo[Double],
    delete: String => CallbackTo[js.Promise[Unit]],
    open: OpenOptions => CallbackTo[js.Promise[Server]]
  ): DbJsStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cmp")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => cmp(t0, t1).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: typingsJapgolly.dbJs.DbJs.OpenOptions) => open(t0).runNow()))
    __obj.asInstanceOf[DbJsStatic]
  }
}

