package typingsJapgolly.scChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.scChannel.scChannelStrings.pending
  - typingsJapgolly.scChannel.scChannelStrings.subscribed
  - typingsJapgolly.scChannel.scChannelStrings.unsubscribed
*/
trait ChannelState extends js.Object

object ChannelState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typingsJapgolly.scChannel.scChannelStrings.pending = this.cast("pending")
  @scala.inline
  def subscribed: typingsJapgolly.scChannel.scChannelStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribed: typingsJapgolly.scChannel.scChannelStrings.unsubscribed = this.cast("unsubscribed")
}

