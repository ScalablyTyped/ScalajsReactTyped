package typingsJapgolly.androiduix.PageStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateSaved extends js.Object {
  var extra: js.UndefOr[js.Any] = js.undefined
  var pageId: String
}

object StateSaved {
  @scala.inline
  def apply(pageId: String, extra: js.Any = null): StateSaved = {
    val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateSaved]
  }
}

