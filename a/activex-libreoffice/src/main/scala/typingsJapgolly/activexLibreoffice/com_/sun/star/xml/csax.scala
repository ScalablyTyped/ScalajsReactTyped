package typingsJapgolly.activexLibreoffice.com_.sun.star.xml

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csax {
  
  /**
    * A compressed XDocumentHandler interface.
    *
    * All methods in this interface have the same function with methods in the XDocumentHandler interface.
    *
    * Because there is no interface parameter in these methods, so using this interface to transfer SAX event is thought to have better performance than
    * using the XDocumentHandler interface, in case of when UNO C++/Java bridge is involved.
    */
  trait XCompressedDocumentHandler
    extends StObject
       with XInterface {
    
    def compressedCharacters(aChars: String): Unit
    
    def compressedEndDocument(): Unit
    
    def compressedEndElement(aName: String): Unit
    
    def compressedIgnorableWhitespace(aWhitespaces: String): Unit
    
    def compressedProcessingInstruction(aTarget: String, aData: String): Unit
    
    def compressedSetDocumentLocator(columnNumber: Double, lineNumber: Double, publicId: String, systemId: String): Unit
    
    def compressedStartDocument(): Unit
    
    def compressedStartElement(aName: String, aAttributes: SeqEquiv[XMLAttribute]): Unit
  }
  object XCompressedDocumentHandler {
    
    inline def apply(
      acquire: Callback,
      compressedCharacters: String => Callback,
      compressedEndDocument: Callback,
      compressedEndElement: String => Callback,
      compressedIgnorableWhitespace: String => Callback,
      compressedProcessingInstruction: (String, String) => Callback,
      compressedSetDocumentLocator: (Double, Double, String, String) => Callback,
      compressedStartDocument: Callback,
      compressedStartElement: (String, SeqEquiv[XMLAttribute]) => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XCompressedDocumentHandler = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, compressedCharacters = js.Any.fromFunction1((t0: String) => compressedCharacters(t0).runNow()), compressedEndDocument = compressedEndDocument.toJsFn, compressedEndElement = js.Any.fromFunction1((t0: String) => compressedEndElement(t0).runNow()), compressedIgnorableWhitespace = js.Any.fromFunction1((t0: String) => compressedIgnorableWhitespace(t0).runNow()), compressedProcessingInstruction = js.Any.fromFunction2((t0: String, t1: String) => (compressedProcessingInstruction(t0, t1)).runNow()), compressedSetDocumentLocator = js.Any.fromFunction4((t0: Double, t1: Double, t2: String, t3: String) => (compressedSetDocumentLocator(t0, t1, t2, t3)).runNow()), compressedStartDocument = compressedStartDocument.toJsFn, compressedStartElement = js.Any.fromFunction2((t0: String, t1: SeqEquiv[XMLAttribute]) => (compressedStartElement(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XCompressedDocumentHandler]
    }
    
    extension [Self <: XCompressedDocumentHandler](x: Self) {
      
      inline def setCompressedCharacters(value: String => Callback): Self = StObject.set(x, "compressedCharacters", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setCompressedEndDocument(value: Callback): Self = StObject.set(x, "compressedEndDocument", value.toJsFn)
      
      inline def setCompressedEndElement(value: String => Callback): Self = StObject.set(x, "compressedEndElement", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setCompressedIgnorableWhitespace(value: String => Callback): Self = StObject.set(x, "compressedIgnorableWhitespace", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setCompressedProcessingInstruction(value: (String, String) => Callback): Self = StObject.set(x, "compressedProcessingInstruction", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setCompressedSetDocumentLocator(value: (Double, Double, String, String) => Callback): Self = StObject.set(x, "compressedSetDocumentLocator", js.Any.fromFunction4((t0: Double, t1: Double, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setCompressedStartDocument(value: Callback): Self = StObject.set(x, "compressedStartDocument", value.toJsFn)
      
      inline def setCompressedStartElement(value: (String, SeqEquiv[XMLAttribute]) => Callback): Self = StObject.set(x, "compressedStartElement", js.Any.fromFunction2((t0: String, t1: SeqEquiv[XMLAttribute]) => (value(t0, t1)).runNow()))
    }
  }
  
  /** A struct to keep information of an element's attribute. */
  trait XMLAttribute extends StObject {
    
    /** the attribute name */
    var sName: String
    
    /** the attribute value */
    var sValue: String
  }
  object XMLAttribute {
    
    inline def apply(sName: String, sValue: String): XMLAttribute = {
      val __obj = js.Dynamic.literal(sName = sName.asInstanceOf[js.Any], sValue = sValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[XMLAttribute]
    }
    
    extension [Self <: XMLAttribute](x: Self) {
      
      inline def setSName(value: String): Self = StObject.set(x, "sName", value.asInstanceOf[js.Any])
      
      inline def setSValue(value: String): Self = StObject.set(x, "sValue", value.asInstanceOf[js.Any])
    }
  }
}
