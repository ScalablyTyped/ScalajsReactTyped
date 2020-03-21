package typingsJapgolly.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResult extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var errors: js.UndefOr[js.Array[js.Error]] = js.undefined
}

object GraphQLResult {
  @scala.inline
  def apply(data: js.Any = null, errors: js.Array[js.Error] = null): GraphQLResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResult]
  }
}

