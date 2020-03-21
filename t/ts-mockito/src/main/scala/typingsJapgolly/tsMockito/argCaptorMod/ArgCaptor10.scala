package typingsJapgolly.tsMockito.argCaptorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] extends js.Object {
  def beforeLast(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def byCallIndex(index: Double): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def first(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def last(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def second(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def third(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
}

object ArgCaptor10 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    beforeLast: CallbackTo[js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]],
    byCallIndex: Double => CallbackTo[js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]],
    first: CallbackTo[js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]],
    last: CallbackTo[js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]],
    second: CallbackTo[js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]],
    third: CallbackTo[js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]]
  ): ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast.toJsFn)
    __obj.updateDynamic("byCallIndex")(js.Any.fromFunction1((t0: scala.Double) => byCallIndex(t0).runNow()))
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("last")(last.toJsFn)
    __obj.updateDynamic("second")(second.toJsFn)
    __obj.updateDynamic("third")(third.toJsFn)
    __obj.asInstanceOf[ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]]
  }
}

