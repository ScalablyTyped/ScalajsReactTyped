package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCopyWithin extends js.Object {
  var copyWithin: scala.Boolean
  var entries: scala.Boolean
  var fill: scala.Boolean
  var find: scala.Boolean
  var findIndex: scala.Boolean
  var keys: scala.Boolean
  var values: scala.Boolean
}

object AnonCopyWithin {
  @scala.inline
  def apply(
    copyWithin: scala.Boolean,
    entries: scala.Boolean,
    fill: scala.Boolean,
    find: scala.Boolean,
    findIndex: scala.Boolean,
    keys: scala.Boolean,
    values: scala.Boolean
  ): AnonCopyWithin = {
    val __obj = js.Dynamic.literal(copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCopyWithin]
  }
}

