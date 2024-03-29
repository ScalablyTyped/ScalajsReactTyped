package typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates the methods needed to execute XPath queries on an XML DOM tree or subtree. */
trait IXmlNodeSelector extends StObject {
  
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
  def selectNodesNS(xpath: String, namespaces: Any): XmlNodeList
  
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
  def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode
}
object IXmlNodeSelector {
  
  inline def apply(
    selectNodes: String => XmlNodeList,
    selectNodesNS: (String, Any) => XmlNodeList,
    selectSingleNode: String => IXmlNode,
    selectSingleNodeNS: (String, Any) => IXmlNode
  ): IXmlNodeSelector = {
    val __obj = js.Dynamic.literal(selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS))
    __obj.asInstanceOf[IXmlNodeSelector]
  }
  
  extension [Self <: IXmlNodeSelector](x: Self) {
    
    inline def setSelectNodes(value: String => XmlNodeList): Self = StObject.set(x, "selectNodes", js.Any.fromFunction1(value))
    
    inline def setSelectNodesNS(value: (String, Any) => XmlNodeList): Self = StObject.set(x, "selectNodesNS", js.Any.fromFunction2(value))
    
    inline def setSelectSingleNode(value: String => IXmlNode): Self = StObject.set(x, "selectSingleNode", js.Any.fromFunction1(value))
    
    inline def setSelectSingleNodeNS(value: (String, Any) => IXmlNode): Self = StObject.set(x, "selectSingleNodeNS", js.Any.fromFunction2(value))
  }
}
