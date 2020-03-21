package typingsJapgolly.sane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sane.saneStrings.ready
  - typingsJapgolly.sane.saneStrings.error
  - typingsJapgolly.sane.saneStrings.all
  - typingsJapgolly.sane.saneStrings.add
  - typingsJapgolly.sane.saneStrings.change
  - typingsJapgolly.sane.saneStrings.delete
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def add: typingsJapgolly.sane.saneStrings.add = this.cast("add")
  @scala.inline
  def all: typingsJapgolly.sane.saneStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsJapgolly.sane.saneStrings.change = this.cast("change")
  @scala.inline
  def delete: typingsJapgolly.sane.saneStrings.delete = this.cast("delete")
  @scala.inline
  def error: typingsJapgolly.sane.saneStrings.error = this.cast("error")
  @scala.inline
  def ready: typingsJapgolly.sane.saneStrings.ready = this.cast("ready")
}

