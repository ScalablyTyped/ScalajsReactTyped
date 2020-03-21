package typingsJapgolly.apolloGraphql.schemaMod

import typingsJapgolly.apolloGraphql.resolverMapMod.GraphQLResolverMap
import typingsJapgolly.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema", "addResolversToSchema")
@js.native
object addResolversToSchema extends js.Object {
  def apply(schema: GraphQLSchema, resolvers: GraphQLResolverMap[_]): Unit = js.native
}

