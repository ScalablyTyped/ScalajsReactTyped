package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to connect a document with an {@link ExportFilter}
  *
  * An {@link ExportFilter} must know the source of its filter operation. To set this on a filter is part of this interface. Same mechanism exist for
  * import too.
  * @see ExportFilter
  * @see ImportFilter
  * @see XImporter
  */
trait XExporter
  extends StObject
     with XInterface {
  
  /**
    * sets the source document for the exporter
    * @param Document the source document
    * @throws com::sun::star::lang::IllegalArgumentException if **Document** does not support any service which is supported by this exporter
    */
  def setSourceDocument(Document: XComponent): Unit
}
object XExporter {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setSourceDocument: XComponent => Callback
  ): XExporter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setSourceDocument = js.Any.fromFunction1((t0: XComponent) => setSourceDocument(t0).runNow()))
    __obj.asInstanceOf[XExporter]
  }
  
  extension [Self <: XExporter](x: Self) {
    
    inline def setSetSourceDocument(value: XComponent => Callback): Self = StObject.set(x, "setSourceDocument", js.Any.fromFunction1((t0: XComponent) => value(t0).runNow()))
  }
}
