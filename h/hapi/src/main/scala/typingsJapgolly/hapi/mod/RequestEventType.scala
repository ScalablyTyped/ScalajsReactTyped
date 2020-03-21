package typingsJapgolly.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapi.hapiStrings.peek
  - typingsJapgolly.hapi.hapiStrings.finish
  - typingsJapgolly.hapi.hapiStrings.disconnect
*/
trait RequestEventType extends js.Object

object RequestEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disconnect: typingsJapgolly.hapi.hapiStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def finish: typingsJapgolly.hapi.hapiStrings.finish = this.cast("finish")
  @scala.inline
  def peek: typingsJapgolly.hapi.hapiStrings.peek = this.cast("peek")
}

