package typingsJapgolly.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of the channel, relative to the client: whether
  * the channel has been `joined` or the client is
  * `notParticipating` in the channel or has been `invited` to
  * the channel.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioChat.twilioChatStrings.unknown
  - typingsJapgolly.twilioChat.twilioChatStrings.notParticipating
  - typingsJapgolly.twilioChat.twilioChatStrings.invited
  - typingsJapgolly.twilioChat.twilioChatStrings.joined
*/
trait ChannelStatus extends StObject
object ChannelStatus {
  
  inline def invited: typingsJapgolly.twilioChat.twilioChatStrings.invited = "invited".asInstanceOf[typingsJapgolly.twilioChat.twilioChatStrings.invited]
  
  inline def joined: typingsJapgolly.twilioChat.twilioChatStrings.joined = "joined".asInstanceOf[typingsJapgolly.twilioChat.twilioChatStrings.joined]
  
  inline def notParticipating: typingsJapgolly.twilioChat.twilioChatStrings.notParticipating = "notParticipating".asInstanceOf[typingsJapgolly.twilioChat.twilioChatStrings.notParticipating]
  
  inline def unknown: typingsJapgolly.twilioChat.twilioChatStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.twilioChat.twilioChatStrings.unknown]
}
