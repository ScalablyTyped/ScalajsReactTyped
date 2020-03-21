package typingsJapgolly.reduxLittleRouter.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.redux.mod.MiddlewareAPI
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.StoreEnhancer
import typingsJapgolly.redux.mod.StoreEnhancerStoreCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router extends js.Object {
  var enhancer: StoreEnhancer[Location, js.Object]
  var middleware: Middleware[js.Object, _, Dispatch[AnyAction]]
  var reducer: Reducer[Location, AnyAction]
}

object Router {
  @scala.inline
  def apply(
    enhancer: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => CallbackTo[StoreEnhancerStoreCreator[Location, js.Object]],
    middleware: /* api */ MiddlewareAPI[Dispatch[AnyAction], js.Any] => CallbackTo[
      js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ js.Any, js.Any]]
    ],
    reducer: (/* state */ js.UndefOr[Location], AnyAction) => CallbackTo[Location]
  ): Router = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enhancer")(js.Any.fromFunction1((t0: /* next */ typingsJapgolly.redux.mod.StoreEnhancerStoreCreator[js.Object, js.Object]) => enhancer(t0).runNow()))
    __obj.updateDynamic("middleware")(js.Any.fromFunction1((t0: /* api */ typingsJapgolly.redux.mod.MiddlewareAPI[typingsJapgolly.redux.mod.Dispatch[typingsJapgolly.redux.mod.AnyAction], js.Any]) => middleware(t0).runNow()))
    __obj.updateDynamic("reducer")(js.Any.fromFunction2((t0: /* state */ js.UndefOr[typingsJapgolly.reduxLittleRouter.mod.Location], t1: typingsJapgolly.redux.mod.AnyAction) => reducer(t0, t1).runNow()))
    __obj.asInstanceOf[Router]
  }
}

