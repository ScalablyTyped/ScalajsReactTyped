package typingsJapgolly.azureArmResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomHeadersTop extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object AnonCustomHeadersTop {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, top: Int | Double = null): AnonCustomHeadersTop = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomHeadersTop]
  }
}

