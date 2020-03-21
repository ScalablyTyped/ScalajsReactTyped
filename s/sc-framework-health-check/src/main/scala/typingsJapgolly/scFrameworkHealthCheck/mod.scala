package typingsJapgolly.scFrameworkHealthCheck

import typingsJapgolly.express.mod.Express
import typingsJapgolly.socketcluster.scworkerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-framework-health-check", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def attach(worker: ^, expressApp: Express): Unit = js.native
}

