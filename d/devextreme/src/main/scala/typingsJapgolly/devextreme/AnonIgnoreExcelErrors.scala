package typingsJapgolly.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnoreExcelErrors extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var ignoreExcelErrors: js.UndefOr[Boolean] = js.undefined
  var proxyUrl: js.UndefOr[String] = js.undefined
}

object AnonIgnoreExcelErrors {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    fileName: String = null,
    ignoreExcelErrors: js.UndefOr[Boolean] = js.undefined,
    proxyUrl: String = null
  ): AnonIgnoreExcelErrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExcelErrors)) __obj.updateDynamic("ignoreExcelErrors")(ignoreExcelErrors.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreExcelErrors]
  }
}

