package typingsJapgolly.hapiHawk.serverMod

import typingsJapgolly.hapiHawk.cryptoMod.Artifacts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/server", "header")
@js.native
object header extends js.Object {
  def apply(credentials: Credentials, artifacts: Artifacts): String = js.native
  def apply(credentials: Credentials, artifacts: Artifacts, options: HeaderOptions): String = js.native
}

