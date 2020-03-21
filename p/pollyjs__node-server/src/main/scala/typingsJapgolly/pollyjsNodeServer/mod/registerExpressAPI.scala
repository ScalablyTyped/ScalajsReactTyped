package typingsJapgolly.pollyjsNodeServer.mod

import typingsJapgolly.express.mod.Express
import typingsJapgolly.pollyjsNodeServer.PartialConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/node-server", "registerExpressAPI")
@js.native
object registerExpressAPI extends js.Object {
  def apply(app: Express, config: PartialConfig): Unit = js.native
}

