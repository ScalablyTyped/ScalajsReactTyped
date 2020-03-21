package typingsJapgolly.materialUiCore.mod.PropTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.materialUiCore.materialUiCoreStrings.inherit
  - typingsJapgolly.materialUiCore.materialUiCoreStrings.primary
  - typingsJapgolly.materialUiCore.materialUiCoreStrings.secondary
  - typingsJapgolly.materialUiCore.materialUiCoreStrings.default
*/
trait Color extends js.Object

object Color {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.materialUiCore.materialUiCoreStrings.default = this.cast("default")
  @scala.inline
  def inherit: typingsJapgolly.materialUiCore.materialUiCoreStrings.inherit = this.cast("inherit")
  @scala.inline
  def primary: typingsJapgolly.materialUiCore.materialUiCoreStrings.primary = this.cast("primary")
  @scala.inline
  def secondary: typingsJapgolly.materialUiCore.materialUiCoreStrings.secondary = this.cast("secondary")
}

