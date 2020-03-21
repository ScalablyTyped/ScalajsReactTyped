package typingsJapgolly.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object watchQueryOptionsMod {
  type MutationUpdaterFn[T] = js.Function2[
    /* proxy */ typingsJapgolly.apolloCache.dataProxyMod.DataProxy, 
    /* mutationResult */ typingsJapgolly.apolloLink.typesMod.FetchResult[
      T, 
      typingsJapgolly.std.Record[java.lang.String, js.Any], 
      typingsJapgolly.std.Record[java.lang.String, js.Any]
    ], 
    scala.Unit
  ]
  type RefetchQueryDescription = js.Array[java.lang.String | typingsJapgolly.apolloClient.typesMod.PureQueryOptions]
  type UpdateQueryFn[TData, TSubscriptionVariables, TSubscriptionData] = js.Function2[
    /* previousQueryResult */ TData, 
    /* options */ typingsJapgolly.apolloClient.AnonSubscriptionData[TSubscriptionData, TSubscriptionVariables], 
    TData
  ]
}
