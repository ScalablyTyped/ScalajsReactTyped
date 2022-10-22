package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to control a data pilot table which has already been created.
  * @see com.sun.star.sheet.DataPilotTable
  */
trait XDataPilotTable
  extends StObject
     with XInterface {
  
  /** returns the address of the cell range that contains the data pilot table. */
  val OutputRange: CellRangeAddress
  
  /** returns the address of the cell range that contains the data pilot table. */
  def getOutputRange(): CellRangeAddress
  
  /** recreates the data pilot table with current data from the source cell range. */
  def refresh(): Unit
}
object XDataPilotTable {
  
  inline def apply(
    OutputRange: CellRangeAddress,
    acquire: Callback,
    getOutputRange: CallbackTo[CellRangeAddress],
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback
  ): XDataPilotTable = {
    val __obj = js.Dynamic.literal(OutputRange = OutputRange.asInstanceOf[js.Any], acquire = acquire.toJsFn, getOutputRange = getOutputRange.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn)
    __obj.asInstanceOf[XDataPilotTable]
  }
  
  extension [Self <: XDataPilotTable](x: Self) {
    
    inline def setGetOutputRange(value: CallbackTo[CellRangeAddress]): Self = StObject.set(x, "getOutputRange", value.toJsFn)
    
    inline def setOutputRange(value: CellRangeAddress): Self = StObject.set(x, "OutputRange", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
  }
}
