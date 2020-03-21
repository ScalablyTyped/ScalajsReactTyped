package typingsJapgolly.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybeDocument
  extends MaybeIdentifiedDocument
     with MaybeRevisionedDocument

object MaybeDocument {
  @scala.inline
  def apply(_id: String = null, _rev: String = null): MaybeDocument = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_rev != null) __obj.updateDynamic("_rev")(_rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaybeDocument]
  }
}

