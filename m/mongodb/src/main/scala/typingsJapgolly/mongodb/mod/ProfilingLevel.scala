package typingsJapgolly.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mongodbStrings.off
  - typingsJapgolly.mongodb.mongodbStrings.slow_only
  - typingsJapgolly.mongodb.mongodbStrings.all
*/
trait ProfilingLevel extends js.Object

object ProfilingLevel {
  @scala.inline
  def all: typingsJapgolly.mongodb.mongodbStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def off: typingsJapgolly.mongodb.mongodbStrings.off = this.cast("off")
  @scala.inline
  def slow_only: typingsJapgolly.mongodb.mongodbStrings.slow_only = this.cast("slow_only")
}

