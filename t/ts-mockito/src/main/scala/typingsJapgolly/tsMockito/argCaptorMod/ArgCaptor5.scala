package typingsJapgolly.tsMockito.argCaptorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor5[T0, T1, T2, T3, T4] extends js.Object {
  def beforeLast(): js.Tuple5[T0, T1, T2, T3, T4]
  def byCallIndex(index: Double): js.Tuple5[T0, T1, T2, T3, T4]
  def first(): js.Tuple5[T0, T1, T2, T3, T4]
  def last(): js.Tuple5[T0, T1, T2, T3, T4]
  def second(): js.Tuple5[T0, T1, T2, T3, T4]
  def third(): js.Tuple5[T0, T1, T2, T3, T4]
}

object ArgCaptor5 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4](
    beforeLast: CallbackTo[js.Tuple5[T0, T1, T2, T3, T4]],
    byCallIndex: Double => CallbackTo[js.Tuple5[T0, T1, T2, T3, T4]],
    first: CallbackTo[js.Tuple5[T0, T1, T2, T3, T4]],
    last: CallbackTo[js.Tuple5[T0, T1, T2, T3, T4]],
    second: CallbackTo[js.Tuple5[T0, T1, T2, T3, T4]],
    third: CallbackTo[js.Tuple5[T0, T1, T2, T3, T4]]
  ): ArgCaptor5[T0, T1, T2, T3, T4] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast.toJsFn)
    __obj.updateDynamic("byCallIndex")(js.Any.fromFunction1((t0: scala.Double) => byCallIndex(t0).runNow()))
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("last")(last.toJsFn)
    __obj.updateDynamic("second")(second.toJsFn)
    __obj.updateDynamic("third")(third.toJsFn)
    __obj.asInstanceOf[ArgCaptor5[T0, T1, T2, T3, T4]]
  }
}

