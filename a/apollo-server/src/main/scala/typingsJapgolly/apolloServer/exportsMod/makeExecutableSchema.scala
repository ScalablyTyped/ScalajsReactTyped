package typingsJapgolly.apolloServer.exportsMod

import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.IExecutableSchemaDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "makeExecutableSchema")
@js.native
object makeExecutableSchema extends js.Object {
  def apply[TContext](
    hasTypeDefsResolversConnectorsLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesParseOptionsInheritResolversFromInterfaces: IExecutableSchemaDefinition[TContext]
  ): GraphQLSchema = js.native
}

