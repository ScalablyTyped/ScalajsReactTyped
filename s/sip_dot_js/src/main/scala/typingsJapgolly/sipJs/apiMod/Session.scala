package typingsJapgolly.sipJs.apiMod

import typingsJapgolly.sipJs.sessionOptionsMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Session")
@js.native
abstract class Session protected ()
  extends typingsJapgolly.sipJs.sessionMod.Session {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: typingsJapgolly.sipJs.userAgentMod.UserAgent) = this()
  protected def this(userAgent: typingsJapgolly.sipJs.userAgentMod.UserAgent, options: SessionOptions) = this()
}

