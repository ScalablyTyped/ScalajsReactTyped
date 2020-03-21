package typingsJapgolly.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactElemental.reactElementalStrings.info
  - typingsJapgolly.reactElemental.reactElementalStrings.success
  - typingsJapgolly.reactElemental.reactElementalStrings.warn
  - typingsJapgolly.reactElemental.reactElementalStrings.error
*/
trait AlertType extends js.Object

object AlertType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.reactElemental.reactElementalStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.reactElemental.reactElementalStrings.info = this.cast("info")
  @scala.inline
  def success: typingsJapgolly.reactElemental.reactElementalStrings.success = this.cast("success")
  @scala.inline
  def warn: typingsJapgolly.reactElemental.reactElementalStrings.warn = this.cast("warn")
}

