package typingsJapgolly.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybeRevisionedDocument extends js.Object {
  var _rev: js.UndefOr[String] = js.undefined
}

object MaybeRevisionedDocument {
  @scala.inline
  def apply(_rev: String = null): MaybeRevisionedDocument = {
    val __obj = js.Dynamic.literal()
    if (_rev != null) __obj.updateDynamic("_rev")(_rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaybeRevisionedDocument]
  }
}

