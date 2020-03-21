package typingsJapgolly.knockoutProjections

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisposeItem[T, TResult] extends js.Object {
  var disposeItem: js.UndefOr[js.Function1[/* mappedItem */ TResult, Unit]] = js.undefined
  def mapping(value: T): TResult
}

object AnonDisposeItem {
  @scala.inline
  def apply[T, TResult](mapping: T => CallbackTo[TResult], disposeItem: /* mappedItem */ TResult => Callback = null): AnonDisposeItem[T, TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mapping")(js.Any.fromFunction1((t0: T) => mapping(t0).runNow()))
    if (disposeItem != null) __obj.updateDynamic("disposeItem")(js.Any.fromFunction1((t0: /* mappedItem */ TResult) => disposeItem(t0).runNow()))
    __obj.asInstanceOf[AnonDisposeItem[T, TResult]]
  }
}

