package typingsJapgolly.sipJs.apiMod

import typingsJapgolly.sipJs.coreMod.URI
import typingsJapgolly.sipJs.subscriberOptionsMod.SubscriberOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Subscriber")
@js.native
class Subscriber protected ()
  extends typingsJapgolly.sipJs.subscriberMod.Subscriber {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - The request URI identifying the subscribed event.
    * @param eventType - The event type identifying the subscribed event.
    * @param options - Options bucket. See {@link SubscriberOptions} for details.
    */
  def this(userAgent: typingsJapgolly.sipJs.userAgentMod.UserAgent, targetURI: URI, eventType: String) = this()
  def this(
    userAgent: typingsJapgolly.sipJs.userAgentMod.UserAgent,
    targetURI: URI,
    eventType: String,
    options: SubscriberOptions
  ) = this()
}

