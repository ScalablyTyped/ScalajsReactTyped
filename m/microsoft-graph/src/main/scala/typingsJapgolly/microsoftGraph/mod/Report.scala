package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  // Not yet documented
  var content: js.UndefOr[js.Any] = js.undefined
}

object Report {
  @scala.inline
  def apply(content: js.Any = null): Report = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Report]
  }
}

