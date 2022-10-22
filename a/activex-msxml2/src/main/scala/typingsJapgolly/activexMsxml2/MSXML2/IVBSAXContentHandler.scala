package typingsJapgolly.activexMsxml2.MSXML2

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IVBSAXContentHandler interface */
trait IVBSAXContentHandler extends StObject {
  
  /* private */ @JSName("MSXML2.IVBSAXContentHandler_typekey")
  var MSXML2DotIVBSAXContentHandler_typekey: IVBSAXContentHandler
  
  /** Receive notification of character data. */
  def characters(strChars: String): Unit
  
  /** Receive an object for locating the origin of SAX document events. */
  val documentLocator: IVBSAXLocator
  
  /** Receive notification of the end of a document. */
  def endDocument(): Unit
  
  /** Receive notification of the end of an element. */
  def endElement(strNamespaceURI: String, strLocalName: String, strQName: String): Unit
  
  /** End the scope of a prefix-URI mapping. */
  def endPrefixMapping(strPrefix: String): Unit
  
  /** Receive notification of ignorable whitespace in element content. */
  def ignorableWhitespace(strChars: String): Unit
  
  /** Receive notification of a processing instruction. */
  def processingInstruction(strTarget: String, strData: String): Unit
  
  /** Receive notification of a skipped entity. */
  def skippedEntity(strName: String): Unit
  
  /** Receive notification of the beginning of a document. */
  def startDocument(): Unit
  
  /** Receive notification of the beginning of an element. */
  def startElement(strNamespaceURI: String, strLocalName: String, strQName: String, oAttributes: IVBSAXAttributes): Unit
  
  /** Begin the scope of a prefix-URI Namespace mapping. */
  def startPrefixMapping(strPrefix: String, strURI: String): Unit
}
object IVBSAXContentHandler {
  
  inline def apply(
    MSXML2DotIVBSAXContentHandler_typekey: IVBSAXContentHandler,
    characters: String => Callback,
    documentLocator: IVBSAXLocator,
    endDocument: Callback,
    endElement: (String, String, String) => Callback,
    endPrefixMapping: String => Callback,
    ignorableWhitespace: String => Callback,
    processingInstruction: (String, String) => Callback,
    skippedEntity: String => Callback,
    startDocument: Callback,
    startElement: (String, String, String, IVBSAXAttributes) => Callback,
    startPrefixMapping: (String, String) => Callback
  ): IVBSAXContentHandler = {
    val __obj = js.Dynamic.literal(characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), documentLocator = documentLocator.asInstanceOf[js.Any], endDocument = endDocument.toJsFn, endElement = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (endElement(t0, t1, t2)).runNow()), endPrefixMapping = js.Any.fromFunction1((t0: String) => endPrefixMapping(t0).runNow()), ignorableWhitespace = js.Any.fromFunction1((t0: String) => ignorableWhitespace(t0).runNow()), processingInstruction = js.Any.fromFunction2((t0: String, t1: String) => (processingInstruction(t0, t1)).runNow()), skippedEntity = js.Any.fromFunction1((t0: String) => skippedEntity(t0).runNow()), startDocument = startDocument.toJsFn, startElement = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: IVBSAXAttributes) => (startElement(t0, t1, t2, t3)).runNow()), startPrefixMapping = js.Any.fromFunction2((t0: String, t1: String) => (startPrefixMapping(t0, t1)).runNow()))
    __obj.updateDynamic("MSXML2.IVBSAXContentHandler_typekey")(MSXML2DotIVBSAXContentHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXContentHandler]
  }
  
  extension [Self <: IVBSAXContentHandler](x: Self) {
    
    inline def setCharacters(value: String => Callback): Self = StObject.set(x, "characters", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setDocumentLocator(value: IVBSAXLocator): Self = StObject.set(x, "documentLocator", value.asInstanceOf[js.Any])
    
    inline def setEndDocument(value: Callback): Self = StObject.set(x, "endDocument", value.toJsFn)
    
    inline def setEndElement(value: (String, String, String) => Callback): Self = StObject.set(x, "endElement", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setEndPrefixMapping(value: String => Callback): Self = StObject.set(x, "endPrefixMapping", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setIgnorableWhitespace(value: String => Callback): Self = StObject.set(x, "ignorableWhitespace", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setMSXML2DotIVBSAXContentHandler_typekey(value: IVBSAXContentHandler): Self = StObject.set(x, "MSXML2.IVBSAXContentHandler_typekey", value.asInstanceOf[js.Any])
    
    inline def setProcessingInstruction(value: (String, String) => Callback): Self = StObject.set(x, "processingInstruction", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSkippedEntity(value: String => Callback): Self = StObject.set(x, "skippedEntity", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStartDocument(value: Callback): Self = StObject.set(x, "startDocument", value.toJsFn)
    
    inline def setStartElement(value: (String, String, String, IVBSAXAttributes) => Callback): Self = StObject.set(x, "startElement", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: IVBSAXAttributes) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setStartPrefixMapping(value: (String, String) => Callback): Self = StObject.set(x, "startPrefixMapping", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
