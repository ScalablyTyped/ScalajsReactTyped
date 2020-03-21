package typingsJapgolly.koaSslify.mod

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-sslify", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
}

