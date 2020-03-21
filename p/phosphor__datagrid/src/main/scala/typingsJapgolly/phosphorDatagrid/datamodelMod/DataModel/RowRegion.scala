package typingsJapgolly.phosphorDatagrid.datamodelMod.DataModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the data model row regions.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.body
  - typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`column-header`
*/
trait RowRegion extends js.Object

object RowRegion {
  @scala.inline
  def body: typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `column-header`: typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`column-header` = this.cast("column-header")
}

