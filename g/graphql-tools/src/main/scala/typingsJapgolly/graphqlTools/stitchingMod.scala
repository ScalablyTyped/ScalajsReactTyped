package typingsJapgolly.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloLink.mod.ApolloLink
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.IDelegateToSchemaOptions
import typingsJapgolly.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching", JSImport.Namespace)
@js.native
object stitchingMod extends js.Object {
  val defaultMergedResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  def defaultCreateRemoteResolver(fetcher: Fetcher): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def delegateToSchema(options: GraphQLSchema, args: js.Any*): js.Promise[_] = js.native
  def delegateToSchema(options: IDelegateToSchemaOptions[StringDictionary[_]], args: js.Any*): js.Promise[_] = js.native
  def introspectSchema(fetcher: ApolloLink): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: ApolloLink, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: Fetcher): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: Fetcher, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def makeRemoteExecutableSchema(hasSchemaLinkFetcherCreateResolverBuildSchemaOptionsPrintSchemaOptions: AnonBuildSchemaOptions): GraphQLSchema = js.native
  def mergeSchemas(
    hasSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfacesMergeDirectives: AnonInheritResolversFromInterfaces
  ): GraphQLSchema = js.native
}

