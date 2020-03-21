package typingsJapgolly.agChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.agChannel.agChannelStrings.pending
  - typingsJapgolly.agChannel.agChannelStrings.subscribed
  - typingsJapgolly.agChannel.agChannelStrings.unsubscribed
*/
trait ChannelState extends js.Object

object ChannelState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typingsJapgolly.agChannel.agChannelStrings.pending = this.cast("pending")
  @scala.inline
  def subscribed: typingsJapgolly.agChannel.agChannelStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribed: typingsJapgolly.agChannel.agChannelStrings.unsubscribed = this.cast("unsubscribed")
}

