package typingsJapgolly.graphqlTools.addArgumentsAsVariablesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.Request
import typingsJapgolly.graphqlTools.interfacesMod.Result
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddArgumentsAsVariablesTransform extends Transform {
  var args: js.Any
  var schema: js.Any
  @JSName("transformRequest")
  def transformRequest_MAddArgumentsAsVariablesTransform(originalRequest: Request): Request
}

object AddArgumentsAsVariablesTransform {
  @scala.inline
  def apply(
    args: js.Any,
    schema: js.Any,
    transformRequest: Request => CallbackTo[Request],
    transformResult: /* result */ Result => CallbackTo[Result] = null,
    transformSchema: /* schema */ GraphQLSchema => CallbackTo[GraphQLSchema] = null
  ): AddArgumentsAsVariablesTransform = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.updateDynamic("transformRequest")(js.Any.fromFunction1((t0: typingsJapgolly.graphqlTools.interfacesMod.Request) => transformRequest(t0).runNow()))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.graphqlTools.interfacesMod.Result) => transformResult(t0).runNow()))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1((t0: /* schema */ typingsJapgolly.graphql.mod.GraphQLSchema) => transformSchema(t0).runNow()))
    __obj.asInstanceOf[AddArgumentsAsVariablesTransform]
  }
}

