package typingsJapgolly.graphqlTools.interfacesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var transformRequest: js.UndefOr[js.Function1[/* originalRequest */ Request, Request]] = js.undefined
  var transformResult: js.UndefOr[js.Function1[/* result */ Result, Result]] = js.undefined
  var transformSchema: js.UndefOr[js.Function1[/* schema */ GraphQLSchema, GraphQLSchema]] = js.undefined
}

object Transform {
  @scala.inline
  def apply(
    transformRequest: /* originalRequest */ Request => CallbackTo[Request] = null,
    transformResult: /* result */ Result => CallbackTo[Result] = null,
    transformSchema: /* schema */ GraphQLSchema => CallbackTo[GraphQLSchema] = null
  ): Transform = {
    val __obj = js.Dynamic.literal()
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1((t0: /* originalRequest */ typingsJapgolly.graphqlTools.interfacesMod.Request) => transformRequest(t0).runNow()))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.graphqlTools.interfacesMod.Result) => transformResult(t0).runNow()))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1((t0: /* schema */ typingsJapgolly.graphql.mod.GraphQLSchema) => transformSchema(t0).runNow()))
    __obj.asInstanceOf[Transform]
  }
}

