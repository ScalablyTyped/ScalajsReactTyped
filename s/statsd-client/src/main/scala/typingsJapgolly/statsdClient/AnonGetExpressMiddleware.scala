package typingsJapgolly.statsdClient

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.statsdClient.mod.ExpressMiddlewareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetExpressMiddleware extends js.Object {
  def getExpressMiddleware(): RequestHandler[ParamsDictionary] = js.native
  def getExpressMiddleware(prefix: String): RequestHandler[ParamsDictionary] = js.native
  def getExpressMiddleware(prefix: String, options: ExpressMiddlewareOptions): RequestHandler[ParamsDictionary] = js.native
}

