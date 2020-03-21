package typingsJapgolly.expressHttpProxy.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-http-proxy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(host: String): RequestHandler[ParamsDictionary] = js.native
  def apply(host: String, options: ProxyOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(host: js.Function1[/* req */ Request_[ParamsDictionary], String]): RequestHandler[ParamsDictionary] = js.native
  def apply(host: js.Function1[/* req */ Request_[ParamsDictionary], String], options: ProxyOptions): RequestHandler[ParamsDictionary] = js.native
}

