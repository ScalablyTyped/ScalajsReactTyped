package typingsJapgolly.sipJs.apiMod

import typingsJapgolly.sipJs.coreMod.URI
import typingsJapgolly.sipJs.inviterOptionsMod.InviterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Inviter")
@js.native
class Inviter protected ()
  extends typingsJapgolly.sipJs.inviterMod.Inviter {
  /**
    * Constructs a new instance of the `Inviter` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param options - Options bucket. See {@link InviterOptions} for details.
    */
  def this(userAgent: typingsJapgolly.sipJs.userAgentMod.UserAgent, targetURI: URI) = this()
  def this(userAgent: typingsJapgolly.sipJs.userAgentMod.UserAgent, targetURI: URI, options: InviterOptions) = this()
}

