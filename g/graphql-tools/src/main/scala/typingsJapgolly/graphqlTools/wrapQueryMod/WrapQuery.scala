package typingsJapgolly.graphqlTools.wrapQueryMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.Request
import typingsJapgolly.graphqlTools.interfacesMod.Result
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapQuery extends Transform {
  var extractor: js.Any
  var path: js.Any
  var wrapper: js.Any
  @JSName("transformRequest")
  def transformRequest_MWrapQuery(originalRequest: Request): Request
  @JSName("transformResult")
  def transformResult_MWrapQuery(originalResult: Result): Result
}

object WrapQuery {
  @scala.inline
  def apply(
    extractor: js.Any,
    path: js.Any,
    transformRequest: Request => CallbackTo[Request],
    transformResult: Result => CallbackTo[Result],
    wrapper: js.Any,
    transformSchema: /* schema */ GraphQLSchema => CallbackTo[GraphQLSchema] = null
  ): WrapQuery = {
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.updateDynamic("transformRequest")(js.Any.fromFunction1((t0: typingsJapgolly.graphqlTools.interfacesMod.Request) => transformRequest(t0).runNow()))
    __obj.updateDynamic("transformResult")(js.Any.fromFunction1((t0: typingsJapgolly.graphqlTools.interfacesMod.Result) => transformResult(t0).runNow()))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1((t0: /* schema */ typingsJapgolly.graphql.mod.GraphQLSchema) => transformSchema(t0).runNow()))
    __obj.asInstanceOf[WrapQuery]
  }
}

