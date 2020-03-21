package typingsJapgolly.apolloReactCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Context = typingsJapgolly.std.Record[java.lang.String, js.Any]
  type MutationFunction[TData, TVariables] = js.Function1[
    /* options */ js.UndefOr[
      typingsJapgolly.apolloReactCommon.typesMod.MutationFunctionOptions[TData, TVariables]
    ], 
    js.Promise[
      typingsJapgolly.apolloReactCommon.typesMod.MutationFetchResult[
        TData, 
        typingsJapgolly.std.Record[java.lang.String, js.Any], 
        typingsJapgolly.std.Record[java.lang.String, js.Any]
      ]
    ]
  ]
  type OperationVariables = typingsJapgolly.std.Record[java.lang.String, js.Any]
  type RefetchQueriesFunction = js.Function1[
    /* repeated */ js.Any, 
    js.Array[java.lang.String | typingsJapgolly.apolloClient.typesMod.PureQueryOptions]
  ]
}
