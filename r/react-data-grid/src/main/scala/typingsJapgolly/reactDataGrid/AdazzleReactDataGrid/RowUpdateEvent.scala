package typingsJapgolly.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a row update. Generic event type returns untyped row, use parameterized type with the row type as the parameter
  * @default T = any
  */
trait RowUpdateEvent[T] extends js.Object {
  /**
    * The name of the column that was updated.
    */
  var cellKey: String
  /**
    * The name of the key pressed to trigger the event ('Tab', 'Enter', etc.).
    */
  var key: String
  /**
    * The index of the updated row.
    */
  var rowIdx: Double
  /**
    * The columns that were updated and their values.
    */
  var updated: T
}

object RowUpdateEvent {
  @scala.inline
  def apply[T](cellKey: String, key: String, rowIdx: Double, updated: T): RowUpdateEvent[T] = {
    val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowUpdateEvent[T]]
  }
}

