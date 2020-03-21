package typingsJapgolly.koaJoiRouter

import typingsJapgolly.koaRouter.mod.IMiddleware
import typingsJapgolly.koaRouter.mod.Router
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  def apply(path: String, middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  def apply(path: js.Array[String], middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  def apply(path: RegExp, middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
}

