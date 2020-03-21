package typingsJapgolly.swaggerStats.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-stats", "getMiddleware")
@js.native
object getMiddleware extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(opts: SWStats): RequestHandler[ParamsDictionary] = js.native
}

