package typingsJapgolly.hapiHawk.serverMod

import typingsJapgolly.hapiHawk.cryptoMod.Artifacts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/server", "authenticatePayload")
@js.native
object authenticatePayload extends js.Object {
  def apply(payload: String, credentials: Credentials, artifacts: Artifacts, contentType: String): Unit = js.native
}

