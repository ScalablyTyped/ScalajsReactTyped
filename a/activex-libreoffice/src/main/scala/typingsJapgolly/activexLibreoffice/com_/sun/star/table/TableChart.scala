package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XEmbeddedObjectSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a chart based on data in a table or spreadsheet.
  *
  * This service does not represent the chart document model itself, but the object in the table that contains this chart document.
  */
trait TableChart
  extends StObject
     with XTableChart
     with XEmbeddedObjectSupplier
     with XNamed
object TableChart {
  
  inline def apply(
    EmbeddedObject: XComponent,
    HasColumnHeaders: Boolean,
    HasRowHeaders: Boolean,
    Name: String,
    Ranges: SafeArray[CellRangeAddress],
    acquire: Callback,
    getEmbeddedObject: CallbackTo[XComponent],
    getHasColumnHeaders: CallbackTo[Boolean],
    getHasRowHeaders: CallbackTo[Boolean],
    getName: CallbackTo[String],
    getRanges: CallbackTo[SafeArray[CellRangeAddress]],
    queryInterface: `type` => Any,
    release: Callback,
    setHasColumnHeaders: Boolean => Callback,
    setHasRowHeaders: Boolean => Callback,
    setName: String => Callback,
    setRanges: SeqEquiv[CellRangeAddress] => Callback
  ): TableChart = {
    val __obj = js.Dynamic.literal(EmbeddedObject = EmbeddedObject.asInstanceOf[js.Any], HasColumnHeaders = HasColumnHeaders.asInstanceOf[js.Any], HasRowHeaders = HasRowHeaders.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Ranges = Ranges.asInstanceOf[js.Any], acquire = acquire.toJsFn, getEmbeddedObject = getEmbeddedObject.toJsFn, getHasColumnHeaders = getHasColumnHeaders.toJsFn, getHasRowHeaders = getHasRowHeaders.toJsFn, getName = getName.toJsFn, getRanges = getRanges.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setHasColumnHeaders = js.Any.fromFunction1((t0: Boolean) => setHasColumnHeaders(t0).runNow()), setHasRowHeaders = js.Any.fromFunction1((t0: Boolean) => setHasRowHeaders(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setRanges = js.Any.fromFunction1((t0: SeqEquiv[CellRangeAddress]) => setRanges(t0).runNow()))
    __obj.asInstanceOf[TableChart]
  }
}
