package typingsJapgolly.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.muiDatatables.muiDatatablesStrings.dropdown
  - typingsJapgolly.muiDatatables.muiDatatablesStrings.checkbox
  - typingsJapgolly.muiDatatables.muiDatatablesStrings.multiselect
  - typingsJapgolly.muiDatatables.muiDatatablesStrings.textField
  - typingsJapgolly.muiDatatables.muiDatatablesStrings.custom
*/
trait FilterType extends js.Object

object FilterType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checkbox: typingsJapgolly.muiDatatables.muiDatatablesStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def custom: typingsJapgolly.muiDatatables.muiDatatablesStrings.custom = this.cast("custom")
  @scala.inline
  def dropdown: typingsJapgolly.muiDatatables.muiDatatablesStrings.dropdown = this.cast("dropdown")
  @scala.inline
  def multiselect: typingsJapgolly.muiDatatables.muiDatatablesStrings.multiselect = this.cast("multiselect")
  @scala.inline
  def textField: typingsJapgolly.muiDatatables.muiDatatablesStrings.textField = this.cast("textField")
}

