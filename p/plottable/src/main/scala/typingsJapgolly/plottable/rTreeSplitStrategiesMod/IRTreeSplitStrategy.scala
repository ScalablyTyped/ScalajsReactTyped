package typingsJapgolly.plottable.rTreeSplitStrategiesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.plottable.rTreeMod.RTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRTreeSplitStrategy extends js.Object {
  def split[T](entries: js.Array[RTreeNode[T]], nodes: NodePair[T]): Unit
}

object IRTreeSplitStrategy {
  @scala.inline
  def apply(split: (js.Array[RTreeNode[js.Any]], NodePair[js.Any]) => Callback): IRTreeSplitStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("split")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.plottable.rTreeMod.RTreeNode[js.Any]], t1: typingsJapgolly.plottable.rTreeSplitStrategiesMod.NodePair[js.Any]) => split(t0, t1).runNow()))
    __obj.asInstanceOf[IRTreeSplitStrategy]
  }
}

