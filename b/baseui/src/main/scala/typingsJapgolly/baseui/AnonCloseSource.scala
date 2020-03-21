package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.backdrop
import typingsJapgolly.baseui.baseuiStrings.closeButton
import typingsJapgolly.baseui.baseuiStrings.escape_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseSource extends js.Object {
  var closeSource: js.UndefOr[closeButton | backdrop | escape_] = js.undefined
}

object AnonCloseSource {
  @scala.inline
  def apply(closeSource: closeButton | backdrop | escape_ = null): AnonCloseSource = {
    val __obj = js.Dynamic.literal()
    if (closeSource != null) __obj.updateDynamic("closeSource")(closeSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloseSource]
  }
}

