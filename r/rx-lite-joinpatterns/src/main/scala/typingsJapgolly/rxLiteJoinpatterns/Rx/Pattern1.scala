package typingsJapgolly.rxLiteJoinpatterns.Rx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern1[T1] extends js.Object {
  def and[T2](other: Observable[T2]): Pattern2[T1, T2]
  def thenDo[TR](selector: js.Function1[/* item1 */ T1, TR]): Plan[TR]
}

object Pattern1 {
  @scala.inline
  def apply[T1](
    and: Observable[js.Any] => CallbackTo[Pattern2[T1, js.Any]],
    thenDo: js.Function1[/* item1 */ T1, js.Any] => CallbackTo[Plan[js.Any]]
  ): Pattern1[T1] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: typingsJapgolly.rxLiteJoinpatterns.Rx.Observable[js.Any]) => and(t0).runNow()))
    __obj.updateDynamic("thenDo")(js.Any.fromFunction1((t0: js.Function1[/* item1 */ T1, js.Any]) => thenDo(t0).runNow()))
    __obj.asInstanceOf[Pattern1[T1]]
  }
}

