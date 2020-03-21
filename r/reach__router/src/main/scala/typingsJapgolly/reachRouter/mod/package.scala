package typingsJapgolly.reachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HistoryListener = js.Function1[
    /* parameter */ typingsJapgolly.reachRouter.mod.HistoryListenerParameter, 
    scala.Unit
  ]
  type HistoryLocation = typingsJapgolly.reachRouter.mod.WindowLocation with typingsJapgolly.reachRouter.AnonState
  type HistoryUnsubscribe = js.Function0[scala.Unit]
  type LocationProviderRenderFn = js.Function1[
    /* context */ typingsJapgolly.reachRouter.mod.LocationContext, 
    japgolly.scalajs.react.raw.React.Node
  ]
  type MatchRenderFn[TParams] = js.Function1[
    /* props */ typingsJapgolly.reachRouter.mod.MatchRenderProps[TParams], 
    japgolly.scalajs.react.raw.React.Node
  ]
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type RouteComponentProps[TParams] = typingsJapgolly.std.Partial[TParams] with typingsJapgolly.reachRouter.AnonDefault
  type WindowLocation = typingsJapgolly.std.Location_ with typingsJapgolly.history.mod.Location[typingsJapgolly.history.mod.LocationState]
}
