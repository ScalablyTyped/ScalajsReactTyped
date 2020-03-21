package typingsJapgolly.milkcocoa.milkcocoa

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  def done(callback: js.Function1[/* data */ js.Any, Unit]): Unit
  def limit(number: Double): Query
  def skip(index: Double): Query
  // mode  asc, desc
  def sort(mode: String): Query
}

object Query {
  @scala.inline
  def apply(
    done: js.Function1[/* data */ js.Any, Unit] => Callback,
    limit: Double => CallbackTo[Query],
    skip: Double => CallbackTo[Query],
    sort: String => CallbackTo[Query]
  ): Query = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(js.Any.fromFunction1((t0: js.Function1[/* data */ js.Any, scala.Unit]) => done(t0).runNow()))
    __obj.updateDynamic("limit")(js.Any.fromFunction1((t0: scala.Double) => limit(t0).runNow()))
    __obj.updateDynamic("skip")(js.Any.fromFunction1((t0: scala.Double) => skip(t0).runNow()))
    __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: java.lang.String) => sort(t0).runNow()))
    __obj.asInstanceOf[Query]
  }
}

