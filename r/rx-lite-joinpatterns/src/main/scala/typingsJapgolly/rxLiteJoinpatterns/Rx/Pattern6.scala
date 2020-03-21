package typingsJapgolly.rxLiteJoinpatterns.Rx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern6[T1, T2, T3, T4, T5, T6] extends js.Object {
  def and[T7](other: Observable[T7]): Pattern7[T1, T2, T3, T4, T5, T6, T7]
  def thenDo[TR](
    selector: js.Function6[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      TR
    ]
  ): Plan[TR]
}

object Pattern6 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5, T6](
    and: Observable[js.Any] => CallbackTo[Pattern7[T1, T2, T3, T4, T5, T6, js.Any]],
    thenDo: js.Function6[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      js.Any
    ] => CallbackTo[Plan[js.Any]]
  ): Pattern6[T1, T2, T3, T4, T5, T6] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: typingsJapgolly.rxLiteJoinpatterns.Rx.Observable[js.Any]) => and(t0).runNow()))
    __obj.updateDynamic("thenDo")(js.Any.fromFunction1((t0: js.Function6[
  /* item1 */ T1, 
  /* item2 */ T2, 
  /* item3 */ T3, 
  /* item4 */ T4, 
  /* item5 */ T5, 
  /* item6 */ T6, 
  js.Any]) => thenDo(t0).runNow()))
    __obj.asInstanceOf[Pattern6[T1, T2, T3, T4, T5, T6]]
  }
}

