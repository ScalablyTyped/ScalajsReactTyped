package typingsJapgolly.phosphorDatagrid.datamodelMod.DataModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the data model cell regions.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.body
  - typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`row-header`
  - typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`column-header`
  - typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`corner-header`
*/
trait CellRegion extends js.Object

object CellRegion {
  @scala.inline
  def body: typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `column-header`: typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`column-header` = this.cast("column-header")
  @scala.inline
  def `corner-header`: typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`corner-header` = this.cast("corner-header")
  @scala.inline
  def `row-header`: typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`row-header` = this.cast("row-header")
}

