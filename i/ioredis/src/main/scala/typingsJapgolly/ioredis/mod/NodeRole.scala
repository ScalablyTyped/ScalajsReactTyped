package typingsJapgolly.ioredis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ioredis.ioredisStrings.master
  - typingsJapgolly.ioredis.ioredisStrings.slave
  - typingsJapgolly.ioredis.ioredisStrings.all
*/
trait NodeRole extends js.Object

object NodeRole {
  @scala.inline
  def all: typingsJapgolly.ioredis.ioredisStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def master: typingsJapgolly.ioredis.ioredisStrings.master = this.cast("master")
  @scala.inline
  def slave: typingsJapgolly.ioredis.ioredisStrings.slave = this.cast("slave")
}

