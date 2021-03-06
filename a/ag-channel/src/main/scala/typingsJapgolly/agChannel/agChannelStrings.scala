package typingsJapgolly.agChannel

import typingsJapgolly.agChannel.mod.ChannelState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object agChannelStrings {
  @js.native
  sealed trait pending extends ChannelState
  
  @js.native
  sealed trait subscribed extends ChannelState
  
  @js.native
  sealed trait unsubscribed extends ChannelState
  
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  @scala.inline
  def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
}

