package typingsJapgolly.vueComponentCompilerUtils

import japgolly.scalajs.react.Callback
import typingsJapgolly.vueComponentCompilerUtils.utilsMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostTransformNode extends js.Object {
  def postTransformNode(node: ASTNode): Unit
}

object AnonPostTransformNode {
  @scala.inline
  def apply(postTransformNode: ASTNode => Callback): AnonPostTransformNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postTransformNode")(js.Any.fromFunction1((t0: typingsJapgolly.vueComponentCompilerUtils.utilsMod.ASTNode) => postTransformNode(t0).runNow()))
    __obj.asInstanceOf[AnonPostTransformNode]
  }
}

