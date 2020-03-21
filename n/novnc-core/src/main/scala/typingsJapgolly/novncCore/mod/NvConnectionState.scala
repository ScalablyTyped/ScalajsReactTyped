package typingsJapgolly.novncCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.novncCore.novncCoreStrings.connecting
  - typingsJapgolly.novncCore.novncCoreStrings.connected
  - typingsJapgolly.novncCore.novncCoreStrings.disconnecting
  - typingsJapgolly.novncCore.novncCoreStrings.disconnected
*/
trait NvConnectionState extends js.Object

object NvConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsJapgolly.novncCore.novncCoreStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsJapgolly.novncCore.novncCoreStrings.connecting = this.cast("connecting")
  @scala.inline
  def disconnected: typingsJapgolly.novncCore.novncCoreStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typingsJapgolly.novncCore.novncCoreStrings.disconnecting = this.cast("disconnecting")
}

