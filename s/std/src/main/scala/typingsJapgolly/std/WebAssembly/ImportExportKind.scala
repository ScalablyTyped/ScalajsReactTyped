package typingsJapgolly.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.function
  - typings.std.stdStrings.table
  - typings.std.stdStrings.memory
  - typings.std.stdStrings.global
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

