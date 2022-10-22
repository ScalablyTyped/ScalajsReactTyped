package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * additional methods to extend {@link com.sun.star.sheet.XDataPilotTable} .
  *
  * {@link com.sun.star.sheet.XDataPilotTable2} extends the old {@link com.sun.star.sheet.XDataPilotTable} interface with additional methods.
  * @see com.sun.star.sheet.XDataPilotTable
  * @since OOo 3.0
  */
trait XDataPilotTable2
  extends StObject
     with XDataPilotTable {
  
  /**
    * When the address of a cell within the result area is given, {@link XDataPilotTable2.getDrillDownData()} returns its drill-down output table that
    * includes only those rows that contribute to the value of that cell.
    * @param aAddr cell address within the result area of a DataPilot table.
    * @returns drill-down output as 2-dimensional sequence, including the header row.
    * @see XDataPilotTable2.insertDrillDownSheet()
    */
  def getDrillDownData(aAddr: CellAddress): SafeArray[SafeArray[Any]]
  
  /**
    * This method returns a different output range of a DataPilot table per specified output range type.
    * @returns depicting the range specified. See {@link DataPilotOutputRangeType} for a set of possible output rang
    * @see com.sun.star.sheet.DataPilotOutputRangeType
    */
  def getOutputRangeByType(nType: Double): CellRangeAddress
  
  /**
    * Given a cell address, it returns the information about that cell. The type of information returned depends upon whether the cell is within the result
    * area or column/row header area.
    * @param aAddr address of the cell whose information is to be returned.
    * @returns which contains the position type and the information for that cell position.
    * @see com.sun.star.sheet.DataPilotTablePositionData
    * @see com.sun.star.sheet.DataPilotTableHeaderData
    * @see com.sun.star.sheet.DataPilotTableResultData
    */
  def getPositionData(aAddr: CellAddress): DataPilotTablePositionData
  
  /**
    * This method inserts a new sheet to display the drill-down data for a specified result cell. A drill-down data for a result cell consists of a subset
    * of rows from the original data source that contribute to the value displayed in that cell.
    *
    * The new sheet is always inserted to the immediate left of the current sheet where the DataPilot table is. Note that when the drill-down data is empty,
    * no new sheet is inserted.
    * @param aAddr address of a result cell
    * @returns `VOID`
    */
  def insertDrillDownSheet(aAddr: CellAddress): Unit
}
object XDataPilotTable2 {
  
  inline def apply(
    OutputRange: CellRangeAddress,
    acquire: Callback,
    getDrillDownData: CellAddress => SafeArray[SafeArray[Any]],
    getOutputRange: CallbackTo[CellRangeAddress],
    getOutputRangeByType: Double => CellRangeAddress,
    getPositionData: CellAddress => DataPilotTablePositionData,
    insertDrillDownSheet: CellAddress => Callback,
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback
  ): XDataPilotTable2 = {
    val __obj = js.Dynamic.literal(OutputRange = OutputRange.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDrillDownData = js.Any.fromFunction1(getDrillDownData), getOutputRange = getOutputRange.toJsFn, getOutputRangeByType = js.Any.fromFunction1(getOutputRangeByType), getPositionData = js.Any.fromFunction1(getPositionData), insertDrillDownSheet = js.Any.fromFunction1((t0: CellAddress) => insertDrillDownSheet(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn)
    __obj.asInstanceOf[XDataPilotTable2]
  }
  
  extension [Self <: XDataPilotTable2](x: Self) {
    
    inline def setGetDrillDownData(value: CellAddress => SafeArray[SafeArray[Any]]): Self = StObject.set(x, "getDrillDownData", js.Any.fromFunction1(value))
    
    inline def setGetOutputRangeByType(value: Double => CellRangeAddress): Self = StObject.set(x, "getOutputRangeByType", js.Any.fromFunction1(value))
    
    inline def setGetPositionData(value: CellAddress => DataPilotTablePositionData): Self = StObject.set(x, "getPositionData", js.Any.fromFunction1(value))
    
    inline def setInsertDrillDownSheet(value: CellAddress => Callback): Self = StObject.set(x, "insertDrillDownSheet", js.Any.fromFunction1((t0: CellAddress) => value(t0).runNow()))
  }
}
