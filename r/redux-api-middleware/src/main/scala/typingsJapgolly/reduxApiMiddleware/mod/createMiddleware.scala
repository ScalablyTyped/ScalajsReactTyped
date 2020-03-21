package typingsJapgolly.reduxApiMiddleware.mod

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", "createMiddleware")
@js.native
object createMiddleware extends js.Object {
  def apply(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(options: CreateMiddlewareOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

