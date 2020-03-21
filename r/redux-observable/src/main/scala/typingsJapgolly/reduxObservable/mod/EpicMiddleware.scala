package typingsJapgolly.reduxObservable.mod

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpicMiddleware[T /* <: Action[_] */, O /* <: T */, S, D]
  extends Middleware[js.Object, js.Any, Dispatch[AnyAction]] {
  def run(rootEpic: Epic[T, O, S, D]): Unit = js.native
}

