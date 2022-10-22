package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a data pilot table on a spreadsheet. */
trait DataPilotTable
  extends StObject
     with XDataPilotDescriptor
     with XDataPilotTable
     with XModifyBroadcaster
object DataPilotTable {
  
  inline def apply(
    ColumnFields: XIndexAccess,
    DataFields: XIndexAccess,
    DataPilotFields: XIndexAccess,
    FilterDescriptor: XSheetFilterDescriptor,
    HiddenFields: XIndexAccess,
    Name: String,
    OutputRange: CellRangeAddress,
    PageFields: XIndexAccess,
    RowFields: XIndexAccess,
    SourceRange: CellRangeAddress,
    Tag: String,
    acquire: Callback,
    addModifyListener: XModifyListener => Callback,
    getColumnFields: CallbackTo[XIndexAccess],
    getDataFields: CallbackTo[XIndexAccess],
    getDataPilotFields: CallbackTo[XIndexAccess],
    getFilterDescriptor: CallbackTo[XSheetFilterDescriptor],
    getHiddenFields: CallbackTo[XIndexAccess],
    getName: CallbackTo[String],
    getOutputRange: CallbackTo[CellRangeAddress],
    getPageFields: CallbackTo[XIndexAccess],
    getRowFields: CallbackTo[XIndexAccess],
    getSourceRange: CallbackTo[CellRangeAddress],
    getTag: CallbackTo[String],
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback,
    removeModifyListener: XModifyListener => Callback,
    setName: String => Callback,
    setSourceRange: CellRangeAddress => Callback,
    setTag: String => Callback
  ): DataPilotTable = {
    val __obj = js.Dynamic.literal(ColumnFields = ColumnFields.asInstanceOf[js.Any], DataFields = DataFields.asInstanceOf[js.Any], DataPilotFields = DataPilotFields.asInstanceOf[js.Any], FilterDescriptor = FilterDescriptor.asInstanceOf[js.Any], HiddenFields = HiddenFields.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutputRange = OutputRange.asInstanceOf[js.Any], PageFields = PageFields.asInstanceOf[js.Any], RowFields = RowFields.asInstanceOf[js.Any], SourceRange = SourceRange.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), getColumnFields = getColumnFields.toJsFn, getDataFields = getDataFields.toJsFn, getDataPilotFields = getDataPilotFields.toJsFn, getFilterDescriptor = getFilterDescriptor.toJsFn, getHiddenFields = getHiddenFields.toJsFn, getName = getName.toJsFn, getOutputRange = getOutputRange.toJsFn, getPageFields = getPageFields.toJsFn, getRowFields = getRowFields.toJsFn, getSourceRange = getSourceRange.toJsFn, getTag = getTag.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn, removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setSourceRange = js.Any.fromFunction1((t0: CellRangeAddress) => setSourceRange(t0).runNow()), setTag = js.Any.fromFunction1((t0: String) => setTag(t0).runNow()))
    __obj.asInstanceOf[DataPilotTable]
  }
}
