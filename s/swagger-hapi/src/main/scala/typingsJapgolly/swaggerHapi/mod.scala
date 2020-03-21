package typingsJapgolly.swaggerHapi

import typingsJapgolly.swaggerNodeRunner.mod.Config
import typingsJapgolly.swaggerNodeRunner.mod.HapiMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-hapi", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def create(
    config: Config,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* middleware */ HapiMiddleware, Unit]
  ): Unit = js.native
}

