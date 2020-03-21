package typingsJapgolly.phosphorDatagrid.datagridMod.DataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported header visibility modes.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.all
  - typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.row
  - typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.column
  - typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.none
*/
trait HeaderVisibility extends js.Object

object HeaderVisibility {
  @scala.inline
  def all: typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def column: typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.column = this.cast("column")
  @scala.inline
  def none: typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.none = this.cast("none")
  @scala.inline
  def row: typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.row = this.cast("row")
}

