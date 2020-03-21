package typingsJapgolly.jestJasmine2.treeProcessorMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var queueRunnerFactory: js.Any
  var runnableIds: js.Array[String]
  var tree: TreeNode
  def nodeComplete(suite: TreeNode): Unit
  def nodeStart(suite: TreeNode): Unit
}

object Options {
  @scala.inline
  def apply(
    nodeComplete: TreeNode => Callback,
    nodeStart: TreeNode => Callback,
    queueRunnerFactory: js.Any,
    runnableIds: js.Array[String],
    tree: TreeNode
  ): Options = {
    val __obj = js.Dynamic.literal(queueRunnerFactory = queueRunnerFactory.asInstanceOf[js.Any], runnableIds = runnableIds.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.updateDynamic("nodeComplete")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.treeProcessorMod.TreeNode) => nodeComplete(t0).runNow()))
    __obj.updateDynamic("nodeStart")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.treeProcessorMod.TreeNode) => nodeStart(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

