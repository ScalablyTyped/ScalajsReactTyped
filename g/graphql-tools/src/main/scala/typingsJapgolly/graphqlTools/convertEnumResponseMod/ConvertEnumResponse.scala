package typingsJapgolly.graphqlTools.convertEnumResponseMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.Request
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertEnumResponse extends Transform {
  var enumNode: js.Any
  @JSName("transformResult")
  def transformResult_MConvertEnumResponse(result: js.Any): js.Any
}

object ConvertEnumResponse {
  @scala.inline
  def apply(
    enumNode: js.Any,
    transformResult: js.Any => CallbackTo[js.Any],
    transformRequest: /* originalRequest */ Request => CallbackTo[Request] = null,
    transformSchema: /* schema */ GraphQLSchema => CallbackTo[GraphQLSchema] = null
  ): ConvertEnumResponse = {
    val __obj = js.Dynamic.literal(enumNode = enumNode.asInstanceOf[js.Any])
    __obj.updateDynamic("transformResult")(js.Any.fromFunction1((t0: js.Any) => transformResult(t0).runNow()))
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1((t0: /* originalRequest */ typingsJapgolly.graphqlTools.interfacesMod.Request) => transformRequest(t0).runNow()))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1((t0: /* schema */ typingsJapgolly.graphql.mod.GraphQLSchema) => transformSchema(t0).runNow()))
    __obj.asInstanceOf[ConvertEnumResponse]
  }
}

