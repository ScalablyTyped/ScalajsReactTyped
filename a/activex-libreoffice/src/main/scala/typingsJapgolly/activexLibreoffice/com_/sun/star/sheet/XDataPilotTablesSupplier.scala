package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * grants access to a collection of data pilot tables.
  * @see com.sun.star.sheet.Spreadsheet
  */
trait XDataPilotTablesSupplier
  extends StObject
     with XInterface {
  
  /**
    * Returns the collection of data pilot tables.
    * @see com.sun.star.sheet.DataPilotTables
    */
  val DataPilotTables: XDataPilotTables
  
  /**
    * Returns the collection of data pilot tables.
    * @see com.sun.star.sheet.DataPilotTables
    */
  def getDataPilotTables(): XDataPilotTables
}
object XDataPilotTablesSupplier {
  
  inline def apply(
    DataPilotTables: XDataPilotTables,
    acquire: Callback,
    getDataPilotTables: CallbackTo[XDataPilotTables],
    queryInterface: `type` => Any,
    release: Callback
  ): XDataPilotTablesSupplier = {
    val __obj = js.Dynamic.literal(DataPilotTables = DataPilotTables.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDataPilotTables = getDataPilotTables.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDataPilotTablesSupplier]
  }
  
  extension [Self <: XDataPilotTablesSupplier](x: Self) {
    
    inline def setDataPilotTables(value: XDataPilotTables): Self = StObject.set(x, "DataPilotTables", value.asInstanceOf[js.Any])
    
    inline def setGetDataPilotTables(value: CallbackTo[XDataPilotTables]): Self = StObject.set(x, "getDataPilotTables", value.toJsFn)
  }
}
