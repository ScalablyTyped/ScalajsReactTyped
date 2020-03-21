package typingsJapgolly.hapiHawk.serverMod

import typingsJapgolly.hapiHawk.cryptoMod.Artifacts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/server", "authenticatePayloadHash")
@js.native
object authenticatePayloadHash extends js.Object {
  def apply(calculatedHash: String, artifacts: Artifacts): Unit = js.native
}

