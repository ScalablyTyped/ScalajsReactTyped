package typingsJapgolly.winrtUwp.Windows.Web.Syndication

import typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents feed content including Text, HTML, XHTML, URL, and XML. This object encapsulates the atom:content element in Atom 1.0 and can contain a link to external content. */
trait SyndicationContent extends StObject {
  
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute]
  
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri
  
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode]
  
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument
  
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String
  
  /** Gets or sets the local name of the element. */
  var nodeName: String
  
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String
  
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: String
  
  /** Gets or sets the URI to the content. This property represents the src attribute on atom:content. */
  var sourceUri: Uri
  
  /** Gets the syndication content. */
  var text: String
  
  /** Gets or sets the type of the content. */
  var `type`: String
  
  /** Gets or sets the XML content. */
  var xml: XmlDocument
}
object SyndicationContent {
  
  inline def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    sourceUri: Uri,
    text: String,
    `type`: String,
    xml: XmlDocument
  ): SyndicationContent = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], sourceUri = sourceUri.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationContent]
  }
  
  extension [Self <: SyndicationContent](x: Self) {
    
    inline def setAttributeExtensions(value: IVector[SyndicationAttribute]): Self = StObject.set(x, "attributeExtensions", value.asInstanceOf[js.Any])
    
    inline def setBaseUri(value: Uri): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
    
    inline def setElementExtensions(value: IVector[ISyndicationNode]): Self = StObject.set(x, "elementExtensions", value.asInstanceOf[js.Any])
    
    inline def setGetXmlDocument(value: SyndicationFormat => XmlDocument): Self = StObject.set(x, "getXmlDocument", js.Any.fromFunction1(value))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeNamespace(value: String): Self = StObject.set(x, "nodeNamespace", value.asInstanceOf[js.Any])
    
    inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    inline def setSourceUri(value: Uri): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXml(value: XmlDocument): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
