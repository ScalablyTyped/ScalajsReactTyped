package typingsJapgolly.koaMount

import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.koa.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-mount", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[StateT, CustomT](app: Middleware[StateT, CustomT]): Middleware[StateT, CustomT] = js.native
  def apply[StateT, CustomT](app: ^[StateT, CustomT]): Middleware[StateT, CustomT] = js.native
  def apply[StateT, CustomT](prefix: String, app: Middleware[StateT, CustomT]): Middleware[StateT, CustomT] = js.native
  def apply[StateT, CustomT](prefix: String, app: ^[StateT, CustomT]): Middleware[StateT, CustomT] = js.native
}

