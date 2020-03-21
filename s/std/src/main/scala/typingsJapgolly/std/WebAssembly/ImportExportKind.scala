package typingsJapgolly.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.function
  - typingsJapgolly.std.stdStrings.global
  - typingsJapgolly.std.stdStrings.memory
  - typingsJapgolly.std.stdStrings.table
*/
trait ImportExportKind extends js.Object

object ImportExportKind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def function: typingsJapgolly.std.stdStrings.function = this.cast("function")
  @scala.inline
  def global: typingsJapgolly.std.stdStrings.global = this.cast("global")
  @scala.inline
  def memory: typingsJapgolly.std.stdStrings.memory = this.cast("memory")
  @scala.inline
  def table: typingsJapgolly.std.stdStrings.table = this.cast("table")
}

