package typingsJapgolly.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcsTokenLink extends js.Object {
  /** URL to retrieve ACS token for pdf download. (In LITE projection.) */
  var acsTokenLink: js.UndefOr[String] = js.undefined
  /** URL to download pdf. (In LITE projection.) */
  var downloadLink: js.UndefOr[String] = js.undefined
  /** Is a scanned image pdf available either as public domain or for purchase. (In LITE projection.) */
  var isAvailable: js.UndefOr[Boolean] = js.undefined
}

object AnonAcsTokenLink {
  @scala.inline
  def apply(
    acsTokenLink: String = null,
    downloadLink: String = null,
    isAvailable: js.UndefOr[Boolean] = js.undefined
  ): AnonAcsTokenLink = {
    val __obj = js.Dynamic.literal()
    if (acsTokenLink != null) __obj.updateDynamic("acsTokenLink")(acsTokenLink.asInstanceOf[js.Any])
    if (downloadLink != null) __obj.updateDynamic("downloadLink")(downloadLink.asInstanceOf[js.Any])
    if (!js.isUndefined(isAvailable)) __obj.updateDynamic("isAvailable")(isAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcsTokenLink]
  }
}

