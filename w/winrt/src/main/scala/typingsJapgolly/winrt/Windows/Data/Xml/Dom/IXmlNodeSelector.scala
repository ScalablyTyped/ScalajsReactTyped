package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlNodeSelector extends js.Object {
  def selectNodes(xpath: String): XmlNodeList
  def selectNodesNS(xpath: String, namespaces: js.Any): XmlNodeList
  def selectSingleNode(xpath: String): IXmlNode
  def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode
}

object IXmlNodeSelector {
  @scala.inline
  def apply(
    selectNodes: String => CallbackTo[XmlNodeList],
    selectNodesNS: (String, js.Any) => CallbackTo[XmlNodeList],
    selectSingleNode: String => CallbackTo[IXmlNode],
    selectSingleNodeNS: (String, js.Any) => CallbackTo[IXmlNode]
  ): IXmlNodeSelector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selectNodes")(js.Any.fromFunction1((t0: java.lang.String) => selectNodes(t0).runNow()))
    __obj.updateDynamic("selectNodesNS")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => selectNodesNS(t0, t1).runNow()))
    __obj.updateDynamic("selectSingleNode")(js.Any.fromFunction1((t0: java.lang.String) => selectSingleNode(t0).runNow()))
    __obj.updateDynamic("selectSingleNodeNS")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => selectSingleNodeNS(t0, t1).runNow()))
    __obj.asInstanceOf[IXmlNodeSelector]
  }
}

