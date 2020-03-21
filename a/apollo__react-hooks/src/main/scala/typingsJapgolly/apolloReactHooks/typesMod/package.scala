package typingsJapgolly.apolloReactHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CommonOptions[TOptions] = TOptions with typingsJapgolly.apolloReactHooks.AnonClientApolloClient
  type MutationTuple[TData, TVariables] = js.Tuple2[
    js.Function1[
      /* options */ js.UndefOr[
        typingsJapgolly.apolloReactCommon.typesMod.MutationFunctionOptions[TData, TVariables]
      ], 
      js.Promise[typingsJapgolly.apolloReactCommon.typesMod.ExecutionResult[TData]]
    ], 
    typingsJapgolly.apolloReactCommon.typesMod.MutationResult[TData]
  ]
  type QueryTuple[TData, TVariables] = js.Tuple2[
    js.Function1[
      /* options */ js.UndefOr[typingsJapgolly.apolloReactHooks.typesMod.QueryLazyOptions[TVariables]], 
      scala.Unit
    ], 
    typingsJapgolly.apolloReactCommon.typesMod.QueryResult[TData, TVariables]
  ]
}
