package typingsJapgolly.jwtExpress.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-express", "init")
@js.native
object init extends js.Object {
  def apply(secret: String): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: String, options: JWTExpressOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: js.Function1[/* req */ Request_[ParamsDictionary], String]): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: js.Function1[/* req */ Request_[ParamsDictionary], String], options: JWTExpressOptions): RequestHandler[ParamsDictionary] = js.native
}

