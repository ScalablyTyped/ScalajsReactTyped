package typingsJapgolly.azureArmResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
}

object AnonFilter {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, filter: String = null): AnonFilter = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter]
  }
}

