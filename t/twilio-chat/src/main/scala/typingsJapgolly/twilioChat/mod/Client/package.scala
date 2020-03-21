package typingsJapgolly.twilioChat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Client {
  type ConnectionState = typingsJapgolly.twilioNotifications.clientMod.ConnectionState
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.twilioChat.twilioChatStrings.trace
    - typingsJapgolly.twilioChat.twilioChatStrings.debug
    - typingsJapgolly.twilioChat.twilioChatStrings.info
    - typingsJapgolly.twilioChat.twilioChatStrings.warn
    - typingsJapgolly.twilioChat.twilioChatStrings.error
    - typingsJapgolly.twilioChat.twilioChatStrings.silent
    - scala.Null
  */
  type LogLevel = typingsJapgolly.twilioChat.mod.Client._LogLevel | scala.Null
  type NotificationsChannelType = typingsJapgolly.twilioNotifications.connectorMod.ChannelType
}
