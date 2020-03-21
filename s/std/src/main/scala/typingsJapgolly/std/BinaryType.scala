package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.arraybuffer
  - typingsJapgolly.std.stdStrings.blob
*/
trait BinaryType extends js.Object

object BinaryType {
  @scala.inline
  def arraybuffer: typingsJapgolly.std.stdStrings.arraybuffer = this.cast("arraybuffer")
  @scala.inline
  def blob: typingsJapgolly.std.stdStrings.blob = this.cast("blob")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

