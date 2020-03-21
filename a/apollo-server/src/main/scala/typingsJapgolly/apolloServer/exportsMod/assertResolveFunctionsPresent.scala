package typingsJapgolly.apolloServer.exportsMod

import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.IResolverValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "assertResolveFunctionsPresent")
@js.native
object assertResolveFunctionsPresent extends js.Object {
  def apply(schema: GraphQLSchema): Unit = js.native
  def apply(schema: GraphQLSchema, resolverValidationOptions: IResolverValidationOptions): Unit = js.native
}

