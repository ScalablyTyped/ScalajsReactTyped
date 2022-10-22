package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the collections of columns and rows of a cell range.
  * @see com.sun.star.table.CellRange
  */
trait XColumnRowRange
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of columns in the range.
    * @see com.sun.star.table.TableColumns
    */
  val Columns: XTableColumns
  
  /**
    * returns the collection of rows in the range.
    * @see com.sun.star.table.TableRows
    */
  val Rows: XTableRows
  
  /**
    * returns the collection of columns in the range.
    * @see com.sun.star.table.TableColumns
    */
  def getColumns(): XTableColumns
  
  /**
    * returns the collection of rows in the range.
    * @see com.sun.star.table.TableRows
    */
  def getRows(): XTableRows
}
object XColumnRowRange {
  
  inline def apply(
    Columns: XTableColumns,
    Rows: XTableRows,
    acquire: Callback,
    getColumns: CallbackTo[XTableColumns],
    getRows: CallbackTo[XTableRows],
    queryInterface: `type` => Any,
    release: Callback
  ): XColumnRowRange = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], acquire = acquire.toJsFn, getColumns = getColumns.toJsFn, getRows = getRows.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XColumnRowRange]
  }
  
  extension [Self <: XColumnRowRange](x: Self) {
    
    inline def setColumns(value: XTableColumns): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setGetColumns(value: CallbackTo[XTableColumns]): Self = StObject.set(x, "getColumns", value.toJsFn)
    
    inline def setGetRows(value: CallbackTo[XTableRows]): Self = StObject.set(x, "getRows", value.toJsFn)
    
    inline def setRows(value: XTableRows): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
  }
}
