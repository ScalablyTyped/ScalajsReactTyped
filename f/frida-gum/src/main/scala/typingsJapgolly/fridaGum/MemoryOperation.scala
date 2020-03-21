package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.read
  - typingsJapgolly.fridaGum.fridaGumStrings.write
  - typingsJapgolly.fridaGum.fridaGumStrings.execute
*/
trait MemoryOperation extends js.Object

object MemoryOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def execute: typingsJapgolly.fridaGum.fridaGumStrings.execute = this.cast("execute")
  @scala.inline
  def read: typingsJapgolly.fridaGum.fridaGumStrings.read = this.cast("read")
  @scala.inline
  def write: typingsJapgolly.fridaGum.fridaGumStrings.write = this.cast("write")
}

