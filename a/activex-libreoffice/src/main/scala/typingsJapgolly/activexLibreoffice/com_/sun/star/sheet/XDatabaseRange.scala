package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings and options of a database range.
  * @see com.sun.star.sheet.DatabaseRange
  */
trait XDatabaseRange
  extends StObject
     with XInterface {
  
  /** returns the data area of the database range in the spreadsheet document. */
  var DataArea: CellRangeAddress
  
  /**
    * returns the filter descriptor stored with the database range.
    *
    * If the filter descriptor is modified, the new filtering is carried out when {@link XDatabaseRange.refresh()} is called.
    * @see SheetFilterDescriptor
    */
  val FilterDescriptor: XSheetFilterDescriptor
  
  /**
    * returns the database import descriptor stored with this database range.
    * @see DatabaseImportDescriptor
    */
  val ImportDescriptor: SafeArray[PropertyValue]
  
  /**
    * returns the sort descriptor stored with the database range.
    * @see SheetSortDescriptor2
    */
  val SortDescriptor: SafeArray[PropertyValue]
  
  /**
    * returns the subtotal descriptor stored with the database range.
    *
    * If the subtotal descriptor is modified, the new subtotals are inserted when {@link XDatabaseRange.refresh()} is called.
    * @see SubTotalDescriptor
    */
  val SubTotalDescriptor: XSubTotalDescriptor
  
  /** returns the data area of the database range in the spreadsheet document. */
  def getDataArea(): CellRangeAddress
  
  /**
    * returns the filter descriptor stored with the database range.
    *
    * If the filter descriptor is modified, the new filtering is carried out when {@link XDatabaseRange.refresh()} is called.
    * @see SheetFilterDescriptor
    */
  def getFilterDescriptor(): XSheetFilterDescriptor
  
  /**
    * returns the database import descriptor stored with this database range.
    * @see DatabaseImportDescriptor
    */
  def getImportDescriptor(): SafeArray[PropertyValue]
  
  /**
    * returns the sort descriptor stored with the database range.
    * @see SheetSortDescriptor2
    */
  def getSortDescriptor(): SafeArray[PropertyValue]
  
  /**
    * returns the subtotal descriptor stored with the database range.
    *
    * If the subtotal descriptor is modified, the new subtotals are inserted when {@link XDatabaseRange.refresh()} is called.
    * @see SubTotalDescriptor
    */
  def getSubTotalDescriptor(): XSubTotalDescriptor
  
  /** executes the stored import, filter, sorting, and subtotals descriptors again. */
  def refresh(): Unit
  
  /** sets the data area of the database range. */
  def setDataArea(aDataArea: CellRangeAddress): Unit
}
object XDatabaseRange {
  
  inline def apply(
    DataArea: CellRangeAddress,
    FilterDescriptor: XSheetFilterDescriptor,
    ImportDescriptor: SafeArray[PropertyValue],
    SortDescriptor: SafeArray[PropertyValue],
    SubTotalDescriptor: XSubTotalDescriptor,
    acquire: Callback,
    getDataArea: CallbackTo[CellRangeAddress],
    getFilterDescriptor: CallbackTo[XSheetFilterDescriptor],
    getImportDescriptor: CallbackTo[SafeArray[PropertyValue]],
    getSortDescriptor: CallbackTo[SafeArray[PropertyValue]],
    getSubTotalDescriptor: CallbackTo[XSubTotalDescriptor],
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback,
    setDataArea: CellRangeAddress => Callback
  ): XDatabaseRange = {
    val __obj = js.Dynamic.literal(DataArea = DataArea.asInstanceOf[js.Any], FilterDescriptor = FilterDescriptor.asInstanceOf[js.Any], ImportDescriptor = ImportDescriptor.asInstanceOf[js.Any], SortDescriptor = SortDescriptor.asInstanceOf[js.Any], SubTotalDescriptor = SubTotalDescriptor.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDataArea = getDataArea.toJsFn, getFilterDescriptor = getFilterDescriptor.toJsFn, getImportDescriptor = getImportDescriptor.toJsFn, getSortDescriptor = getSortDescriptor.toJsFn, getSubTotalDescriptor = getSubTotalDescriptor.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn, setDataArea = js.Any.fromFunction1((t0: CellRangeAddress) => setDataArea(t0).runNow()))
    __obj.asInstanceOf[XDatabaseRange]
  }
  
  extension [Self <: XDatabaseRange](x: Self) {
    
    inline def setDataArea(value: CellRangeAddress): Self = StObject.set(x, "DataArea", value.asInstanceOf[js.Any])
    
    inline def setFilterDescriptor(value: XSheetFilterDescriptor): Self = StObject.set(x, "FilterDescriptor", value.asInstanceOf[js.Any])
    
    inline def setGetDataArea(value: CallbackTo[CellRangeAddress]): Self = StObject.set(x, "getDataArea", value.toJsFn)
    
    inline def setGetFilterDescriptor(value: CallbackTo[XSheetFilterDescriptor]): Self = StObject.set(x, "getFilterDescriptor", value.toJsFn)
    
    inline def setGetImportDescriptor(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getImportDescriptor", value.toJsFn)
    
    inline def setGetSortDescriptor(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getSortDescriptor", value.toJsFn)
    
    inline def setGetSubTotalDescriptor(value: CallbackTo[XSubTotalDescriptor]): Self = StObject.set(x, "getSubTotalDescriptor", value.toJsFn)
    
    inline def setImportDescriptor(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ImportDescriptor", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setSetDataArea(value: CellRangeAddress => Callback): Self = StObject.set(x, "setDataArea", js.Any.fromFunction1((t0: CellRangeAddress) => value(t0).runNow()))
    
    inline def setSortDescriptor(value: SafeArray[PropertyValue]): Self = StObject.set(x, "SortDescriptor", value.asInstanceOf[js.Any])
    
    inline def setSubTotalDescriptor(value: XSubTotalDescriptor): Self = StObject.set(x, "SubTotalDescriptor", value.asInstanceOf[js.Any])
  }
}
