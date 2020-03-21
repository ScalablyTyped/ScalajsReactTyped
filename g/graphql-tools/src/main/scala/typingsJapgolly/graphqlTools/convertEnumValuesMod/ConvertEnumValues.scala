package typingsJapgolly.graphqlTools.convertEnumValuesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.Request
import typingsJapgolly.graphqlTools.interfacesMod.Result
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertEnumValues extends Transform {
  var enumValueMap: js.Any
  @JSName("transformSchema")
  def transformSchema_MConvertEnumValues(schema: GraphQLSchema): GraphQLSchema
}

object ConvertEnumValues {
  @scala.inline
  def apply(
    enumValueMap: js.Any,
    transformSchema: GraphQLSchema => CallbackTo[GraphQLSchema],
    transformRequest: /* originalRequest */ Request => CallbackTo[Request] = null,
    transformResult: /* result */ Result => CallbackTo[Result] = null
  ): ConvertEnumValues = {
    val __obj = js.Dynamic.literal(enumValueMap = enumValueMap.asInstanceOf[js.Any])
    __obj.updateDynamic("transformSchema")(js.Any.fromFunction1((t0: typingsJapgolly.graphql.mod.GraphQLSchema) => transformSchema(t0).runNow()))
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1((t0: /* originalRequest */ typingsJapgolly.graphqlTools.interfacesMod.Request) => transformRequest(t0).runNow()))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.graphqlTools.interfacesMod.Result) => transformResult(t0).runNow()))
    __obj.asInstanceOf[ConvertEnumValues]
  }
}

