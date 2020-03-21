package typingsJapgolly.koaCompress.mod

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-compress", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Compress middleware for Koa
    */
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: CompressOptions): Middleware[DefaultState, DefaultContext] = js.native
}

