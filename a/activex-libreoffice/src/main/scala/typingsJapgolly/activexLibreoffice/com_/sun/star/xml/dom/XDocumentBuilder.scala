package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XEntityResolver
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XErrorHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builds a new dom tree */
trait XDocumentBuilder
  extends StObject
     with XInterface {
  
  /** Obtain an instance of a DOMImplementation object. */
  val DOMImplementation: XDOMImplementation
  
  /** Obtain an instance of a DOMImplementation object. */
  def getDOMImplementation(): XDOMImplementation
  
  /** Indicates whether or not this parser is configured to understand namespaces. */
  def isNamespaceAware(): Boolean
  
  /** Indicates whether or not this parser is configured to validate XML documents. */
  def isValidating(): Boolean
  
  /** Obtain a new instance of a DOM Document object to build a DOM tree with. */
  def newDocument(): XDocument
  
  /** Parse the content of the given InputStream as an XML document and return a new DOM Document object. */
  def parse(is: XInputStream): XDocument
  
  /** Parse the content of the given URI as an XML document and return a new DOM Document object. */
  def parseURI(uri: String): XDocument
  
  /** Specify the EntityResolver to be used to resolve entities present in the XML document to be parsed. */
  def setEntityResolver(er: XEntityResolver): Unit
  
  /** Specify the ErrorHandler to be used to report errors present in the XML document to be parsed. */
  def setErrorHandler(eh: XErrorHandler): Unit
}
object XDocumentBuilder {
  
  inline def apply(
    DOMImplementation: XDOMImplementation,
    acquire: Callback,
    getDOMImplementation: CallbackTo[XDOMImplementation],
    isNamespaceAware: CallbackTo[Boolean],
    isValidating: CallbackTo[Boolean],
    newDocument: CallbackTo[XDocument],
    parse: XInputStream => XDocument,
    parseURI: String => XDocument,
    queryInterface: `type` => Any,
    release: Callback,
    setEntityResolver: XEntityResolver => Callback,
    setErrorHandler: XErrorHandler => Callback
  ): XDocumentBuilder = {
    val __obj = js.Dynamic.literal(DOMImplementation = DOMImplementation.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDOMImplementation = getDOMImplementation.toJsFn, isNamespaceAware = isNamespaceAware.toJsFn, isValidating = isValidating.toJsFn, newDocument = newDocument.toJsFn, parse = js.Any.fromFunction1(parse), parseURI = js.Any.fromFunction1(parseURI), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setEntityResolver = js.Any.fromFunction1((t0: XEntityResolver) => setEntityResolver(t0).runNow()), setErrorHandler = js.Any.fromFunction1((t0: XErrorHandler) => setErrorHandler(t0).runNow()))
    __obj.asInstanceOf[XDocumentBuilder]
  }
  
  extension [Self <: XDocumentBuilder](x: Self) {
    
    inline def setDOMImplementation(value: XDOMImplementation): Self = StObject.set(x, "DOMImplementation", value.asInstanceOf[js.Any])
    
    inline def setGetDOMImplementation(value: CallbackTo[XDOMImplementation]): Self = StObject.set(x, "getDOMImplementation", value.toJsFn)
    
    inline def setIsNamespaceAware(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNamespaceAware", value.toJsFn)
    
    inline def setIsValidating(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValidating", value.toJsFn)
    
    inline def setNewDocument(value: CallbackTo[XDocument]): Self = StObject.set(x, "newDocument", value.toJsFn)
    
    inline def setParse(value: XInputStream => XDocument): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setParseURI(value: String => XDocument): Self = StObject.set(x, "parseURI", js.Any.fromFunction1(value))
    
    inline def setSetEntityResolver(value: XEntityResolver => Callback): Self = StObject.set(x, "setEntityResolver", js.Any.fromFunction1((t0: XEntityResolver) => value(t0).runNow()))
    
    inline def setSetErrorHandler(value: XErrorHandler => Callback): Self = StObject.set(x, "setErrorHandler", js.Any.fromFunction1((t0: XErrorHandler) => value(t0).runNow()))
  }
}
