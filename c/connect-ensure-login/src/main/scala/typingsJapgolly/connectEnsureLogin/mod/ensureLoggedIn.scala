package typingsJapgolly.connectEnsureLogin.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-ensure-login", "ensureLoggedIn")
@js.native
object ensureLoggedIn extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: String): RequestHandler[ParamsDictionary] = js.native
  def apply(options: LoggedInOptions): RequestHandler[ParamsDictionary] = js.native
}

