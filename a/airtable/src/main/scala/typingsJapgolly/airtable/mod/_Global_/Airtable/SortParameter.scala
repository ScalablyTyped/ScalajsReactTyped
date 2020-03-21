package typingsJapgolly.airtable.mod._Global_.Airtable

import typingsJapgolly.airtable.airtableStrings.asc
import typingsJapgolly.airtable.airtableStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortParameter extends js.Object {
  var direction: js.UndefOr[asc | desc] = js.undefined
  var field: String
}

object SortParameter {
  @scala.inline
  def apply(field: String, direction: asc | desc = null): SortParameter = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortParameter]
  }
}

