package typingsJapgolly.sipJs.mod

import typingsJapgolly.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifiers
import typingsJapgolly.sipJs.libSessionMod.InviteClientContext.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "InviteClientContext")
@js.native
class InviteClientContext protected ()
  extends typingsJapgolly.sipJs.libSessionMod.InviteClientContext {
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, target: String) = this()
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, target: typingsJapgolly.sipJs.coreMod.URI) = this()
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, target: String, options: Options) = this()
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, target: typingsJapgolly.sipJs.coreMod.URI, options: Options) = this()
  def this(
    ua: typingsJapgolly.sipJs.uAMod.UA,
    target: String,
    options: Options,
    modifiers: SessionDescriptionHandlerModifiers
  ) = this()
  def this(
    ua: typingsJapgolly.sipJs.uAMod.UA,
    target: typingsJapgolly.sipJs.coreMod.URI,
    options: Options,
    modifiers: SessionDescriptionHandlerModifiers
  ) = this()
}

