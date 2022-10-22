package typingsJapgolly.twilioChat.mod

import typingsJapgolly.twilioNotifications.mod.ChannelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Connection state of the client. Possible values are as follows:
  * * `'connecting'` - client is offline and connection attempt is in process
  * * `'connected'` - client is online and ready
  * * `'disconnecting'` - client is going offline as disconnection is in process
  * * `'disconnected'` - client is offline and no connection attempt is in process
  * * `'denied'` - client connection is denied because of invalid JWT access token. User must
  * refresh token in order to proceed
  */
type ConnectionState = typingsJapgolly.twilsock.mod.ConnectionState

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioChat.twilioChatStrings.trace
  - typingsJapgolly.twilioChat.twilioChatStrings.debug
  - typingsJapgolly.twilioChat.twilioChatStrings.info
  - typingsJapgolly.twilioChat.twilioChatStrings.warn
  - typingsJapgolly.twilioChat.twilioChatStrings.error
  - typingsJapgolly.twilioChat.twilioChatStrings.silent
  - scala.Null
*/
type LogLevel = _LogLevel | Null

/**
  * Notifications channel type. Possible values are as follows:
  * * `'fcm'`
  * * `'apn'`
  */
type NotificationsChannelType = ChannelType
