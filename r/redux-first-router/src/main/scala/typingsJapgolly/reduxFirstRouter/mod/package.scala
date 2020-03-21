package typingsJapgolly.reduxFirstRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfirmLeave = js.Function2[
    /* state */ js.Object, 
    /* action */ js.Object, 
    typingsJapgolly.reduxFirstRouter.mod.Nullable[java.lang.String]
  ]
  type DisplayConfirmLeave = js.Function2[
    /* message */ java.lang.String, 
    /* callback */ js.Function1[/* unblock */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  type HistoryAction = java.lang.String
  type HistoryEntries = js.Array[typingsJapgolly.reduxFirstRouter.AnonPathname]
  type Listener = js.Function2[
    /* location */ typingsJapgolly.reduxFirstRouter.mod.HistoryLocation, 
    /* action */ typingsJapgolly.reduxFirstRouter.mod.HistoryAction, 
    scala.Unit
  ]
  type Navigators[TState] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reduxFirstRouter.mod.Navigator[TState]]
  type Nullable[T] = js.UndefOr[T | scala.Null]
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Query = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type Route[TKeys, TState] = typingsJapgolly.reduxFirstRouter.mod.RouteString | (typingsJapgolly.reduxFirstRouter.mod.RouteObject[TKeys, TState])
  type RouteObject[TKeys, TState] = TKeys with typingsJapgolly.reduxFirstRouter.AnonCapitalizedWords[TState]
  type RouteString = java.lang.String
  type RouteThunk[TState] = js.Function2[
    /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any], 
    /* getState */ typingsJapgolly.reduxFirstRouter.mod.StateGetter[TState], 
    js.Any | js.Promise[js.Any]
  ]
  type RoutesMap[TKeys, TState] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reduxFirstRouter.mod.Route[TKeys, TState]]
  type ScrollBehavior_ = js.Object
  type ScrollUpdater = js.Function1[/* performedByUser */ scala.Boolean, scala.Unit]
  type SelectLocationState_[TKeys, TState] = js.Function1[
    /* state */ TState, 
    typingsJapgolly.reduxFirstRouter.mod.LocationState[TKeys, TState]
  ]
  type SelectTitleState[TState] = js.Function1[/* state */ TState, java.lang.String]
  type StateGetter[TState] = js.Function0[TState]
}
