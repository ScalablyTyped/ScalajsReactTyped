package typingsJapgolly.apolloServer.mod

import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.GraphQLParseOptions
import typingsJapgolly.graphqlTools.interfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "buildSchemaFromTypeDefinitions")
@js.native
object buildSchemaFromTypeDefinitions extends js.Object {
  def apply(typeDefinitions: ITypeDefinitions): GraphQLSchema = js.native
  def apply(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): GraphQLSchema = js.native
}

