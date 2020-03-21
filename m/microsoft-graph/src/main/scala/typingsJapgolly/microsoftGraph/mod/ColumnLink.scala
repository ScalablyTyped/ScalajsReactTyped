package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnLink extends Entity {
  // The name of the column in this content type.
  var name: js.UndefOr[String] = js.undefined
}

object ColumnLink {
  @scala.inline
  def apply(id: String = null, name: String = null): ColumnLink = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnLink]
  }
}

