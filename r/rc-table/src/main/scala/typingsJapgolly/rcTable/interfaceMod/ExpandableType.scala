package typingsJapgolly.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rcTable.rcTableBooleans.`false`
  - typingsJapgolly.rcTable.rcTableStrings.row
  - typingsJapgolly.rcTable.rcTableStrings.nest
*/
trait ExpandableType extends js.Object

object ExpandableType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typingsJapgolly.rcTable.rcTableBooleans.`false` = this.cast(false)
  @scala.inline
  def nest: typingsJapgolly.rcTable.rcTableStrings.nest = this.cast("nest")
  @scala.inline
  def row: typingsJapgolly.rcTable.rcTableStrings.row = this.cast("row")
}

