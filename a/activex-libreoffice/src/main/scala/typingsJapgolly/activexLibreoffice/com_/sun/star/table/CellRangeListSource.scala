package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.ListEntrySource
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.XListEntryListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the a source of list entries coming from a cell range in a table document
  *
  * The component cannot be instantiated at a global service factory, instead it's usually provided by a document instance.
  * @see com.sun.star.document.OfficeDocument
  */
trait CellRangeListSource
  extends StObject
     with ListEntrySource
     with XInitialization {
  
  /** specifies the cell range within a document to which the component is bound. */
  var CellRange: CellRangeAddress
}
object CellRangeListSource {
  
  inline def apply(
    AllListEntries: SafeArray[String],
    CellRange: CellRangeAddress,
    ListEntryCount: Double,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addListEntryListener: XListEntryListener => Callback,
    dispose: Callback,
    getAllListEntries: CallbackTo[SafeArray[String]],
    getListEntry: Double => String,
    getListEntryCount: CallbackTo[Double],
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeListEntryListener: XListEntryListener => Callback
  ): CellRangeListSource = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries.asInstanceOf[js.Any], CellRange = CellRange.asInstanceOf[js.Any], ListEntryCount = ListEntryCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addListEntryListener = js.Any.fromFunction1((t0: XListEntryListener) => addListEntryListener(t0).runNow()), dispose = dispose.toJsFn, getAllListEntries = getAllListEntries.toJsFn, getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = getListEntryCount.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeListEntryListener = js.Any.fromFunction1((t0: XListEntryListener) => removeListEntryListener(t0).runNow()))
    __obj.asInstanceOf[CellRangeListSource]
  }
  
  extension [Self <: CellRangeListSource](x: Self) {
    
    inline def setCellRange(value: CellRangeAddress): Self = StObject.set(x, "CellRange", value.asInstanceOf[js.Any])
  }
}
