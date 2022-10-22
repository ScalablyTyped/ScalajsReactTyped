package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XExporter
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XFilter
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XMimeTypeInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait XGraphicExportFilter
  extends StObject
     with XFilter
     with XExporter
     with XMimeTypeInfo
object XGraphicExportFilter {
  
  inline def apply(
    SupportedMimeTypeNames: SafeArray[String],
    acquire: Callback,
    cancel: Callback,
    filter: SeqEquiv[PropertyValue] => Boolean,
    getSupportedMimeTypeNames: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback,
    setSourceDocument: XComponent => Callback,
    supportsMimeType: String => Boolean
  ): XGraphicExportFilter = {
    val __obj = js.Dynamic.literal(SupportedMimeTypeNames = SupportedMimeTypeNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, cancel = cancel.toJsFn, filter = js.Any.fromFunction1(filter), getSupportedMimeTypeNames = getSupportedMimeTypeNames.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setSourceDocument = js.Any.fromFunction1((t0: XComponent) => setSourceDocument(t0).runNow()), supportsMimeType = js.Any.fromFunction1(supportsMimeType))
    __obj.asInstanceOf[XGraphicExportFilter]
  }
}
