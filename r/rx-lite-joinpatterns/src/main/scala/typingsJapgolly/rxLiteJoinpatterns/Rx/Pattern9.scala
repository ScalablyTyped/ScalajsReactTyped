package typingsJapgolly.rxLiteJoinpatterns.Rx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] extends js.Object {
  def thenDo[TR](
    selector: js.Function9[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      /* item8 */ T8, 
      /* item9 */ T9, 
      TR
    ]
  ): Plan[TR]
}

object Pattern9 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    thenDo: js.Function9[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      /* item8 */ T8, 
      /* item9 */ T9, 
      js.Any
    ] => CallbackTo[Plan[js.Any]]
  ): Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("thenDo")(js.Any.fromFunction1((t0: js.Function9[
  /* item1 */ T1, 
  /* item2 */ T2, 
  /* item3 */ T3, 
  /* item4 */ T4, 
  /* item5 */ T5, 
  /* item6 */ T6, 
  /* item7 */ T7, 
  /* item8 */ T8, 
  /* item9 */ T9, 
  js.Any]) => thenDo(t0).runNow()))
    __obj.asInstanceOf[Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]
  }
}

