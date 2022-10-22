package typingsJapgolly.twilio.libJwtAccessTokenMod

import typingsJapgolly.twilio.twilioStrings.chat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", "ChatGrant")
@js.native
open class ChatGrant ()
  extends Grant[ChatGrantOptions, ChatGrantPayload, chat]
     with ChatGrantOptions {
  def this(opts: ChatGrantOptions) = this()
}
