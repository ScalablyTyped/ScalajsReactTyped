package typingsJapgolly.knockoutPreRendered

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddDisposeCallback extends js.Object {
  def addDisposeCallback(node: Element, callback: js.Function): Unit
  def cleanNode(node: Node): Element
  def removeDisposeCallback(node: Element, callback: js.Function): Unit
  def removeNode(node: Node): Unit
}

object AnonAddDisposeCallback {
  @scala.inline
  def apply(
    addDisposeCallback: (Element, js.Function) => Callback,
    cleanNode: Node => CallbackTo[Element],
    removeDisposeCallback: (Element, js.Function) => Callback,
    removeNode: Node => Callback
  ): AnonAddDisposeCallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDisposeCallback")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: js.Function) => addDisposeCallback(t0, t1).runNow()))
    __obj.updateDynamic("cleanNode")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Node) => cleanNode(t0).runNow()))
    __obj.updateDynamic("removeDisposeCallback")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: js.Function) => removeDisposeCallback(t0, t1).runNow()))
    __obj.updateDynamic("removeNode")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Node) => removeNode(t0).runNow()))
    __obj.asInstanceOf[AnonAddDisposeCallback]
  }
}

