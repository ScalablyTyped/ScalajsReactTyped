package typingsJapgolly.mitm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mitm.mitmStrings.connect
  - typingsJapgolly.mitm.mitmStrings.connection
  - typingsJapgolly.mitm.mitmStrings.request
*/
trait Event extends js.Object

object Event {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connect: typingsJapgolly.mitm.mitmStrings.connect = this.cast("connect")
  @scala.inline
  def connection: typingsJapgolly.mitm.mitmStrings.connection = this.cast("connection")
  @scala.inline
  def request: typingsJapgolly.mitm.mitmStrings.request = this.cast("request")
}

