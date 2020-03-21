package typingsJapgolly.sane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sane.saneStrings.add
  - typingsJapgolly.sane.saneStrings.change
  - typingsJapgolly.sane.saneStrings.delete
*/
trait AllEventType extends js.Object

object AllEventType {
  @scala.inline
  def add: typingsJapgolly.sane.saneStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsJapgolly.sane.saneStrings.change = this.cast("change")
  @scala.inline
  def delete: typingsJapgolly.sane.saneStrings.delete = this.cast("delete")
}

