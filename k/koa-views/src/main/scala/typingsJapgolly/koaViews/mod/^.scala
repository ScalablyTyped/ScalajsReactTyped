package typingsJapgolly.koaViews.mod

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.koaViews.AnonAutoRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-views", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(dir: String): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String, opts: AnonAutoRender): Middleware[DefaultState, DefaultContext] = js.native
}

