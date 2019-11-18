package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.next
  - typings.std.stdStrings.nextunique
  - typings.std.stdStrings.prev
  - typings.std.stdStrings.prevunique
*/
trait IDBCursorDirection extends js.Object

object IDBCursorDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def next: typingsJapgolly.std.stdStrings.next = this.cast("next")
  @scala.inline
  def nextunique: typingsJapgolly.std.stdStrings.nextunique = this.cast("nextunique")
  @scala.inline
  def prev: typingsJapgolly.std.stdStrings.prev = this.cast("prev")
  @scala.inline
  def prevunique: typingsJapgolly.std.stdStrings.prevunique = this.cast("prevunique")
}

