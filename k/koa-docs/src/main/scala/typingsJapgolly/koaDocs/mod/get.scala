package typingsJapgolly.koaDocs.mod

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.koaDocs.mod.koaDocs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-docs", "get")
@js.native
object get extends js.Object {
  def apply(path: String, options: Options): Middleware[DefaultState, DefaultContext] = js.native
}

