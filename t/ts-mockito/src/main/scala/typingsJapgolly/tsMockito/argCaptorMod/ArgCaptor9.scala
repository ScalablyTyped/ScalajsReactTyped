package typingsJapgolly.tsMockito.argCaptorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] extends js.Object {
  def beforeLast(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
  def byCallIndex(index: Double): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
  def first(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
  def last(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
  def second(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
  def third(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
}

object ArgCaptor9 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8](
    beforeLast: CallbackTo[js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]],
    byCallIndex: Double => CallbackTo[js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]],
    first: CallbackTo[js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]],
    last: CallbackTo[js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]],
    second: CallbackTo[js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]],
    third: CallbackTo[js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]]
  ): ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast.toJsFn)
    __obj.updateDynamic("byCallIndex")(js.Any.fromFunction1((t0: scala.Double) => byCallIndex(t0).runNow()))
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("last")(last.toJsFn)
    __obj.updateDynamic("second")(second.toJsFn)
    __obj.updateDynamic("third")(third.toJsFn)
    __obj.asInstanceOf[ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8]]
  }
}

