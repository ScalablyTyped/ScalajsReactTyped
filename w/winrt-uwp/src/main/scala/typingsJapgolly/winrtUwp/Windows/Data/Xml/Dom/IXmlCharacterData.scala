package typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides text manipulation methods that are used by several objects. */
trait IXmlCharacterData extends IXmlNode {
  /** Gets or sets the node data depending on the node type. */
  var data: String
  /** Gets the length of the data, in Unicode characters. */
  var length: Double
  /**
    * Appends the supplied string to the existing string data.
    * @param data The data to be appended to the existing string.
    */
  def appendData(data: String): Unit
  /**
    * Deletes specified data.
    * @param offset The offset, in characters, at which to start deleting the string data.
    * @param count The number of characters to delete.
    */
  def deleteData(offset: Double, count: Double): Unit
  /**
    * Inserts a string at the specified offset.
    * @param offset The offset, in characters, at which to insert the supplied string data.
    * @param data The data to be inserted into the existing string.
    */
  def insertData(offset: Double, data: String): Unit
  /**
    * Replaces the specified number of characters with the supplied string.
    * @param offset The offset, in characters, at which to start replacing string data.
    * @param count The number of characters to replace.
    * @param data The new data that replaces the old string data.
    */
  def replaceData(offset: Double, count: Double, data: String): Unit
  /**
    * Retrieves a substring of the full string from the specified range.
    * @param offset Specifies the offset, in characters, from the beginning of the string. An offset of zero indicates copying from the start of the data.
    * @param count Specifies the number of characters to retrieve from the specified offset.
    * @return The returned substring.
    */
  def substringData(offset: Double, count: Double): String
}

object IXmlCharacterData {
  @scala.inline
  def apply(
    appendChild: IXmlNode => CallbackTo[IXmlNode],
    appendData: String => Callback,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => CallbackTo[IXmlNode],
    data: String,
    deleteData: (Double, Double) => Callback,
    firstChild: IXmlNode,
    getXml: CallbackTo[String],
    hasChildNodes: CallbackTo[Boolean],
    innerText: String,
    insertBefore: (IXmlNode, IXmlNode) => CallbackTo[IXmlNode],
    insertData: (Double, String) => Callback,
    lastChild: IXmlNode,
    length: Double,
    localName: js.Any,
    namespaceUri: js.Any,
    nextSibling: IXmlNode,
    nodeName: String,
    nodeType: NodeType,
    nodeValue: js.Any,
    normalize: Callback,
    ownerDocument: XmlDocument,
    parentNode: IXmlNode,
    prefix: js.Any,
    previousSibling: IXmlNode,
    removeChild: IXmlNode => CallbackTo[IXmlNode],
    replaceChild: (IXmlNode, IXmlNode) => CallbackTo[IXmlNode],
    replaceData: (Double, Double, String) => Callback,
    selectNodes: String => CallbackTo[XmlNodeList],
    selectNodesNS: (String, js.Any) => CallbackTo[XmlNodeList],
    selectSingleNode: String => CallbackTo[IXmlNode],
    selectSingleNodeNS: (String, js.Any) => CallbackTo[IXmlNode],
    substringData: (Double, Double) => CallbackTo[String]
  ): IXmlCharacterData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], innerText = innerText.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.IXmlNode) => appendChild(t0).runNow()))
    __obj.updateDynamic("appendData")(js.Any.fromFunction1((t0: java.lang.String) => appendData(t0).runNow()))
    __obj.updateDynamic("cloneNode")(js.Any.fromFunction1((t0: scala.Boolean) => cloneNode(t0).runNow()))
    __obj.updateDynamic("deleteData")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => deleteData(t0, t1).runNow()))
    __obj.updateDynamic("getXml")(getXml.toJsFn)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes.toJsFn)
    __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.IXmlNode, t1: typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.IXmlNode) => insertBefore(t0, t1).runNow()))
    __obj.updateDynamic("insertData")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => insertData(t0, t1).runNow()))
    __obj.updateDynamic("normalize")(normalize.toJsFn)
    __obj.updateDynamic("removeChild")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.IXmlNode) => removeChild(t0).runNow()))
    __obj.updateDynamic("replaceChild")(js.Any.fromFunction2((t0: typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.IXmlNode, t1: typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.IXmlNode) => replaceChild(t0, t1).runNow()))
    __obj.updateDynamic("replaceData")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: java.lang.String) => replaceData(t0, t1, t2).runNow()))
    __obj.updateDynamic("selectNodes")(js.Any.fromFunction1((t0: java.lang.String) => selectNodes(t0).runNow()))
    __obj.updateDynamic("selectNodesNS")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => selectNodesNS(t0, t1).runNow()))
    __obj.updateDynamic("selectSingleNode")(js.Any.fromFunction1((t0: java.lang.String) => selectSingleNode(t0).runNow()))
    __obj.updateDynamic("selectSingleNodeNS")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => selectSingleNodeNS(t0, t1).runNow()))
    __obj.updateDynamic("substringData")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => substringData(t0, t1).runNow()))
    __obj.asInstanceOf[IXmlCharacterData]
  }
}

