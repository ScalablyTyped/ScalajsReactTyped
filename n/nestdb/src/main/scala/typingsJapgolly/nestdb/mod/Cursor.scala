package typingsJapgolly.nestdb.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursor[T] extends js.Object {
  def exec(callback: js.Function2[/* err */ js.Error, /* documents */ js.Array[T], Unit]): Unit
  def limit(n: Double): Cursor[T]
  def projection(query: js.Any): Cursor[T]
  def skip(n: Double): Cursor[T]
  def sort(query: js.Any): Cursor[T]
}

object Cursor {
  @scala.inline
  def apply[T](
    exec: js.Function2[/* err */ js.Error, /* documents */ js.Array[T], Unit] => Callback,
    limit: Double => CallbackTo[Cursor[T]],
    projection: js.Any => CallbackTo[Cursor[T]],
    skip: Double => CallbackTo[Cursor[T]],
    sort: js.Any => CallbackTo[Cursor[T]]
  ): Cursor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exec")(js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* documents */ js.Array[T], scala.Unit]) => exec(t0).runNow()))
    __obj.updateDynamic("limit")(js.Any.fromFunction1((t0: scala.Double) => limit(t0).runNow()))
    __obj.updateDynamic("projection")(js.Any.fromFunction1((t0: js.Any) => projection(t0).runNow()))
    __obj.updateDynamic("skip")(js.Any.fromFunction1((t0: scala.Double) => skip(t0).runNow()))
    __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: js.Any) => sort(t0).runNow()))
    __obj.asInstanceOf[Cursor[T]]
  }
}

