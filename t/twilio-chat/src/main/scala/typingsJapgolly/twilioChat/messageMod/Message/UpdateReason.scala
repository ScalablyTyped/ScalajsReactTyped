package typingsJapgolly.twilioChat.messageMod.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioChat.twilioChatStrings.body
  - typingsJapgolly.twilioChat.twilioChatStrings.lastUpdatedBy
  - typingsJapgolly.twilioChat.twilioChatStrings.dateUpdated
  - typingsJapgolly.twilioChat.twilioChatStrings.timestamp
  - typingsJapgolly.twilioChat.twilioChatStrings.attributes
  - typingsJapgolly.twilioChat.twilioChatStrings.author
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  def attributes: typingsJapgolly.twilioChat.twilioChatStrings.attributes = this.cast("attributes")
  @scala.inline
  def author: typingsJapgolly.twilioChat.twilioChatStrings.author = this.cast("author")
  @scala.inline
  def body: typingsJapgolly.twilioChat.twilioChatStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dateUpdated: typingsJapgolly.twilioChat.twilioChatStrings.dateUpdated = this.cast("dateUpdated")
  @scala.inline
  def lastUpdatedBy: typingsJapgolly.twilioChat.twilioChatStrings.lastUpdatedBy = this.cast("lastUpdatedBy")
  @scala.inline
  def timestamp: typingsJapgolly.twilioChat.twilioChatStrings.timestamp = this.cast("timestamp")
}

