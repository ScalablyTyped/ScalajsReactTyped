package typingsJapgolly.scalike.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Either[A, B] extends js.Object {
  var isLeft: Boolean
  var isRight: Boolean
  var value: A | B
  def fold[X](fa: js.Function1[/* a */ A, X], fb: js.Function1[/* b */ B, X]): X
  def left(): LeftProjection[A, B]
  def right(): RightProjection[A, B]
  def swap(): Either[B, A]
}

object Either {
  @scala.inline
  def apply[A, B](
    fold: (js.Function1[/* a */ A, js.Any], js.Function1[/* b */ B, js.Any]) => CallbackTo[js.Any],
    isLeft: Boolean,
    isRight: Boolean,
    left: CallbackTo[LeftProjection[A, B]],
    right: CallbackTo[RightProjection[A, B]],
    swap: CallbackTo[Either[B, A]],
    value: A | B
  ): Either[A, B] = {
    val __obj = js.Dynamic.literal(isLeft = isLeft.asInstanceOf[js.Any], isRight = isRight.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("fold")(js.Any.fromFunction2((t0: js.Function1[/* a */ A, js.Any], t1: js.Function1[/* b */ B, js.Any]) => fold(t0, t1).runNow()))
    __obj.updateDynamic("left")(left.toJsFn)
    __obj.updateDynamic("right")(right.toJsFn)
    __obj.updateDynamic("swap")(swap.toJsFn)
    __obj.asInstanceOf[Either[A, B]]
  }
}

