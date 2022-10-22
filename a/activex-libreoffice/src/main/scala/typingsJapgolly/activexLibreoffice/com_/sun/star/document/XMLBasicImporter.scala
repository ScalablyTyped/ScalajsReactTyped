package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XLocator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter for importing Basic macros from the OpenOffice.org file format.
  *
  * The {@link XImporter.setTargetDocument()} method must be called in order to provide the import component with the target document to which the data
  * should be imported. The {@link com.sun.star.xml.sax.XDocumentHandler} interface is used to stream the XML data into the filter.
  * @since OOo 2.0
  */
trait XMLBasicImporter
  extends StObject
     with XImporter
     with XDocumentHandler
object XMLBasicImporter {
  
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
    setTargetDocument: XComponent => Callback,
    startDocument: Callback,
    startElement: (String, XAttributeList) => Callback
  ): XMLBasicImporter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), endDocument = endDocument.toJsFn, endElement = js.Any.fromFunction1((t0: String) => endElement(t0).runNow()), ignorableWhitespace = js.Any.fromFunction1((t0: String) => ignorableWhitespace(t0).runNow()), processingInstruction = js.Any.fromFunction2((t0: String, t1: String) => (processingInstruction(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDocumentLocator = js.Any.fromFunction1((t0: XLocator) => setDocumentLocator(t0).runNow()), setTargetDocument = js.Any.fromFunction1((t0: XComponent) => setTargetDocument(t0).runNow()), startDocument = startDocument.toJsFn, startElement = js.Any.fromFunction2((t0: String, t1: XAttributeList) => (startElement(t0, t1)).runNow()))
    __obj.asInstanceOf[XMLBasicImporter]
  }
}
