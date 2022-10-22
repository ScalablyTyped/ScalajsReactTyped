package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * filter for imports
  *
  * Such filters can be used for importing a content. Of course it's possible to combine it with the service {@link ExportFilter} if export functionality
  * should be available at same implementation too.
  * @see ExportFilter
  */
trait ImportFilter
  extends StObject
     with XImporter
     with XFilter
     with XInitialization
     with XNamed
object ImportFilter {
  
  inline def apply(
    Name: String,
    acquire: Callback,
    cancel: Callback,
    filter: SeqEquiv[PropertyValue] => Boolean,
    getName: CallbackTo[String],
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setName: String => Callback,
    setTargetDocument: XComponent => Callback
  ): ImportFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, cancel = cancel.toJsFn, filter = js.Any.fromFunction1(filter), getName = getName.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setTargetDocument = js.Any.fromFunction1((t0: XComponent) => setTargetDocument(t0).runNow()))
    __obj.asInstanceOf[ImportFilter]
  }
}
