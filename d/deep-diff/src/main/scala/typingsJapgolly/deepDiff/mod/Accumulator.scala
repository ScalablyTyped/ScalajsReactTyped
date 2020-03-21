package typingsJapgolly.deepDiff.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accumulator[LHS, RHS] extends js.Object {
  var length: Double
  def push(diff: Diff_[LHS, RHS]): Unit
}

object Accumulator {
  @scala.inline
  def apply[LHS, RHS](length: Double, push: Diff_[LHS, RHS] => Callback): Accumulator[LHS, RHS] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: typingsJapgolly.deepDiff.mod.Diff_[LHS, RHS]) => push(t0).runNow()))
    __obj.asInstanceOf[Accumulator[LHS, RHS]]
  }
}

