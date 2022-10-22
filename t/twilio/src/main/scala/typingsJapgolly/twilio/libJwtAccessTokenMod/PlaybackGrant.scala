package typingsJapgolly.twilio.libJwtAccessTokenMod

import typingsJapgolly.twilio.twilioStrings.player
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", "PlaybackGrant")
@js.native
open class PlaybackGrant ()
  extends Grant[PlaybackGrantOptions, PlaybackGrantPayload, player]
     with PlaybackGrantOptions {
  def this(opts: PlaybackGrantOptions) = this()
}
