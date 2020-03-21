package typingsJapgolly.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sharedb.sharedbStrings.ready
  - typingsJapgolly.sharedb.sharedbStrings.error
  - typingsJapgolly.sharedb.sharedbStrings.changed
  - typingsJapgolly.sharedb.sharedbStrings.insert
  - typingsJapgolly.sharedb.sharedbStrings.move
  - typingsJapgolly.sharedb.sharedbStrings.remove
  - typingsJapgolly.sharedb.sharedbStrings.extra
*/
trait QueryEvent extends js.Object

object QueryEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def changed: typingsJapgolly.sharedb.sharedbStrings.changed = this.cast("changed")
  @scala.inline
  def error: typingsJapgolly.sharedb.sharedbStrings.error = this.cast("error")
  @scala.inline
  def extra: typingsJapgolly.sharedb.sharedbStrings.extra = this.cast("extra")
  @scala.inline
  def insert: typingsJapgolly.sharedb.sharedbStrings.insert = this.cast("insert")
  @scala.inline
  def move: typingsJapgolly.sharedb.sharedbStrings.move = this.cast("move")
  @scala.inline
  def ready: typingsJapgolly.sharedb.sharedbStrings.ready = this.cast("ready")
  @scala.inline
  def remove: typingsJapgolly.sharedb.sharedbStrings.remove = this.cast("remove")
}

