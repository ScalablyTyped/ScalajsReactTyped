package typingsJapgolly.apolloEngineReporting

import typingsJapgolly.apolloEngineReporting.apolloEngineReportingStrings.metrics
import typingsJapgolly.apolloEngineReporting.apolloEngineReportingStrings.queryHash
import typingsJapgolly.apolloServerEnv.mod.Request
import typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext
import typingsJapgolly.apolloServerTypes.mod.WithRequired
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext[TContext] extends js.Object {
  var context: TContext
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var parsedQuery: js.UndefOr[DocumentNode] = js.undefined
  var queryString: js.UndefOr[String] = js.undefined
  var request: Request
  var requestContext: WithRequired[GraphQLRequestContext[TContext], metrics | queryHash]
  var variables: js.UndefOr[Record[String, _]] = js.undefined
}

object AnonContext {
  @scala.inline
  def apply[TContext](
    context: TContext,
    request: Request,
    requestContext: WithRequired[GraphQLRequestContext[TContext], metrics | queryHash],
    extensions: Record[String, _] = null,
    parsedQuery: DocumentNode = null,
    queryString: String = null,
    variables: Record[String, _] = null
  ): AnonContext[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (parsedQuery != null) __obj.updateDynamic("parsedQuery")(parsedQuery.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext[TContext]]
  }
}

