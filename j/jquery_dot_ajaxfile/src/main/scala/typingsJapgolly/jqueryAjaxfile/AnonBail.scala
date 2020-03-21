package typingsJapgolly.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBail extends js.Object {
  var bail: js.UndefOr[Boolean] = js.undefined
  var grep: js.UndefOr[js.RegExp] = js.undefined
  var reporter: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var ui: js.UndefOr[String] = js.undefined
}

object AnonBail {
  @scala.inline
  def apply(
    bail: js.UndefOr[Boolean] = js.undefined,
    grep: js.RegExp = null,
    reporter: String = null,
    timeout: Int | Double = null,
    ui: String = null
  ): AnonBail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail.asInstanceOf[js.Any])
    if (grep != null) __obj.updateDynamic("grep")(grep.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBail]
  }
}

