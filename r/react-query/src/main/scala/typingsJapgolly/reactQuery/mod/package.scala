package typingsJapgolly.reactQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MutateFunction[TResults, TVariables /* <: js.Object */] = js.Function2[
    /* variables */ js.UndefOr[TVariables], 
    /* options */ js.UndefOr[typingsJapgolly.reactQuery.AnonUpdateQuery], 
    js.Promise[TResults]
  ]
  type MutationFunction[TResults, TVariables /* <: js.Object */] = js.Function1[/* variables */ TVariables, js.Promise[TResults]]
  type QueryFunction[TResult, TVariables /* <: js.Object */] = js.Function1[/* variables */ TVariables, js.Promise[TResult]]
  type QueryKey[TVariables] = java.lang.String | (js.Tuple2[java.lang.String, TVariables]) | typingsJapgolly.reactQuery.reactQueryBooleans.`false` | scala.Null | typingsJapgolly.reactQuery.mod.QueryKeyFunction[TVariables]
  type QueryKeyFunction[TVariables] = js.Function0[
    java.lang.String | (js.Tuple2[java.lang.String, TVariables]) | typingsJapgolly.reactQuery.reactQueryBooleans.`false` | scala.Null
  ]
}
