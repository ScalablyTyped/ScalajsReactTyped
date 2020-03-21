package typingsJapgolly.lusca.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", "csrf")
@js.native
object csrf extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: csrfOptions): RequestHandler[ParamsDictionary] = js.native
}

