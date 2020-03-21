package typingsJapgolly.graphqlTools

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloLink.mod.ApolloLink
import typingsJapgolly.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.executeMod.ExecutionResult
import typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphql.schemaPrinterMod.Options
import typingsJapgolly.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher
import typingsJapgolly.graphqlTools.makeRemoteExecutableSchemaMod.FetcherOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuildSchemaOptions extends js.Object {
  var buildSchemaOptions: js.UndefOr[BuildSchemaOptions] = js.undefined
  var createResolver: js.UndefOr[
    js.Function1[/* fetcher */ Fetcher, GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ] = js.undefined
  var fetcher: js.UndefOr[Fetcher] = js.undefined
  var link: js.UndefOr[ApolloLink] = js.undefined
  var printSchemaOptions: js.UndefOr[Options] = js.undefined
  var schema: GraphQLSchema | String
}

object AnonBuildSchemaOptions {
  @scala.inline
  def apply(
    schema: GraphQLSchema | String,
    buildSchemaOptions: BuildSchemaOptions = null,
    createResolver: /* fetcher */ Fetcher => CallbackTo[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]] = null,
    fetcher: /* operation */ FetcherOperation => CallbackTo[js.Promise[ExecutionResult[ExecutionResultDataDefault]]] = null,
    link: ApolloLink = null,
    printSchemaOptions: Options = null
  ): AnonBuildSchemaOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (buildSchemaOptions != null) __obj.updateDynamic("buildSchemaOptions")(buildSchemaOptions.asInstanceOf[js.Any])
    if (createResolver != null) __obj.updateDynamic("createResolver")(js.Any.fromFunction1((t0: /* fetcher */ typingsJapgolly.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher) => createResolver(t0).runNow()))
    if (fetcher != null) __obj.updateDynamic("fetcher")(js.Any.fromFunction1((t0: /* operation */ typingsJapgolly.graphqlTools.makeRemoteExecutableSchemaMod.FetcherOperation) => fetcher(t0).runNow()))
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (printSchemaOptions != null) __obj.updateDynamic("printSchemaOptions")(printSchemaOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuildSchemaOptions]
  }
}

