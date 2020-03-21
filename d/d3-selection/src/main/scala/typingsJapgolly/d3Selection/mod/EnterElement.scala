package typingsJapgolly.d3Selection.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterElement extends js.Object {
  var namespaceURI: String
  var ownerDocument: Document_
  def appendChild(newChild: Node): Node
  def insertBefore(newChild: Node, refChild: Node): Node
  def querySelector(selectors: String): Element
  def querySelectorAll(selectors: String): NodeListOf[Element with Node]
}

object EnterElement {
  @scala.inline
  def apply(
    appendChild: Node => CallbackTo[Node],
    insertBefore: (Node, Node) => CallbackTo[Node],
    namespaceURI: String,
    ownerDocument: Document_,
    querySelector: String => CallbackTo[Element],
    querySelectorAll: String => CallbackTo[NodeListOf[Element with Node]]
  ): EnterElement = {
    val __obj = js.Dynamic.literal(namespaceURI = namespaceURI.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Node) => appendChild(t0).runNow()))
    __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Node, t1: org.scalajs.dom.raw.Node) => insertBefore(t0, t1).runNow()))
    __obj.updateDynamic("querySelector")(js.Any.fromFunction1((t0: java.lang.String) => querySelector(t0).runNow()))
    __obj.updateDynamic("querySelectorAll")(js.Any.fromFunction1((t0: java.lang.String) => querySelectorAll(t0).runNow()))
    __obj.asInstanceOf[EnterElement]
  }
}

