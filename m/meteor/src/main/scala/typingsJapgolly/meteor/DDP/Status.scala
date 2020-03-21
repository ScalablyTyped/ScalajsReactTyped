package typingsJapgolly.meteor.DDP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.meteor.meteorStrings.connected
  - typingsJapgolly.meteor.meteorStrings.connecting
  - typingsJapgolly.meteor.meteorStrings.failed
  - typingsJapgolly.meteor.meteorStrings.waiting
  - typingsJapgolly.meteor.meteorStrings.offline
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsJapgolly.meteor.meteorStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsJapgolly.meteor.meteorStrings.connecting = this.cast("connecting")
  @scala.inline
  def failed: typingsJapgolly.meteor.meteorStrings.failed = this.cast("failed")
  @scala.inline
  def offline: typingsJapgolly.meteor.meteorStrings.offline = this.cast("offline")
  @scala.inline
  def waiting: typingsJapgolly.meteor.meteorStrings.waiting = this.cast("waiting")
}

