package typingsJapgolly.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCell extends js.Object {
  var cell: String
  var item: String
  var itemTitle: String
  var root: String
  var row: String
}

object AnonCell {
  @scala.inline
  def apply(cell: String, item: String, itemTitle: String, root: String, row: String): AnonCell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemTitle = itemTitle.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCell]
  }
}

