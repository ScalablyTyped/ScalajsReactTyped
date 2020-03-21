package typingsJapgolly.phosphorDatagrid.cellrendererMod.CellRenderer

import typingsJapgolly.phosphorDatagrid.datamodelMod.DataModel.CellRegion
import typingsJapgolly.phosphorDatagrid.datamodelMod.DataModel.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the configuration data for a cell.
  */
trait ICellConfig extends js.Object {
  /**
    * The column index of the cell.
    */
  val column: Double
  /**
    * The height of the cell rectangle, in viewport pixels.
    */
  val height: Double
  /**
    * The metadata for the column.
    */
  val metadata: Metadata
  /**
    * The region for the cell.
    */
  val region: CellRegion
  /**
    * The row index of the cell.
    */
  val row: Double
  /**
    * The data value for the cell.
    */
  val value: js.Any
  /**
    * The width of the cell rectangle, in viewport pixels.
    */
  val width: Double
  /**
    * The X position of the cell rectangle, in viewport coordinates.
    */
  val x: Double
  /**
    * The Y position of the cell rectangle, in viewport coordinates.
    */
  val y: Double
}

object ICellConfig {
  @scala.inline
  def apply(
    column: Double,
    height: Double,
    metadata: Metadata,
    region: CellRegion,
    row: Double,
    value: js.Any,
    width: Double,
    x: Double,
    y: Double
  ): ICellConfig = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICellConfig]
  }
}

