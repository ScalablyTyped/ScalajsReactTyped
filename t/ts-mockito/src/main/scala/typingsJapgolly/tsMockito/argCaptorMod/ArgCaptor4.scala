package typingsJapgolly.tsMockito.argCaptorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor4[T0, T1, T2, T3] extends js.Object {
  def beforeLast(): js.Tuple4[T0, T1, T2, T3]
  def byCallIndex(index: Double): js.Tuple4[T0, T1, T2, T3]
  def first(): js.Tuple4[T0, T1, T2, T3]
  def last(): js.Tuple4[T0, T1, T2, T3]
  def second(): js.Tuple4[T0, T1, T2, T3]
  def third(): js.Tuple4[T0, T1, T2, T3]
}

object ArgCaptor4 {
  @scala.inline
  def apply[T0, T1, T2, T3](
    beforeLast: CallbackTo[js.Tuple4[T0, T1, T2, T3]],
    byCallIndex: Double => CallbackTo[js.Tuple4[T0, T1, T2, T3]],
    first: CallbackTo[js.Tuple4[T0, T1, T2, T3]],
    last: CallbackTo[js.Tuple4[T0, T1, T2, T3]],
    second: CallbackTo[js.Tuple4[T0, T1, T2, T3]],
    third: CallbackTo[js.Tuple4[T0, T1, T2, T3]]
  ): ArgCaptor4[T0, T1, T2, T3] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast.toJsFn)
    __obj.updateDynamic("byCallIndex")(js.Any.fromFunction1((t0: scala.Double) => byCallIndex(t0).runNow()))
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("last")(last.toJsFn)
    __obj.updateDynamic("second")(second.toJsFn)
    __obj.updateDynamic("third")(third.toJsFn)
    __obj.asInstanceOf[ArgCaptor4[T0, T1, T2, T3]]
  }
}

