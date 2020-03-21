package typingsJapgolly.phosphorDatagrid.datamodelMod.DataModel

import typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`cells-changed`
import typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`columns-inserted`
import typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`columns-moved`
import typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`columns-removed`
import typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`model-reset`
import typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`rows-inserted`
import typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`rows-moved`
import typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`rows-removed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the args objects of the `changed` signal.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.phosphorDatagrid.datamodelMod.DataModel.IRowsChangedArgs
  - typingsJapgolly.phosphorDatagrid.datamodelMod.DataModel.IColumnsChangedArgs
  - typingsJapgolly.phosphorDatagrid.datamodelMod.DataModel.IRowsMovedArgs
  - typingsJapgolly.phosphorDatagrid.datamodelMod.DataModel.IColumnsMovedArgs
  - typingsJapgolly.phosphorDatagrid.datamodelMod.DataModel.ICellsChangedArgs
  - typingsJapgolly.phosphorDatagrid.datamodelMod.DataModel.IModelResetArgs
*/
trait ChangedArgs extends js.Object

object ChangedArgs {
  @scala.inline
  def IColumnsMovedArgs(destination: Double, index: Double, region: ColumnRegion, span: Double, `type`: `columns-moved`): ChangedArgs = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  @scala.inline
  def IColumnsChangedArgs(index: Double, region: ColumnRegion, span: Double, `type`: `columns-inserted` | `columns-removed`): ChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  @scala.inline
  def IRowsMovedArgs(destination: Double, index: Double, region: RowRegion, span: Double, `type`: `rows-moved`): ChangedArgs = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  @scala.inline
  def IModelResetArgs(`type`: `model-reset`): ChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  @scala.inline
  def ICellsChangedArgs(
    columnIndex: Double,
    columnSpan: Double,
    region: CellRegion,
    rowIndex: Double,
    rowSpan: Double,
    `type`: `cells-changed`
  ): ChangedArgs = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  @scala.inline
  def IRowsChangedArgs(index: Double, region: RowRegion, span: Double, `type`: `rows-inserted` | `rows-removed`): ChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
}

