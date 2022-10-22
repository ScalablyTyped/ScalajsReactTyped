package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this interface does not conform to the SAX-standard.
  *
  * Note: Whether or not every callback is supported is dependent on the parser implementation.
  */
trait XExtendedDocumentHandler
  extends StObject
     with XDocumentHandler {
  
  /** informs a writer that it is allowable to insert a line break and indentation before the next XDocumentHandler-call. */
  def allowLineBreak(): Unit
  
  /** receives notification about a comment in the XML-source. */
  def comment(sComment: String): Unit
  
  /**
    * informs about the end of a CDATA-Section.
    *
    * Note that `startCDATA/endCDATA` MUST NOT enclose any `startElement/endElement` -call!
    */
  def endCDATA(): Unit
  
  /**
    * receives notification about the start of a CDATA section in the XML-source.
    *
    * Any string coming in via character handler may include chars, that would otherwise be interpreted as markup.
    */
  def startCDATA(): Unit
  
  /** notifies that any characters that cannot be handled by other callback methods are announced through this method. */
  def unknown(sString: String): Unit
}
object XExtendedDocumentHandler {
  
  inline def apply(
    acquire: Callback,
    allowLineBreak: Callback,
    characters: String => Callback,
    comment: String => Callback,
    endCDATA: Callback,
    endDocument: Callback,
    endElement: String => Callback,
    ignorableWhitespace: String => Callback,
    processingInstruction: (String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setDocumentLocator: XLocator => Callback,
    startCDATA: Callback,
    startDocument: Callback,
    startElement: (String, XAttributeList) => Callback,
    unknown: String => Callback
  ): XExtendedDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, allowLineBreak = allowLineBreak.toJsFn, characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), comment = js.Any.fromFunction1((t0: String) => comment(t0).runNow()), endCDATA = endCDATA.toJsFn, endDocument = endDocument.toJsFn, endElement = js.Any.fromFunction1((t0: String) => endElement(t0).runNow()), ignorableWhitespace = js.Any.fromFunction1((t0: String) => ignorableWhitespace(t0).runNow()), processingInstruction = js.Any.fromFunction2((t0: String, t1: String) => (processingInstruction(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDocumentLocator = js.Any.fromFunction1((t0: XLocator) => setDocumentLocator(t0).runNow()), startCDATA = startCDATA.toJsFn, startDocument = startDocument.toJsFn, startElement = js.Any.fromFunction2((t0: String, t1: XAttributeList) => (startElement(t0, t1)).runNow()), unknown = js.Any.fromFunction1((t0: String) => unknown(t0).runNow()))
    __obj.asInstanceOf[XExtendedDocumentHandler]
  }
  
  extension [Self <: XExtendedDocumentHandler](x: Self) {
    
    inline def setAllowLineBreak(value: Callback): Self = StObject.set(x, "allowLineBreak", value.toJsFn)
    
    inline def setComment(value: String => Callback): Self = StObject.set(x, "comment", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setEndCDATA(value: Callback): Self = StObject.set(x, "endCDATA", value.toJsFn)
    
    inline def setStartCDATA(value: Callback): Self = StObject.set(x, "startCDATA", value.toJsFn)
    
    inline def setUnknown(value: String => Callback): Self = StObject.set(x, "unknown", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
