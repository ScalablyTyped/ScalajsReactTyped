package typingsJapgolly.graphqlTools.renameRootFieldsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.Request
import typingsJapgolly.graphqlTools.interfacesMod.Result
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameRootFields extends Transform {
  var transformer: js.Any
  @JSName("transformSchema")
  def transformSchema_MRenameRootFields(originalSchema: GraphQLSchema): GraphQLSchema
}

object RenameRootFields {
  @scala.inline
  def apply(
    transformSchema: GraphQLSchema => CallbackTo[GraphQLSchema],
    transformer: js.Any,
    transformRequest: /* originalRequest */ Request => CallbackTo[Request] = null,
    transformResult: /* result */ Result => CallbackTo[Result] = null
  ): RenameRootFields = {
    val __obj = js.Dynamic.literal(transformer = transformer.asInstanceOf[js.Any])
    __obj.updateDynamic("transformSchema")(js.Any.fromFunction1((t0: typingsJapgolly.graphql.mod.GraphQLSchema) => transformSchema(t0).runNow()))
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1((t0: /* originalRequest */ typingsJapgolly.graphqlTools.interfacesMod.Request) => transformRequest(t0).runNow()))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.graphqlTools.interfacesMod.Result) => transformResult(t0).runNow()))
    __obj.asInstanceOf[RenameRootFields]
  }
}

