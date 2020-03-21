package typingsJapgolly.frecency.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.frecency.AnonFrecencyScore
import typingsJapgolly.frecency.AnonKeepScores
import typingsJapgolly.frecency.AnonSearchQuery
import typingsJapgolly.frecency.AnonSearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frecency[T] extends js.Object {
  var sort: js.Function1[
    (/* arg */ AnonKeepScores[T]) | (/* arg */ AnonSearchResults[T]), 
    js.Array[(T with AnonFrecencyScore) | T]
  ]
  def save(arg: AnonSearchQuery[T]): Unit
}

object Frecency {
  @scala.inline
  def apply[T](
    save: AnonSearchQuery[T] => Callback,
    sort: (/* arg */ AnonKeepScores[T]) | (/* arg */ AnonSearchResults[T]) => CallbackTo[js.Array[(T with AnonFrecencyScore) | T]]
  ): Frecency[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("save")(js.Any.fromFunction1((t0: typingsJapgolly.frecency.AnonSearchQuery[T]) => save(t0).runNow()))
    __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: (/* arg */ typingsJapgolly.frecency.AnonKeepScores[T]) | (/* arg */ typingsJapgolly.frecency.AnonSearchResults[T])) => sort(t0).runNow()))
    __obj.asInstanceOf[Frecency[T]]
  }
}

