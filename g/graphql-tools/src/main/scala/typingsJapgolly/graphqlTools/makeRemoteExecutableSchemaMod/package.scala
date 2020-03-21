package typingsJapgolly.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object makeRemoteExecutableSchemaMod {
  type Fetcher = js.Function1[
    /* operation */ typingsJapgolly.graphqlTools.makeRemoteExecutableSchemaMod.FetcherOperation, 
    js.Promise[
      typingsJapgolly.graphql.executeMod.ExecutionResult[typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault]
    ]
  ]
  type ResolverFn = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo], 
    typingsJapgolly.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]
  ]
}
