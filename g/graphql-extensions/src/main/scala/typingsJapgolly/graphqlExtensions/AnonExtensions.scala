package typingsJapgolly.graphqlExtensions

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensions[TContext] extends js.Object {
  var context: TContext
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var operationName: js.UndefOr[String] = js.undefined
  var parsedQuery: js.UndefOr[DocumentNode] = js.undefined
  var persistedQueryHit: js.UndefOr[Boolean] = js.undefined
  var persistedQueryRegister: js.UndefOr[Boolean] = js.undefined
  var queryString: js.UndefOr[String] = js.undefined
  var request: PickRequesturlmethodheade
  var requestContext: GraphQLRequestContext[TContext]
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object AnonExtensions {
  @scala.inline
  def apply[TContext](
    context: TContext,
    request: PickRequesturlmethodheade,
    requestContext: GraphQLRequestContext[TContext],
    extensions: Record[String, _] = null,
    operationName: String = null,
    parsedQuery: DocumentNode = null,
    persistedQueryHit: js.UndefOr[Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[Boolean] = js.undefined,
    queryString: String = null,
    variables: StringDictionary[js.Any] = null
  ): AnonExtensions[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (parsedQuery != null) __obj.updateDynamic("parsedQuery")(parsedQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(persistedQueryHit)) __obj.updateDynamic("persistedQueryHit")(persistedQueryHit.asInstanceOf[js.Any])
    if (!js.isUndefined(persistedQueryRegister)) __obj.updateDynamic("persistedQueryRegister")(persistedQueryRegister.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtensions[TContext]]
  }
}

