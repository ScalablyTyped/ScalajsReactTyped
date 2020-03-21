package typingsJapgolly.apollographqlApolloTools

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollographql/apollo-tools/lib/schema/resolverMap", JSImport.Namespace)
@js.native
object resolverMapMod extends js.Object {
  type GraphQLResolverMap[TContext] = StringDictionary[
    StringDictionary[
      (GraphQLFieldResolver[js.Any, TContext, StringDictionary[js.Any]]) | AnonRequires[TContext] | AnonResolve[TContext] | AnonSubscribe[TContext]
    ]
  ]
}

