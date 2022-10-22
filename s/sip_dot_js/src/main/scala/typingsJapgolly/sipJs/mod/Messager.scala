package typingsJapgolly.sipJs.mod

import typingsJapgolly.sipJs.libApiMessagerOptionsMod.MessagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Messager")
@js.native
open class Messager protected ()
  extends typingsJapgolly.sipJs.libApiMod.Messager {
  /**
    * Constructs a new instance of the `Messager` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param content - Content for the body of the message.
    * @param contentType - Content type of the body of the message.
    * @param options - Options bucket. See {@link MessagerOptions} for details.
    */
  def this(
    userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typingsJapgolly.sipJs.libCoreMod.URI,
    content: String
  ) = this()
  def this(
    userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typingsJapgolly.sipJs.libCoreMod.URI,
    content: String,
    contentType: String
  ) = this()
  def this(
    userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typingsJapgolly.sipJs.libCoreMod.URI,
    content: String,
    contentType: String,
    options: MessagerOptions
  ) = this()
  def this(
    userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typingsJapgolly.sipJs.libCoreMod.URI,
    content: String,
    contentType: Unit,
    options: MessagerOptions
  ) = this()
}
