package typingsJapgolly.lusca.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", "xssProtection")
@js.native
object xssProtection extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: xssProtectionOptions): RequestHandler[ParamsDictionary] = js.native
}

