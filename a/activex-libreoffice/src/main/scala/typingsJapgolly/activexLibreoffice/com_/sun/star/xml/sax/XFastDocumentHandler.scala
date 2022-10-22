package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** receives notification of sax document events from a {@link XFastParser} */
trait XFastDocumentHandler
  extends StObject
     with XFastContextHandler {
  
  /** called by the parser after the last XML element of a stream is processed. */
  def endDocument(): Unit
  
  /** receives an object for locating the origin of SAX document events. */
  def setDocumentLocator(xLocator: XLocator): Unit
  
  /** called by the parser when parsing of an XML stream is started. */
  def startDocument(): Unit
}
object XFastDocumentHandler {
  
  inline def apply(
    acquire: Callback,
    characters: String => Callback,
    createFastChildContext: (Double, XFastAttributeList) => XFastContextHandler,
    createUnknownChildContext: (String, String, XFastAttributeList) => XFastContextHandler,
    endDocument: Callback,
    endFastElement: Double => Callback,
    endUnknownElement: (String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setDocumentLocator: XLocator => Callback,
    startDocument: Callback,
    startFastElement: (Double, XFastAttributeList) => Callback,
    startUnknownElement: (String, String, XFastAttributeList) => Callback
  ): XFastDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), createFastChildContext = js.Any.fromFunction2(createFastChildContext), createUnknownChildContext = js.Any.fromFunction3(createUnknownChildContext), endDocument = endDocument.toJsFn, endFastElement = js.Any.fromFunction1((t0: Double) => endFastElement(t0).runNow()), endUnknownElement = js.Any.fromFunction2((t0: String, t1: String) => (endUnknownElement(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDocumentLocator = js.Any.fromFunction1((t0: XLocator) => setDocumentLocator(t0).runNow()), startDocument = startDocument.toJsFn, startFastElement = js.Any.fromFunction2((t0: Double, t1: XFastAttributeList) => (startFastElement(t0, t1)).runNow()), startUnknownElement = js.Any.fromFunction3((t0: String, t1: String, t2: XFastAttributeList) => (startUnknownElement(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XFastDocumentHandler]
  }
  
  extension [Self <: XFastDocumentHandler](x: Self) {
    
    inline def setEndDocument(value: Callback): Self = StObject.set(x, "endDocument", value.toJsFn)
    
    inline def setSetDocumentLocator(value: XLocator => Callback): Self = StObject.set(x, "setDocumentLocator", js.Any.fromFunction1((t0: XLocator) => value(t0).runNow()))
    
    inline def setStartDocument(value: Callback): Self = StObject.set(x, "startDocument", value.toJsFn)
  }
}
