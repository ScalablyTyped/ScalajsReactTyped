package typingsJapgolly.jwtExpress.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-express", "require")
@js.native
object require extends js.Object {
  def apply(key: String): RequestHandler[ParamsDictionary] = js.native
  def apply(key: String, operator: String): RequestHandler[ParamsDictionary] = js.native
  def apply(key: String, operator: String, value: js.Any): RequestHandler[ParamsDictionary] = js.native
}

