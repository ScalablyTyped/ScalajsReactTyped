package typingsJapgolly.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlClassification extends js.Object {
  /** First party classification flags if the request has been classified. */
  var firstParty: UrlClassificationParty
  /** Third party classification flags if the request has been classified. */
  var thirdParty: UrlClassificationParty
}

object UrlClassification {
  @scala.inline
  def apply(firstParty: UrlClassificationParty, thirdParty: UrlClassificationParty): UrlClassification = {
    val __obj = js.Dynamic.literal(firstParty = firstParty.asInstanceOf[js.Any], thirdParty = thirdParty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UrlClassification]
  }
}

