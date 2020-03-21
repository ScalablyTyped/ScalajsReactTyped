package typingsJapgolly.rxLiteJoinpatterns.Rx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern7[T1, T2, T3, T4, T5, T6, T7] extends js.Object {
  def and[T8](other: Observable[T8]): Pattern8[T1, T2, T3, T4, T5, T6, T7, T8]
  def thenDo[TR](
    selector: js.Function7[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      TR
    ]
  ): Plan[TR]
}

object Pattern7 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5, T6, T7](
    and: Observable[js.Any] => CallbackTo[Pattern8[T1, T2, T3, T4, T5, T6, T7, js.Any]],
    thenDo: js.Function7[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      js.Any
    ] => CallbackTo[Plan[js.Any]]
  ): Pattern7[T1, T2, T3, T4, T5, T6, T7] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: typingsJapgolly.rxLiteJoinpatterns.Rx.Observable[js.Any]) => and(t0).runNow()))
    __obj.updateDynamic("thenDo")(js.Any.fromFunction1((t0: js.Function7[
  /* item1 */ T1, 
  /* item2 */ T2, 
  /* item3 */ T3, 
  /* item4 */ T4, 
  /* item5 */ T5, 
  /* item6 */ T6, 
  /* item7 */ T7, 
  js.Any]) => thenDo(t0).runNow()))
    __obj.asInstanceOf[Pattern7[T1, T2, T3, T4, T5, T6, T7]]
  }
}

