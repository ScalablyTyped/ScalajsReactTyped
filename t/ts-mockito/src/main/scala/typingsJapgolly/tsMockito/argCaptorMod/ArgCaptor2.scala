package typingsJapgolly.tsMockito.argCaptorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor2[T0, T1] extends js.Object {
  def beforeLast(): js.Tuple2[T0, T1]
  def byCallIndex(index: Double): js.Tuple2[T0, T1]
  def first(): js.Tuple2[T0, T1]
  def last(): js.Tuple2[T0, T1]
  def second(): js.Tuple2[T0, T1]
  def third(): js.Tuple2[T0, T1]
}

object ArgCaptor2 {
  @scala.inline
  def apply[T0, T1](
    beforeLast: CallbackTo[js.Tuple2[T0, T1]],
    byCallIndex: Double => CallbackTo[js.Tuple2[T0, T1]],
    first: CallbackTo[js.Tuple2[T0, T1]],
    last: CallbackTo[js.Tuple2[T0, T1]],
    second: CallbackTo[js.Tuple2[T0, T1]],
    third: CallbackTo[js.Tuple2[T0, T1]]
  ): ArgCaptor2[T0, T1] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast.toJsFn)
    __obj.updateDynamic("byCallIndex")(js.Any.fromFunction1((t0: scala.Double) => byCallIndex(t0).runNow()))
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("last")(last.toJsFn)
    __obj.updateDynamic("second")(second.toJsFn)
    __obj.updateDynamic("third")(third.toJsFn)
    __obj.asInstanceOf[ArgCaptor2[T0, T1]]
  }
}

