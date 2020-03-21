package typingsJapgolly.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Changes extends js.Object {
  var added: js.UndefOr[js.Array[_]] = js.undefined
  var changed: js.UndefOr[js.Array[_]] = js.undefined
  var deleted: js.UndefOr[js.Array[_]] = js.undefined
}

object Changes {
  @scala.inline
  def apply(added: js.Array[_] = null, changed: js.Array[_] = null, deleted: js.Array[_] = null): Changes = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (changed != null) __obj.updateDynamic("changed")(changed.asInstanceOf[js.Any])
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changes]
  }
}

