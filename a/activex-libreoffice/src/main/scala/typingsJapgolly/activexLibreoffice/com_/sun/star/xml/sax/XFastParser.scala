package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a SAX parser that uses integer values for known XML names (elements, attributes and attribute values). The parser also handles namespaces
  * and allows to have individual contexts for each XML element.
  *
  * Before parsing is possible you have to set your {@link XFastDocumentHandler} using {@link setFastDocumentHandler()} .
  *
  * Parsing starts with calling {@link parseStream()} . If the parser finds a valid XML file with the given {@link InputSource} , it calls {@link
  * XFastDocumentHandler.startDocument()} first.
  *
  * This parser generates either "fast" events that use integer token values for namespaces, elements and attributes or "unknown" events for elements that
  * are unknown.
  *
  * A namespace is unknown if the namespace URL was not registered with {@link registerNamespace()} .
  *
  * An element is unknown if no {@link XFastTokenHandler} is set or if the {@link XFastTokenHandler} does not return a valid identifier for the elements
  * local name. An element is also unknown if the elements local name is known but it uses a namespace that is unknown.
  *
  * Setting a {@link XFastTokenHandler} with {@link setTokenHandler()} is optional, but without a {@link XFastTokenHandler} you will only get unknown sax
  * events. This can be useful if you are only interested in the namespace handling and/or the context feature.
  *
  * For each element the parser sends a create child element event to the elements parent context by calling {@link
  * XFastContextHandler.createFastChildContext()} for known elements or {@link XFastContextHandler.createUnknownChildContext()} for unknown elements. ;
  * The parent context for the root element is the {@link XFastDocumentHandler} itself.
  *
  * If the parent context returns an empty reference, no further events for the element and all of its children are created.
  *
  * If a valid context is returned this context gets a start event by a call to {@link XFastContextHandler.startFastElement()} for known elements or
  * {@link XFastContextHandler.startUnknownElement()} for unknown elements.
  *
  * After processing all its child elements the context gets an end event by a call to {@link XFastContextHandler.endFastElement()} for known elements or
  * {@link XFastContextHandler.endUnknownElement()} for unknown elements.
  *
  * It is valid to return one instance of {@link XFastContextHandler} more than once. It is even possible to only use the {@link XFastDocumentHandler} by
  * always returning a reference to itself for each create child context event.
  *
  * After the last element is processed the parser generates an end document event at the {@link XFastDocumentHandler} by calling {@link
  * XFastDocumentHandler.endDocument()} .
  * @see http://wiki.openoffice.org/wiki/FastParser
  */
trait XFastParser
  extends StObject
     with XInterface {
  
  /** Gets the namespace url string. */
  def getNamespaceURL(prefix: String): String
  
  /**
    * parses an XML document from a stream.
    *
    * Set the desired handlers before calling this method.
    */
  def parseStream(aInputSource: InputSource): Unit
  
  /**
    * registers a known namespace url with the given integer token. ;
    * @param NamespaceURL the namespace URL.
    * @param NamespaceToken an integer token that must be greater than {@link FastToken.NAMESPACE} .
    */
  def registerNamespace(NamespaceURL: String, NamespaceToken: Double): Unit
  
  /** allows an application to register a DTD-Handler. */
  def setEntityResolver(Resolver: XEntityResolver): Unit
  
  /**
    * allows an application to register an error event handler.
    *
    * Note that the error handler can throw an exception when an error or warning occurs. Note that an exception is thrown by the parser when an
    * unrecoverable (fatal) error occurs.
    */
  def setErrorHandler(Handler: XErrorHandler): Unit
  
  /** Application must register a document event handler to get sax events for the parsed stream. */
  def setFastDocumentHandler(Handler: XFastDocumentHandler): Unit
  
  /**
    * sets a locale specified for localization of warnings and error messages.
    *
    * Set the language of the error messages. Useful when the parsing errors will be presented to the user.
    */
  def setLocale(locale: Locale): Unit
  
  /** @since LibreOffice 5.3 */
  def setNamespaceHandler(Handler: XFastNamespaceHandler): Unit
  
  /** must be registered to translate known XML names to integer tokens. */
  def setTokenHandler(Handler: XFastTokenHandler): Unit
}
object XFastParser {
  
