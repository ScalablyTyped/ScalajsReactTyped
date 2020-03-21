package typingsJapgolly.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type MutationQueryReducer[T] = js.Function2[
    /* previousResult */ typingsJapgolly.std.Record[java.lang.String, js.Any], 
    /* options */ typingsJapgolly.apolloClient.AnonMutationResult[T], 
    typingsJapgolly.std.Record[java.lang.String, js.Any]
  ]
  type MutationQueryReducersMap[T] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.apolloClient.typesMod.MutationQueryReducer[T]]
  type OperationVariables = org.scalablytyped.runtime.StringDictionary[js.Any]
  type QueryListener = js.Function3[
    /* queryStoreValue */ typingsJapgolly.apolloClient.queriesMod.QueryStoreValue, 
    /* newData */ js.UndefOr[js.Any], 
    /* forceResolvers */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type Resolvers = org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[typingsJapgolly.apolloClient.localStateMod.Resolver]
  ]
}
