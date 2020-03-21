package typingsJapgolly.aceDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceDiffLROpts extends js.Object {
  var content: js.UndefOr[String | Null] = js.undefined
  var copyLinkEnabled: js.UndefOr[Boolean] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object AceDiffLROpts {
  @scala.inline
  def apply(
    content: String = null,
    copyLinkEnabled: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    theme: String = null
  ): AceDiffLROpts = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(copyLinkEnabled)) __obj.updateDynamic("copyLinkEnabled")(copyLinkEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AceDiffLROpts]
  }
}

