package typingsJapgolly.reactDataGrid.AdazzleReactDataGrid

import typingsJapgolly.reactDataGrid.reactDataGridStrings.cellDrag
import typingsJapgolly.reactDataGrid.reactDataGridStrings.cellUpdate
import typingsJapgolly.reactDataGrid.reactDataGridStrings.columnFill
import typingsJapgolly.reactDataGrid.reactDataGridStrings.copyPaste
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about some update to the grid's contents. Generic event type returns untyped row, use parameterized type with the row type as the parameter
  * @default T = any
  */
trait GridRowsUpdatedEvent[T] extends StObject {
  
  /**
    * The action that occurred to trigger this event.
    * One of 'cellUpdate', 'cellDrag', 'columnFill', or 'copyPaste'.
    */
  var action: cellUpdate | cellDrag | columnFill | copyPaste
  
  /**
    * The key of the column where the event occurred.
    */
  var cellKey: String
  
  /**
    * The top row affected by the event.
    */
  var fromRow: Double
  
  /**
    * The bottom row affected by the event.
    */
  var toRow: Double
  
  /**
    * The columns that were updated and their values.
    */
  var updated: T
}
object GridRowsUpdatedEvent {
  
  inline def apply[T](
    action: cellUpdate | cellDrag | columnFill | copyPaste,
    cellKey: String,
    fromRow: Double,
    toRow: Double,
    updated: T
  ): GridRowsUpdatedEvent[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRowsUpdatedEvent[T]]
  }
  
  extension [Self <: GridRowsUpdatedEvent[?], T](x: Self & GridRowsUpdatedEvent[T]) {
    
    inline def setAction(value: cellUpdate | cellDrag | columnFill | copyPaste): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
    
    inline def setFromRow(value: Double): Self = StObject.set(x, "fromRow", value.asInstanceOf[js.Any])
    
    inline def setToRow(value: Double): Self = StObject.set(x, "toRow", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: T): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
