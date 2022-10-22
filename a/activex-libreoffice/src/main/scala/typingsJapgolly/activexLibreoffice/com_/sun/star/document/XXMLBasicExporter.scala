package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides unified interface for {@link XMLOasisBasicExporter} and {@link XMLBasicExporter} services.
  * @since LibreOffice 4.1
  */
trait XXMLBasicExporter
  extends StObject
     with XExporter
     with XFilter
object XXMLBasicExporter {
  
  inline def apply(
    acquire: Callback,
    cancel: Callback,
    filter: SeqEquiv[PropertyValue] => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    setSourceDocument: XComponent => Callback
  ): XXMLBasicExporter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, cancel = cancel.toJsFn, filter = js.Any.fromFunction1(filter), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setSourceDocument = js.Any.fromFunction1((t0: XComponent) => setSourceDocument(t0).runNow()))
    __obj.asInstanceOf[XXMLBasicExporter]
  }
}
