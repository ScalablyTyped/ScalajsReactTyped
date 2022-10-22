package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a SAX parser.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.Parser** with some minor adaptations.
  */
trait XParser
  extends StObject
     with XInterface {
  
  /**
    * parses an XML document from a stream.
    *
    * Set the desired handlers before calling this method.
    */
  def parseStream(aInputSource: InputSource): Unit
  
  /** allows an application to register a DTD-Handler. */
  def setDTDHandler(xHandler: XDTDHandler): Unit
  
  /** allows an application to register a document event handler. */
  def setDocumentHandler(xHandler: XDocumentHandler): Unit
  
  /** allows an application to register a DTD-Handler. */
  def setEntityResolver(xResolver: XEntityResolver): Unit
  
  /**
    * allows an application to register an error event handler.
    *
    * Note that the error handler can throw an exception when an error or warning occurs. Note that an exception is thrown by the parser when an
    * unrecoverable (fatal) error occurs.
    */
  def setErrorHandler(xHandler: XErrorHandler): Unit
  
  /**
    * sets a locale specified for localization of warnings and error messages.
    *
    * Set the language of the error messages. Useful when the parsing errors will be presented to the user.
    */
  def setLocale(locale: Locale): Unit
}
object XParser {
  
  inline def apply(
    acquire: Callback,
    parseStream: InputSource => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setDTDHandler: XDTDHandler => Callback,
    setDocumentHandler: XDocumentHandler => Callback,
    setEntityResolver: XEntityResolver => Callback,
    setErrorHandler: XErrorHandler => Callback,
    setLocale: Locale => Callback
  ): XParser = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, parseStream = js.Any.fromFunction1((t0: InputSource) => parseStream(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDTDHandler = js.Any.fromFunction1((t0: XDTDHandler) => setDTDHandler(t0).runNow()), setDocumentHandler = js.Any.fromFunction1((t0: XDocumentHandler) => setDocumentHandler(t0).runNow()), setEntityResolver = js.Any.fromFunction1((t0: XEntityResolver) => setEntityResolver(t0).runNow()), setErrorHandler = js.Any.fromFunction1((t0: XErrorHandler) => setErrorHandler(t0).runNow()), setLocale = js.Any.fromFunction1((t0: Locale) => setLocale(t0).runNow()))
    __obj.asInstanceOf[XParser]
  }
  
  extension [Self <: XParser](x: Self) {
    
    inline def setParseStream(value: InputSource => Callback): Self = StObject.set(x, "parseStream", js.Any.fromFunction1((t0: InputSource) => value(t0).runNow()))
    
    inline def setSetDTDHandler(value: XDTDHandler => Callback): Self = StObject.set(x, "setDTDHandler", js.Any.fromFunction1((t0: XDTDHandler) => value(t0).runNow()))
    
    inline def setSetDocumentHandler(value: XDocumentHandler => Callback): Self = StObject.set(x, "setDocumentHandler", js.Any.fromFunction1((t0: XDocumentHandler) => value(t0).runNow()))
    
    inline def setSetEntityResolver(value: XEntityResolver => Callback): Self = StObject.set(x, "setEntityResolver", js.Any.fromFunction1((t0: XEntityResolver) => value(t0).runNow()))
    
    inline def setSetErrorHandler(value: XErrorHandler => Callback): Self = StObject.set(x, "setErrorHandler", js.Any.fromFunction1((t0: XErrorHandler) => value(t0).runNow()))
    
    inline def setSetLocale(value: Locale => Callback): Self = StObject.set(x, "setLocale", js.Any.fromFunction1((t0: Locale) => value(t0).runNow()))
  }
}
