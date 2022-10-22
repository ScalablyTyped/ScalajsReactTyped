package typingsJapgolly.activexLibreoffice.com_.sun.star.xml

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XLocator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object input {
  
  /**
    * This service helps parsing files by providing a SAX document handler interface for a SAX parsers. You have to instantiate this service passing an
    * {@link XRoot} instance.
    */
  trait SaxDocumentHandler
    extends StObject
       with XDocumentHandler
       with XInitialization
  object SaxDocumentHandler {
    
    inline def apply(
      acquire: Callback,
      characters: String => Callback,
      endDocument: Callback,
      endElement: String => Callback,
      ignorableWhitespace: String => Callback,
      initialize: SeqEquiv[Any] => Callback,
      processingInstruction: (String, String) => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      setDocumentLocator: XLocator => Callback,
      startDocument: Callback,
      startElement: (String, XAttributeList) => Callback
    ): SaxDocumentHandler = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), endDocument = endDocument.toJsFn, endElement = js.Any.fromFunction1((t0: String) => endElement(t0).runNow()), ignorableWhitespace = js.Any.fromFunction1((t0: String) => ignorableWhitespace(t0).runNow()), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), processingInstruction = js.Any.fromFunction2((t0: String, t1: String) => (processingInstruction(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDocumentLocator = js.Any.fromFunction1((t0: XLocator) => setDocumentLocator(t0).runNow()), startDocument = startDocument.toJsFn, startElement = js.Any.fromFunction2((t0: String, t1: XAttributeList) => (startElement(t0, t1)).runNow()))
      __obj.asInstanceOf[SaxDocumentHandler]
    }
  }
  
  /** An element's attributes */
  trait XAttributes
    extends StObject
       with XInterface {
    
    /**
      * Gets the number of attributes.
      * @returns number of attributes
      */
    val Length: Double
    
    /**
      * Gets attribute index passing a QName.
      * @param qName QName
      * @returns attribute index or -1, if not found
      */
    def getIndexByQName(qName: String): Double
    
    /**
      * Gets attribute index passing a namespace uid and a local name.
      * @param uid namespace uid
      * @param localName local name
      * @returns attribute index or -1, if not found
      */
    def getIndexByUidName(uid: Double, localName: String): Double
    
    /**
      * Gets the number of attributes.
      * @returns number of attributes
      */
    def getLength(): Double
    
    /**
      * Gets the local name of an attribute.
      * @param nIndex index
      * @returns local name of attribute or empty string, if invalid index
      */
    def getLocalNameByIndex(nIndex: Double): String
    
    /**
      * Gets the QName of an attribute.
      * @param nIndex index
      * @returns QName of attribute or empty string, if invalid index
      */
    def getQNameByIndex(nIndex: Double): String
    
    /**
      * Gets the type of an attribute, if possible.
      * @param nIndex index
      * @returns type of attribute (if possible, else empty string)
      */
    def getTypeByIndex(nIndex: Double): String
    
    /**
      * Gets the namespace uid of an attribute.
      * @param nIndex index
      * @returns namespace uid of attribute or -1, if invalid index
      */
    def getUidByIndex(nIndex: Double): Double
    
    /**
      * Gets the value of an attribute.
      * @param nIndex index
      * @returns value string or empty string, if invalid index
      */
    def getValueByIndex(nIndex: Double): String
    
    /**
      * For convenience: Gets the value of an attribute passing uid, local name.
      * @param uid namespace uid
      * @param localName local name
      * @returns value string or empty string, if invalid uid/local name
      */
    def getValueByUidName(uid: Double, localName: String): String
  }
  object XAttributes {
    
    inline def apply(
      Length: Double,
      acquire: Callback,
      getIndexByQName: String => Double,
      getIndexByUidName: (Double, String) => Double,
      getLength: CallbackTo[Double],
      getLocalNameByIndex: Double => String,
      getQNameByIndex: Double => String,
      getTypeByIndex: Double => String,
      getUidByIndex: Double => Double,
      getValueByIndex: Double => String,
      getValueByUidName: (Double, String) => String,
      queryInterface: `type` => Any,
      release: Callback
    ): XAttributes = {
      val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], acquire = acquire.toJsFn, getIndexByQName = js.Any.fromFunction1(getIndexByQName), getIndexByUidName = js.Any.fromFunction2(getIndexByUidName), getLength = getLength.toJsFn, getLocalNameByIndex = js.Any.fromFunction1(getLocalNameByIndex), getQNameByIndex = js.Any.fromFunction1(getQNameByIndex), getTypeByIndex = js.Any.fromFunction1(getTypeByIndex), getUidByIndex = js.Any.fromFunction1(getUidByIndex), getValueByIndex = js.Any.fromFunction1(getValueByIndex), getValueByUidName = js.Any.fromFunction2(getValueByUidName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XAttributes]
    }
    
    extension [Self <: XAttributes](x: Self) {
      
      inline def setGetIndexByQName(value: String => Double): Self = StObject.set(x, "getIndexByQName", js.Any.fromFunction1(value))
      
      inline def setGetIndexByUidName(value: (Double, String) => Double): Self = StObject.set(x, "getIndexByUidName", js.Any.fromFunction2(value))
      
      inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
      
      inline def setGetLocalNameByIndex(value: Double => String): Self = StObject.set(x, "getLocalNameByIndex", js.Any.fromFunction1(value))
      
      inline def setGetQNameByIndex(value: Double => String): Self = StObject.set(x, "getQNameByIndex", js.Any.fromFunction1(value))
      
      inline def setGetTypeByIndex(value: Double => String): Self = StObject.set(x, "getTypeByIndex", js.Any.fromFunction1(value))
      
      inline def setGetUidByIndex(value: Double => Double): Self = StObject.set(x, "getUidByIndex", js.Any.fromFunction1(value))
      
      inline def setGetValueByIndex(value: Double => String): Self = StObject.set(x, "getValueByIndex", js.Any.fromFunction1(value))
      
      inline def setGetValueByUidName(value: (Double, String) => String): Self = StObject.set(x, "getValueByUidName", js.Any.fromFunction2(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    }
  }
  
  /** Capsule around an XML element. */
  trait XElement
    extends StObject
       with XInterface {
    
    /**
      * Gets the attributes of this element.
      * @returns attributes of this element
      */
    val Attributes: XAttributes
    
    /**
      * Gets the local name of this element.
      * @returns local name of this element
      */
    val LocalName: String
    
    /**
      * Gets the parent context.
      * @returns parent context
      */
    val Parent: XElement
    
    /**
      * Gets the namespace uid of this element.
      * @returns namespace uid of this element
      */
    val Uid: Double
    
    /**
      * Called upon retrieval of characters.
      * @param chars characters
      */
    def characters(chars: String): Unit
    
    /** Receives notification of element closing. */
    def endElement(): Unit
    
    /**
      * Gets the attributes of this element.
      * @returns attributes of this element
      */
    def getAttributes(): XAttributes
    
    /**
      * Gets the local name of this element.
      * @returns local name of this element
      */
    def getLocalName(): String
    
    /**
      * Gets the parent context.
      * @returns parent context
      */
    def getParent(): XElement
    
    /**
      * Gets the namespace uid of this element.
      * @returns namespace uid of this element
      */
    def getUid(): Double
    
    /**
      * Receives notification of white space that can be ignored.
      * @param whitespace white space characters
      */
    def ignorableWhitespace(whitespace: String): Unit
    
    /**
      * Receives notification of a processing instruction.
      * @param target target
      * @param data data
      */
    def processingInstruction(target: String, data: String): Unit
    
    /**
      * Called upon each occurring child element.
      * @param uid namespace uid of element
      * @param localName local name of element
      * @param xAttributes attributes of element
      * @returns child import context
      */
    def startChildElement(uid: Double, localName: String, xAttributes: XAttributes): XElement
  }
  object XElement {
    
    inline def apply(
      Attributes: XAttributes,
      LocalName: String,
      Parent: XElement,
      Uid: Double,
      acquire: Callback,
      characters: String => Callback,
      endElement: Callback,
      getAttributes: CallbackTo[XAttributes],
      getLocalName: CallbackTo[String],
      getParent: CallbackTo[XElement],
      getUid: CallbackTo[Double],
      ignorableWhitespace: String => Callback,
      processingInstruction: (String, String) => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      startChildElement: (Double, String, XAttributes) => XElement
    ): XElement = {
      val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Uid = Uid.asInstanceOf[js.Any], acquire = acquire.toJsFn, characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), endElement = endElement.toJsFn, getAttributes = getAttributes.toJsFn, getLocalName = getLocalName.toJsFn, getParent = getParent.toJsFn, getUid = getUid.toJsFn, ignorableWhitespace = js.Any.fromFunction1((t0: String) => ignorableWhitespace(t0).runNow()), processingInstruction = js.Any.fromFunction2((t0: String, t1: String) => (processingInstruction(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, startChildElement = js.Any.fromFunction3(startChildElement))
      __obj.asInstanceOf[XElement]
    }
    
    extension [Self <: XElement](x: Self) {
      
      inline def setAttributes(value: XAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      inline def setCharacters(value: String => Callback): Self = StObject.set(x, "characters", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setEndElement(value: Callback): Self = StObject.set(x, "endElement", value.toJsFn)
      
      inline def setGetAttributes(value: CallbackTo[XAttributes]): Self = StObject.set(x, "getAttributes", value.toJsFn)
      
      inline def setGetLocalName(value: CallbackTo[String]): Self = StObject.set(x, "getLocalName", value.toJsFn)
      
      inline def setGetParent(value: CallbackTo[XElement]): Self = StObject.set(x, "getParent", value.toJsFn)
      
      inline def setGetUid(value: CallbackTo[Double]): Self = StObject.set(x, "getUid", value.toJsFn)
      
      inline def setIgnorableWhitespace(value: String => Callback): Self = StObject.set(x, "ignorableWhitespace", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setLocalName(value: String): Self = StObject.set(x, "LocalName", value.asInstanceOf[js.Any])
      
      inline def setParent(value: XElement): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
      
      inline def setProcessingInstruction(value: (String, String) => Callback): Self = StObject.set(x, "processingInstruction", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setStartChildElement(value: (Double, String, XAttributes) => XElement): Self = StObject.set(x, "startChildElement", js.Any.fromFunction3(value))
      
      inline def setUid(value: Double): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
    }
  }
  
  /** Interface to map XML namespace URI strings to ordinals (URI-id, short uid). */
  trait XNamespaceMapping
    extends StObject
       with XInterface {
    
    /**
      * Creates a unique ordinal passing an XML namespace URI.
      * @param uri XML namespace URI
      * @returns uid
      */
    def getUidByUri(uri: String): Double
    
    /**
      * Gets the corresponding XML namespace URI passing a uid (created using {@link getUidByUri()} ).
      * @param uid uid
      * @returns XML namespace URI
      */
    def getUriByUid(uid: Double): String
  }
  object XNamespaceMapping {
    
    inline def apply(
      acquire: Callback,
      getUidByUri: String => Double,
      getUriByUid: Double => String,
      queryInterface: `type` => Any,
      release: Callback
    ): XNamespaceMapping = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getUidByUri = js.Any.fromFunction1(getUidByUri), getUriByUid = js.Any.fromFunction1(getUriByUid), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XNamespaceMapping]
    }
    
    extension [Self <: XNamespaceMapping](x: Self) {
      
      inline def setGetUidByUri(value: String => Double): Self = StObject.set(x, "getUidByUri", js.Any.fromFunction1(value))
      
      inline def setGetUriByUid(value: Double => String): Self = StObject.set(x, "getUriByUid", js.Any.fromFunction1(value))
    }
  }
  
  /** Root interface being passed to {@link SaxDocumentHandler} service upon instantiation. */
  trait XRoot
    extends StObject
       with XInterface {
    
    /** Receives notification of the end of a document. */
    def endDocument(): Unit
    
    /**
      * Receives notification of a processing instruction.
      * @param target target
      * @param data data
      */
    def processingInstruction(target: String, data: String): Unit
    
    /**
      * Receives an object for locating the origin of SAX document events.
      * @param locator locator
      */
    def setDocumentLocator(locator: XLocator): Unit
    
    /**
      * Receives notification of the beginning of a document.
      * @param xMapping mapping to obtain ids out of XML namespace URIs and vice versa
      */
    def startDocument(xMapping: XNamespaceMapping): Unit
    
    /**
      * Called upon root element.
      * @param uid namespace uid of element
      * @param localName local name of element
      * @param xAttributes attributes of element
      */
    def startRootElement(uid: Double, localName: String, xAttributes: XAttributes): XElement
  }
  object XRoot {
    
    inline def apply(
      acquire: Callback,
      endDocument: Callback,
      processingInstruction: (String, String) => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      setDocumentLocator: XLocator => Callback,
      startDocument: XNamespaceMapping => Callback,
      startRootElement: (Double, String, XAttributes) => XElement
    ): XRoot = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, endDocument = endDocument.toJsFn, processingInstruction = js.Any.fromFunction2((t0: String, t1: String) => (processingInstruction(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDocumentLocator = js.Any.fromFunction1((t0: XLocator) => setDocumentLocator(t0).runNow()), startDocument = js.Any.fromFunction1((t0: XNamespaceMapping) => startDocument(t0).runNow()), startRootElement = js.Any.fromFunction3(startRootElement))
      __obj.asInstanceOf[XRoot]
    }
    
    extension [Self <: XRoot](x: Self) {
      
      inline def setEndDocument(value: Callback): Self = StObject.set(x, "endDocument", value.toJsFn)
      
      inline def setProcessingInstruction(value: (String, String) => Callback): Self = StObject.set(x, "processingInstruction", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetDocumentLocator(value: XLocator => Callback): Self = StObject.set(x, "setDocumentLocator", js.Any.fromFunction1((t0: XLocator) => value(t0).runNow()))
      
      inline def setStartDocument(value: XNamespaceMapping => Callback): Self = StObject.set(x, "startDocument", js.Any.fromFunction1((t0: XNamespaceMapping) => value(t0).runNow()))
      
      inline def setStartRootElement(value: (Double, String, XAttributes) => XElement): Self = StObject.set(x, "startRootElement", js.Any.fromFunction3(value))
    }
  }
}
