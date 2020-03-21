package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLNode extends js.Object {
  def getAttribute(attribute: String): String
  def getChildNodeIterator(): XMLNodeIterator
  def getFirstChild(): XMLNode
  def getLastChild(): XMLNode
  def getNodeName(): String
  def getNodeValue(): String
  def getTextContent(): String
  def hasAttribute(name: String): Boolean
}

object XMLNode {
  @scala.inline
  def apply(
    getAttribute: String => CallbackTo[String],
    getChildNodeIterator: CallbackTo[XMLNodeIterator],
    getFirstChild: CallbackTo[XMLNode],
    getLastChild: CallbackTo[XMLNode],
    getNodeName: CallbackTo[String],
    getNodeValue: CallbackTo[String],
    getTextContent: CallbackTo[String],
    hasAttribute: String => CallbackTo[Boolean]
  ): XMLNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAttribute")(js.Any.fromFunction1((t0: java.lang.String) => getAttribute(t0).runNow()))
    __obj.updateDynamic("getChildNodeIterator")(getChildNodeIterator.toJsFn)
    __obj.updateDynamic("getFirstChild")(getFirstChild.toJsFn)
    __obj.updateDynamic("getLastChild")(getLastChild.toJsFn)
    __obj.updateDynamic("getNodeName")(getNodeName.toJsFn)
    __obj.updateDynamic("getNodeValue")(getNodeValue.toJsFn)
    __obj.updateDynamic("getTextContent")(getTextContent.toJsFn)
    __obj.updateDynamic("hasAttribute")(js.Any.fromFunction1((t0: java.lang.String) => hasAttribute(t0).runNow()))
    __obj.asInstanceOf[XMLNode]
  }
}

