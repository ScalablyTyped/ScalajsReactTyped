package typingsJapgolly.k6.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.k6.k6Strings.close
  - typingsJapgolly.k6.k6Strings.error
  - typingsJapgolly.k6.k6Strings.message
  - typingsJapgolly.k6.k6Strings.open
  - typingsJapgolly.k6.k6Strings.ping
  - typingsJapgolly.k6.k6Strings.pong
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typingsJapgolly.k6.k6Strings.close = this.cast("close")
  @scala.inline
  def error: typingsJapgolly.k6.k6Strings.error = this.cast("error")
  @scala.inline
  def message: typingsJapgolly.k6.k6Strings.message = this.cast("message")
  @scala.inline
  def open: typingsJapgolly.k6.k6Strings.open = this.cast("open")
  @scala.inline
  def ping: typingsJapgolly.k6.k6Strings.ping = this.cast("ping")
  @scala.inline
  def pong: typingsJapgolly.k6.k6Strings.pong = this.cast("pong")
}

