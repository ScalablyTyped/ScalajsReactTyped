package typingsJapgolly.sipJs.apiMod

import typingsJapgolly.sipJs.coreMod.URI
import typingsJapgolly.sipJs.publisherOptionsMod.PublisherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Publisher")
@js.native
class Publisher protected ()
  extends typingsJapgolly.sipJs.publisherMod.Publisher {
  /**
    * Constructs a new instance of the `Publisher` class.
    *
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param eventType - The event type identifying the published document.
    * @param options - Options bucket. See {@link PublisherOptions} for details.
    */
  def this(userAgent: typingsJapgolly.sipJs.userAgentMod.UserAgent, targetURI: URI, eventType: String) = this()
  def this(
    userAgent: typingsJapgolly.sipJs.userAgentMod.UserAgent,
    targetURI: URI,
    eventType: String,
    options: PublisherOptions
  ) = this()
}

