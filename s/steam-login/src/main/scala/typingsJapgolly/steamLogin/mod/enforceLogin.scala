package typingsJapgolly.steamLogin.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steam-login", "enforceLogin")
@js.native
object enforceLogin extends js.Object {
  def apply(redirect: String): RequestHandler[ParamsDictionary] = js.native
}

