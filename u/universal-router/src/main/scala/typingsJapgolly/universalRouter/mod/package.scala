package typingsJapgolly.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Context = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ErrorHandler[C /* <: typingsJapgolly.universalRouter.mod.Context */, R] = js.Function2[
    /* error */ typingsJapgolly.universalRouter.Errorstatusnumber, 
    /* context */ C with (typingsJapgolly.universalRouter.mod.RouteContext[C, R]), 
    typingsJapgolly.universalRouter.mod.Result[R]
  ]
  type QueryParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ResolveRoute[C /* <: typingsJapgolly.universalRouter.mod.Context */, R] = js.Function2[
    /* context */ C with (typingsJapgolly.universalRouter.mod.RouteContext[C, R]), 
    /* params */ typingsJapgolly.universalRouter.mod.QueryParams, 
    typingsJapgolly.universalRouter.mod.Result[R]
  ]
  type Result[T] = T | (js.Promise[T | scala.Unit]) | scala.Unit
  type Routes[C /* <: typingsJapgolly.universalRouter.mod.Context */, R] = js.Array[typingsJapgolly.universalRouter.mod.Route[C, R]]
}
