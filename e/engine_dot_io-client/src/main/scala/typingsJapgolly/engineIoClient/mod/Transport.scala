package typingsJapgolly.engineIoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.engineIoClient.engineIoClientStrings.polling
  - typingsJapgolly.engineIoClient.engineIoClientStrings.websocket
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def polling: typingsJapgolly.engineIoClient.engineIoClientStrings.polling = this.cast("polling")
  @scala.inline
  def websocket: typingsJapgolly.engineIoClient.engineIoClientStrings.websocket = this.cast("websocket")
}

