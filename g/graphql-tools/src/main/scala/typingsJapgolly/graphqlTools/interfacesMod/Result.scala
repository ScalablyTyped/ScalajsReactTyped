package typingsJapgolly.graphqlTools.interfacesMod

import typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault
import typingsJapgolly.graphql.graphQLErrorMod.GraphQLError
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.ExecutionResult<graphql.graphql/execution/execute.ExecutionResultDataDefault> & {  extensions ? :std.Record<string, any>} */
trait Result extends js.Object {
  var data: js.UndefOr[ExecutionResultDataDefault | Null] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
}

object Result {
  @scala.inline
  def apply(
    data: ExecutionResultDataDefault = null,
    errors: js.Array[GraphQLError] = null,
    extensions: Record[String, _] = null
  ): Result = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

