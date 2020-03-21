package typingsJapgolly.koaFavicon

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-favicon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Returns a middleware serving the favicon found on the given path.
    */
  def apply(path: String): Middleware[DefaultState, DefaultContext] = js.native
  def apply(path: String, options: AnonMaxage): Middleware[DefaultState, DefaultContext] = js.native
}

