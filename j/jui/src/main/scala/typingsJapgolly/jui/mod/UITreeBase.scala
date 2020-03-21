package typingsJapgolly.jui.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UITreeBase extends js.Object {
  def appendNode(args: js.Any*): UITreeNode
  def foldNode(index: String): Unit
  def foldNodeAll(index: String): Unit
  def getNode(index: String): UITreeNode
  def getNodeAll(index: String): js.Array[UITreeNode]
  def getNodeParent(index: String): UITreeNode
  def getRoot(): UITreeNode
  def insertNode(index: String, data: js.Any): UITreeNode
  def moveNode(index: String, targetIndex: Double): Unit
  def openNode(index: String): Unit
  def openNodeAll(index: String): Unit
  def removeNode(index: String): Unit
  def removeNodes(): Unit
  def updateNode(index: String, data: js.Any): UITreeNode
}

object UITreeBase {
  @scala.inline
  def apply(
    appendNode: /* repeated */ js.Any => CallbackTo[UITreeNode],
    foldNode: String => Callback,
    foldNodeAll: String => Callback,
    getNode: String => CallbackTo[UITreeNode],
    getNodeAll: String => CallbackTo[js.Array[UITreeNode]],
    getNodeParent: String => CallbackTo[UITreeNode],
    getRoot: CallbackTo[UITreeNode],
    insertNode: (String, js.Any) => CallbackTo[UITreeNode],
    moveNode: (String, Double) => Callback,
    openNode: String => Callback,
    openNodeAll: String => Callback,
    removeNode: String => Callback,
    removeNodes: Callback,
    updateNode: (String, js.Any) => CallbackTo[UITreeNode]
  ): UITreeBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendNode")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => appendNode(t0).runNow()))
    __obj.updateDynamic("foldNode")(js.Any.fromFunction1((t0: java.lang.String) => foldNode(t0).runNow()))
    __obj.updateDynamic("foldNodeAll")(js.Any.fromFunction1((t0: java.lang.String) => foldNodeAll(t0).runNow()))
    __obj.updateDynamic("getNode")(js.Any.fromFunction1((t0: java.lang.String) => getNode(t0).runNow()))
    __obj.updateDynamic("getNodeAll")(js.Any.fromFunction1((t0: java.lang.String) => getNodeAll(t0).runNow()))
    __obj.updateDynamic("getNodeParent")(js.Any.fromFunction1((t0: java.lang.String) => getNodeParent(t0).runNow()))
    __obj.updateDynamic("getRoot")(getRoot.toJsFn)
    __obj.updateDynamic("insertNode")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => insertNode(t0, t1).runNow()))
    __obj.updateDynamic("moveNode")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => moveNode(t0, t1).runNow()))
    __obj.updateDynamic("openNode")(js.Any.fromFunction1((t0: java.lang.String) => openNode(t0).runNow()))
    __obj.updateDynamic("openNodeAll")(js.Any.fromFunction1((t0: java.lang.String) => openNodeAll(t0).runNow()))
    __obj.updateDynamic("removeNode")(js.Any.fromFunction1((t0: java.lang.String) => removeNode(t0).runNow()))
    __obj.updateDynamic("removeNodes")(removeNodes.toJsFn)
    __obj.updateDynamic("updateNode")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => updateNode(t0, t1).runNow()))
    __obj.asInstanceOf[UITreeBase]
  }
}

