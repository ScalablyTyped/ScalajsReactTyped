package typingsJapgolly.apolloGraphql

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.mod.GraphQLScalarType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema/resolverMap", JSImport.Namespace)
@js.native
object resolverMapMod extends js.Object {
  type GraphQLResolverMap[TContext] = StringDictionary[
    (StringDictionary[
      AnonRequires[TContext] | Double | (GraphQLFieldResolver[js.Any, TContext, StringDictionary[js.Any]]) | String
    ]) | GraphQLScalarType
  ]
}

