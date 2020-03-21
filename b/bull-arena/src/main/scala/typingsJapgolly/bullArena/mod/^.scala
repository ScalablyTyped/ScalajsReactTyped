package typingsJapgolly.bullArena.mod

import typingsJapgolly.bullArena.mod.BullArena.MiddlewareListenOptions
import typingsJapgolly.bullArena.mod.BullArena.MiddlewareOptions
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bull-arena", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: MiddlewareOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(options: MiddlewareOptions, listenOptions: MiddlewareListenOptions): RequestHandler[ParamsDictionary] = js.native
}

