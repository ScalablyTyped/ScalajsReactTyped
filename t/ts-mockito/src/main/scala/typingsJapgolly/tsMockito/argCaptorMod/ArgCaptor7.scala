package typingsJapgolly.tsMockito.argCaptorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] extends js.Object {
  def beforeLast(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def byCallIndex(index: Double): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def first(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def last(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def second(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def third(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
}

object ArgCaptor7 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6](
    beforeLast: CallbackTo[js.Tuple7[T0, T1, T2, T3, T4, T5, T6]],
    byCallIndex: Double => CallbackTo[js.Tuple7[T0, T1, T2, T3, T4, T5, T6]],
    first: CallbackTo[js.Tuple7[T0, T1, T2, T3, T4, T5, T6]],
    last: CallbackTo[js.Tuple7[T0, T1, T2, T3, T4, T5, T6]],
    second: CallbackTo[js.Tuple7[T0, T1, T2, T3, T4, T5, T6]],
    third: CallbackTo[js.Tuple7[T0, T1, T2, T3, T4, T5, T6]]
  ): ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast.toJsFn)
    __obj.updateDynamic("byCallIndex")(js.Any.fromFunction1((t0: scala.Double) => byCallIndex(t0).runNow()))
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("last")(last.toJsFn)
    __obj.updateDynamic("second")(second.toJsFn)
    __obj.updateDynamic("third")(third.toJsFn)
    __obj.asInstanceOf[ArgCaptor7[T0, T1, T2, T3, T4, T5, T6]]
  }
}

