package typingsJapgolly.sipJs.apiMod

import typingsJapgolly.sipJs.coreMod.URI
import typingsJapgolly.sipJs.referrerOptionsMod.ReferrerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Referrer")
@js.native
class Referrer protected ()
  extends typingsJapgolly.sipJs.referrerMod.Referrer {
  /**
    * Constructs a new instance of the `Referrer` class.
    * @param session - The session the REFER will be sent from. See {@link Session} for details.
    * @param referTo - The referral target. If a `Session`, a REFER w/Replaces is sent.
    * @param options - An options bucket. See {@link ReferrerOptions} for details.
    */
  def this(session: typingsJapgolly.sipJs.sessionMod.Session, referTo: URI) = this()
  def this(
    session: typingsJapgolly.sipJs.sessionMod.Session,
    referTo: typingsJapgolly.sipJs.sessionMod.Session
  ) = this()
  def this(session: typingsJapgolly.sipJs.sessionMod.Session, referTo: URI, options: ReferrerOptions) = this()
  def this(
    session: typingsJapgolly.sipJs.sessionMod.Session,
    referTo: typingsJapgolly.sipJs.sessionMod.Session,
    options: ReferrerOptions
  ) = this()
}

