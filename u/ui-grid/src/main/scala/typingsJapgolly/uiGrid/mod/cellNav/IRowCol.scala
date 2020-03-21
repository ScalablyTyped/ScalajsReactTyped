package typingsJapgolly.uiGrid.mod.cellNav

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Number
import typingsJapgolly.uiGrid.mod.IGridColumnOf
import typingsJapgolly.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowCol[TEntity] extends js.Object {
  var col: IGridColumnOf[TEntity]
  var row: IGridRowOf[TEntity]
  /**
    * Gets the intersection of where the row and column meet.
    * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
    *          will also apply the filter to it and return the value that the filter displays
    */
  def getIntersectionValueFiltered(): String | Number | js.Object
  /**
    * Gets the intersection of where the row and column meet
    * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
    *          will NOT return the filtered value.
    */
  def getIntersectionValueRaw(): String | Number | js.Object
}

object IRowCol {
  @scala.inline
  def apply[TEntity](
    col: IGridColumnOf[TEntity],
    getIntersectionValueFiltered: CallbackTo[String | Number | js.Object],
    getIntersectionValueRaw: CallbackTo[String | Number | js.Object],
    row: IGridRowOf[TEntity]
  ): IRowCol[TEntity] = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.updateDynamic("getIntersectionValueFiltered")(getIntersectionValueFiltered.toJsFn)
    __obj.updateDynamic("getIntersectionValueRaw")(getIntersectionValueRaw.toJsFn)
    __obj.asInstanceOf[IRowCol[TEntity]]
  }
}

