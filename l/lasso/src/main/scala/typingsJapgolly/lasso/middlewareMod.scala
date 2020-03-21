package typingsJapgolly.lasso

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso/middleware", JSImport.Namespace)
@js.native
object middlewareMod extends js.Object {
  def serveStatic(): RequestHandler[ParamsDictionary] = js.native
  def serveStatic(options: AnonLasso): RequestHandler[ParamsDictionary] = js.native
}

