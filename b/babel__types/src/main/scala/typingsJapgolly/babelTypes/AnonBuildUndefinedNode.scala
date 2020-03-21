package typingsJapgolly.babelTypes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuildUndefinedNode extends js.Object {
  def buildUndefinedNode(): Node
  def push(value: AnonId): Unit
}

object AnonBuildUndefinedNode {
  @scala.inline
  def apply(buildUndefinedNode: CallbackTo[Node], push: AnonId => Callback): AnonBuildUndefinedNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildUndefinedNode")(buildUndefinedNode.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: typingsJapgolly.babelTypes.AnonId) => push(t0).runNow()))
    __obj.asInstanceOf[AnonBuildUndefinedNode]
  }
}

