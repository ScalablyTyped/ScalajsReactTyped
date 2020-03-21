package typingsJapgolly.domParser.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends DOMSearchable {
  var attributes: js.Array[String]
  var childNodes: js.Array[Node]
  var firstChild: Node | Null
  var innerHTML: String
  var lastChild: Node | Null
  var nodeName: String
  var nodeType: NodeType
  var outerHTML: String
  var parentNode: Node | Null
  var textContent: String
  def getAttribute(name: String): String | Null
}

object Node {
  @scala.inline
  def apply(
    attributes: js.Array[String],
    childNodes: js.Array[Node],
    getAttribute: String => CallbackTo[String | Null],
    getElementById: String => CallbackTo[Node | Null],
    getElementsByClassName: String => CallbackTo[js.Array[Node] | Null],
    getElementsByName: String => CallbackTo[js.Array[Node] | Null],
    getElementsByTagName: String => CallbackTo[js.Array[Node] | Null],
    innerHTML: String,
    nodeName: String,
    nodeType: NodeType,
    outerHTML: String,
    textContent: String,
    firstChild: Node = null,
    lastChild: Node = null,
    parentNode: Node = null
  ): Node = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.updateDynamic("getAttribute")(js.Any.fromFunction1((t0: java.lang.String) => getAttribute(t0).runNow()))
    __obj.updateDynamic("getElementById")(js.Any.fromFunction1((t0: java.lang.String) => getElementById(t0).runNow()))
    __obj.updateDynamic("getElementsByClassName")(js.Any.fromFunction1((t0: java.lang.String) => getElementsByClassName(t0).runNow()))
    __obj.updateDynamic("getElementsByName")(js.Any.fromFunction1((t0: java.lang.String) => getElementsByName(t0).runNow()))
    __obj.updateDynamic("getElementsByTagName")(js.Any.fromFunction1((t0: java.lang.String) => getElementsByTagName(t0).runNow()))
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

