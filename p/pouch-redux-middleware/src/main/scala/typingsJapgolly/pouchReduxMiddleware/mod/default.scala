package typingsJapgolly.pouchReduxMiddleware.mod

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pouch-redux-middleware", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[T](): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply[T](paths: js.Array[Path[T]]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply[T](paths: Path[T]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

