package typingsJapgolly.graphqlTools.checkResultAndHandleErrorsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.Request
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckResultAndHandleErrors extends Transform {
  var fieldName: js.UndefOr[js.Any] = js.undefined
  var info: js.Any
  @JSName("transformResult")
  def transformResult_MCheckResultAndHandleErrors(result: js.Any): js.Any
}

object CheckResultAndHandleErrors {
  @scala.inline
  def apply(
    info: js.Any,
    transformResult: js.Any => CallbackTo[js.Any],
    fieldName: js.Any = null,
    transformRequest: /* originalRequest */ Request => CallbackTo[Request] = null,
    transformSchema: /* schema */ GraphQLSchema => CallbackTo[GraphQLSchema] = null
  ): CheckResultAndHandleErrors = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.updateDynamic("transformResult")(js.Any.fromFunction1((t0: js.Any) => transformResult(t0).runNow()))
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1((t0: /* originalRequest */ typingsJapgolly.graphqlTools.interfacesMod.Request) => transformRequest(t0).runNow()))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1((t0: /* schema */ typingsJapgolly.graphql.mod.GraphQLSchema) => transformSchema(t0).runNow()))
    __obj.asInstanceOf[CheckResultAndHandleErrors]
  }
}

