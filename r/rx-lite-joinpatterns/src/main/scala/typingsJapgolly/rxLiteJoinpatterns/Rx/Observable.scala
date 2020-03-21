package typingsJapgolly.rxLiteJoinpatterns.Rx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observable[T] extends js.Object {
  def and[T2](other: Observable[T2]): Pattern2[T, T2]
  def thenDo[TR](selector: js.Function1[/* item1 */ T, TR]): Plan[TR]
}

object Observable {
  @scala.inline
  def apply[T](
    and: Observable[js.Any] => CallbackTo[Pattern2[T, js.Any]],
    thenDo: js.Function1[/* item1 */ T, js.Any] => CallbackTo[Plan[js.Any]]
  ): Observable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: typingsJapgolly.rxLiteJoinpatterns.Rx.Observable[js.Any]) => and(t0).runNow()))
    __obj.updateDynamic("thenDo")(js.Any.fromFunction1((t0: js.Function1[/* item1 */ T, js.Any]) => thenDo(t0).runNow()))
    __obj.asInstanceOf[Observable[T]]
  }
}