  inline def apply(
    acquire: Callback,
    getNamespaceURL: String => String,
    parseStream: InputSource => Callback,
    queryInterface: `type` => Any,
    registerNamespace: (String, Double) => Callback,
    release: Callback,
    setEntityResolver: XEntityResolver => Callback,
    setErrorHandler: XErrorHandler => Callback,
    setFastDocumentHandler: XFastDocumentHandler => Callback,
    setLocale: Locale => Callback,
    setNamespaceHandler: XFastNamespaceHandler => Callback,
    setTokenHandler: XFastTokenHandler => Callback
  ): XFastParser = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getNamespaceURL = js.Any.fromFunction1(getNamespaceURL), parseStream = js.Any.fromFunction1((t0: InputSource) => parseStream(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), registerNamespace = js.Any.fromFunction2((t0: String, t1: Double) => (registerNamespace(t0, t1)).runNow()), release = release.toJsFn, setEntityResolver = js.Any.fromFunction1((t0: XEntityResolver) => setEntityResolver(t0).runNow()), setErrorHandler = js.Any.fromFunction1((t0: XErrorHandler) => setErrorHandler(t0).runNow()), setFastDocumentHandler = js.Any.fromFunction1((t0: XFastDocumentHandler) => setFastDocumentHandler(t0).runNow()), setLocale = js.Any.fromFunction1((t0: Locale) => setLocale(t0).runNow()), setNamespaceHandler = js.Any.fromFunction1((t0: XFastNamespaceHandler) => setNamespaceHandler(t0).runNow()), setTokenHandler = js.Any.fromFunction1((t0: XFastTokenHandler) => setTokenHandler(t0).runNow()))
    __obj.asInstanceOf[XFastParser]
  }
  
  extension [Self <: XFastParser](x: Self) {
    
    inline def setGetNamespaceURL(value: String => String): Self = StObject.set(x, "getNamespaceURL", js.Any.fromFunction1(value))
    
    inline def setParseStream(value: InputSource => Callback): Self = StObject.set(x, "parseStream", js.Any.fromFunction1((t0: InputSource) => value(t0).runNow()))
    
    inline def setRegisterNamespace(value: (String, Double) => Callback): Self = StObject.set(x, "registerNamespace", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetEntityResolver(value: XEntityResolver => Callback): Self = StObject.set(x, "setEntityResolver", js.Any.fromFunction1((t0: XEntityResolver) => value(t0).runNow()))
    
    inline def setSetErrorHandler(value: XErrorHandler => Callback): Self = StObject.set(x, "setErrorHandler", js.Any.fromFunction1((t0: XErrorHandler) => value(t0).runNow()))
    
    inline def setSetFastDocumentHandler(value: XFastDocumentHandler => Callback): Self = StObject.set(x, "setFastDocumentHandler", js.Any.fromFunction1((t0: XFastDocumentHandler) => value(t0).runNow()))
    
    inline def setSetLocale(value: Locale => Callback): Self = StObject.set(x, "setLocale", js.Any.fromFunction1((t0: Locale) => value(t0).runNow()))
    
    inline def setSetNamespaceHandler(value: XFastNamespaceHandler => Callback): Self = StObject.set(x, "setNamespaceHandler", js.Any.fromFunction1((t0: XFastNamespaceHandler) => value(t0).runNow()))
    
    inline def setSetTokenHandler(value: XFastTokenHandler => Callback): Self = StObject.set(x, "setTokenHandler", js.Any.fromFunction1((t0: XFastTokenHandler) => value(t0).runNow()))
  }
}
