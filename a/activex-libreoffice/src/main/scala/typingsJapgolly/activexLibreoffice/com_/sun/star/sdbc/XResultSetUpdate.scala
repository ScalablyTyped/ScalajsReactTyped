package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the possibility to write changes made on a result set back to database. */
trait XResultSetUpdate
  extends StObject
     with XInterface {
  
  /**
    * cancels the updates made to a row.
    *
    * This method may be called after calling an `updateXXX` method(s) and before calling {@link com.sun.star.sdbc.XResultSetUpdate.updateRow()} to rollback
    * the updates made to a row. If no updates have been made or `updateRow` has already been called, then this method has no effect.
    * @throws SQLException if a database access error occurs.
    */
  def cancelRowUpdates(): Unit
  
  /**
    * deletes the current row from the result set and the underlying database. Cannot be called when on the insert row.
    * @throws SQLException if a database access error occurs.
    */
  def deleteRow(): Unit
  
  /**
    * inserts the contents of the insert row into the result set and the database. Must be on the insert row when this method is called.
    * @throws SQLException if a database access error occurs.
    */
  def insertRow(): Unit
  
  /**
    * moves the cursor to the remembered cursor position, usually the current row. This method has no effect if the cursor is not on the insert row.
    * @throws SQLException if a database access error occurs.
    */
  def moveToCurrentRow(): Unit
  
  /**
    * moves the cursor to the insert row. The current cursor position is remembered while the cursor is positioned on the insert row.
    *
    * The insert row is a special row associated with an updatable result set. It is essentially a buffer where a new row may be constructed by calling the
    * `updateXXX` methods prior to inserting the row into the result set.
    *
    * Only the `updateXXX` , `getXXX` , and {@link com.sun.star.sdbc.XResultSetUpdate.insertRow()} methods may be called when the cursor is on the insert
    * row. All of the columns in a result set must be given a value each time this method is called before calling `insertRow` . The method `updateXXX` must
    * be called before a `getXXX` method can be called on a column value.
    * @throws SQLException if a database access error occurs.
    */
  def moveToInsertRow(): Unit
  
  /**
    * updates the underlying database with the new contents of the current row. Cannot be called when on the insert row.
    * @throws SQLException if a database access error occurs.
    */
  def updateRow(): Unit
}
object XResultSetUpdate {
  
  inline def apply(
    acquire: Callback,
    cancelRowUpdates: Callback,
    deleteRow: Callback,
    insertRow: Callback,
    moveToCurrentRow: Callback,
    moveToInsertRow: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    updateRow: Callback
  ): XResultSetUpdate = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, cancelRowUpdates = cancelRowUpdates.toJsFn, deleteRow = deleteRow.toJsFn, insertRow = insertRow.toJsFn, moveToCurrentRow = moveToCurrentRow.toJsFn, moveToInsertRow = moveToInsertRow.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, updateRow = updateRow.toJsFn)
    __obj.asInstanceOf[XResultSetUpdate]
  }
  
  extension [Self <: XResultSetUpdate](x: Self) {
    
    inline def setCancelRowUpdates(value: Callback): Self = StObject.set(x, "cancelRowUpdates", value.toJsFn)
    
    inline def setDeleteRow(value: Callback): Self = StObject.set(x, "deleteRow", value.toJsFn)
    
    inline def setInsertRow(value: Callback): Self = StObject.set(x, "insertRow", value.toJsFn)
    
    inline def setMoveToCurrentRow(value: Callback): Self = StObject.set(x, "moveToCurrentRow", value.toJsFn)
    
    inline def setMoveToInsertRow(value: Callback): Self = StObject.set(x, "moveToInsertRow", value.toJsFn)
    
    inline def setUpdateRow(value: Callback): Self = StObject.set(x, "updateRow", value.toJsFn)
  }
}
