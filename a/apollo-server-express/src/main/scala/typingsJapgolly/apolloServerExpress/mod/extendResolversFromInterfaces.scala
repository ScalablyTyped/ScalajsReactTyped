package typingsJapgolly.apolloServerExpress.mod

import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "extendResolversFromInterfaces")
@js.native
object extendResolversFromInterfaces extends js.Object {
  def apply(schema: GraphQLSchema, resolvers: IResolvers[_, _]): IResolvers[_, _] = js.native
}

