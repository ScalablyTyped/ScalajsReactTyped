package typingsJapgolly.atlaskitSingleSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupType extends js.Object {
  var heading: js.UndefOr[String] = js.undefined
  var items: js.Array[ItemType]
}

object GroupType {
  @scala.inline
  def apply(items: js.Array[ItemType], heading: String = null): GroupType = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupType]
  }
}

