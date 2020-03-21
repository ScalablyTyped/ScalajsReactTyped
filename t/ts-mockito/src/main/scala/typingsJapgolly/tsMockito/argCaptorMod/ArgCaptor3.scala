package typingsJapgolly.tsMockito.argCaptorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor3[T0, T1, T2] extends js.Object {
  def beforeLast(): js.Tuple3[T0, T1, T2]
  def byCallIndex(index: Double): js.Tuple3[T0, T1, T2]
  def first(): js.Tuple3[T0, T1, T2]
  def last(): js.Tuple3[T0, T1, T2]
  def second(): js.Tuple3[T0, T1, T2]
  def third(): js.Tuple3[T0, T1, T2]
}

object ArgCaptor3 {
  @scala.inline
  def apply[T0, T1, T2](
    beforeLast: CallbackTo[js.Tuple3[T0, T1, T2]],
    byCallIndex: Double => CallbackTo[js.Tuple3[T0, T1, T2]],
    first: CallbackTo[js.Tuple3[T0, T1, T2]],
    last: CallbackTo[js.Tuple3[T0, T1, T2]],
    second: CallbackTo[js.Tuple3[T0, T1, T2]],
    third: CallbackTo[js.Tuple3[T0, T1, T2]]
  ): ArgCaptor3[T0, T1, T2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast.toJsFn)
    __obj.updateDynamic("byCallIndex")(js.Any.fromFunction1((t0: scala.Double) => byCallIndex(t0).runNow()))
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("last")(last.toJsFn)
    __obj.updateDynamic("second")(second.toJsFn)
    __obj.updateDynamic("third")(third.toJsFn)
    __obj.asInstanceOf[ArgCaptor3[T0, T1, T2]]
  }
}

