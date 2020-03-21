package typingsJapgolly.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object universalRouterSyncMod {
  type Context = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ErrorHandler[C /* <: typingsJapgolly.universalRouter.universalRouterSyncMod.Context */, R] = js.Function2[
    /* error */ typingsJapgolly.universalRouter.Errorstatusnumber, 
    /* context */ C with (typingsJapgolly.universalRouter.universalRouterSyncMod.RouteContext[C, R]), 
    typingsJapgolly.universalRouter.universalRouterSyncMod.Result[R]
  ]
  type QueryParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ResolveRoute[C /* <: typingsJapgolly.universalRouter.universalRouterSyncMod.Context */, R] = js.Function2[
    /* context */ C with (typingsJapgolly.universalRouter.universalRouterSyncMod.RouteContext[C, R]), 
    /* params */ typingsJapgolly.universalRouter.universalRouterSyncMod.QueryParams, 
    typingsJapgolly.universalRouter.universalRouterSyncMod.Result[R]
  ]
  type Result[T] = T | scala.Unit
  type Routes[C /* <: typingsJapgolly.universalRouter.universalRouterSyncMod.Context */, R] = js.Array[typingsJapgolly.universalRouter.universalRouterSyncMod.Route[C, R]]
}
