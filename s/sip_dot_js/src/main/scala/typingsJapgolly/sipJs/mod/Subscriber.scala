package typingsJapgolly.sipJs.mod

import typingsJapgolly.sipJs.libApiSubscriberOptionsMod.SubscriberOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Subscriber")
@js.native
open class Subscriber protected ()
  extends typingsJapgolly.sipJs.libApiMod.Subscriber {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - The request URI identifying the subscribed event.
    * @param eventType - The event type identifying the subscribed event.
    * @param options - Options bucket. See {@link SubscriberOptions} for details.
    */
  def this(
    userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typingsJapgolly.sipJs.libCoreMod.URI,
    eventType: String
  ) = this()
  def this(
    userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typingsJapgolly.sipJs.libCoreMod.URI,
    eventType: String,
    options: SubscriberOptions
  ) = this()
}
