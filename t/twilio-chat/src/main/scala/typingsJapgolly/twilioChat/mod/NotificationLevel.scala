package typingsJapgolly.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The user's notification level for the channel. Determines
  * whether the currently logged-in user will receive pushes for events
  * in this channel. Can be either `muted` or `default`, where
  * `default` defers to the global service push configuration.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioChat.twilioChatStrings.default
  - typingsJapgolly.twilioChat.twilioChatStrings.muted
*/
trait NotificationLevel extends StObject
object NotificationLevel {
  
  inline def default: typingsJapgolly.twilioChat.twilioChatStrings.default = "default".asInstanceOf[typingsJapgolly.twilioChat.twilioChatStrings.default]
  
  inline def muted: typingsJapgolly.twilioChat.twilioChatStrings.muted = "muted".asInstanceOf[typingsJapgolly.twilioChat.twilioChatStrings.muted]
}
