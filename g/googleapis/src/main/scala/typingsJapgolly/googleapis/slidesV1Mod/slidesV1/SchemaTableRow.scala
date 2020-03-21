package typingsJapgolly.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties and contents of each row in a table.
  */
@js.native
trait SchemaTableRow extends js.Object {
  /**
    * Height of a row.
    */
  var rowHeight: js.UndefOr[SchemaDimension] = js.native
  /**
    * Properties and contents of each cell.  Cells that span multiple columns
    * are represented only once with a column_span greater than 1. As a result,
    * the length of this collection does not always match the number of columns
    * of the entire table.
    */
  var tableCells: js.UndefOr[js.Array[SchemaTableCell]] = js.native
  /**
    * Properties of the row.
    */
  var tableRowProperties: js.UndefOr[SchemaTableRowProperties] = js.native
}

object SchemaTableRow {
  @scala.inline
  def apply(
    rowHeight: SchemaDimension = null,
    tableCells: js.Array[SchemaTableCell] = null,
    tableRowProperties: SchemaTableRowProperties = null
  ): SchemaTableRow = {
    val __obj = js.Dynamic.literal()
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (tableCells != null) __obj.updateDynamic("tableCells")(tableCells.asInstanceOf[js.Any])
    if (tableRowProperties != null) __obj.updateDynamic("tableRowProperties")(tableRowProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableRow]
  }
}

