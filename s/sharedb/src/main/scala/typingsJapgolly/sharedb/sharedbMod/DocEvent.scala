package typingsJapgolly.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sharedb.sharedbStrings.load
  - typingsJapgolly.sharedb.sharedbStrings.create
  - typingsJapgolly.sharedb.sharedbStrings.`before op`
  - typingsJapgolly.sharedb.sharedbStrings.op
  - typingsJapgolly.sharedb.sharedbStrings.del
  - typingsJapgolly.sharedb.sharedbStrings.error
  - typingsJapgolly.sharedb.sharedbStrings.`no write pending`
  - typingsJapgolly.sharedb.sharedbStrings.`nothing pending`
*/
trait DocEvent extends js.Object

object DocEvent {
  @scala.inline
  def `before op`: typingsJapgolly.sharedb.sharedbStrings.`before op` = this.cast("before op")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typingsJapgolly.sharedb.sharedbStrings.create = this.cast("create")
  @scala.inline
  def del: typingsJapgolly.sharedb.sharedbStrings.del = this.cast("del")
  @scala.inline
  def error: typingsJapgolly.sharedb.sharedbStrings.error = this.cast("error")
  @scala.inline
  def load: typingsJapgolly.sharedb.sharedbStrings.load = this.cast("load")
  @scala.inline
  def `no write pending`: typingsJapgolly.sharedb.sharedbStrings.`no write pending` = this.cast("no write pending")
  @scala.inline
  def `nothing pending`: typingsJapgolly.sharedb.sharedbStrings.`nothing pending` = this.cast("nothing pending")
  @scala.inline
  def op: typingsJapgolly.sharedb.sharedbStrings.op = this.cast("op")
}

