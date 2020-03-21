package typingsJapgolly.engineIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.engineIo.engineIoStrings.polling
  - typingsJapgolly.engineIo.engineIoStrings.websocket
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def polling: typingsJapgolly.engineIo.engineIoStrings.polling = this.cast("polling")
  @scala.inline
  def websocket: typingsJapgolly.engineIo.engineIoStrings.websocket = this.cast("websocket")
}

