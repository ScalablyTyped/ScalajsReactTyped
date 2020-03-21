package typingsJapgolly.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cometd.cometdStrings.retry
  - typingsJapgolly.cometd.cometdStrings.handshake
  - typingsJapgolly.cometd.cometdStrings.none
*/
trait ReconnectAdvice extends js.Object

object ReconnectAdvice {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def handshake: typingsJapgolly.cometd.cometdStrings.handshake = this.cast("handshake")
  @scala.inline
  def none: typingsJapgolly.cometd.cometdStrings.none = this.cast("none")
  @scala.inline
  def retry: typingsJapgolly.cometd.cometdStrings.retry = this.cast("retry")
}

