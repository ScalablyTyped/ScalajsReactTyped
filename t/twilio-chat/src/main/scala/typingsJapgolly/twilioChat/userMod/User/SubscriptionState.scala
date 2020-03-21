package typingsJapgolly.twilioChat.userMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioChat.twilioChatStrings.initializing
  - typingsJapgolly.twilioChat.twilioChatStrings.subscribed
  - typingsJapgolly.twilioChat.twilioChatStrings.unsubscribed
*/
trait SubscriptionState extends js.Object

object SubscriptionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def initializing: typingsJapgolly.twilioChat.twilioChatStrings.initializing = this.cast("initializing")
  @scala.inline
  def subscribed: typingsJapgolly.twilioChat.twilioChatStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribed: typingsJapgolly.twilioChat.twilioChatStrings.unsubscribed = this.cast("unsubscribed")
}

