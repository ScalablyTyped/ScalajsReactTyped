package typingsJapgolly.tsMockito.argCaptorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor1[T] extends js.Object {
  def beforeLast(): js.Array[T]
  def byCallIndex(index: Double): js.Array[T]
  def first(): js.Array[T]
  def last(): js.Array[T]
  def second(): js.Array[T]
  def third(): js.Array[T]
}

object ArgCaptor1 {
  @scala.inline
  def apply[T](
    beforeLast: CallbackTo[js.Array[T]],
    byCallIndex: Double => CallbackTo[js.Array[T]],
    first: CallbackTo[js.Array[T]],
    last: CallbackTo[js.Array[T]],
    second: CallbackTo[js.Array[T]],
    third: CallbackTo[js.Array[T]]
  ): ArgCaptor1[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast.toJsFn)
    __obj.updateDynamic("byCallIndex")(js.Any.fromFunction1((t0: scala.Double) => byCallIndex(t0).runNow()))
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("last")(last.toJsFn)
    __obj.updateDynamic("second")(second.toJsFn)
    __obj.updateDynamic("third")(third.toJsFn)
    __obj.asInstanceOf[ArgCaptor1[T]]
  }
}

