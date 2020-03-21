package typingsJapgolly.graphqlTools.renameTypesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.Request
import typingsJapgolly.graphqlTools.interfacesMod.Result
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameTypes extends Transform {
  var renameBuiltins: js.Any
  var renameScalars: js.Any
  var renameTypes: js.Any
  var renamer: js.Any
  var reverseMap: js.Any
  @JSName("transformRequest")
  def transformRequest_MRenameTypes(originalRequest: Request): Request
  @JSName("transformResult")
  def transformResult_MRenameTypes(result: Result): Result
  @JSName("transformSchema")
  def transformSchema_MRenameTypes(originalSchema: GraphQLSchema): GraphQLSchema
}

object RenameTypes {
  @scala.inline
  def apply(
    renameBuiltins: js.Any,
    renameScalars: js.Any,
    renameTypes: js.Any,
    renamer: js.Any,
    reverseMap: js.Any,
    transformRequest: Request => CallbackTo[Request],
    transformResult: Result => CallbackTo[Result],
    transformSchema: GraphQLSchema => CallbackTo[GraphQLSchema]
  ): RenameTypes = {
    val __obj = js.Dynamic.literal(renameBuiltins = renameBuiltins.asInstanceOf[js.Any], renameScalars = renameScalars.asInstanceOf[js.Any], renameTypes = renameTypes.asInstanceOf[js.Any], renamer = renamer.asInstanceOf[js.Any], reverseMap = reverseMap.asInstanceOf[js.Any])
    __obj.updateDynamic("transformRequest")(js.Any.fromFunction1((t0: typingsJapgolly.graphqlTools.interfacesMod.Request) => transformRequest(t0).runNow()))
    __obj.updateDynamic("transformResult")(js.Any.fromFunction1((t0: typingsJapgolly.graphqlTools.interfacesMod.Result) => transformResult(t0).runNow()))
    __obj.updateDynamic("transformSchema")(js.Any.fromFunction1((t0: typingsJapgolly.graphql.mod.GraphQLSchema) => transformSchema(t0).runNow()))
    __obj.asInstanceOf[RenameTypes]
  }
}

