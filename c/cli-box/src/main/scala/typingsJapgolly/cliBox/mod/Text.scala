package typingsJapgolly.cliBox.mod

import typingsJapgolly.cliBox.cliBoxStrings.bottom
import typingsJapgolly.cliBox.cliBoxStrings.center
import typingsJapgolly.cliBox.cliBoxStrings.left
import typingsJapgolly.cliBox.cliBoxStrings.middle
import typingsJapgolly.cliBox.cliBoxStrings.right
import typingsJapgolly.cliBox.cliBoxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var autoEOL: js.UndefOr[Boolean] = js.undefined
  var hAlign: js.UndefOr[left | middle | right] = js.undefined
  var stretch: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var vAlign: js.UndefOr[top | center | bottom] = js.undefined
}

object Text {
  @scala.inline
  def apply(
    autoEOL: js.UndefOr[Boolean] = js.undefined,
    hAlign: left | middle | right = null,
    stretch: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    vAlign: top | center | bottom = null
  ): Text = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoEOL)) __obj.updateDynamic("autoEOL")(autoEOL.asInstanceOf[js.Any])
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(stretch)) __obj.updateDynamic("stretch")(stretch.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (vAlign != null) __obj.updateDynamic("vAlign")(vAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

