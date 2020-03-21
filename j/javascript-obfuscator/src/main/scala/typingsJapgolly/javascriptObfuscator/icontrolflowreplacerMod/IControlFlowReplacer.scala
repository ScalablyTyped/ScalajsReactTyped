package typingsJapgolly.javascriptObfuscator.icontrolflowreplacerMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import typingsJapgolly.javascriptObfuscator.tcontrolflowstorageMod.TControlFlowStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlFlowReplacer extends js.Object {
  /**
    * @param node
    * @param parentNode
    * @param controlFlowStorage
    * @returns ESTree.Node
    */
  def replace(node: Node, parentNode: Node, controlFlowStorage: TControlFlowStorage): Node
}

object IControlFlowReplacer {
  @scala.inline
  def apply(replace: (Node, Node, TControlFlowStorage) => CallbackTo[Node]): IControlFlowReplacer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("replace")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.Node, t1: org.scalajs.dom.raw.Node, t2: typingsJapgolly.javascriptObfuscator.tcontrolflowstorageMod.TControlFlowStorage) => replace(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IControlFlowReplacer]
  }
}

