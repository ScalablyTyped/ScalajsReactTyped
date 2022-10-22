package typingsJapgolly.sipJs.mod

import typingsJapgolly.sipJs.libApiPublisherOptionsMod.PublisherOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Publisher")
@js.native
open class Publisher protected ()
  extends typingsJapgolly.sipJs.libApiMod.Publisher {
  /**
    * Constructs a new instance of the `Publisher` class.
    *
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param eventType - The event type identifying the published document.
    * @param options - Options bucket. See {@link PublisherOptions} for details.
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
    options: PublisherOptions
  ) = this()
}
