package typingsJapgolly.koaBunyanLogger.mod

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-bunyan-logger", "requestIdContext")
@js.native
object requestIdContext extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: RequestIdContextOptions): Middleware[DefaultState, DefaultContext] = js.native
}

