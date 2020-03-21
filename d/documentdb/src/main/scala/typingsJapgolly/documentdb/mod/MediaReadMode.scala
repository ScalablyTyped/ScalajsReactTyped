package typingsJapgolly.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.documentdb.documentdbStrings.Buffered
  - typingsJapgolly.documentdb.documentdbStrings.Streamed
*/
trait MediaReadMode extends js.Object

object MediaReadMode {
  @scala.inline
  def Buffered: typingsJapgolly.documentdb.documentdbStrings.Buffered = this.cast("Buffered")
  @scala.inline
  def Streamed: typingsJapgolly.documentdb.documentdbStrings.Streamed = this.cast("Streamed")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

