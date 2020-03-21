package typingsJapgolly.reduxApiMiddleware.mod

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.redux.mod.MiddlewareAPI
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", "apiMiddleware")
@js.native
object apiMiddleware extends js.Object {
  def apply(api: MiddlewareAPI[Dispatch[AnyAction], _]): ReturnType[Middleware[js.Object, _, Dispatch[AnyAction]]] = js.native
}

