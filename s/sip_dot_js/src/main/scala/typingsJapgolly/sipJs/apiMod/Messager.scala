package typingsJapgolly.sipJs.apiMod

import typingsJapgolly.sipJs.coreMod.URI
import typingsJapgolly.sipJs.messagerOptionsMod.MessagerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Messager")
@js.native
class Messager protected ()
  extends typingsJapgolly.sipJs.messagerMod.Messager {
  /**
    * Constructs a new instance of the `Messager` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param content - Content for the body of the message.
    * @param contentType - Content type of the body of the message.
    * @param options - Options bucket. See {@link MessagerOptions} for details.
    */
  def this(userAgent: typingsJapgolly.sipJs.userAgentMod.UserAgent, targetURI: URI, content: String) = this()
  def this(
    userAgent: typingsJapgolly.sipJs.userAgentMod.UserAgent,
    targetURI: URI,
    content: String,
    contentType: String
  ) = this()
  def this(
    userAgent: typingsJapgolly.sipJs.userAgentMod.UserAgent,
    targetURI: URI,
    content: String,
    contentType: String,
    options: MessagerOptions
  ) = this()
}

