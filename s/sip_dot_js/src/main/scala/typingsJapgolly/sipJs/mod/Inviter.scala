package typingsJapgolly.sipJs.mod

import typingsJapgolly.sipJs.libApiInviterOptionsMod.InviterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Inviter")
@js.native
open class Inviter protected ()
  extends typingsJapgolly.sipJs.libApiMod.Inviter {
  /**
    * Constructs a new instance of the `Inviter` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param options - Options bucket. See {@link InviterOptions} for details.
    */
  def this(
    userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typingsJapgolly.sipJs.libCoreMod.URI
  ) = this()
  def this(
    userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typingsJapgolly.sipJs.libCoreMod.URI,
    options: InviterOptions
  ) = this()
}
