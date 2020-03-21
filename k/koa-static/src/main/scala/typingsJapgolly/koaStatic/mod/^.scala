package typingsJapgolly.koaStatic.mod

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-static", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(root: String): Middleware[js.Object, DefaultContext] = js.native
  def apply(root: String, opts: Options): Middleware[js.Object, DefaultContext] = js.native
}

