package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter for exporting Basic macros to the OASIS Open Office file format.
  *
  * First the {@link XExporter.setSourceDocument()} method must be called in order to provide the export component with the source document from which the
  * data should be exported. After that, the export is started by calling the {@link XFilter.filter()} method.
  * @since OOo 2.0
  */
trait XMLOasisBasicExporter
  extends StObject
     with XXMLBasicExporter {
  
  def createWithHandler(DocumentHandler: XDocumentHandler): Unit
}
object XMLOasisBasicExporter {
  
  inline def apply(
    acquire: Callback,
    cancel: Callback,
    createWithHandler: XDocumentHandler => Callback,
    filter: SeqEquiv[PropertyValue] => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    setSourceDocument: XComponent => Callback
  ): XMLOasisBasicExporter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, cancel = cancel.toJsFn, createWithHandler = js.Any.fromFunction1((t0: XDocumentHandler) => createWithHandler(t0).runNow()), filter = js.Any.fromFunction1(filter), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setSourceDocument = js.Any.fromFunction1((t0: XComponent) => setSourceDocument(t0).runNow()))
    __obj.asInstanceOf[XMLOasisBasicExporter]
  }
  
  extension [Self <: XMLOasisBasicExporter](x: Self) {
    
    inline def setCreateWithHandler(value: XDocumentHandler => Callback): Self = StObject.set(x, "createWithHandler", js.Any.fromFunction1((t0: XDocumentHandler) => value(t0).runNow()))
  }
}
