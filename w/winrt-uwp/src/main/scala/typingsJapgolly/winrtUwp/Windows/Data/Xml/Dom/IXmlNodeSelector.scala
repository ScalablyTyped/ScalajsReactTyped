package typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the methods needed to execute XPath queries on an XML DOM tree or subtree. */
trait IXmlNodeSelector extends js.Object {
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList.
    * @param xpath Specifies an XPath expression.
    * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
    */
  def selectNodes(xpath: String): XmlNodeList
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList.
    * @param xpath Specifies an XPath expresssion.
    * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
    * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
    */
  def selectNodesNS(xpath: String, namespaces: js.Any): XmlNodeList
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
    * @param xpath Specifies an XPath expression.
    * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
    */
  def selectSingleNode(xpath: String): IXmlNode
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
    * @param xpath Specifies an XPath expression.
    * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
    * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
    */
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

