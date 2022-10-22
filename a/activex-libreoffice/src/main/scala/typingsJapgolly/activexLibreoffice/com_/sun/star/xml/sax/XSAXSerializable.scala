package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.StringPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * serializes a DOM tree by generating SAX events.
  * @since OOo 3.0
  */
trait XSAXSerializable extends StObject {
  
  /**
    * serializes an object (e.g. a DOM tree) that represents an XML document by generating SAX events.
    * @param handler the SAX event handler that should receive the generated events
    * @param namespaces a list of namespace declarations that will be added to the root element node of the XML document This is necessary mostly because the
    * @throws com::sun::star::xml::sax::SAXException if serializing the XML document fails
    */
  def serialize(handler: XDocumentHandler, namespaces: SeqEquiv[StringPair]): Unit
}
object XSAXSerializable {
  
  inline def apply(serialize: (XDocumentHandler, SeqEquiv[StringPair]) => Callback): XSAXSerializable = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction2((t0: XDocumentHandler, t1: SeqEquiv[StringPair]) => (serialize(t0, t1)).runNow()))
    __obj.asInstanceOf[XSAXSerializable]
  }
  
  extension [Self <: XSAXSerializable](x: Self) {
    
    inline def setSerialize(value: (XDocumentHandler, SeqEquiv[StringPair]) => Callback): Self = StObject.set(x, "serialize", js.Any.fromFunction2((t0: XDocumentHandler, t1: SeqEquiv[StringPair]) => (value(t0, t1)).runNow()))
  }
}
