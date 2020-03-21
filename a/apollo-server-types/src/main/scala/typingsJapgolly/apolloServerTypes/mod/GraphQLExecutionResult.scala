package typingsJapgolly.apolloServerTypes.mod

import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLExecutionResult extends js.Object {
  var data: js.UndefOr[(Record[String, _]) | Null] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
}

object GraphQLExecutionResult {
  @scala.inline
  def apply(
    data: Record[String, _] = null,
    errors: js.Array[GraphQLError] = null,
    extensions: Record[String, _] = null
  ): GraphQLExecutionResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLExecutionResult]
  }
}

