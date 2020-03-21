package typingsJapgolly.sipJs.apiMod

import typingsJapgolly.sipJs.referMod.IncomingReferRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Referral")
@js.native
class Referral protected ()
  extends typingsJapgolly.sipJs.referralMod.Referral {
  /** @internal */
  def this(incomingReferRequest: IncomingReferRequest, session: typingsJapgolly.sipJs.sessionMod.Session) = this()
}

