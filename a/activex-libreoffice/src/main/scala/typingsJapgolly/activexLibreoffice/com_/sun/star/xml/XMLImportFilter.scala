package typingsJapgolly.activexLibreoffice.com_.sun.star.xml

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XLocator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes an import filter for XML-based file formats.
  *
  * It is an extension of {@link com.sun.star.document.ImportFilter} and differs from it in that this filter additionally supports the {@link
  * com.sun.star.xml.sax.XDocumentHandler} interface.
  */
trait XMLImportFilter
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.document.ImportFilter
     with XDocumentHandler
object XMLImportFilter {
  
  inline def apply(
    Name: String,
    acquire: Callback,
    cancel: Callback,
    characters: String => Callback,
    endDocument: Callback,
    endElement: String => Callback,
    filter: SeqEquiv[PropertyValue] => Boolean,
    getName: CallbackTo[String],
    ignorableWhitespace: String => Callback,
    initialize: SeqEquiv[Any] => Callback,
    processingInstruction: (String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setDocumentLocator: XLocator => Callback,
    setName: String => Callback,
    setTargetDocument: XComponent => Callback,
    startDocument: Callback,
    startElement: (String, XAttributeList) => Callback
  ): XMLImportFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, cancel = cancel.toJsFn, characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), endDocument = endDocument.toJsFn, endElement = js.Any.fromFunction1((t0: String) => endElement(t0).runNow()), filter = js.Any.fromFunction1(filter), getName = getName.toJsFn, ignorableWhitespace = js.Any.fromFunction1((t0: String) => ignorableWhitespace(t0).runNow()), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), processingInstruction = js.Any.fromFunction2((t0: String, t1: String) => (processingInstruction(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDocumentLocator = js.Any.fromFunction1((t0: XLocator) => setDocumentLocator(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setTargetDocument = js.Any.fromFunction1((t0: XComponent) => setTargetDocument(t0).runNow()), startDocument = startDocument.toJsFn, startElement = js.Any.fromFunction2((t0: String, t1: XAttributeList) => (startElement(t0, t1)).runNow()))
    __obj.asInstanceOf[XMLImportFilter]
  }
}
