package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCellRange
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a database range in a spreadsheet document.
  *
  * A database range is a name for a cell range that also stores filtering, sorting, subtotal and data import settings and options.
  * @see com.sun.star.sheet.DatabaseRanges
  */
trait DatabaseRange
  extends StObject
     with XDatabaseRange
     with XCellRangeReferrer
     with XPropertySet
     with XNamed
     with XRefreshable {
  
  /**
    * specifies whether the AutoFilter is enabled or not.
    * @since OOo 1.1.2
    */
  var AutoFilter: Boolean
  
  /**
    * specifies whether this range includes a top row of headers.
    * @since LibreOffice 5.0
    */
  var ContainsHeader: Boolean
  
  /**
    * specifies the range where the filter can find the filter criteria.
    *
    * This is only used if SheetFilterDescriptor::UseFilterCriteriaSource is `TRUE` .
    * @since OOo 1.1.2
    */
  var FilterCriteriaSource: CellRangeAddress
  
  /**
    * specifies whether the imported data is only a selection of the database.
    * @since OOo 2.0
    */
  var FromSelection: Boolean
  
  /** if this property is set, cell formats are extended when the size of the range is changed by an update operation. */
  var KeepFormats: Boolean
  
  /** if this property is set, columns or rows are inserted or deleted when the size of the range is changed by an update operation. */
  var MoveCells: Boolean
  
  /**
    * specifies the time between two refresh actions in seconds.
    * @since OOo 2.0
    */
  var RefreshPeriod: Double
  
  /** if this property is set, the cell contents within the database range are left out when the document is saved. */
  var StripData: Boolean
  
  /**
    * returns the index used to refer to this range in token arrays.
    *
    * A token describing a database range shall contain the op-code obtained from the {@link FormulaMapGroupSpecialOffset.DB_AREA} and this index as data
    * part.
    * @see com.sun.star.sheet.FormulaToken
    * @see com.sun.star.sheet.FormulaMapGroupSpecialOffset.DB_AREA
    * @since OOo 3.0
    */
  var TokenIndex: Double
  
  /**
    * specifies whether this range includes a bottom row of totals.
    * @since LibreOffice 5.0
    */
  var TotalsRow: Boolean
  
  /**
    * specifies whether the filter criteria should be taken from a CellRange.
    * @since OOo 1.1.2
    */
  var UseFilterCriteriaSource: Boolean
  
  /** executes the stored import, filter, sorting, and subtotals descriptors again. */
  /* InferMemberOverrides */
  override def refresh(): Unit
}
object DatabaseRange {
  
  inline def apply(
    AutoFilter: Boolean,
    ContainsHeader: Boolean,
    DataArea: CellRangeAddress,
    FilterCriteriaSource: CellRangeAddress,
    FilterDescriptor: XSheetFilterDescriptor,
    FromSelection: Boolean,
    ImportDescriptor: SafeArray[PropertyValue],
    KeepFormats: Boolean,
    MoveCells: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    ReferredCells: XCellRange,
    RefreshPeriod: Double,
    SortDescriptor: SafeArray[PropertyValue],
    StripData: Boolean,
    SubTotalDescriptor: XSubTotalDescriptor,
    TokenIndex: Double,
    TotalsRow: Boolean,
    UseFilterCriteriaSource: Boolean,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addRefreshListener: XRefreshListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getDataArea: CallbackTo[CellRangeAddress],
    getFilterDescriptor: CallbackTo[XSheetFilterDescriptor],
    getImportDescriptor: CallbackTo[SafeArray[PropertyValue]],
    getName: CallbackTo[String],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getReferredCells: CallbackTo[XCellRange],
    getSortDescriptor: CallbackTo[SafeArray[PropertyValue]],
    getSubTotalDescriptor: CallbackTo[XSubTotalDescriptor],
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeRefreshListener: XRefreshListener => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setDataArea: CellRangeAddress => Callback,
    setName: String => Callback,
    setPropertyValue: (String, Any) => Callback
  ): DatabaseRange = {
    val __obj = js.Dynamic.literal(AutoFilter = AutoFilter.asInstanceOf[js.Any], ContainsHeader = ContainsHeader.asInstanceOf[js.Any], DataArea = DataArea.asInstanceOf[js.Any], FilterCriteriaSource = FilterCriteriaSource.asInstanceOf[js.Any], FilterDescriptor = FilterDescriptor.asInstanceOf[js.Any], FromSelection = FromSelection.asInstanceOf[js.Any], ImportDescriptor = ImportDescriptor.asInstanceOf[js.Any], KeepFormats = KeepFormats.asInstanceOf[js.Any], MoveCells = MoveCells.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReferredCells = ReferredCells.asInstanceOf[js.Any], RefreshPeriod = RefreshPeriod.asInstanceOf[js.Any], SortDescriptor = SortDescriptor.asInstanceOf[js.Any], StripData = StripData.asInstanceOf[js.Any], SubTotalDescriptor = SubTotalDescriptor.asInstanceOf[js.Any], TokenIndex = TokenIndex.asInstanceOf[js.Any], TotalsRow = TotalsRow.asInstanceOf[js.Any], UseFilterCriteriaSource = UseFilterCriteriaSource.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => addRefreshListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getDataArea = getDataArea.toJsFn, getFilterDescriptor = getFilterDescriptor.toJsFn, getImportDescriptor = getImportDescriptor.toJsFn, getName = getName.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReferredCells = getReferredCells.toJsFn, getSortDescriptor = getSortDescriptor.toJsFn, getSubTotalDescriptor = getSubTotalDescriptor.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => removeRefreshListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setDataArea = js.Any.fromFunction1((t0: CellRangeAddress) => setDataArea(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[DatabaseRange]
  }
  
  extension [Self <: DatabaseRange](x: Self) {
    
    inline def setAutoFilter(value: Boolean): Self = StObject.set(x, "AutoFilter", value.asInstanceOf[js.Any])
    
    inline def setContainsHeader(value: Boolean): Self = StObject.set(x, "ContainsHeader", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaSource(value: CellRangeAddress): Self = StObject.set(x, "FilterCriteriaSource", value.asInstanceOf[js.Any])
    
    inline def setFromSelection(value: Boolean): Self = StObject.set(x, "FromSelection", value.asInstanceOf[js.Any])
    
    inline def setKeepFormats(value: Boolean): Self = StObject.set(x, "KeepFormats", value.asInstanceOf[js.Any])
    
    inline def setMoveCells(value: Boolean): Self = StObject.set(x, "MoveCells", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setRefreshPeriod(value: Double): Self = StObject.set(x, "RefreshPeriod", value.asInstanceOf[js.Any])
    
    inline def setStripData(value: Boolean): Self = StObject.set(x, "StripData", value.asInstanceOf[js.Any])
    
    inline def setTokenIndex(value: Double): Self = StObject.set(x, "TokenIndex", value.asInstanceOf[js.Any])
    
    inline def setTotalsRow(value: Boolean): Self = StObject.set(x, "TotalsRow", value.asInstanceOf[js.Any])
    
    inline def setUseFilterCriteriaSource(value: Boolean): Self = StObject.set(x, "UseFilterCriteriaSource", value.asInstanceOf[js.Any])
  }
}
