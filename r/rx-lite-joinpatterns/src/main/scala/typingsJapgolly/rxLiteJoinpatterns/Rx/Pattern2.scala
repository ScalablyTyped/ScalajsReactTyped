package typingsJapgolly.rxLiteJoinpatterns.Rx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern2[T1, T2] extends js.Object {
  def and[T3](other: Observable[T3]): Pattern3[T1, T2, T3]
  def thenDo[TR](selector: js.Function2[/* item1 */ T1, /* item2 */ T2, TR]): Plan[TR]
}

object Pattern2 {
  @scala.inline
  def apply[T1, T2](
    and: Observable[js.Any] => CallbackTo[Pattern3[T1, T2, js.Any]],
    thenDo: js.Function2[/* item1 */ T1, /* item2 */ T2, js.Any] => CallbackTo[Plan[js.Any]]
  ): Pattern2[T1, T2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: typingsJapgolly.rxLiteJoinpatterns.Rx.Observable[js.Any]) => and(t0).runNow()))
    __obj.updateDynamic("thenDo")(js.Any.fromFunction1((t0: js.Function2[/* item1 */ T1, /* item2 */ T2, js.Any]) => thenDo(t0).runNow()))
    __obj.asInstanceOf[Pattern2[T1, T2]]
  }
}

