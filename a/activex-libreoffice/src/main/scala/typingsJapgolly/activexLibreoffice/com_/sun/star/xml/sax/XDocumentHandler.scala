package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives notification of general document events.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.DocumentHandler** with some smaller adaptations.
  */
trait XDocumentHandler
  extends StObject
     with XInterface {
  
  /** receives notification of character data. */
  def characters(aChars: String): Unit
  
  /** receives notification of the end of a document. */
  def endDocument(): Unit
  
  /** receives notification of the end of an element. */
  def endElement(aName: String): Unit
  
  /** receives notification of white space that can be ignored. */
  def ignorableWhitespace(aWhitespaces: String): Unit
  
  /** receives notification of a processing instruction. */
  def processingInstruction(aTarget: String, aData: String): Unit
  
  /** receives an object for locating the origin of SAX document events. */
  def setDocumentLocator(xLocator: XLocator): Unit
  
  /** receives notification of the beginning of a document. */
  def startDocument(): Unit
  
  /** receives notification of the beginning of an element . */
  def startElement(aName: String, xAttribs: XAttributeList): Unit
}
object XDocumentHandler {
  
  inline def apply(
    acquire: Callback,
    characters: String => Callback,
    endDocument: Callback,
    endElement: String => Callback,
    ignorableWhitespace: String => Callback,
    processingInstruction: (String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setDocumentLocator: XLocator => Callback,
    startDocument: Callback,
    startElement: (String, XAttributeList) => Callback
  ): XDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), endDocument = endDocument.toJsFn, endElement = js.Any.fromFunction1((t0: String) => endElement(t0).runNow()), ignorableWhitespace = js.Any.fromFunction1((t0: String) => ignorableWhitespace(t0).runNow()), processingInstruction = js.Any.fromFunction2((t0: String, t1: String) => (processingInstruction(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDocumentLocator = js.Any.fromFunction1((t0: XLocator) => setDocumentLocator(t0).runNow()), startDocument = startDocument.toJsFn, startElement = js.Any.fromFunction2((t0: String, t1: XAttributeList) => (startElement(t0, t1)).runNow()))
    __obj.asInstanceOf[XDocumentHandler]
  }
  
  extension [Self <: XDocumentHandler](x: Self) {
    
    inline def setCharacters(value: String => Callback): Self = StObject.set(x, "characters", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setEndDocument(value: Callback): Self = StObject.set(x, "endDocument", value.toJsFn)
    
    inline def setEndElement(value: String => Callback): Self = StObject.set(x, "endElement", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setIgnorableWhitespace(value: String => Callback): Self = StObject.set(x, "ignorableWhitespace", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setProcessingInstruction(value: (String, String) => Callback): Self = StObject.set(x, "processingInstruction", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetDocumentLocator(value: XLocator => Callback): Self = StObject.set(x, "setDocumentLocator", js.Any.fromFunction1((t0: XLocator) => value(t0).runNow()))
    
    inline def setStartDocument(value: Callback): Self = StObject.set(x, "startDocument", value.toJsFn)
    
    inline def setStartElement(value: (String, XAttributeList) => Callback): Self = StObject.set(x, "startElement", js.Any.fromFunction2((t0: String, t1: XAttributeList) => (value(t0, t1)).runNow()))
  }
}
