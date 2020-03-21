package typingsJapgolly.tsMockito.argCaptorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor6[T0, T1, T2, T3, T4, T5] extends js.Object {
  def beforeLast(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def byCallIndex(index: Double): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def first(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def last(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def second(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def third(): js.Tuple6[T0, T1, T2, T3, T4, T5]
}

object ArgCaptor6 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5](
    beforeLast: CallbackTo[js.Tuple6[T0, T1, T2, T3, T4, T5]],
    byCallIndex: Double => CallbackTo[js.Tuple6[T0, T1, T2, T3, T4, T5]],
    first: CallbackTo[js.Tuple6[T0, T1, T2, T3, T4, T5]],
    last: CallbackTo[js.Tuple6[T0, T1, T2, T3, T4, T5]],
    second: CallbackTo[js.Tuple6[T0, T1, T2, T3, T4, T5]],
    third: CallbackTo[js.Tuple6[T0, T1, T2, T3, T4, T5]]
  ): ArgCaptor6[T0, T1, T2, T3, T4, T5] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast.toJsFn)
    __obj.updateDynamic("byCallIndex")(js.Any.fromFunction1((t0: scala.Double) => byCallIndex(t0).runNow()))
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("last")(last.toJsFn)
    __obj.updateDynamic("second")(second.toJsFn)
    __obj.updateDynamic("third")(third.toJsFn)
    __obj.asInstanceOf[ArgCaptor6[T0, T1, T2, T3, T4, T5]]
  }
}

