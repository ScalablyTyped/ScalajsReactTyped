package typingsJapgolly.openfin

import typingsJapgolly.openfin.openfinBooleans.`true`
import typingsJapgolly.openfin.openfinStrings.`request-external-authorization`
import typingsJapgolly.openfin.transportMod.AuthorizationPayload
import typingsJapgolly.openfin.transportMod.Message
import typingsJapgolly.openfin.transportMod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(action: String, payload: js.Object, uncorrelated: Boolean): js.Promise[Message[Payload]] = js.native
  def apply(action: `request-external-authorization`, payload: js.Object, uncorrelated: `true`): js.Promise[Message[AuthorizationPayload]] = js.native
}

