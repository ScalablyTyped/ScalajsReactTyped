package typingsJapgolly.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.azdata.azdataStrings.unknown
  - typingsJapgolly.azdata.azdataStrings.starting
  - typingsJapgolly.azdata.azdataStrings.reconnecting
  - typingsJapgolly.azdata.azdataStrings.idle
  - typingsJapgolly.azdata.azdataStrings.busy
  - typingsJapgolly.azdata.azdataStrings.restarting
  - typingsJapgolly.azdata.azdataStrings.dead
  - typingsJapgolly.azdata.azdataStrings.connected
*/
trait KernelStatus extends js.Object

object KernelStatus {
  @scala.inline
  def busy: typingsJapgolly.azdata.azdataStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsJapgolly.azdata.azdataStrings.connected = this.cast("connected")
  @scala.inline
  def dead: typingsJapgolly.azdata.azdataStrings.dead = this.cast("dead")
  @scala.inline
  def idle: typingsJapgolly.azdata.azdataStrings.idle = this.cast("idle")
  @scala.inline
  def reconnecting: typingsJapgolly.azdata.azdataStrings.reconnecting = this.cast("reconnecting")
  @scala.inline
  def restarting: typingsJapgolly.azdata.azdataStrings.restarting = this.cast("restarting")
  @scala.inline
  def starting: typingsJapgolly.azdata.azdataStrings.starting = this.cast("starting")
  @scala.inline
  def unknown: typingsJapgolly.azdata.azdataStrings.unknown = this.cast("unknown")
}

