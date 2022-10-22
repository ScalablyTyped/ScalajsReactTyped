package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a writer that provides a set of methods to append text in XML format. Use the static SP.XmlWriter.create(sb) Method to create an SP.XmlWriter object with the Sys.StringBuilder object you pass in. */
trait XmlWriter extends StObject {
  
  /** This member is reserved for internal use and is not intended to be used directly from your code. */
  def close(): Unit
  
  /** Appends an attribute with the specified name and value in XML format to the object?s string builder. */
  def writeAttributeString(localName: String, value: String): Unit
  
  /** Appends an element with the specified tag name and value in XML format to the string builder. */
  def writeElementString(tagName: String, value: String): Unit
  
  /** Appends an end of an attribute in XML format to the object?s string builder. */
  def writeEndAttribute(): Unit
  
  /** Appends an end element tag in XML format to the object?s string builder. This method appends the end element tag ?/>? if the start element tag is not closed; otherwise, it appends a full end element tag ?</tagName>? to the string builder. */
  def writeEndElement(): Unit
  
  /** Appends the specified text to the object?s string builder. */
  def writeRaw(xml: String): Unit
  
  /** This method only appends the name of the attribute. You can append the value of the attribute by calling the SP.XmlWriter.writeString(value) Method, and close the attribute by calling the SP.XmlWriter.writeEndAttribute() Method. */
  def writeStartAttribute(localName: String): Unit
  
  /** Appends a start element tag with the specified name in XML format to the object?s string builder. */
  def writeStartElement(tagName: String): Unit
  
  /** Appends the specified value for an element tag or attribute to the object?s string builder. */
  def writeString(value: String): Unit
}
object XmlWriter {
  
  inline def apply(
    close: Callback,
    writeAttributeString: (String, String) => Callback,
    writeElementString: (String, String) => Callback,
    writeEndAttribute: Callback,
    writeEndElement: Callback,
    writeRaw: String => Callback,
    writeStartAttribute: String => Callback,
    writeStartElement: String => Callback,
    writeString: String => Callback
  ): XmlWriter = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, writeAttributeString = js.Any.fromFunction2((t0: String, t1: String) => (writeAttributeString(t0, t1)).runNow()), writeElementString = js.Any.fromFunction2((t0: String, t1: String) => (writeElementString(t0, t1)).runNow()), writeEndAttribute = writeEndAttribute.toJsFn, writeEndElement = writeEndElement.toJsFn, writeRaw = js.Any.fromFunction1((t0: String) => writeRaw(t0).runNow()), writeStartAttribute = js.Any.fromFunction1((t0: String) => writeStartAttribute(t0).runNow()), writeStartElement = js.Any.fromFunction1((t0: String) => writeStartElement(t0).runNow()), writeString = js.Any.fromFunction1((t0: String) => writeString(t0).runNow()))
    __obj.asInstanceOf[XmlWriter]
  }
  
  extension [Self <: XmlWriter](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setWriteAttributeString(value: (String, String) => Callback): Self = StObject.set(x, "writeAttributeString", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setWriteElementString(value: (String, String) => Callback): Self = StObject.set(x, "writeElementString", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setWriteEndAttribute(value: Callback): Self = StObject.set(x, "writeEndAttribute", value.toJsFn)
    
    inline def setWriteEndElement(value: Callback): Self = StObject.set(x, "writeEndElement", value.toJsFn)
    
    inline def setWriteRaw(value: String => Callback): Self = StObject.set(x, "writeRaw", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWriteStartAttribute(value: String => Callback): Self = StObject.set(x, "writeStartAttribute", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWriteStartElement(value: String => Callback): Self = StObject.set(x, "writeStartElement", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWriteString(value: String => Callback): Self = StObject.set(x, "writeString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
