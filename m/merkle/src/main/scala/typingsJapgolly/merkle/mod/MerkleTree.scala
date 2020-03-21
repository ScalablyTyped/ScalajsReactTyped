package typingsJapgolly.merkle.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerkleTree extends js.Object {
  def depth(): Double
  def level(level: Double): js.UndefOr[Double]
  def levels(): Double
  def nodes(): Double
  def root(): String
}

object MerkleTree {
  @scala.inline
  def apply(
    depth: CallbackTo[Double],
    level: Double => CallbackTo[js.UndefOr[Double]],
    levels: CallbackTo[Double],
    nodes: CallbackTo[Double],
    root: CallbackTo[String]
  ): MerkleTree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("depth")(depth.toJsFn)
    __obj.updateDynamic("level")(js.Any.fromFunction1((t0: scala.Double) => level(t0).runNow()))
    __obj.updateDynamic("levels")(levels.toJsFn)
    __obj.updateDynamic("nodes")(nodes.toJsFn)
    __obj.updateDynamic("root")(root.toJsFn)
    __obj.asInstanceOf[MerkleTree]
  }
}

