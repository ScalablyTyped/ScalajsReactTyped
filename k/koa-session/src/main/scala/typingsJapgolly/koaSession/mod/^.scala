package typingsJapgolly.koaSession.mod

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.koaSession.Partialopts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(CONFIG: Partialopts, app: typingsJapgolly.koa.mod.^[DefaultState, DefaultContext]): Middleware[DefaultState, DefaultContext] = js.native
  def apply(app: typingsJapgolly.koa.mod.^[DefaultState, DefaultContext]): Middleware[DefaultState, DefaultContext] = js.native
}

