package typingsJapgolly.tsMockito.argCaptorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] extends js.Object {
  def beforeLast(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def byCallIndex(index: Double): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def first(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def last(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def second(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def third(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
}

object ArgCaptor8 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6, T7](
    beforeLast: CallbackTo[js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]],
    byCallIndex: Double => CallbackTo[js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]],
    first: CallbackTo[js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]],
    last: CallbackTo[js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]],
    second: CallbackTo[js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]],
    third: CallbackTo[js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]]
  ): ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast.toJsFn)
    __obj.updateDynamic("byCallIndex")(js.Any.fromFunction1((t0: scala.Double) => byCallIndex(t0).runNow()))
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("last")(last.toJsFn)
    __obj.updateDynamic("second")(second.toJsFn)
    __obj.updateDynamic("third")(third.toJsFn)
    __obj.asInstanceOf[ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7]]
  }
}

