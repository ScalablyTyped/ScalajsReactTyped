package typingsJapgolly.qsMiddleware

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.qs.mod.IParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qs-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: IParseOptions): RequestHandler[ParamsDictionary] = js.native
}

