package typingsJapgolly.connectTimeout.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-timeout", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(timeout: String): RequestHandler[ParamsDictionary] = js.native
  def apply(timeout: String, options: TimeoutOptions): RequestHandler[ParamsDictionary] = js.native
}

